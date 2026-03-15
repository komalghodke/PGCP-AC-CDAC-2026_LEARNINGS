// Employee.js
class Employee {
  constructor(firstName, lastName, email, designation, basicSalary) {
    this.fname = firstName;
    this.lname = lastName;
    this.email = email;
    this.des = designation;
    this.sal = basicSalary;
  }

  display() {
    console.log("Employee Details are:");
    console.log(`Name: ${this.fname}, LastName: ${this.lname}, Email: ${this.email}, Designation: ${this.des}, BasicSalary: ${this.sal}`);
  }

  getFname() { return this.fname; }
  setFname(newName) { this.fname = newName; }

  getLname() { return this.lname; }
  setLname(newName) { this.lname = newName; }

  getEmail() { return this.email; }
  setEmail(newEmail) { this.email = newEmail; }

  getDesg() { return this.des; }
  setDesg(newDes) { this.des = newDes; }

  getSal() { return this.sal; }
  setSal(newSal) { this.sal = newSal; }
}

module.exports = Employee;