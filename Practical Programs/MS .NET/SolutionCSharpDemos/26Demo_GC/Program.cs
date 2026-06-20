//using statement : namespace resolve

namespace _26Demo_GC
{
    internal class Program
    {
        static void Main(string[] args)
        {
            MyClass obj = new MyClass();
            MyClass obj2 = new MyClass();
            //obj.Show();
            //obj.Dispose();

            // using block
            //using (MyClass obj = new MyClass())
            //{ 
            //    obj.Show();
            //}

            //GC.Collect(2);

            //Console.WriteLine(GC.GetGeneration(obj));
            //Console.WriteLine(GC.GetGeneration(obj2));

            //Console.WriteLine(GC.MaxGeneration);
           
        }
    }
    public class MyClass : IDisposable
    {
        //~MyClass() // Finalize
        //{
        //    Console.WriteLine("Destructor gets called..");
        //}
        public void Dispose()
        {
            Console.WriteLine("Despose method gets called..");
            GC.SuppressFinalize(this);
        }

        public void Show()
        {
            Console.WriteLine("Show method of MyClass");
        }
    }
}
