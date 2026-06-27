using Microsoft.AspNetCore.Mvc;

namespace AttributeBasedRoutingDemo.Controllers
{
    [Route("Home")]
    public class HomeController : Controller
    {
        [Route("")]  // "/"
        [Route("Index")]// "/Ho                                                                                                                                                                                                                    me/Index"
        [Route("~/")] // "/Home"
        public IActionResult Index()
        {
            return View();
        }

        [Route("About")]//"/Home/About"
        public IActionResult About()
        {
            return View();
        }
    }
}
