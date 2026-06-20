namespace _10Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Enter your Database choice: 1. MySql, 2. Oracle, 3. SqlServer");
                int dbChoice = Convert.ToInt32(Console.ReadLine());

                DataBaseFactory factory = new DataBaseFactory();
                Database dbObj = factory.GetSomeDatabase(dbChoice);
                if (dbObj != null)
                {
                    Console.WriteLine("Enter your db opeartion choice: 1. Insert, 2. Update, 3. Delete");
                    int opChoice = Convert.ToInt32(Console.ReadLine());
                    switch (opChoice)
                    {
                        case 1:
                            dbObj.Insert();
                            break;
                        case 2:
                            dbObj.Update();
                            break;
                        case 3:
                            dbObj.Delete();
                            break;
                        default:
                            Console.WriteLine("Invalid db operation choice");
                            break;
                    }
                }

                Console.WriteLine("Do you want to continue? y/n");
                string ynChoice = Console.ReadLine().ToLower();// y,n

                if (ynChoice == "n")
                {
                    break;
                }
            }
        }
    }

    public abstract class Database
    {
        protected Logger _logger = null;

        protected Database()
        {
            _logger = Logger.GetLogger();
        }
        protected abstract void DoInsert();
        protected abstract void DoUpdate();
        protected abstract void DoDelete();
        protected abstract string GetDatabaseName();

        // Wrapper Methods 
        public void Insert()
        {
            DoInsert();
            _logger.Log($"Insert done in {GetDatabaseName()} db");
        }
        public void Update()
        {
            DoUpdate();
            _logger.Log($"Update done in {GetDatabaseName()} db");

        }
        public void Delete()
        {
            DoDelete();
            _logger.Log($"Delete done in {GetDatabaseName()} db");

        }
    }

    public class DataBaseFactory // Factory Design Pattern
    {
        public Database GetSomeDatabase(int dbChoice)// Factory Method
        {
            Database obj = null;
            switch (dbChoice)
            {
                case 1:
                    obj = new MySqlServer();
                    break;
                case 2:
                    obj = new OracleServer();
                    break;
                case 3:
                    obj = new SqlServer();
                    break;
                default:
                    obj = null;
                    break;
            }
            return obj;
        }
    }

    public class MySqlServer : Database
    {
        //private Logger _logger = null;
        //public MySqlServer()
        //{
        //    _logger = Logger.GetLogger();
        //}
        protected override string GetDatabaseName()
        {
            return "MySql Server";
        }
        protected override void DoInsert()
        {
            // logic code..
            Console.WriteLine("Insert operation done for MySql Db");
            //_logger.Log("Insert done in MySql");
        }
        protected override void DoUpdate()
        {
            // logic code..
            Console.WriteLine("Update operation done for MySql Db");
            //_logger.Log("Update done in MySql");
        }
        protected override void DoDelete()
        {
            // logic code..
            Console.WriteLine("Delete operation done for MySql Db");
            //_logger.Log("Delete done in MySql");
        }
    }

    public class OracleServer : Database
    {
        //private Logger _logger = null;
        //public OracleServer()
        //{
        //    _logger= Logger.GetLogger();
        //}
        protected override string GetDatabaseName()
        {
            return "Oracle Server";
        }
        protected override void DoInsert()
        {
            // logic code..
            Console.WriteLine("Insert operation done for Oracle Db");
            //_logger.Log("Insert done in Oracle");
        }
        protected override void DoUpdate()
        {
            // logic code..
            Console.WriteLine("Update operation done for Oracle Db");
            //_logger.Log("Update done in Oracle");

        }
        protected override void DoDelete()
        {
            // logic code..
            Console.WriteLine("Delete operation done for Oracle Db");
            //_logger.Log("Delete done in Oracle");
        }
    }

    public class SqlServer : Database
    {
        //private Logger _logger = null;
        //public SqlServer()
        //{
        //    _logger = Logger.GetLogger(); 
        //}

        protected override string GetDatabaseName()
        {
            return "SQL Server";
        }
        protected override void DoInsert()
        {
            // logic code..
            Console.WriteLine("Insert operation done for SqlServer Db");
            //_logger.Log("Insert done in SQL");

        }
        protected override void DoUpdate()
        {
            // logic code..
            Console.WriteLine("Update operation done for SqlServer Db");
            //_logger.Log("Update done in SQL");

        }
        protected override void DoDelete()
        {
            // logic code..
            Console.WriteLine("Delete operation done for SqlServer Db");
            //_logger.Log("Delete done in SQL");
        }
    }

    public class Logger
    {
        // Singleton Design Pattern: Single object per application
        private static Logger _logger1 = new Logger();
       // private static Logger _logger2 = new Logger();
       // private static Logger _logger3 = new Logger();

        // Object Pooling
       //static Logger[] alllogerobjects = new Logger[] { _logger1,_logger2, _logger3};
        
        private Logger()
        {
            Console.WriteLine("Logger object gets created...");
            // File IO code : method  which creates Log.txt file on D drive
        }
        public static Logger GetLogger()// Factory method
        {
            return _logger1;
        }

        //public static Logger[] GetLoggers()// Factory method
        //{
        //    return alllogerobjects;
        //}
        public void Log(string message)
        {
            // txt file 
            Console.WriteLine($"---Log : {message} at {DateTime.Now.ToString()}");
        }
    }
}
