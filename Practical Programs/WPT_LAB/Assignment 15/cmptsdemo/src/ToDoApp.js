import { Component } from "react";

class TodoApp extends Component {

    constructor(props) {
        super(props);
        this.state = {
            task: "",
            tasks: []
        };
        this.txtHandler = this.txtHandler.bind(this);
        this.btnHandler = this.btnHandler.bind(this);
    }

    txtHandler(e) {
        console.log("Target name: " + e.target.name);
        console.log("Task Value: " + e.target.value);
        this.setState({ task: e.target.value });
    }

    btnHandler() {
        console.log("Inside btnHandler!");
        if (this.state.task.trim() !== "") {
            this.setState(prevState => ({
                tasks: prevState.tasks.concat(prevState.task),
                task: ""
            }));
        }
    }

    getListItems() {
        let items = [];
        for (let i = 0; i < this.state.tasks.length; i++) {
            items.push(<li key={i}>{this.state.tasks[i]}</li>);
        }
        return items;
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
                        {this.getListItems()}
                    </ol>
                </b>
            </>
        );
    }
}

export default TodoApp;