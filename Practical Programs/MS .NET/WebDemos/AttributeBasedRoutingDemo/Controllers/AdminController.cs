using Microsoft.AspNetCore.Mvc;

namespace AttributeBasedRoutingDemo.Controllers
{
    [Route("BVS")] // "/BVS/Dashboard"
    public class AdminController : Controller
    {
        [Route("Dashboard")]
        public IActionResult Index()
        {
            return View();
        }

        [Route("Demo/{id?}")]// "/BVS/Demo"
        public IActionResult GetData(int? id)
        {
            return View("Data");
        }

        [Route("Test")]// "/BVS/Test"
        public IActionResult GetInfo()
        {
            return RedirectToAction("Index");
        }
    }
}
