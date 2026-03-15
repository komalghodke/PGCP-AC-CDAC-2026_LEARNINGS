const fs = require('fs'); 

fs.mkdirSync('myDir'); 

console.log("sample.txt exists?", fs.existsSync('sample.txt')); 

fs.renameSync('product.txt', 'productRenamed.txt');

fs.unlinkSync('productRenamed.txt');
