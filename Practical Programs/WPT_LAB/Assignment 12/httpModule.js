const http = require("http");

const server = http.createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/plain" });

    if (req.method === "GET") {
        if (req.url === "/") {
            res.end("Welcome to API Root");
        } else if (req.url === "/index") {
            res.end("<Index Page>");
        } else if (req.url === "/home") {
            res.end("<Home Page>");
        } else {
            res.end("404 Not Found");
        }
    } else if (req.method === "POST") {
        if (req.url === "/aboutus") {
            res.end("<About US>");
        } else {
            res.end("404 Not Found");
        }
    } else {
        res.end("Method Not Supported");
    }
});

server.listen(5050, () => {
    console.log("Server running on http://localhost:5050");
});
