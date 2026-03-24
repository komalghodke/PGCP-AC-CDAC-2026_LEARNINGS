import { useState } from "react";

export default function ControlledDemo() {
  const [name, setName] = useState("");

  return (
    <>
      <pre>
      Controlled Component — input value managed by state
      </pre>

      <h2>Controlled Component Demo</h2>
      <input
        type="text"
        value={name}
        onChange={(e) => setName(e.target.value)}
        placeholder="Type your name"
      />
      <p>Value in state: {name}</p>
    </>
  );
}
