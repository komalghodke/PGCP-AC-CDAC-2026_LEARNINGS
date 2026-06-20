namespace _04Demo_OOP
{
    public class Employee
    {
        public string Department;
        public Employee()
        {
            
        }
        public Employee(string dept)
        {
            Department = dept;
        }
    }
    public class Devlopers:Employee
    {
        public string Projects;
        public Devlopers():base()
        {
            
        }
        // Ctor mapping, ctor chaining
        public Devlopers(string projectName, string dpt) :base(dpt)
        {
            Projects = projectName;
        }
    }
}
