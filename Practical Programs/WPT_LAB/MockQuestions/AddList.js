function ItemList() {
  const [items, setItems] = useState([]);
  const [input, setInput] = useState("");

  return (
    <div>
      <input value={input} onChange={e => setInput(e.target.value)} />
      <button onClick={() => {
        if(input.trim()!=="") {
          setItems([...items, input]);
          setInput("");
        }
      }}>Add</button>
      <div>
        <ol>
          {items.map((item,i) => <li key={i}>{item}</li>)}
        </ol>
      </div>
    </div>
  );
}

export default ItemList;