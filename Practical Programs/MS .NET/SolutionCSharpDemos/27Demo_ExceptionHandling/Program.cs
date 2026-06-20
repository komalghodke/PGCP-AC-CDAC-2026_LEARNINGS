namespace _27Demo_ExceptionHandling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x = 10;
            int y = 0;
            try
            {
                if (y == 0)
                {
                    //throw new DivideByZeroException("y can not be Zero");
                    throw new MyCustomExeption("Divisor can not zero");
                }
                int div = x / y;
                Console.WriteLine($"Div result = {div}");
            }
            //catch (IndexOutOfRangeException ex) { }
            //catch (ObjectDisposedException obj) { }
            //catch (FileNotFoundException ex){ }
            catch (DivideByZeroException ex)
            {
                Console.WriteLine(ex.Message);
            }
            catch (MyCustomExeption ex)
            {
                Console.WriteLine(ex.Message);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Console.WriteLine("Every time this code  will get called..");
                //obj.Dispose();  
            }
        }
    }

    public class MyCustomExeption: Exception
    {
        public MyCustomExeption(string message):base(message)
        {
            
        }
    }
}
