import { Component } from "react";

class LifecycleDemo extends Component {

    constructor(props) {
        super(props); // component instance
        this.state = { msg: "Initial State" };
        console.log("Constructor: Component is created");
    }

    componentDidMount() {
        // called once after initial render
        console.log("componentDidMount: Component mounted");
        // simulate data fetch or side effect
        this.setState({ msg: "Updated in componentDidMount" });
    }

    componentDidUpdate(prevProps, prevState) {
        // called after state/props update
        console.log("componentDidUpdate: Component updated");
        console.log("Previous State:", prevState);
        console.log("Current State:", this.state);
    }

    componentWillUnmount() {
        // called before component is removed
        console.log("componentWillUnmount: Component will unmount");
    }

    render() {
        console.log("Render: Component rendering");
        return (
            <>
            <pre> Q. 3) Write a code to understand lifecycle of class component </pre>
                <h2>Lifecycle Demo</h2>
                <p>Message: {this.state.msg}</p>
            </>
        );
    }
}

export default LifecycleDemo;
