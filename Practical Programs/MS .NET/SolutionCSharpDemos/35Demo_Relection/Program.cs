using System.Reflection;
using _33Demo_MyLib;

namespace _35Demo_Relection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string assemblyPath = @"D:\CDAC_IET\PGCP-AC Notes IET\MS. NET\CSharpDemos26\34Demo_EmpLib\bin\Debug\net9.0\34Demo_EmpLib.dll";

            Assembly asm = Assembly.LoadFrom(assemblyPath);
            Type[] alltypes = asm.GetTypes();

            for (int i = 0; i < alltypes.Length; i++)
            {
                Type type = alltypes[i]; // Emp

                Attribute[] allAttributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < allAttributes.Length; j++)
                {
                    Attribute attr = allAttributes[j];

                    if (attr is CompanyInfoAttribute)
                    {
                        CompanyInfoAttribute comp = attr as CompanyInfoAttribute;

                        Console.WriteLine($"Company Name: {comp.CompanyName}, Developer Name: {comp.DeveloperName}");
                    }
                }
            }
        }
    }
}
