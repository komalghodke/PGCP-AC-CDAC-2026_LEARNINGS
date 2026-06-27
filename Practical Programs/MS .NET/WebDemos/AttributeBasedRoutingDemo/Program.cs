namespace AttributeBasedRoutingDemo
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            builder.Services.AddControllersWithViews();

            var app = builder.Build();

            // Supports Attribute based Routing
            app.MapControllers();

            app.Run();
        }
    }

}
