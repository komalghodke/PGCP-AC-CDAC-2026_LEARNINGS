import React, { useCallback, useEffect, useState } from "react";
// unique

//Array   List  Set 
const funcSet = new Set();
//render 
const DemoCallBack = () => {
    const [cnt, setCnt] = useState(0);
    const [num, setNum] = useState(0);

    //const incCnt = () => setCnt(cnt + 1);//Object 
    // state of react   re render 
    function incCnt() {
        //setCnt ---  cnt previous state 
        setCnt((prev) => prev + 1)  // 1
        setCnt((prev) => prev + 1)//2
        //setCnt(cnt + 1);//1
        //setCnt(cnt + 1);// 2  1time 
    }

    /*  const incCnt = () => setCnt(cnt + 1); */
    //const incCnt = useCallback
    // (() => setCnt(cnt + 1), [cnt]);
    const decCnt = useCallback(() => setCnt(cnt - 1),
        [cnt]);
    const incNum = useCallback(() => setNum(num + 1), [num]);

    //useEffect((), cnt)


    // console.log(incCnt)
    //object   unique 
    funcSet.add(incCnt);
    funcSet.add(decCnt);
    funcSet.add(incNum);


    //alert(funcSet.size);
    return (
        <div>
            <h2>Without useCallback Hook</h2>
            <button onClick={incCnt}>Increase Counter</button>
            <button onClick={decCnt}>Decrease Counter</button>
            <button onClick={incNum}>Increase Number</button>

            <h1>Count : {cnt}</h1>
            <h1>Number : {num}</h1>
            {/*  <h2>Set Size  : {funcSet.size}</h2> */}
        </div>
    );
};

export default DemoCallBack;