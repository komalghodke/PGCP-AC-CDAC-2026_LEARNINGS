import React, { useState } from "react";

const BgColorDemo = () => {
  const [color, setColor] = useState("cyan");

  const colors = ["Red", "Yellow", "Green", "Blue", "Orange"];

  return (
    <div style={{ backgroundColor: color, height: "100vh" }}>
      <h2>Background Color Demo</h2>
      {colors.map(c => (
        <button key={c} onClick={() => setColor(c.toLowerCase())}>
          {c}
        </button>
      ))}
    </div>
  );
};

export default BgColorDemo;