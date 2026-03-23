import React, { useState, useCallback } from "react";

const DemoCounter = () => {
  const [count, setCount] = useState(0);

  const incCount = useCallback(() => {
    setCount(prev => prev + 1);
  }, []);

  const decCount = useCallback(() => {
    setCount(prev => prev - 1);
  }, []);

  return (
    <div>
        <b>ASSIGNMENT - 23rd March</b>
        <pre> Q. 1) By doing demo understand concept for useCallBack, prev state, Error Handling, Routes</pre>
        <h2> (useCallback + Prev State Demo) </h2>
        <h3>Count: {count}</h3>
        <button onClick={incCount}>Increase</button>
        <button onClick={decCount}>Decrease</button>
    </div>
  );
};

export default DemoCounter;