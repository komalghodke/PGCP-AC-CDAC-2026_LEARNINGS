import { useState } from "react";
import ChildComponent from "./ChildComponent";

export default function ParentComponent()
{
    let [n1,setN1] =useState(0)
    let [n2,setN2] =useState(0)
    let [res,setRe] = useState(0)
    
    function changeResult(v)
    {
        setRe(v)
    }

    return <div className="outline">
        <pre> Q. 3) Create ParentComponent which accept data 2 numbers and it will display result Create ChildComponent <br/> which display options in DropDown Format add , subtraction , Division , Multiplication <br/> after Option Selection onChange display result on ParentComponent </pre>
        <pre>Number 1: <input type="number" onBlur={(e)=>{ setN1(e.target.value)}}  />
        <br></br>
        Number 2 :<input type="number" onBlur={(e)=>{ setN2(e.target.value)}}/>
        </pre>
        <ChildComponent f1={changeResult} num1={parseInt(n1)} num2={parseInt(n2)}></ChildComponent>
        <b><p>Result = {res}</p></b>
    </div>

}