using _45Demo_EntityFramework.DAL;
using _45Demo_EntityFramework.Models;

namespace _45Demo_EntityFramework
{
    internal class Program
    {
        static void Main(string[] args)
        {

            IETDbContext _dbContext = new IETDbContext();
            //_dbContext.emps --> just like declaration of LINQ
            //_dbContext.emps.ToList() --> just like firing of LINQ query

            #region Select Query
            var result = _dbContext.emps.ToList();
            foreach (Emp emp in result)
            {
                Console.WriteLine($"Id: {emp.Id},Name:{emp.Name},Address: {emp.Address}");
            }
            #endregion

            #region Insert
            Emp empToBeInserted = new Emp() { Name = "Ron", Address = "Rome" };
            _dbContext.emps.Add(empToBeInserted);
            _dbContext.SaveChanges();
            #endregion

            #region Update
            int id = 8;
            Emp empToBeUpdated = _dbContext.emps.Find(id);
            empToBeUpdated.Name = "Peter";
            empToBeUpdated.Address = "Pune";

            _dbContext.SaveChanges();
            #endregion

            #region Delete
            //int idToBeDeleted = 2;
            //Emp empToBDeleted = _dbContext.emps.Find(idToBeDeleted);
            //_dbContext.emps.Remove(empToBDeleted);
            //_dbContext.SaveChanges();
            #endregion

        }
    }
}
