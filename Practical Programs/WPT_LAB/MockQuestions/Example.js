let obj = { rollnumber: 1, name: "Gk", marks: 80 };
let obj_copy = { ...obj };

obj.marks = 90;

console.log("Original:", obj);
console.log("Copy:", obj_copy);

console.log("Today's Date:", new Date().toDateString());