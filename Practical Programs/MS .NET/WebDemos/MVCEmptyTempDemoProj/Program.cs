namespace MVCEmptyTempDemoProj
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // SERVICESS ABOVE builder.Build(); 
            var app = builder.Build();  //Call Express
            // Middleware below builder.Build(); 

            app.MapGet("/", () => "GET: Hello World!");

            // Middlewares
            #region Map.GET/Map.Post etc
            app.MapGet("/abc", () => "something!");
            app.MapPost("/", () => "POST: Hello World!");
            //app.MapPut("/", () => "PUT: Hello World!"); 
            //app.MapDelete("/", () => "DELETE: Hello World!");
            //app.MapGet("/", () => "<h1>GET: Hello World!</h1>"); 
            #endregion

            app.Use(async (httpcontext, next) => {
                await httpcontext.Response.WriteAsync("Hello, Hugh Jackman!!");
                await httpcontext.Response.WriteAsync("\nWel-come to Asp.Net MVC Core Web Application");

                await httpcontext.Response.WriteAsync("\nDo not sleep in my class!!");
                next(httpcontext);

                await httpcontext.Response.WriteAsync("\nStill getting this output");
            });

            app.Use(async (httpcontext, next) => {
                await httpcontext.Response.WriteAsync("\nABCD");
                await httpcontext.Response.WriteAsync("\n1234");

                next(httpcontext);

                await httpcontext.Response.WriteAsync("\nTom Holland");
            });


            app.Run(async (HttpContent) => {
                await HttpContent.Response.WriteAsync("\n DO NOT SLEEP IN MY CLASS!! ");
            });

            app.Run();
        }
    }
}
