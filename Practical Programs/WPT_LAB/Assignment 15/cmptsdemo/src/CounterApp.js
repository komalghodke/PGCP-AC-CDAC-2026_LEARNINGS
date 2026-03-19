import { Component } from "react";

class Counter extends Component {

    constructor(props) {
        super(props);
        //this.i = 0;
        this.i = this.props.cnt;
        this.state = {cnt: 0};
        this.incHandler = this.incHandler.bind(this);
        this.decHandler = this.decHandler.bind(this);
    }

    incHandler(e) {
        this.i++;
        this.setState({cnt: this.i});
        console.log("Incremented! " + this.i);
    }

    decHandler(e) {
        this.i--;
        this.setState({cnt: this.i});
        console.log("Decremented! " + this.i);
    }

    render() {
        return <>
        <pre> Q. 1) With the concept of Class Component Create Counter Application, Take 2 buttons Increment and Decrement </pre>
        <h2>Counter Application</h2>
        <b><p>Counter Value : {this.state.cnt} </p></b>
        <button value={"Inc"} onClick={this.incHandler}> Increment </button> <br/>
        <button value={"Dec"} onClick={this.decHandler}> Decrement </button>
        </>
    }
}
export default Counter;