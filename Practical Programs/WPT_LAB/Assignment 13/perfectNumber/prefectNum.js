const express = require('express');
const app = express();

app.set('view engine', 'hbs');
app.use(express.urlencoded({ extended: true }));

const isPerfect = n => {
  let sum = 0;
  for (let i = 1; i < n; i++) {
    if (n % i === 0) sum += i;
  }
  return sum === n;
};

app.get('/', (req, res) => res.render('index', { result: null }));

app.post('/', (req, res) => {
  const num = +req.body.number;
  const result = isPerfect(num)
    ? `${num} is Perfect`
    : `${num} is Not Perfect`;
  res.render('index', { result });
});

app.listen(3000, () => console.log('http://localhost:3000'));