namespace _19Demo_Events_Delegate
{
    public delegate void ResultHandler(int mrk);
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Only Delegate code 
            //// Class Obj
            //Student student = new Student();

            //// Couple/ Bind : Delegate with Methods
            //ResultHandler passHandler = new ResultHandler(student.pass_student);
            //ResultHandler failHandler = new ResultHandler(student.Fail_student);

            //// Invoke Delegate
            //Console.WriteLine("Enter your Marks : ");
            //student.Mark = Convert.ToInt32(Console.ReadLine());

            //if (student.Mark > 40)
            //{
            //    //student.pass_student(student.Mark);
            //    passHandler(student.Mark);
            //}
            //else
            //{
            //    //student.Fail_student(student.Mark);
            //    failHandler(student.Mark);
            //} 
            #endregion

            // Event coupled with Delegate
            //btn1.Click += new EventHandler(btn1_Click);


            Student std = new Student();
            
            // Event coupled with Delegate
            // += coupling operator
            std._Pass += new ResultHandler(std.pass_student);
            std._Fail += new ResultHandler(std.Fail_student);

            //Console.WriteLine("Enter Your MArks: ");
            //int mrk = Convert.ToInt32(Console.ReadLine());
            //std.RaiseEvent(mrk);

            Console.WriteLine("Enter Your MArks: ");
            std.Mark = Convert.ToInt32(Console.ReadLine());
           
        }
    }
    public class Student
    {
        // Events are always declared inside the classes.
        // You can invoke / Raise events only within the same class.
        public event ResultHandler _Pass;
        public event ResultHandler _Fail;

        private int _Mark;
        public int Mark 
        {
            set 
            {
                _Mark = value;
                if (_Mark > 40)
                    _Pass(_Mark);
                else
                    _Fail(_Mark);
            
            }
            get { return _Mark; }
        }

        public void RaiseEvent(int mrk)// NotifyEvent
        {
            if (mrk > 40)
            { 
                _Pass.Invoke(mrk);
            }
            else
            {
                _Fail(mrk);
            }
        }
        public void pass_student(int mrk)
        {
            Console.WriteLine($"Congratulations! you have passed with {mrk} marks!!!!");
        }

        public void Fail_student(int mrk)
        {
            Console.WriteLine($"Congratulations! you have Failed with {mrk} marks!!!!");
        }

    }
}
