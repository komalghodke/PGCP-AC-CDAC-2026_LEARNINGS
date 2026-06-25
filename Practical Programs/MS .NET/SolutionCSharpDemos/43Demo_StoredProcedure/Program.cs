using Microsoft.Data.SqlClient;

namespace _43Demo_StoredProcedure
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string _conString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=testDb;Integrated Security=True;";
            InsertDepartment(_conString, "IT");
            InsertDepartment(_conString, "HR");
            InsertDepartment(_conString, "Admin");

            InsertEmployee(_conString, "Samwise Gamgee", 3);
            InsertEmployee(_conString, "Fordo Baggins", 1);
            InsertEmployee(_conString, "Gandalf The Gray", 1);
            InsertEmployee(_conString, "Aragorn", 2);
            InsertEmployee(_conString, "Gimlee", 1);
            InsertEmployee(_conString, "Sauron", 3);

            GetEmployeeByDepartment(_conString, 1);
            GetEmployeeByDepartment(_conString, 2);
            GetEmployeeByDepartment(_conString, 3);


        }
        // DbContext Class
        public static void InsertDepartment(string constr,string deptName) 
        {
            using (SqlConnection con = new SqlConnection(constr))
            {
                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandText = "InsertDepartment";
                    cmd.CommandType = System.Data.CommandType.StoredProcedure;
                    cmd.Connection = con;
                    cmd.Parameters.AddWithValue("@DepartmentName", deptName);

                    con.Open();

                    cmd.ExecuteNonQuery();
                }
            }
        }

        public static void InsertEmployee(string constr,string empName, int deptId) 
        {
            using (SqlConnection con = new SqlConnection(constr))
            {
                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandText = "InsertEmployee";
                    cmd.CommandType = System.Data.CommandType.StoredProcedure;
                    cmd.Connection = con;
                    cmd.Parameters.AddWithValue("@EmployeeName", empName);
                    cmd.Parameters.AddWithValue("@DepartmentId", deptId);

                    con.Open();

                    cmd.ExecuteNonQuery();
                }
            }
        }

        public static void GetEmployeeByDepartment(string constr,int deptId)
        {
            using (SqlConnection con = new SqlConnection(constr))
            {
                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandText = "GetEmployeeByDepartment";
                    cmd.CommandType = System.Data.CommandType.StoredProcedure;
                    cmd.Connection = con;
                    cmd.Parameters.AddWithValue("@DepartmentId", deptId);

                    con.Open();

                    using (SqlDataReader reader = cmd.ExecuteReader())
                    {
                        while (reader.Read()) 
                        {
                            Console.WriteLine($"Id: {reader["EmployeeId"]}, Name: {reader["EmployeeName"]}");
                        }
                    }
                }
            }
        }

    }
}
