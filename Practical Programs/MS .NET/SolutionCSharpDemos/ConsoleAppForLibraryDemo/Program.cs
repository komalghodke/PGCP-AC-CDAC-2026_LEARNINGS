using ConsoleAppForLibraryDemo;
using ConsoleAppForLibraryDemo.Logics;

// UI : Buissness Presentation Logic
Demo demo = new Demo();

demo.DemoMethod();

Emp emp = new Emp();
emp.FullName = "Hugh Jackman";
Console.WriteLine(emp.FullName);