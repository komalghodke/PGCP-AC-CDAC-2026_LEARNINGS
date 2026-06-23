using System.Reflection;
using _36Demo_MyCustomAttribute;

namespace _37Demo_MyORM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string assemblyPath = @"D:\CDAC_IET\PGCP-AC Notes IET\MS. NET\CSharpDemos26\34Demo_EmpLib\bin\Debug\net9.0\34Demo_EmpLib.dll";

            Assembly asm = Assembly.LoadFrom(assemblyPath);

            Type[] allTypes = asm.GetTypes();

            for (int i = 0; i < allTypes.Length; i++)
            {
                Type type = allTypes[i];

                Attribute[] attr = type.GetCustomAttributes().ToArray();

                string query = "CREATE TABLE ";

                for (int j = 0; j < attr.Length;  j++)
                {
                    Attribute currentAttr = attr[j];
                    if (currentAttr is TableAttribute)
                    { 
                        TableAttribute table = currentAttr as TableAttribute;

                        //"CREATE TABLE Emp("
                        query = query + table.TableName + "( ";
                    }
                }

               PropertyInfo[] allProperties = type.GetProperties();

                for (int j = 0; j < allProperties.Length; j++)
                {
                    PropertyInfo currentProp = allProperties[j];

                   Attribute [] propAttr = currentProp.GetCustomAttributes().ToArray();
                    for (int k = 0; k < propAttr.Length; k++)
                    {
                        Attribute attribute = propAttr[k];
                        if (attribute is ColumnAttribute)
                        {
                            ColumnAttribute column = attribute as ColumnAttribute;

                            //"CREATE TABLE Emp( Id int,Name varchar(50), Address varchar(50),"
                            query = query + column.ColumnName+" "+ column.ColumnType+ ",";
                        }
                    }

                }
                //"CREATE TABLE Emp( Id int,Name varchar(50), Address varchar(50))"

                query = query.TrimEnd(',') + ")";
                Console.WriteLine(query);

                File.WriteAllText(@"D:\CDAC_IET\PGCP-AC Notes IET\MS. NET\CSharpDemos26\37Demo_MyORM\SQLQueries\myquery.sql", query);
                Console.WriteLine("Done");
            }
        }
    }
}
