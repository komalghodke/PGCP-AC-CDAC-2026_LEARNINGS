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
        <h1>Counter Application</h1>
        <b><p>Counter Value : {this.state.cnt} </p></b>
        <button value={"Inc"} onClick={this.incHandler}> Increment </button> <br/>
        <button value={"Dec"} onClick={this.decHandler}> Decrement </button>
        </>
    }
}
export default Counter;