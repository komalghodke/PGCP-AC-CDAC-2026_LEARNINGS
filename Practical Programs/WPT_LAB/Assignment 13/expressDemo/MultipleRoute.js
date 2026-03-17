const express = require('express');
const app = express();

app.use(express.json());

let products = require('./product.json');

app.get('/', (req, res) => {
  res.json(products);
});

app.get('/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const product = products.find(p => p.prodid === id);
  product ? res.json(product) : res.status(404).send('Product not found');
});

app.post('/add', (req, res) => {
  const { prodid, ProductName, price } = req.query;
  const newProduct = { prodid: parseInt(prodid), ProductName, price: parseInt(price) };
  products.push(newProduct);
  res.json(newProduct);
});

app.post('/insert', (req, res) => {
  const newProduct = req.body;
  products.push(newProduct);
  res.json(newProduct);
});

app.delete('/:id', (req, res) => {
  const id = parseInt(req.params.id);
  products = products.filter(p => p.prodid !== id);
  res.send(`Product with id ${id} deleted`);
});

app.listen(4050, () => {
  console.log(`Server running at http://localhost:4050`);
});


// const express = require('express')
// const fs = require('fs');
// const app = express();
// // app.get("/", (req, res) => {
// //     res.send("From Express");
// // })
// //app.listen(4050);

// app.use(express.json());

// function getProducts() {
//     const data = fs.readFileSync('product.json');
//     return JSON.parse(data);
// }
// +
//     app.get('/', (req, res) => {
//         res.json(getProducts());
//     });

// app.listen(4050, () => {
//     console.log(`Server running at http://localhost:4050`);
// });