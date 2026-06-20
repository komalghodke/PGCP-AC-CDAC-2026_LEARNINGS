namespace _13Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp = new Employee();

            emp.EId = 100;
            Console.WriteLine(emp.EId);

            emp.EName = "Hugh Jackman";
            Console.WriteLine(emp.EName);

            #region string [] Property
            //string[] days = new string[3];
            //days[0] = "Mon";
            //days[1] = "Funday";
            //days[2] = "Sunday";

            //emp.WeekDays = days;
            //for (int i = 0; i < emp.WeekDays.Length ; i++)
            //{
            //    Console.WriteLine(emp.WeekDays[i]);
            //} 
            #endregion

            #region HR obj Property
            //HR obj = new HR();
            //obj.HRName = "Tony Stark";
            //emp.HREmp = obj;
            //HR hrObj = emp.HREmp;
            //Console.WriteLine($"Hr Name = {hrObj.HRName}");
            //Console.WriteLine($"Hr Name = {emp.HREmp.HRName}"); 
            #endregion

            #region Properties 
            //emp.set_EId(14);
            //Console.WriteLine(emp.get_EId());

            //emp.EId = 15; // setter
            //int id = emp.EId; // getter
            //Console.WriteLine(id);

            //Console.WriteLine("Enter emp id: ");
            //emp.EId = Convert.ToInt32(Console.ReadLine());
            ////Console.WriteLine($"Emp Id : {emp.EId}");

            //Console.WriteLine("Enter emp name: ");
            //emp.EName = Console.ReadLine();
            ////Console.WriteLine($"Emp Name : {emp.EName}");

            //Console.WriteLine("Is Emp Active in compnay?");
            //emp.isActive = Convert.ToBoolean(Console.ReadLine());
            ////Console.WriteLine($"Is Emp Active = {emp.isActive}");

            //Console.WriteLine($"Id : {emp.EId}, Name: {emp.EName}, IsActive : {emp.isActive}"); 
            #endregion
        }
    }
    public class Employee
    {
        private int _EId;
        private string _EName;
        private bool _isActive;
        private HR _HREmp;
        private string[] _Days;

        // Property Syntax

        public string[] WeekDays
        {
            set { _Days = value; }
            get { return _Days; }
        }
        // emp.EId = 110;
        public int EId
        {
            set
            {
                if (value == 100)
                    _EId = value;
                else
                    _EId = 0;
            }
            get 
            {
                if (_EId == 100)
                    return _EId +10;
                else
                    return _EId * 0;
            }
        }

        public string EName
        {
            set { _EName = value; }
            get 
            {
                // Data Manupulation
                return $"Mr/Mrs. {_EName}"; 
            }
        }

        public bool isActive
        {
            set { _isActive = value; }
            get { return _isActive; }
        }

        public HR HREmp
        {
            set {_HREmp = value; }
            get { return _HREmp; }
        }

        #region Properties-> getter, setter methods by compiler

        // Syntax:
        // AccessModifier DataType PropertyName
        // {
        //      set
        //      {
        //           _PrivateMember = value;
        //      }
        //      get
        //      {
        //          return _PrivateMember;
        //      }
        // }

        #endregion

        #region old getter, setter syntax code
        //public void set_EId(int id)
        //{
        //    _EId = id;
        //}
        //public int get_EId()
        //{
        //    return _EId;
        //}

        //public void set_EName(string nm)
        //{
        //    _EName = nm;
        //}
        //public string get_EName()
        //{
        //    return _EName;
        //} 
        #endregion


    }

    public class HR
    { 
        private string _HRName;
        public string HRName
        {
            get { return _HRName; } 
            set { _HRName = value; }
        }
    }
}
