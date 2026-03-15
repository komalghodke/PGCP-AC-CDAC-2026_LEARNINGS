const fs = require('fs');

fs.writeFileSync('product.txt', 'Product Data: Laptop, Price: 50000');

fs.writeFile('product.txt', 'Product Data: Phone, Price: 30000', err => {
  if (err) throw err;
  console.log("Async Write Done");
});
