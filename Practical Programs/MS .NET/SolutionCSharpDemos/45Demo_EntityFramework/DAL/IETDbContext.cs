using _45Demo_EntityFramework.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;

namespace _45Demo_EntityFramework.DAL
{
    // DbContext: EF mapper class , mapping object with database
    public class IETDbContext : DbContext
    {
        // Middle Layer - .Net application with EntityFramework and EF with .NetApplication
        public DbSet<Emp> emps { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            // Service to read config file
            // A service to read appsettings.json file
            var builder = new ConfigurationBuilder();

            // Path : bin/debug/.Net9.0/application.dll
            builder.SetBasePath(Directory.GetCurrentDirectory());

            // Path : bin/debug/.Net9.0/appsettings.json
            builder.AddJsonFile("appsettings.json");

            IConfiguration config = builder.Build();

            optionsBuilder.UseSqlServer(config.GetConnectionString("conStr"));
        }
    }
}
