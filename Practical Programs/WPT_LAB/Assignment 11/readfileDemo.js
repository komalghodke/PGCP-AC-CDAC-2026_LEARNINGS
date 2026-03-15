const fs = require('fs');

let data = fs.readFileSync('sample.txt', 'utf8');
console.log("Sync Read:", data);

fs.readFile('sample.txt', 'utf8', (err, data) => {
  if (err) throw err;
  console.log("Async Read:", data);
});