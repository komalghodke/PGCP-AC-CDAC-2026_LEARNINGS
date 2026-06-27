using Microsoft.AspNetCore.Mvc;

namespace AttributeBasedRoutingDemo.Controllers
{
    // Token based Routing
    [Route("{controller}")]
    public class EmpController : Controller
    {
        [Route("{action}")] // "/Emp/Index"
        public IActionResult Index()
        {
            return View();
        }
        [Route("{action}/{unm?}/{pwd?}")]// "/Emp/About/unm/pwd"
        public IActionResult About(string? unm, string? pwd)
        {
            return View();
        }
    }
}
