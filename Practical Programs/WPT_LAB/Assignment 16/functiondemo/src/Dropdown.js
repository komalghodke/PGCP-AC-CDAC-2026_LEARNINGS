import { useState } from "react";

export default function DropDown() {    
    let data = ['C', 'C++', 'Java', 'AdvJava', 'WPT'];
    let [selected, setSelected] =useState("");

    function getOptions(e) {
        console.log("Selected Value: " + e.target.value);
        setSelected(e.target.value);
    }

    return <>
    <br/>
    <br/>
    <pre> 2) Declare variable which contains array Data <br/>
        let data  = ['C' , 'C++' , 'Java' , 'AdvJava' , 'WPT'] <br/>
        display above variable data in Dropdown format on html page </pre>
    {/* <b>DATA: {cnt}</b> <br/> */}
    <b>
        Courses : 
        <select onChange={getOptions}>
            <option value="">--Choose--</option>
                {data.map((item, index) => (
                    <option key={index} value={item}> {item} </option>
                ))}
        </select>
        <p>You selected: {selected}</p>
    </b>
    </>
}