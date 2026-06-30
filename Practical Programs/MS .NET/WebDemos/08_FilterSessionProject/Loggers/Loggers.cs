namespace _08_FilterSessionProject.Loggers
{
    public class Logger {
        private static readonly Logger _logger = new Logger();
        private Logger()
        {
            
        }
        public static Logger CurrentLogger
        {
            get { return _logger; }
        }
    }
}
