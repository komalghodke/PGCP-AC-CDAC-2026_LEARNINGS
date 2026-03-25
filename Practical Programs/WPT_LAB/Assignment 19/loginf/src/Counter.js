import { useState, useCallback } from "react";

export default function Counter() {
  const [cnt, setCnt] = useState(0);

  const increment = useCallback(() => {
    setCnt(cnt + 1);
  }, [cnt]);

  const decrement = useCallback(() => {
    setCnt(cnt - 1);
  }, [cnt]);

  return (
    <>
    <pre>Assignment 2 : <br/>
    Create Functional Component Counter which having increament and decrement button, <br/> on button click call particulae function for memory optimization use useCallBack with empty depedancies            
    </pre>
    
      <h2>Counter Component</h2>
      <p>Count Value = {cnt}</p>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
    </>
  );
}