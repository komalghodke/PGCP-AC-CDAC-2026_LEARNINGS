import { Component } from "react";

class Login extends Component{

    constructor(props) {
        super(props);
        this.state ={msg: "default"}
        this.btnHandler = this.btnHandler.bind(this);
        this.txtHandler = this.txtHandler.bind(this);
    }

    btnHandler() {
        console.log("Ok for Login!")
    }

    txtHandler(e) {
        console.log("Target name: " +e.target.name);
        console.log("Username: " +e.target.value);
        this.setState({msg: e.target.value});
    }

    
    render() {
        return <>
        <pre> 2) Create LoginForm using class component accept username and password and display hello username on same page. if username = "iet" and password = "iet" </pre>
        <h2> Login Form </h2>
        <b>
        Username <input type="text" name="uName" id="uName" onBlur={this.txtHandler}/> <br/>
        Password <input type="password" name="pass" id="pass"/>
        <br/>
        <button value={"LOGIN"} onClick={this.btnHandler}> LOGIN </button>
        <p> Hello, {this.state.msg}!</p>
        </b>
        </>
    }
}
export default Login;