import './App.css';
import Login from './Login';
import Counter from './CounterApp';
import Demo from './DemoComponent';
import LifecycleDemo from "./LifeCycleDemo";
import TodoApp from './ToDoApp';

function App() {
  return (
    <div className="App">
      <Demo> </Demo>
      <Counter cnt={0}> </Counter>
      <Login user={"Gk"}> </Login>
      <LifecycleDemo> </LifecycleDemo>
      <TodoApp> </TodoApp>
    </div>
  );
}

export default App;
