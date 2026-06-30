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

        public void Log(string message)
        {
            _logger.Log(message);
            string filePath = @"D:\CDAC_IET\PGCP-AC-CDAC-2026_LEARNINGS\Practical Programs\MS .NET\WebDemos\08_FilterSessionProject\FileLogs\appLog.txt";
            FileStream fileStream = null;
            if (File.Exists(filePath))
            {
                fileStream = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            }
            else
            {
                fileStream = new FileStream(filePath, FileMode.Create, FileAccess.Write);
            }
            StreamWriter writer = new StreamWriter(fileStream);
            writer.Write($"Logged At {DateTime.Now.ToString()} : {message}");
            writer.Close();
            fileStream.Close();
            writer = null;
            fileStream = null;
        }
    }
}
