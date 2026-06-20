namespace _21Demo_MulticastDelegate
{
    public delegate void MyEventHandler();
    internal class Program
    {
        static void Main(string[] args)
        {
            // Multi-cast Delegate Syntax

            Console.WriteLine("Is Shahrikh Khan our special guest Here? ");
            bool isHere = false;

            AnnualFunction obj = new AnnualFunction();

            // Coupling multiple same signature methods to a single delegate reference using += operator.
            MyEventHandler handler = new MyEventHandler(obj.WelCome);         
            handler += new MyEventHandler(obj.HostSpeech);
            handler += obj.GuestSpeech;

            // Conditional coupling/ de-coupling
            if(isHere)
                handler += obj.SpecialGuestSpeech;
            else
                handler -= obj.SpecialGuestSpeech;

            handler += obj.Dance;
            handler += obj.DinnerParty;
            handler += obj.GoodBye;
            handler += obj.Packup;

            // Series of handlers invoke -- methods invoke
            handler();
           
        }
    }

    public class AnnualFunction()
    {
        public void WelCome()
        {
            Console.WriteLine("Wel-come to our function !!!");
        }
        public void HostSpeech()
        {
            Console.WriteLine("Host: Blah blah blah blah ");
        }
        public void GuestSpeech()
        {
            Console.WriteLine("Guest: Blah blah blah blah ");
        }
        public void SpecialGuestSpeech()
        {
            Console.WriteLine("SpecialGuest: Blah blah blah blah ");
        }
        public void Dance()
        {
            Console.WriteLine("Zhingaaat");
        }
        public void DinnerParty()
        {
            Console.WriteLine("Enjoy your food!!");
        }
        public void GoodBye()
        {
            Console.WriteLine("Host: Event is over..Ab Ghar jao!!!!!!");
        }
        public void Packup()
        {
            Console.WriteLine("Packup... Finally!!!");
        }
    }
}
