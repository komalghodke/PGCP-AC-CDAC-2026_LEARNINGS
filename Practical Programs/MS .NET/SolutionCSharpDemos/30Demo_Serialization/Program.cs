using System.Runtime.Serialization.Formatters.Binary;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Xml.Serialization;

namespace _30Demo_Serialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Emp emp = new Emp();
            emp.Id = 1;
            emp.Name = "Hugh Jackman";
            emp.Address = "NYC";

            string filepath = @"D:\2026\DotNet\IET_Feb_26\CSharpDemos26\30Demo_Serialization\Data\empdata.xml";

            string filepath2 = @"D:\2026\DotNet\IET_Feb_26\CSharpDemos26\30Demo_Serialization\Data\empdata.json";

            FileStream fs = null;

            #region XML Serialization
            //if (File.Exists(filepath))
            //{
            //    fs = new FileStream(filepath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filepath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            ////Type empType = emp.GetType();
            ////XmlSerializer xr = new XmlSerializer(empType);

            //XmlSerializer xr = new XmlSerializer(typeof(Emp));
            //xr.Serialize(fs, emp);

            //fs.Close();
            //Console.WriteLine("Done"); 
            #endregion

            #region XML DeSerialize
            //if (File.Exists(filepath))
            //{
            //    fs = new FileStream(filepath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!!");
            //}

            //XmlSerializer xr = new XmlSerializer(typeof(Emp));
            //Emp emp1 = xr.Deserialize(fs) as Emp;

            //fs.Close();

            //emp1.GetEmpDetails();

            #endregion

            #region JSON Serialization
            //if (File.Exists(filepath))
            //{
            //    fs = new FileStream(filepath2, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filepath2, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //JsonSerializer.Serialize(fs, emp);           

            //fs.Close();
            //Console.WriteLine("Done");
            #endregion

            #region JSON DeSerialize
            if (File.Exists(filepath2))
            {
                fs = new FileStream(filepath2, FileMode.Open, FileAccess.Read);
            }
            else
            {
                Console.WriteLine("File does not exist!!");
            }

            Emp emp1 = JsonSerializer.Deserialize<Emp>(fs);

            fs.Close();

            emp1.GetEmpDetails();

            #endregion
        }
    }
    public class Emp
    {
        private int _EID;
        private string _EName;
        private string _EAddress;

        public string Address
        {
            get { return _EAddress; }
            set { _EAddress = value; }
        }

        [JsonIgnore]
        public string Name
        {
            get { return _EName; }
            set { _EName = value; }
        }
        public int Id
        {
            get { return _EID; }
            set { _EID = value; }
        }

        public void GetEmpDetails()
        {
            Console.WriteLine($"Id: {Id}, Name: {Name}, Address: {Address}");
        }
    }
}
