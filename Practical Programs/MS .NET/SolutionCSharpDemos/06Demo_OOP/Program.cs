namespace _06Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your choice: 1. Cola, 2. Tea");
            int ch = Convert.ToInt32(Console.ReadLine());
            DrinkFactory factory = new DrinkFactory();
            IDrink drink = factory.GetSomeDrink(ch);
            Console.WriteLine($"Enjoy your drink = {drink.GetDrink()}");
        }
    }
    public interface IDrink
    {
        string GetDrink();
    }

    public class DrinkFactory
    {
        public IDrink GetSomeDrink(int ch)
        {
            IDrink drink = null;
            switch (ch)
            {
                case 1:
                    drink = new ColdDrink();
                    break;
                case 2:
                    drink = new HotDrink();
                    break;
                default:
                    Console.WriteLine("Invalid choice");
                    break;
            }

            return drink;
        }
    }
    public class ColdDrink : IDrink
    {
        public string GetDrink()
        {
            // if-else
            return "Cola";
        }
    }
    public class HotDrink : IDrink
    {
        public string GetDrink()
        {
            return "Tea";
        }
    }
}
