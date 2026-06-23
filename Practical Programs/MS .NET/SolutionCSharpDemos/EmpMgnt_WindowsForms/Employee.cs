namespace EmpMgnt_WindowsForms
{
    public class Employee
    {
        public string Name { get; }
        public string Email { get; }
        public string Designation { get; }

        public Employee(string name, string email, string designation)
        {
            Name = name;
            Email = email;
            Designation = designation;
        }

        public override string ToString()
        {
            return $"{Name} | {Email} | {Designation}";
        }
    }
}
