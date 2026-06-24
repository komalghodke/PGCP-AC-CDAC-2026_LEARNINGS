using _42Demo_ConnectedArchitecture.Models;
using Microsoft.Data.SqlClient;

namespace _42Demo_ConnectedArchitecture.DataAccessLayer_DAL_
{
    // Data Access Layer/ DAL : DbContext Layer: This is responsible to perform IET db specific opeartions
    public class IETDbContext
    {
        string _connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=testDb;Integrated Security=True";
        public List<Emp> SelectRecords()
        {
            SqlConnection con = new SqlConnection(_connectionString);

            SqlCommand cmd = new SqlCommand("Select * from Emp",con);

            con.Open();

            SqlDataReader reader = cmd.ExecuteReader();
            List<Emp> emps = new List<Emp>();
            while (reader.Read())
            {
                // if reader represents a row and a row is a collection of columns
                int id = Convert.ToInt32(reader[0]);//Id
                string? nm = Convert.ToString(reader["Name"]);
                string? add = Convert.ToString(reader["Address"]);

                emps.Add(new Emp() {Id =id,Name=nm,Address= add });
            }

            con.Close();

            return emps;
        }
        public Emp SelectEmpById(int id)
        {
            return null;
        }
        public int InsertRecord(Emp obj)
        {
            return 0;
        }

        public int UpdateRecord(int id,Emp obj)
        {
            return 0;
        }

        public int DeleteRecord(int id)
        {
            return 0;
        }
    }
}
