/*
<pre>
Q2. Write a node example1.js file:
- Create a json object with rollnumber, name, marks
- Copy object using spread operator
- Change marks in first object
- Print both objects (marks should differ)
</pre>
*/

let obj = {
    rollnumber: 101,
    name: "Komal",
    marks: 90
};

let obj_copy = { ...obj };

obj.marks = 95;

console.log("Original:", obj);
console.log("Copy:", obj_copy);

/*
<pre>
Q2. Write a node example2.js file:
Print today’s date
</pre>
*/

let today = new Date();
console.log("Today's date is:", today.toDateString());
