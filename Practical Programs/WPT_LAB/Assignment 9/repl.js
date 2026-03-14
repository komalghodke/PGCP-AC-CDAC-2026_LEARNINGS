
function abc() {
        let data = '{ "marks": 90, "id": 1, "name": "abc" }';
        let d = JSON.parse(data);
        console.log(d);

        let newD = JSON.stringify(d);
        console.log(newD);


        let books = { bookid: 1, bName: "JAVASCRIPT" };

        let { bookid, bName } = books;
        console.log("Bookid = " + bookid + " Book Name= " + bName);

        let { bookid: id1, bName: name2 } = books;
        console.log("Bookid = " + id1 + " Book Name= " + name2);
}
abc();
