import { Component } from "react";

class Demo extends Component{

    constructor() {
        super(); //component Instance
        //this.msg = "Default Message"; //Demo instance
        this.state = {msg: "default"}

        this.btnHandler = this.btnHandler.bind(this);
        this.txtHandler = this.txtHandler.bind(this);
    }

    btnHandler() {
        console.log("Just Cliked!");
    }

    txtHandler(e) {
        console.log("Inside TextHandler" + e.target); //element
        console.log("Target Name: " +e.target.name);
        console.log("Target Value: " +e.target.value);
        //console.log(e.target.value);
        this.setState({msg: e.target.value});
    }

    render() {
        return <>
        <h2>Assignment</h2>
        <b> Class Component Demo </b> <br/>
        Username: <input type="text" name="nm" id="name" onBlur={this.txtHandler}/> <br/>
        <button value={"Demo"} onClick={this.btnHandler}> Click </button>
        <p> Data: {this.state.msg}</p>
        </>
} 

}
export default Demo;