namespace _09Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IDemo obj = new MyClass();
            obj.Foo();
            //obj.Log();
        }
    }

    public interface IDemo
    {
        public static int id;
        void Foo();
        protected void Log()
        {
            Console.WriteLine("Log method from IDemo interface");
        }
    }

    public class MyClass : IDemo
    {
        public void Foo()
        {
            Console.WriteLine("Foo method from MyClass");
        }
        protected void Log()
        {
            Console.WriteLine("Log method from MyClass");
        }
    }
}
