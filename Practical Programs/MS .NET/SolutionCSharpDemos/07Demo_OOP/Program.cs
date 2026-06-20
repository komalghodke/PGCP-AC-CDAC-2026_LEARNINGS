namespace _07Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Implict Way 
            //CMath cmath = new CMath();
            //cmath.Add(2, 4);
            //cmath.Sub(13, 5);
            //cmath.Mult(2, 6);

            //// This is contract for IX customers
            //IX xObj = new CMath();
            //xObj.Add(2, 4);
            //xObj.Sub(13, 5);

            //// This is contract for IY customers
            //IY yObj = new CMath();
            //yObj.Add(2, 44);
            //yObj.Mult(10,6); 
            #endregion

            #region Explicit Way
            ////MyMath myMath = new MyMath();
            //IX xobj = new MyMath();
            //xobj.Add(1, 2);
            //xobj.Sub(13, 4);

            //IY yobj = new MyMath();
            //yobj.Add(1, 2);
            //yobj.Mult(13, 4); 
            #endregion

            #region Combination of Implicit and Explicit ways
            //Person person = new Person();
            //person.Greet("Hugh Jackman");
            ////person.Log("blah blah blah");

            //IData data = new Person();
            //data.Log("blah blah blah"); 
            #endregion
        }
    }
    public interface IX
    {
        void Add(int x, int y);
        void Sub(int x, int y);
    }
    public interface IY
    {
        void Add(int x, int y);
        void Mult(int x, int y);
    }

    public interface IData
    {
        void Greet(string name);
        void Log(string message);
    }

    // Implicit way of interface Implementation
    public class CMath : IX,IY
    {
        public void Add(int x, int y)
        {
            Console.WriteLine($"IX : Add = {x + y}");
        }
        public void Sub(int x, int y)
        {
            Console.WriteLine($"IX : Sub = {x - y}");
        }
        public void Mult(int x, int y)
        {
            Console.WriteLine($"IY : Mult = {x * y}");
        }
    }

    // Implement the interface in a Explicit Way
    public class MyMath : IX, IY
    {
        void IX.Add(int x, int y)
        {
            Console.WriteLine($"IX : Add = {x + y}");
        }

        void IY.Add(int x, int y)
        {
            Console.WriteLine($"IY : Add = {x + y + 100}");
        }

        void IY.Mult(int x, int y)
        {
            Console.WriteLine($"IY : Mult = {x * y}");
        }

        void IX.Sub(int x, int y)
        {
            Console.WriteLine($"IX : Sub = {x - y}");
        }
    }

    public class Person : IData
    {
        public void Greet(string name)
        {
            Console.WriteLine($"Hello, {name}");
            IData data = new Person();
            data.Log("blah blah blah blah blah blah blah blah blah");
        }

        void IData.Log(string message)
        {
            Console.WriteLine($"Log - {message}");
        }
    }
}
