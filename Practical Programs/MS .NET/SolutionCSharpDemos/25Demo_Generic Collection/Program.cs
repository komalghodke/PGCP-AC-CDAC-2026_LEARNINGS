using System.Drawing;

namespace _25Demo_Generic_Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //A collection in .NET is a specialized class designed to group, store, manage, and manipulate a set of related objects dynamically.Unlike standard arrays, which have a fixed size, collections can automatically grow or shrink in memory as elements are added or removed.


            // Generic Collection : System.Collections.Genenric
            // Stringly- Typed Collection

            #region List<int>
            //List<int> numbers = new List<int>();
            //numbers.Add(10);
            //numbers.Add(20);
            //numbers.Add(30);
            //numbers.Add(40);
            //for (int i = 0; i < numbers.Count; i++)
            //{
            //    
            #endregion Console.WriteLine(numbers[i]);

            #region Stack<>
            //Stack<string> st = new Stack<string>();
            //st.Push("1");
            //st.Push("2");
            //st.Push("3");

            //int count = st.Count;
            //for (int i = 0; i < count; i++)
            //{
            //    Console.WriteLine(st.Pop());
            //} 
            #endregion

            Emp emp1 = new Emp();
            emp1.Id = 1;
            emp1.Name = "Hugh Jackman";
            emp1.Address = "NYC";

            Emp emp2 = new Emp();
            emp2.Id = 2;
            emp2.Name = "Hugh Grant";
            emp2.Address = "LA";

            Emp emp3 = new Emp();
            emp3.Id = 3;
            emp3.Name = "Tom Holland";
            emp3.Address = "New Jersey";

            #region List<Emp>
            //List<Emp> allemps = new List<Emp>();
            //allemps.Add(emp1);
            //allemps.Add(emp2);
            //allemps.Add(emp3);

            //for (int i = 0; i < allemps.Count; i++)
            //{
            //   // Emp emp = allemps[i];
            //    Console.WriteLine($"Id: {allemps[i].Id}, Name: {allemps[i].Name}, Address: {allemps[i].Address}");
            //} 
            #endregion

            #region Dictionary<TKey,TValue>
            //Dictionary<int,Emp> allEmps =new Dictionary<int, Emp>();

            //   allEmps.Add(1,emp1);
            //   allEmps.Add(2,emp2);
            //   allEmps.Add(3,emp3);

            //   foreach (Emp emp in allEmps.Values)
            //   {
            //       Console.WriteLine($"Id: {emp.Id}, Name: {emp.Name},Address: {emp.Address}");
            //   }

            //   foreach (int key in allEmps.Keys)
            //   {
            //       Console.WriteLine($"Key : {key}, Value:{allEmps[key].Name}");
            //   } 
            #endregion
        }
    }

    public class Emp
    {
        private int _EId;
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
            get { return _EId; }
            set { _EId = value; }
        }
    }
}
