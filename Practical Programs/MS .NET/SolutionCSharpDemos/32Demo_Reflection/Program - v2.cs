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

//                string methodSignature = "";

//                MethodInfo[] allMethods = type.GetMethods();

//                for (int j = 0; j < allMethods.Length; j++)
//                {
//                    MethodInfo method = allMethods[j];
//                    // void Add(  // void Sub(

//                    methodSignature = method.ReturnType.ToString() + " " + method.Name + "(";

//                    ParameterInfo[] allParameters = method.GetParameters();

//                    for (int k = 0; k < allParameters.Length; k++)
//                    {
//                        ParameterInfo currentParameter = allParameters[k];

//                        // void Add( System.Int32 x, System.Int32 y,
//                        methodSignature = methodSignature + " " + currentParameter.ParameterType.ToString() + " " + currentParameter.Name + ",";
//                    }
//                    // void Add( System.Int32 x, System.Int32 y)
//                    methodSignature = methodSignature.TrimEnd(',') + ")";
//                    Console.WriteLine(methodSignature);
//                }
//            }
//        }
//    }
//}
