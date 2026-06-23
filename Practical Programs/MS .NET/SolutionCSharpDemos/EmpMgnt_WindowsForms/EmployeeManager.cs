using System.Collections.Generic;

namespace EmpMgnt_WindowsForms
{
    public class EmployeeManager
    {
        private List<Employee> employeeList = new List<Employee>();

        public void AddEmployee(Employee emp)
        {
            employeeList.Add(emp);
        }

        public List<Employee> GetEmployees()
        {
            return employeeList;
        }

        public void ClearEmployees()
        {
            employeeList.Clear();
        }
    }
}
