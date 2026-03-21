import { useState, useEffect } from "react";

export default function ProductTable() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    fetch("https://fakestoreapi.com/products")
      .then(res => res.json())
      .then(json => setProducts(json));
  }, []);

  return (
    <>
      <pre>
        Q. 2) Read Data From API using fetch method 
        https://fakestoreapi.com/products <br/>
        and display data in Table Format 
        When page is loaded 
        use array.map method
      </pre>

    <center>
      <table border="1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Price</th>
            <th>Category</th>
          </tr>
        </thead>
        <tbody>
          {products.map(p => (
            <tr key={p.id}>
              <td>{p.id}</td>
              <td>{p.title}</td>
              <td>{p.price}</td>
              <td>{p.category}</td>
            </tr>
          ))}
        </tbody>
      </table>
      </center>
    </>
  );
}