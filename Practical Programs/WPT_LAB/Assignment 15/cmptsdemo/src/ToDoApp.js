import { Component } from "react";

class TodoApp extends Component {

    constructor(props) {
        super(props); // component instance
        this.state = {
            task: "",     // current input
            tasks: []     // list of tasks
        };
        this.txtHandler = this.txtHandler.bind(this);
        this.btnHandler = this.btnHandler.bind(this);
    }

    txtHandler(e) {
        console.log("Target name: " + e.target.name);
        console.log("Task Value: " + e.target.value);
        this.setState({ task: e.target.value }); // update current task
    }

    btnHandler() {
        console.log("Inside btnHandler!");
        // add current task to tasks array
        this.setState(prevState => ({
            tasks: [...prevState.tasks, prevState.task],
            task: "" // clear input after adding
        }));
    }

    render() {
        return (
            <>
                <pre> 4) Accept TO DO tasks in text field and display tasks in Ordered List on same page on buttonclick </pre>
                <h2> TO DO List </h2>
                <b>
                    Task <input type="text" name="task" id="task" value={this.state.task} onChange={this.txtHandler}/> <br/>
                    <button onClick={this.btnHandler}> Add Task </button>
                    <ol>
                        {this.state.tasks.map((t, index) => (
                            <li key={index}>{t}</li>
                        ))}
                    </ol>
                </b>
            </>
        );
    }
}

export default TodoApp;