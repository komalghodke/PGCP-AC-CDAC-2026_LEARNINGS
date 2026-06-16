using System;

namespace Day2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            AdvMath adv = new AdvMath();
            Console.WriteLine("using Object AdvMath\n" +
                "AdvMath adv = new AdvMath()\n" + adv.Add(10, 20)); 
            Console.WriteLine("\nusing Object AdvMath\n" +
                "AdvMath adv = new AdvMath()\n" + adv.Sub(100, 20));

            BasicMath b = new AdvMath();
            Console.WriteLine("\nusing Object AdvMath\n" +
                "BasicMath b = new AdvMath()\n" + b.Add(10, 20));

            Console.WriteLine("\nusing Object AdvMath\n" +
                "BasicMath b = new AdvMath()\n" + b.Sub(100, 20));
        }
    }
    public class BasicMath
    {
        public virtual int Add(int x, int y) 
        {
            return x + y;
        }
        public int Sub(int x, int y)
        {
            return x - y;
        }
    }

    public class AdvMath : BasicMath
    {
        public override int Add(int x, int y)
        {
            return x + y + 1000;
        }
        public new int Sub(int x, int y)
        {
            return (x - y) * 100;
        }
    }
}
