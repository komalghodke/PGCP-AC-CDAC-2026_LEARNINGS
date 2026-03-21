import React, { useState, useEffect } from "react";

function LifecycleDemoFunc() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    console.log("Component Mounted or Updated! -  useEffect acts like lifecycle methods");

    return () => {
      console.log("Component Will Unmount! - cleanup function");
    };
}, [count]);

  return (
    <>
      <pre>
       Q. 4) With help of useEffect understand LifeCycle of Function Component
      </pre>
      <strong>Function Component Lifecycle Demo</strong>
      <b>
        Count: {count} <br />
        <button onClick={() => setCount(count + 1)}>Increment</button>
      </b>
    </>
  );
}

export default LifecycleDemoFunc;