import { Component } from "react";

class Login extends Component{

    constructor() {
        super(); //component Instance
        //this.msg = "Default Message"; //Login instance
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
        <b> Class Component Demo </b> <br/>
        Username: <input type="text" name="nm" id="name" onBlur={this.txtHandler}/> <br/>
        <button value={"Login"} onClick={this.btnHandler}> Login </button>
        <p> Data: {this.state.msg}</p>
        </>
} 

}
export default Login;