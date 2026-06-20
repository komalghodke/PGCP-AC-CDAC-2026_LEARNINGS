namespace _18Demo_Delegate
{
    public delegate int MyDelegate2(int p, int q);
    public delegate int MyDelegate3(int x);
    internal class Program
    {
        public delegate void ShowPointer();
        public delegate void MyDelegate(string nm);
        static void Main(string[] args)
        {
            #region Demo 1
            //Show();
            //ShowPointer pointer = new ShowPointer(Show);
            //pointer.Invoke();

            //ShowPointer pointer2 = new ShowPointer(Display);
            //pointer2.Invoke();
            //pointer2();

            //MyDelegate del = new MyDelegate(Greet);
            //del.Invoke("Hugh Jackman");
            //del("Tom Holland"); 
            #endregion

            CMath cmath = new CMath();
            
            MyDelegate2 adddel = new MyDelegate2(cmath.Add);
            int addResult = adddel(2, 3);
            Console.WriteLine($"Add = {addResult}");

            MyDelegate2 subdel = new MyDelegate2(cmath.Sub);
            Console.WriteLine($"Sub = {subdel(33,3)}");

            MyDelegate3 squaredel = new MyDelegate3(cmath.Square);
            Console.WriteLine($"Square = {squaredel(3)}");

        }
        static void Show()
        {
            Console.WriteLine("Show");
        }
        static void Display()
        {
            Console.WriteLine("Display");
        }
        static void Greet(string name)
        {
            Console.WriteLine($"Hello, {name}");
        }
    }

    public class CMath
    {
        public int Add(int x, int y)
        {
            return x + y;
        }
        public int Sub(int x, int y)
        {
            return x - y;
        }
        public int Square(int x)
        {
            return x * x;
        }
    }

}
