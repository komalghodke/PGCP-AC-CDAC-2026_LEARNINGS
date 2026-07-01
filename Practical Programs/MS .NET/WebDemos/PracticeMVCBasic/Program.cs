using Microsoft.EntityFrameworkCore;
using PracticeMVCBasic.DAL;

namespace PracticeMVCBasic
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            builder.Services.AddControllersWithViews();

            builder.Services.AddDbContext<EmpDbContext>(options => options.UseSqlServer("name=myConStr"));
            var app = builder.Build();

            app.MapGet("/", () => "Hello World!");

            app.MapDefaultControllerRoute();
            app.Run();
        }
    }
}
