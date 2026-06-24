namespace _42Demo_ConnectedArchitecture.Models
{
    public class Emp // POCO: Buisness Model
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }

        public void GetEmpData()
        {
            Console.WriteLine($"Id: {Id},Name: {Name}, Address: {Address}");
        }
    }
}
