using _42Demo_ConnectedArchitecture.DataAccessLayer_DAL_;
using _42Demo_ConnectedArchitecture.Models;

namespace _42Demo_ConnectedArchitecture
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Buissness Presentation: UI

            while (true) 
            {
                Console.WriteLine("Enter your Db OPeartion CHoice: 1. Select, 2. Select by Id, 3. Insert, 4. Update, 5.Delete");
                int opchoice= Convert.ToInt32(Console.ReadLine());

                IETDbContext dbContext = new IETDbContext();

                switch(opchoice)
                {
                    case 1:
                       List<Emp> emps = dbContext.SelectRecords();
                        foreach (var emp in emps)
                        {
                            emp.GetEmpData();
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        break;

                }

                Console.WriteLine("Do you want to continue?: y/n");
                string ynChoice = Console.ReadLine().ToLower();
                if (ynChoice == "n")
                    break;
            }
        }
    }
}
