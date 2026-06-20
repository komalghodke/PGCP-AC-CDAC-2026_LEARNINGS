namespace _24Demo_Generic
{
    public delegate void MyDelegate<T>(T para);

    public delegate bool MyPredicateDel<T1, T2>(T1 p1, T2 p2);
    internal class Program
    {
        static void Main(string[] args)
        {
            #region demo01
            //MyClass<string> obj1 = new MyClass<string>();
            //obj1.Show("Peter");

            //Demo demo = new Demo();
            //bool result = demo.Method1<int, string, bool, double, object>(11,"abcd",true,234.567,"Peter");
            // Console.WriteLine(result);

            //object obj = new object();
            //demo.Method2<int, string, bool, double, object>(11, "abcd", true, 234.567,out obj); 
            #endregion

            MyClass obj = new MyClass();

            MyDelegate<string> del = new MyDelegate<string>(obj.Show);

            del("abcd");
        }
    }

    public class Demo
    {
        //public R Method1<P,Q,R,S,T>(P p1, Q p2, R p3, S p4, T p5) 
        //{
        //    Console.WriteLine($"{p1}, {p2}, {p3}, {p4}, {p5}");

        //    return p3;
        //}

        //public T3 Method1<T1, T2, T3, T4, T5>(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5)
        //{
        //    Console.WriteLine($"{p1}, {p2}, {p3}, {p4}, {p5}");

        //    return p3;
        //}

        //public void Method2<T1, T2, T3, T4, T5>(T1 p1, T2 p2, T3 p3, T4 p4,out T5 p5)
        //{
        //    object obj = "Hello";
        //    Console.WriteLine($"{p1}, {p2}, {p3}, {p4}");
        //    p5 = 10;
            
        //}
    }
    //public class MyClass<T> // Generic class
    public class MyClass // NonGeneric class
    {
        public void Show<T>(T obj) // Generic Method
        {
            Console.WriteLine($"{obj}, type: {obj.GetType().ToString()}");
        }

        public void Display(double salary) //Non- Generic Method
        {
            Console.WriteLine($"{salary}");
        }
    }
}
