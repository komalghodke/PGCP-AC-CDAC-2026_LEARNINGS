export default function Addition({num1: a, num2: b}) {

    function clicked() {
        console.log("Clicked!")
        //return "Clicked";
        return "Addition is:" + (a+b);
    }

    return <div>
        <p> <b> Addition is: {a+b} </b></p>

        Num1: <input type="number" name = "num1"/> <br/>
        Num2: <input type="number" name="num2"/> <br/>
        <button onClick={clicked}> Add </button>
    </div>
}