using System.Collections;

namespace _23Demo_Generic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Pass by Reference  
            //CMath cmath = new CMath();

            //int p = 10, q = 20;
            //Console.WriteLine($"Before Swapping: p = {p}, q= {q}");
            //// Pass by Value --> Pass by Reference
            //cmath.Swap(ref p,ref q );

            //Console.WriteLine($"After Swapping: p = {p}, q= {q}");

            //string s1 = "Hello", s2 = "Bye";
            //Console.WriteLine($"Before Swapping: s1 = {s1}, s2= {s2}");
            //// Pass by Value --> Pass by Reference
            //cmath.Swap(ref s1, ref s2);

            //Console.WriteLine($"After Swapping: s1 = {s1}, s2= {s2}"); 
            #endregion

            #region Generic Swap, Dynamic Add
            //CMath cmath = new CMath();

            //int p = 10, q = 20;
            //Console.WriteLine($"Before Swapping: p = {p}, q= {q}");
            //// Pass by Value --> Pass by Reference
            //cmath.Swap<int>(ref p, ref q);

            //Console.WriteLine($"After Swapping: p = {p}, q= {q}");

            //string s1 = "Hello", s2 = "Bye";
            //Console.WriteLine($"Before Swapping: s1 = {s1}, s2= {s2}");
            //// Pass by Value --> Pass by Reference
            //cmath.Swap<string>(ref s1, ref s2);

            //Console.WriteLine($"After Swapping: s1 = {s1}, s2= {s2}");

            //cmath.Add<int>(10, 20);
            //cmath.Add<string>(s1, s2); 
            #endregion

            #region Tuple collection
            //     MyClass obj = new MyClass();

            //(int _id,string _nm, string _add) =  obj.Demo(22, "Rob", "Rome");

            //     Console.WriteLine($"ID:{_id}, nm = {_nm}, add= {_add}");

            //     // Implicit Type: var
            //     var elements = obj.Demo(22, "Rob", "Rome");

            //     Console.WriteLine($"ID:{elements.id}, nm = {elements.nm}, add= {elements.add}"); 
            #endregion

            MyClass obj = new MyClass();

            #region out parameter 
            //double rd = 5;
            //double area = 0;
            //double circumference = 0;
            //obj.Calculate(rd,out area,out circumference);
            //Console.WriteLine($"Area : {area},circumference = {circumference}"); 
            #endregion

            #region Optional/ Keyword / Positional Arguments
            //obj.Func(50,"Ron","India");// Positional Arguments
            //obj.Func(40);// Default/ Optional Argument
            //obj.Func(30,lm : "Ellis", fnm : "Tom");//  // Keyword Arguments 
            #endregion

            #region params keyword arguments
            //obj.GreetPlayers("Jim", "Tom");
            //       obj.GreetPlayers(1234,"Jim", "Tom","Peter","Ron");

            //Console.WriteLine("{0},{1},{2}","Tina","Neha","Pooja");

            //       string nos = string.Format("{0},{1},{2}", 10, 20,30);
            //       Console.WriteLine(nos); 
            #endregion

        }
    }

    //public class CMath<T> // Generic Class
    public class CMath // Non - Generic Class
    {
        // Generic method
        public void Swap<T>(ref T x, ref T y)
        {
            T temp;
            temp = x;
            x = y;
            y = temp;
        }

        public void Add<T>(T x, T y)
        {
            dynamic x1 = x;
            dynamic y1 = y;
            T result = x1 + y1;
            Console.WriteLine($"Add = {result}");
        }

        #region Overloaded Swap 
        //public void Swap(ref int x,ref int y) 
        //{
        //    int temp;
        //    temp = x;
        //    x = y;
        //    y = temp;
        //}

        //public void Swap(ref string x, ref string y)
        //{
        //    string temp;
        //    temp = x;
        //    x = y;
        //    y = temp;
        //} 
        #endregion
    }

    public class MyClass
    {
        // Tuple: when we have to return limited amount of elements from a method.Instead of using array as a container, we can return group of multiple elements from a functionusing Tuple syntax i.e () .
        public (int id, string nm, string add) Demo(int id, string name, string address)
        {
            int EId = id;
            string nm = name;
            string add = address;          
            return (EId,nm,add);
        }

        public void Calculate(double radius,out double area,out double circumference)
        {
            area = 3.14 * radius * radius;
            circumference = 2 * 3.14 * radius;
        }

        //age, fnm, lm : Parametrs/ local containers/variables to a function Func.
        public void Func(int age,string fnm="Hugh", string lm="Jackman")
        {
            // Positional Arguments
            // Keyword Arguments
            // Default/ Optional Argument
            Console.WriteLine($"First Name : {fnm}, Last Name = {lm}, Age = {age}");
        }


        public void GreetPlayers(int phno,params string[] playersNames)
        {
            for (int i = 0; i < playersNames.Length; i++)
            {
                Console.WriteLine($"Welcome, {playersNames[i]}");
            }

            Console.WriteLine(phno);
        }
    
    }

}
