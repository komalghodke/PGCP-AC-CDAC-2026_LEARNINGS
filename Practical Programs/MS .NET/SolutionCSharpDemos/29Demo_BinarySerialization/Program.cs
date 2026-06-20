using System;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;

namespace _29Demo_BinarySerialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filepath = @"D:\2026\DotNet\IET_Feb_26\CSharpDemos26\29Demo_BinarySerialization\Data\empdata.txt";

            FileStream fs = null;

            #region Serialization
            //if (File.Exists(filepath))
            //{
            //    fs = new FileStream(filepath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filepath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //Emp emp = new Emp();
            //emp.Id = 1;
            //emp.Name = "Hugh Jackman";
            //emp.Address = "NYC";

            //BinaryFormatter bf = new BinaryFormatter();
            //bf.Serialize(fs, emp);

            //fs.Close();
            //Console.WriteLine("Done"); 
            #endregion

            #region DeSerialize
            if (File.Exists(filepath))
            {
                fs = new FileStream(filepath, FileMode.Open, FileAccess.Read);
            }
            else
            {
                Console.WriteLine("File does not exist!!");
            }


            BinaryFormatter bf = new BinaryFormatter();
            Emp emp = bf.Deserialize(fs) as Emp;

            fs.Close();
            emp.GetEmpDetails();
            #endregion

        }
    }

    //[] Attributes : extra metadata about entities
    // specify permission to CLR that emp obj can be persisted on HDD. class Emp is giving permission to CLR via attribute.
    [Serializable]
    public class Emp
    {
        private int _EID;

        [NonSerialized]
        private string _EName;

        private string _EAddress;

        public string Address
        {
            get { return _EAddress; }
            set { _EAddress = value; }
        }


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
