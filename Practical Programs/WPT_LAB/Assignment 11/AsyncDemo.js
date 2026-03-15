async function fetchData() {
  return new Promise(resolve => {
    setTimeout(() => resolve("Data fetched!"), 2000);
  });
}

async function main() {
  console.log("Start");
  let result = await fetchData();
  console.log(result);
  console.log("End");
}

main();
