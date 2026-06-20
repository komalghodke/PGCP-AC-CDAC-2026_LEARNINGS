namespace _20Demo_ObserverDesignPattern
{
    public delegate void MyHandler();
    internal class Program
    {
        static void Main(string[] args)
        {
            // Coupling Publisher/ Observer with Subscriber
            Publisher publisher = new Publisher();
            Subscriber subscriberA = new Subscriber();
            Subscriber subscriberB = new Subscriber();
           
          publisher.NotifyChange  += new MyHandler(subscriberA.SMSServices);
            publisher.NotifyChange += new MyHandler(subscriberB.EMailSevice);

            WeatherStation obj = new WeatherStation();
            if (obj.Alert())
            {
                publisher.RaiseNotification();
            }

            // De-coupling operator
            publisher.NotifyChange -= new MyHandler(subscriberB.EMailSevice);

            publisher.NotifyChange += new MyHandler(subscriberB.WhatsAppSevice);

            if (obj.Alert())
            {
                publisher.RaiseNotification();
            }
        }
    }
    public class WeatherStation
    {
        public bool Alert()
        {
            return true;
        }
    }
    public class Publisher  // Observer
    {
        // Event raise
        public event MyHandler NotifyChange;

        public void RaiseNotification()
        {
             NotifyChange();
        }


    }

    public class Subscriber
    {
        public void SMSServices()
        {
            Console.WriteLine("SMS sent because of change in Data");
        }

        public void EMailSevice()
        {
            Console.WriteLine("EMail sent because of change in Data");
        }
        public void WhatsAppSevice()
        {
            Console.WriteLine("Whats app message sent because of change in Data");
        }
    }


}
