import { Component } from "react";

class ToDoNew extends Component {

    constructor() {
        super();
        this.state = {task:"", tasks: []};
        this.btnHandler = this.btnHandler.bind(this);
        
    }
    
    btnHandler(e) {
        console.log("inside btnhandler " + e.target.value)
        this.setState({task:e.target.value});

    }

    displayData(e) {
        console.log("Inside DisplayData " + e.target.value);
    }

    render() {
        return <> 
        <pre> 4) Accept TO DO tasks in text field and display tasks in Ordered List on same page on buttonclick </pre>
                <h2> TO DO LIST </h2>
                Task To Do <input type="task" name="task" id="task" onBlur={this.btnHandler}/>
                <button onClick={this.displayData}> Submit </button>
                    <ol>
                        {this.state.task}
                    </ol>
        </>
    }
}
export default ToDoNew;