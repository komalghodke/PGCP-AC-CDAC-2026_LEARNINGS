import { useState } from "react";

export default function CounterF() {
    let [cnt, setData] =useState(0);

    function inc() {
        setData(++cnt);
        console.log(cnt);
    }

    function dec() {
        setData(--cnt);
        console.log(cnt);
    }

    return <>
    <pre> Q. 1) Create Counter Application with Function Component </pre>
    <b>Demo - Function Component </b>
    <b>Counter Value: {cnt}</b> <br/>
    <button id="btn" onClick={inc}>INCREMENT</button> <br/>
    <button id="dec" onClick={dec}>DECREMET</button>
    </>
}