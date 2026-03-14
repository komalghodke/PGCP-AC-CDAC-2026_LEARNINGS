class Employee {
    constructor(firstName, lastName, email, designation, basicSalary) {
        this.fname = firstName;
        this.lname = lastName;
        this.email = email;
        this.des = designation;
        this.sal = basicSalary;
    }
    display() {
        console.log("Employee Details are: ");
        console.log(`Name: ${this.fname}, lastName: ${this.lname}, email: ${this.email}, Designation: ${this.des}, BasicSalary: ${this.sal} `);
    }
    getFname() {
        return this.fname;
    }
    setFname(newName) {
        this.fname = newName;
    }
    getLname() {
        return this.lname;
    }
    setLname(newName) {
        this.lname = newName;
    }
    getEmail() {
        return this.email;
    }
    setEmail(newEmail) {
        this.email = newEmail;
    }
    getDesg() {
        return this.des;
    }
    setDesg(newDes) {
        this.des = newDes;
    }
    getSal() {
        return this.sal;
    }
    setSal(newSal) {
        this.sal = newSal;
    }
}

//const readline = require("readline");

let Emp = new Employee("emp1", "empLastName", "emp@gmail.com", "SE", "10LPA");
Emp.display();
console.log("After Update : ");
Emp.setFname("KOMAL");
Emp.setLname("G");
Emp.setEmail("kg@gmail.com");
Emp.setDesg("SSE");
Emp.setSal("12LPA")
Emp.display();

