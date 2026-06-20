namespace _05Demo_OOP
{
    // SRP: Single Responsibility Principle
    // DRY : Do Not Repeat Yourself
    internal class Program
    {
        // UI generation: Buissness Presentation
        static void Main(string[] args)
        {
            #region Logically incorrect grouping
            //InsertIntoMySql();
            //UpdateIntoMySql();
            //DeleteIntoMySql(); 
            #endregion

            while (true)
            {
                Console.WriteLine("Enter your Database choice: 1. MySql, 2. Oracle, 3. SqlServer");
                int dbChoice = Convert.ToInt32(Console.ReadLine());

                DataBaseFactory factory = new DataBaseFactory();    
                IDatabase dbObj = factory.GetSomeDatabase(dbChoice);
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
    // Why Interface?
    // Template
    // Forceful implementation of logic
    // Public Contract
    public interface IDatabase
    {
        void Insert();
        void Update();
        void Delete();
    }

    public class DataBaseFactory // Factory Design Pattern
    {
        public IDatabase GetSomeDatabase(int dbChoice)// Factory Method
        {
            IDatabase obj = null;
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

    // S.O.L.I.D Principles
    // Rule : Single Responsibility Principle (SRP)
    public class MySqlServer :IDatabase
    {
        //public void ConnectTODb(string connectionString)
        //{ }
        public void Insert()
        {
            // logic code..
            Console.WriteLine("Insert operation done for MySql Db");
        }
        public void Update()
        {
            // logic code..
            Console.WriteLine("Update operation done for MySql Db");
        }
        public void Delete()
        {
            // logic code..
            Console.WriteLine("Delete operation done for MySql Db");
        }
    }

    public class OracleServer :IDatabase
    {
        public void Insert()
        {
            // logic code..
            Console.WriteLine("Insert operation done for Oracle Db");
        }
        public void Update()
        {
            // logic code..
            Console.WriteLine("Update operation done for Oracle Db");
        }
        public void Delete()
        {
            // logic code..
            Console.WriteLine("Delete operation done for Oracle Db");
        }
    }

    public class SqlServer : IDatabase
    {
        public void Insert()
        {
            // logic code..
            Console.WriteLine("Insert operation done for SqlServer Db");
        }
        public void Update()
        {
            // logic code..
            Console.WriteLine("Update operation done for SqlServer Db");
        }
        public void Delete()
        {
            // logic code..
            Console.WriteLine("Delete operation done for SqlServer Db");
        }
    }
}
