import { useRef } from "react";

export default function UncontrolledDemo() {
  const inputRef = useRef();

  const showValue = () => {
    alert("Uncontrolled Value: " + inputRef.current.value);
  };

  return (
    <>
      <pre>
      UnControlled Component — input value accessed using ref
      </pre>

      <h2>Uncontrolled Component Demo</h2>
      <input type="text" ref={inputRef} placeholder="Type your name" />
      <button onClick={showValue}>Show Value</button>
    </>
  );
}
