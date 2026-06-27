namespace MVCBasicApplicationProj
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Bind Services : Dependencies
            // DI Container
            builder.Services.AddControllersWithViews();

            var app = builder.Build();

            // Middlewares
            // "/", "/Home", "/Home/Index"
            // "/Home/Index/{id?}"
            //app.MapDefaultControllerRoute();

            // Conventional Based Routing 
            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Demo}/{action=Index}/{id?}"
                );

            app.MapControllerRoute(
               name: "bvs",
               pattern: "{controller=Demo}/{action=Data}/{unm}/{pwd}"
               );

            app.Run();// application configuration set to PORT: 5092, with dependencies set on Controllers and Views and choice of hosting server : IIS Express. with this host and run the application
        }
    }
}
