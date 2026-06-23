namespace _28Demo_FileIO
{
    internal class Program
    {
        static void Main(string[] args)
        {

            string filePath = @"D:\CDAC_IET\PGCP-AC Notes IET\MS. NET\CSharpDemos26\28Demo_FileIO\Data\data.txt";

            string filePath2 = @"D:\CDAC_IET\PGCP-AC Notes IET\MS. NET\CSharpDemos26\28Demo_FileIO\Data\empdata.txt";

            #region StreamWriter
            FileStream fs = null;
            if (File.Exists(filePath))
            {
                fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            }
            else
            {
                fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            }

            StreamWriter writer = new StreamWriter(fs);

            writer.WriteLine("Welcome to FileIO");
            //writer.WriteLine("abcd ");

            writer.Flush();
            writer.Close();
            fs.Close();
            Console.WriteLine("Done");

            #endregion


            #region StreamReader
            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist");
            //}

            //StreamReader reader = new StreamReader(fs);
            //string data = reader.ReadToEnd();
            //reader.Close();
            //fs.Close();

            //Console.WriteLine(data); 
            #endregion

            #region StreamWriter for Emp object
            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath2, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath2, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //StreamWriter writer = new StreamWriter(fs);

            //Emp emp = new Emp();
            //emp.Id = 555;
            //emp.Name = "Hugh Jackman";
            //emp.Address = "NYC";

            //writer.Write(emp);

            //writer.Flush();
            //writer.Close();
            //fs.Close();
            //Console.WriteLine("Done");

            #endregion
        .}
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
