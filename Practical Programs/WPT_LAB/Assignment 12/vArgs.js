let sum = 0;

for (let i = 2; i < process.argv.length; i++) {
    let num = Number(process.argv[i]);
    if (num % 2 === 0) {
        sum += num;
    }
}

console.log("Sum of even numbers:", sum);