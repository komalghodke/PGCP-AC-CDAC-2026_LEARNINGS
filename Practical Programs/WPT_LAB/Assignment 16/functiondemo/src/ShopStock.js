import { useState } from "react";
import data from './shopstock.json';

export default function ShopStockLoad() {
  const [rows, setRows] = useState([]);

  function loadData() {
    setRows(data);
  }

  return (
    <>
      <pre>
        Q. 5) Read the given file shopstock.json and display data in table format 
        on page when you click on LoadDataButton
      </pre>

      <button onClick={loadData}>Load Data Here only! </button> <br/>
      <button onClick={() => console.log(data)}> Load Data (Console) </button> 

    <center>
      <table border="2">
        <thead>
          <tr>
            <th>ID</th>
            <th>Item</th>
            <th>Quantity</th>
          </tr>
        </thead>
        <tbody>
          {rows.map((item, index) => (
            <tr key={index}>
              <td>{item.id}</td>
              <td>{item.item_name}</td>
              <td>{item.unit_cost}</td>
            </tr>
          ))}
        </tbody>
      </table>
      </center>
    </>
  );
}