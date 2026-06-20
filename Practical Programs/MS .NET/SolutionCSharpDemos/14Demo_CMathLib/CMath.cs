namespace _14Demo_CMathLib
{
    public class CMath
    {
        // Access Modifier along with Class Library

        //Accessible within the same assembly and also outside the assembly.
        public void Add(int x, int y) 
        {
            Console.WriteLine($"Add = {x + y}");
        }

        //Accessible within the same class.
        private void Sub(int x, int y)
        {
            Console.WriteLine($"Sub = {x - y}");
        }

        //Accessible within the same assembly and also outside the assembly but only within the inherted hierarchy
        protected void Mutl(int x, int y)
        {
            Console.WriteLine($"Mult = {x * y}");
        }

        //Accessible within the same assembly, only internally accessible/ kind off public within the same assembly
        internal void Div(int x, int y)
        {
            Console.WriteLine($"div = {x / y}");
        }

        // Accessible with the assembly like internal and outside the assembly as protected
        protected internal void Square(int x)
        {
            Console.WriteLine($"Square = {x * x}");
        }
    }

    public class Demo
    {
        public void WrrapperMethod()
        { 
            CMath obj = new CMath();
            obj.Add( 1, 2 );

            obj.Div(12, 4);
            obj.Square(5); // Protected Internal

        }
    }

    public class MyClass:CMath
    {
        public void WrapperMethod()
        {
            Mutl(2,3);
            Add(2,3);
            Div(12,3);
            Square(7); // Protected Internal
        }
    }
}
