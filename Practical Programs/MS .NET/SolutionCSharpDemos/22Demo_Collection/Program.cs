using System.Collections;

namespace _22Demo_Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region int[] array 
            //int[] numbers = new int[3];
            //numbers[0] = 10;
            //numbers[1] = 20;
            //numbers[2] = 30;

            //for (int i = 0; i < numbers.Length; i++)
            //{
            //    Console.WriteLine(numbers[i].ToString());
            //} 
            #endregion

            #region string[] array 
            //string[] days = new string[5];
            //days[0] = "Mon";
            //days[1] = "Tue";
            //days[2] = "Wed";
            //days[3] = "Thu";
            //days[4] = "Fri";

            //for (int i = 0; i < days.Length; i++)
            //{
            //    Console.WriteLine(days[i]);
            //} 
            #endregion

            Emp emp1 = new Emp();
            emp1.Id = 1;
            emp1.Name = "Hugh Jackman";
            emp1.Address = "NYC";

            Emp emp2 = new Emp();
            emp2.Id = 2;
            emp2.Name = "Hugh Grant";
            emp2.Address = "New Jersey";

            Emp emp3 = new Emp();
            emp3.Id = 3;
            emp3.Name = "Tom Ellis";
            emp3.Address = "London";

            Book book = new Book();
            book.BookName = "Let us C++";
            book.AuthorName = "Yashwant Kanitkar";

            #region Emps[] 
            //Emp[] emps = new Emp[3];
            //emps[0] = emp1;
            //emps[1] = emp2;
            //emps[2] = emp3;

            //for (int i = 0; i < emps.Length; i++)
            //{
            //    emps[i].GetEmpDetails();
            //} 
            #endregion

            #region Boxing, unboxing, Type- casting : object[] 
            //// value types : int, double
            //// Reference type:  Emp, object, string 

            //// Boxing: Converting value types to reference type
            //// UnBoxing: Converting refernce types again back to value type
            //// Type-casting : Converting value to value types OR Refernce to reference types.

            //object[] arr = new object[5];

            //arr[0] = 100; // Boxing
            //arr[1] = "Something"; // Type-casting
            //arr[2] = true; // Boxing
            //arr[3] = emp1; // Type-casting
            //arr[4] = 23.34; // Boxing

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    object obj = arr[i];

            //    //if(obj.GetType().ToString() == "System.Int32")
            //    if (obj is int)
            //    {
            //        int j = Convert.ToInt32(obj); // Unboxing
            //        Console.WriteLine(j);
            //    }

            //    //if (obj.GetType().ToString() == "_22Demo_Collection.Emp")
            //    if (obj is Emp)
            //    {
            //        //Emp emp =(Emp) obj; // Type Casting
            //        Emp emp = obj as Emp;
            //        emp.GetEmpDetails();
            //    }
            //    if (obj is string)
            //    {
            //        string str = obj as string; // Type Casting
            //        Console.WriteLine(str);
            //    }
            //    if (obj is bool)
            //    {
            //        bool b = Convert.ToBoolean(obj);// Unboxing
            //        Console.WriteLine(b);
            //    }
            //    if (obj is double)
            //    {
            //        double d = Convert.ToDouble(obj);// Unboxing
            //        Console.WriteLine(d);
            //    }
            //} 
            #endregion

            // Collections: an array whos size is not fixed. Growable array.
            // Non Generic collections: creates object array internally

            #region ArrayList 
            //ArrayList obj = new ArrayList();
            //obj.Add(100); // Boxing
            //obj.Add("Something"); // type-casting
            //obj.Add(true);// Boxing
            //obj.Add(emp1);// type-casting
            //obj.Add(23.567);// Boxing
            //obj.Add(emp2);// type-casting
            //obj.Add(book);// type-casting


            //for (int i = 0; i < obj.Count; i++)
            //{
            //    if (obj[i] is int)
            //    {
            //        int j = Convert.ToInt32(obj[i]);// Unboxing
            //        Console.WriteLine(j);
            //    }
            //    if (obj[i] is double)
            //    {
            //        double d = Convert.ToDouble(obj[i]);// Unboxing
            //        Console.WriteLine(d);
            //    }
            //    if (obj[i] is bool)
            //    {
            //       bool b = Convert.ToBoolean(obj[i]);// Unboxing
            //        Console.WriteLine(b);
            //    }
            //    if (obj[i] is Emp)
            //    {
            //        Emp emp = obj[i] as Emp; // type-casting
            //        emp.GetEmpDetails();
            //    }
            //    if (obj[i] is Book) 
            //    {
            //        Book bk = obj[i] as Book;// type-casting
            //        Console.WriteLine($"Author = {bk.AuthorName}, BookName = {bk.BookName}");
            //    }
            //} 
            #endregion

            #region Stack 
            //Stack st = new Stack();
            //st.Push(100);
            //st.Push(200);
            //st.Push(300);

            //int length = st.Count;

            //for (int i = 0; i < length; i++)
            //{
            //    Console.WriteLine(st.Pop());
            //} 
            #endregion

            #region Queue 
            //Queue queue = new Queue();
            //queue.Enqueue(100);
            //queue.Enqueue(200);
            //queue.Enqueue(300);

            //int ln = queue.Count;

            //for (int i = 0; i < ln; i++)
            //{
            //    Console.WriteLine(queue.Dequeue());
            //} 
            #endregion

            
        }
    }

    public class Emp
    {
        private int _Id;
        private string _Name;
        private string _Address;

        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }
        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }
        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }

        public void GetEmpDetails()
        {
            Console.WriteLine($"Id: {Id}, Name: {Name}, Address: {Address}");
        }
    }

    public class Book 
    {
        private string _BookName;
        private string _AuthorName;

        public string AuthorName
        {
            get { return _AuthorName; }
            set { _AuthorName = value; }
        }
        public string BookName
        {
            get { return _BookName; }
            set { _BookName = value; }
        }
    }
}
