using System.Diagnostics;

namespace _46Demo_Threading
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region By default thread has no name but has ManagedThreadId
            Thread t = Thread.CurrentThread;
            t.Name = "Main Thread";
            Console.WriteLine(t.Name);
            Console.WriteLine(t.ManagedThreadId);
            #endregion

            #region Normal Method Call
            //Method1();
            //Method2();
            //Method3();
            #endregion

            #region Call to method by using Thread

            //Thread t1 = new Thread(Method1) {Name = "th 01" };
            //Thread t2 = new Thread(Method2) { Name = "th 02" };
            //Thread t3 = new Thread(Method3) { Name = "th 03" };

            //t1.Start();
            //t2.Start();
            //t3.Start();

            //ThreadStart st = new ThreadStart(Method2);
            //Thread t2 = new Thread(st);

            #endregion

            #region isAlive and Join Method
            ////F1();
            ////F2();
            //Console.WriteLine("Main method execution started");
            //Thread t4 = new Thread(F1);
            //t4.Start();
            //Thread t5 = new Thread(F2);
            //t5.Start();

            //if (t4.Join(2000))
            //{
            //    Console.WriteLine("F1 execution complete");
            //}
            //t5.Join();
            //Console.WriteLine("F2 execution complete");

            //if (t4.IsAlive)
            //{
            //    Console.WriteLine("F1 execution is still going on");
            //}
            //else
            //{
            //    Console.WriteLine("F1 execution is complete");
            //}

            //Console.WriteLine("Main method execution complete");
            #endregion

            #region Normal Method Call: timetaken = 7854511
            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            //for (int i = 0; i < 10; i++)
            //{
            //    DoSomethingComplex();
            //}
            //watch.Stop();
            //Console.WriteLine($"Time taken= {watch.ElapsedTicks} ticks");
            #endregion

            #region using Thread and ThreadStart: timeTaken = 4594592
            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            //for (int i = 0; i < 10; i++)
            //{
            //    Thread t = new Thread(new ThreadStart(DoSomethingComplex));
            //    t.Start();
            //}
            //watch.Stop();
            //Console.WriteLine($"Time taken= {watch.ElapsedTicks} ticks");
            #endregion

            #region using Thread and ThreadStart: timeTaken =  163119
            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            //for (int i = 0; i < 10; i++)
            //{
            //    Task tsk = new Task(new Action(DoSomethingComplex));
            //    tsk.Start();
            //    Console.WriteLine($"Current task Id: {tsk.Id}");
            //}
            //watch.Stop();
            //Console.WriteLine($"Time taken= {watch.ElapsedTicks} ticks");
            #endregion

            #region ParallelForEach - Implicit Parallel Programming
            //// TPL - Task Parallel Library: System.Threading.Tasks
            //// Time taken =   58456
            //int[] arr = { 1,2,3,4,5,6,7,8,9,10};
            //Stopwatch sw = new Stopwatch();
            //sw.Start();
            //// Time taken =   58456
            ////foreach (var item in arr)
            ////{
            ////    Console.WriteLine($"Number: {item}, Thread id: {Thread.CurrentThread.ManagedThreadId}");
            ////}
            //// time taken =  411606
            //Parallel.ForEach(arr, (item) => {
            //    Console.WriteLine($"Number: {item},---Task Id :{Task.CurrentId}");
            //    //Console.WriteLine($"Number: {item},---Task Id :{Task.CurrentId},--- Thread id: {Thread.CurrentThread.ManagedThreadId}");
            //});
            ////Parallel.For()

            //sw.Stop();
            //Console.WriteLine($"Time Taken : { sw.ElapsedTicks} ticks");
            #endregion

            #region Parallel LINQ
            List<Emp> allEmployees = new List<Emp>() {
             new Emp(){ ID =11,Name ="Jignesh", Address ="Patna"},
             new Emp(){ ID =12,Name ="Prathamesh", Address ="Nashik"},
             new Emp(){ ID =13,Name ="Devendra", Address ="Nagpur"},
             new Emp(){ ID =14,Name ="Kalpesh", Address ="Kerla"},
             new Emp(){ ID =15,Name ="kushendra", Address ="Indore"}
            };

            //Parallel LINQ -> PLINQ
            var result = (from emp in allEmployees.AsParallel()
                          where emp.Address.StartsWith("N")
                          select emp);

            foreach (var emp in result)
            {
                Console.WriteLine($"Name: {emp.Name}, Address: {emp.Address}");

            }

            #endregion
            
        }
        static void F1()
        {
            Console.WriteLine("F1 method execution started");
            Thread.Sleep(5000);
            Console.WriteLine("method F1 is awake");
            Console.WriteLine("F1 execution complete");
        }
        static void F2()
        {
            Console.WriteLine("F2 method execution started");
        }
        static void Method1()
        {
            for (int i = 0; i <= 5; i++)
            {
                Console.WriteLine($"Method1 - Count: {i}");
            }
        }
        static void Method2()
        {
            for (int i = 0; i <= 5; i++)
            {
                Console.WriteLine($"Method2 - Count: {i}");
            }
        }
        static void Method3()
        {
            for (int i = 0; i <= 5; i++)
            {
                Console.WriteLine($"Method3 - Count: {i}");
            }
        }
        public static void DoSomethingComplex()
        {
            for (int i = 0; i < 100000; i++)
            {
                for (int j = 0; j < 1000; j++)
                {
                    // Nothing here...
                }
            }
        }
    }
    public class Emp
    {
        public int ID { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
    }

    
}
