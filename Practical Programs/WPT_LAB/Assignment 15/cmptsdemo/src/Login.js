import { Component } from "react";

class Login extends Component{

    constructor(props) {
        super(props); //component Instance
        this.state = {
            username: "",
            password: "", 
            msg: "Miss/Mrs"
        }
        this.btnHandler = this.btnHandler.bind(this);
        this.txtHandler = this.txtHandler.bind(this);
        this.passHandler = this.passHandler.bind(this);
    }

    txtHandler(e) {
        console.log("Target name: " + e.target.name);
        console.log("Username: " + e.target.value);
        this.setState({username: e.target.value}); // update username
    }

    passHandler(e) {
        console.log("Target name: " + e.target.name);
        console.log("Password: " + e.target.value);
        this.setState({password: e.target.value}); // update password
    }

    btnHandler(e) {
        console.log("Inside btnHandler!");
        const {username, password} = this.state;
        if(username === "iet" && password === "iet"){
            this.setState({msg: `Hello ${username}`});
        } else {
            this.setState({msg: "Invalid credentials"});
        }
    }

    render() {
        return <>
        <pre> 2) Create LoginForm using class component accept username and password and display hello username on same page. if username = "iet" and password = "iet" </pre>
        <h2> Login Form </h2>
        <b>
        Username <input type="text" name="uName" id="uName" onBlur={this.txtHandler}/> <br/>
        Password <input type="password" name="pass" id="pass" onBlur={this.passHandler}/>
        <br/>
        <button value={"LOGIN"} onClick={this.btnHandler}> LOGIN </button>
        <p> {this.state.msg}</p>
        </b>
        </>
    }
}
export default Login;
