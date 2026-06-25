using Microsoft.Data.SqlClient;
using System.Data;

namespace _44Demo_DisconnectedArchiteture
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string conStr = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=testDb;Integrated Security=True";

            #region Select Query using SqlDataAdapter
            SqlConnection con = new SqlConnection(conStr);

            string selectQuery = "Select * from Emp";

            SqlDataAdapter da = new SqlDataAdapter(selectQuery, con);
            SqlCommandBuilder builder = new SqlCommandBuilder(da);

            DataTable dt = new DataTable("Emp");

            // this line will help DataAdaptor to fetch Primary key column schema from Database and apply it on DataTable respective columns.
            da.MissingSchemaAction = MissingSchemaAction.AddWithKey;

            da.Fill(dt);

            foreach (DataRow row in dt.Rows)
            {
                Console.WriteLine($"Id: {row["Id"]}, Name: {row["Name"]}, Address: {row["Address"]}");
            }
            #endregion



            #region Select, SQLCommand with DataSet
            // DataSet ds = new DataSet();
            // DataTable dt = new DataTable("Emp");

            // DataColumn col1 = new DataColumn("Id",typeof(int));
            // DataColumn col2 = new DataColumn("Name",typeof(string));
            // DataColumn col3 = new DataColumn("Address", typeof(string));

            // dt.Columns.Add(col1);
            // dt.Columns.Add(col2);
            // dt.Columns.Add(col3);
            // dt.PrimaryKey = new DataColumn[] { col1};

            // SqlConnection con = new SqlConnection(conStr);
            // SqlCommand cmd = new SqlCommand("Select * from Emp",con);
            // con.Open();

            //SqlDataReader reader =  cmd.ExecuteReader();
            // while (reader.Read()) 
            // {
            //     // we are asking DataTable to generate new DatRow class object as per already existing DataColumn Schema.Bcoz DataTable already has DataColumn collection.
            //     DataRow row = dt.NewRow();

            //     row["Id"] = Convert.ToInt32(reader["Id"]);
            //     row["Name"] = reader["Name"].ToString();
            //     row["Address"] = reader["Address"].ToString();

            //     dt.Rows.Add(row);
            // }

            // ds.Tables.Add(dt);

            // ds.WriteXml("D:\\CDAC_IET\\PGCP-AC Notes IET\\MS. NET\\CSharpDemos26\\44Demo_DisconnectedArchiteture\\Data\\empdata.xml");

            // //da.Fill(ds,"Emp");

            // foreach (DataRow row in ds.Tables["Emp"].Rows)
            // {
            //     Console.WriteLine($"Id: {row["Id"]}, Name: {row["Name"]}, Address: {row["Address"]}");
            // } 
            #endregion



            #region Insert 

            DataRow newRow = dt.NewRow();

            Console.WriteLine("Enter Id: ");
            newRow["Id"] = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter Name: ");
            newRow["Name"] = Convert.ToString(Console.ReadLine());

            Console.WriteLine("Enter Address: ");
            newRow["Address"] = Convert.ToString(Console.ReadLine());

            dt.Rows.Add(newRow);

            da.Update(dt);

            #endregion



            #region Update

            Console.WriteLine("Enter id for update: ");
            int idTobeUpdated = Convert.ToInt32(Console.ReadLine());

            DataRow rowToBeUpdated = dt.Rows.Find(idTobeUpdated);

            Console.WriteLine("Enter name to be updated: ");
            rowToBeUpdated["Name"] = Console.ReadLine();

            Console.WriteLine("Enter address to be updated: ");
            rowToBeUpdated["Address"] = Console.ReadLine();

            da.Update(dt);

            #endregion


            #region Delete
            Console.WriteLine("Enter id for delete: ");
            int idTobeDeleted = Convert.ToInt32(Console.ReadLine());

            DataRow rowPointer = dt.Rows.Find(idTobeDeleted);
            rowPointer.Delete();

            da.Update(dt);
            #endregion
        }
    }
}
