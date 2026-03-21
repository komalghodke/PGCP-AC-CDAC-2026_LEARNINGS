export default function ChildComponent({num1,num2,f1})
{
    function compute(e)
    {
        switch(e.target.value)
        {
            case "add" :
                let res = num1+num2;
                f1(res);
                break;
            case "sub" :
                let s = num1-num2;
                f1(s);
                break;
            case "mul" :
                let m = num1*num2;
                f1(m);
                break;
            case "div" :
                let d = num1/num2;
                f1(d)
                break;
            case "pow" :
                let r =Math.pow(num1,num2);
                f1(r);
                break;
            default:
                break;
        }
    }

    return <div className="outline">
        <b>Operation: </b>
        <select onChange={compute}>
            <option>--CHOOSE--</option>
            <option value="add">ADD</option>
            <option value="sub">SUBSTRACT</option>
            <option value="mul">MULTIPLY</option>
            <option value="div">DIVIDE</option>
            <option value="pow">POWER</option>
        </select>
    </div>
}