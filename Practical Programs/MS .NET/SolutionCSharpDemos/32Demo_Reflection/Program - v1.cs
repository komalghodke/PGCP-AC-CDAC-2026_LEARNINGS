//using System.Reflection;

//namespace _32Demo_Reflection
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
//            string assemblyPath = @"D:\2026\DotNet\IET_Feb_26\CSharpDemos26\31MyMathLib\bin\Debug\net8.0\31MyMathLib.dll";

//            Assembly asm = Assembly.LoadFrom(assemblyPath);

//            Type[] allTypes = asm.GetTypes();

//            for (int i = 0; i < allTypes.Length; i++) 
//            {
//                Type type = allTypes[i];
//                #region type Properties
//                //Console.WriteLine(type.IsPublic);
//                //Console.WriteLine(type.IsGenericType);
//                //Console.WriteLine(type.FullName);
//                //Console.WriteLine(type.Name); 
//                #endregion

//                MethodInfo[] allMethods =type.GetMethods();
//                for (int j = 0; j < allMethods.Length; j++)
//                {
//                    MethodInfo method = allMethods[j];
//                    Console.WriteLine(method.Name);
//                    //Console.WriteLine(method.ReturnType.ToString());

//                    ParameterInfo[] allParameters =  method.GetParameters();

//                    for (int k = 0; k < allParameters.Length; k++)
//                    {
//                        ParameterInfo currentParameter = allParameters[k];
//                        Console.WriteLine(currentParameter.Name+" "+currentParameter.ParameterType.ToString());
//                    }

//                }
//            }
//        }
//    }
//}
