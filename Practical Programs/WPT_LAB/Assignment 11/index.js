// index.js
const Employee = require('./Employee');

let Emp = new Employee("emp1", "empLastName", "emp@gmail.com", "SE", "10LPA");
Emp.display();

console.log("After Update:");
Emp.setFname("KOMAL");
Emp.setLname("G");
Emp.setEmail("kg@gmail.com");
Emp.setDesg("SSE");
Emp.setSal("12LPA");
Emp.display();