using _14Demo_CMathLib;

namespace _15Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CMath cmath = new CMath();
            cmath.Add(10, 20);
            Test test = new Test();
            test.TestWrapperMethod();
        }
    }

    public class Test:CMath
    {
        public void TestWrapperMethod()
        {
            Add(4,4); // Public 
            Mutl(4,4); // Protected
            Square(3); // Protected Internal
        }
    }
}
