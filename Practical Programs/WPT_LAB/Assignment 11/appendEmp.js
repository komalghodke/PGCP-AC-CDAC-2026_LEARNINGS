const fs = require('fs');
const Employee = require('./Employee');

const emp = new Employee("Komal", "Ghodke", "komal@example.com", "Developer", "12LPA");
fs.appendFileSync('Employee.txt', JSON.stringify(emp) + "\n");
console.log("Employee data appended to Employee.txt");
