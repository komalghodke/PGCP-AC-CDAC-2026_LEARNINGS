import React, { useState } from "react";

const DemoError = () => {
  const [num, setNum] = useState("");

  const handleClick = () => {
    try {
      if (isNaN(num)) throw new Error("Not a number!");
      alert(`Square: ${num * num}`);
    } catch (err) {
      alert("Error: " + err.message);
    }
  };

  return (
    <div>
      <h2>Error Handling Demo</h2>
      <input
        value={num}
        onChange={e => setNum(e.target.value)}
        placeholder="Enter a number"
      />
      <button onClick={handleClick}>Square</button>
    </div>
  );
};

export default DemoError;