using Microsoft.AspNetCore.Mvc;

namespace MVCBasicApplicationProj.Controllers
{
    // /Demo/Index
    public class DemoController : Controller
    {
        // "/Home/Index/id?"
        public IActionResult Index()
        {
            return View();
        }

        // "/Demo/Data/'HJ'/'1234'"
        public string Data(string unm, string pwd)
        {
            return $"User Name : {unm}, Password: {pwd}";
        }
        // you have to use Query String format: ? then after ? pass parameters in URL
        // "/Demo/Dashboard?id=5&nm=Tom Ellise"
        public string Dashboard(int? id, string? nm)
        {
            return $"Id: {id},name: {nm}";
        }
    }
}
