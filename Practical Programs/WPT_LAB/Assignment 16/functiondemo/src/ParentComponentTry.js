import { Component } from "react";

class ChildComponent extends Component {

    constructor(props) {
        super(props);
    }

    render() {
        return <> 
        Select Operation:
        <select>
            <option> --CHOOSE--</option>
            <option> ADD </option>
            <option> SUBSTRAC </option>
            <option> DIVIDE </option>
            <option> MULTIPY </option>
        </select>
        </>
    }
}

class ParentComponent extends Component {

    constructor(props) {
        super(props);
        this.state = {num1: "", num2: "", result: ""};
    }

    txtHandler(e) {
        this.setState({ [e.target.name]: e.target.value });
    }

    render() {
        return (
        <>
         <pre> Q. 3) Create ParentComponent which accept data 2 numbers and it will display result Create ChildComponent <br/> which display options in DropDown Format add , subtraction , Division , Multiplication after Option Selection onChange display result on ParentComponent </pre>
        <b>
        <br/>
        Num1: <input type="text" name="num1" onChange={this.txtHandler}/> <br/>
        Num2: <input type="text" name="num2"  onChange={this.txtHandler}/> <br/>
        <ChildComponent />
        <p>Result: {}</p>
        </b>
        </>
        )
    }

}
export default ParentComponent;