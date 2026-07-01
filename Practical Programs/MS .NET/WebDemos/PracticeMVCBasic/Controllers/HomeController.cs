using Microsoft.AspNetCore.Mvc;

namespace PracticeMVCBasic.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
