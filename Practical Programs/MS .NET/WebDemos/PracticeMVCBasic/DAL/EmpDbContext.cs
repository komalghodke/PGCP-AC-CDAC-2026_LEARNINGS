using Microsoft.EntityFrameworkCore;

namespace PracticeMVCBasic.DAL
{
    public class EmpDbContext : DbContext
    {
        private string _connectionString = null;
        public EmpDbContext(IConfiguration configuration)
        {
            _connectionString = configuration.GetConnectionString("myConStr");
        }

    }
}
