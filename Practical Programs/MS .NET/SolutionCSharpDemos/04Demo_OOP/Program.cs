namespace _04Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Person class 
            //Person person = new Person();
            //person.PId = 14;
            //person.PName = "Hugh Jackman";
            //person.PCity = "NYC";
            //person.GetPersonDetails(); 
            #endregion

            #region CMath, AdvMath : Inheritance demo
            //CMath cmath = new CMath();
            //Console.WriteLine($"Add result  = {cmath.Add(10, 20)}");
            //Console.WriteLine($"Sub result  = {cmath.Sub(100, 20)}");

            //AdvMath advmath = new AdvMath();
            //Console.WriteLine($"Add result  = {advmath.Add(10, 20)}");
            //Console.WriteLine($"Sub result  = {advmath.Sub(100, 20)}");
            //Console.WriteLine($"Add result  = {advmath.Square(5)}"); 
            #endregion

            #region Virtual, Override, New Keyword, Overloadding demos 
            //AdvMath advMath = new AdvMath();
            //Console.WriteLine(advMath.Add(10, 20));
            //Console.WriteLine(advMath.Sub(100, 20));

            //advMath.Show();
            //advMath.Show("Blah blah blah");
            //advMath.Show("Blah blah blah", 14);

            //CMath cmath = new AdvMath();
            //Console.WriteLine(cmath.Add(10, 20));
            //Console.WriteLine(cmath.Sub(100, 20)); 
            #endregion

            Devlopers developers = new Devlopers("evoting", "IT");
        }
    }
    public class Person
    {
        // Fields
        public int PId;
        public string PName;
        public string PCity;

        // Ctor
        public Person()
        {
            Console.WriteLine("Person ctor");
        }

        // Methods
        public void GetPersonDetails()
        {
            Console.WriteLine($"Id= {PId}, Name = {PName}, City = {PCity}");
        }
    }

    public class CMath
    {
        public virtual int Add(int x, int y)
        {
            return x + y;
        }
        public int Sub(int x, int y)
        {
            return x - y;
        }
        public virtual int Mult(int x, int y)
        {
            return x * y;
        }

        public void Show()
        {
            Console.WriteLine("Show method");
        }
        // method overloading with the same class
        public void Show(string str)
        {
            Console.WriteLine($"Show method and {str}");
        }
    }

    public class AdvMath : CMath
    {
        // method overloading with the across the classes
        public void Show(string str, int id)
        {
            Console.WriteLine($"Show method and {str} and id  = {id}");
        }
        public override int Mult(int x, int y)
        {
            return (x*y) * 2;
        }
        public override int Add(int x, int y)
        {
            return x + y + 1000;
        }

        // Shadowing using new keyword : this to tell compiler to remove warning of intentional hiding of inherited member from base classes/ entities 
        public new int Sub(int x, int y)
        {
            return (x - y) * 100;
        }
        public int Square(int x)
        {
            return x * x;
        }

    }
}
