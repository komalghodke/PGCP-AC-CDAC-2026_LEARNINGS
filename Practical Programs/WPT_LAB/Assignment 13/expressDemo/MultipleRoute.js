const express = require('express')
const fs = require('fs');
const app = express();
// app.get("/", (req, res) => {
//     res.send("From Express");
// })
//app.listen(4050);

app.use(express.json());

function getProducts() {
    const data = fs.readFileSync('product.json');
    return JSON.parse(data);
}
+
    app.get('/', (req, res) => {
        res.json(getProducts());
    });

app.listen(4050, () => {
    console.log(`Server running at http://localhost:4050`);
});
