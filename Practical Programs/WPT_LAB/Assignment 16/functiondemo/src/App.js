import logo from './logo.svg';
import './App.css';
import CounterF from './CounterF';
import DropDown from './Dropdown';
import ChildComponent from './ParentComponent';

function App() {
  return (
    <div className="App">
      <CounterF></CounterF>
      <DropDown></DropDown>
      <ChildComponent></ChildComponent>
    </div>
  );
}

export default App;
