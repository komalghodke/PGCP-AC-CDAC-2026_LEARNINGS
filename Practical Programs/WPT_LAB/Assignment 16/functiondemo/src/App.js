import logo from './logo.svg';
import './App.css';
import CounterF from './CounterF';
import DropDown from './Dropdown';
import ParentComponent from './ParentComponent';

function App() {
  return (
    <div className="App">
      <CounterF></CounterF>
      <DropDown></DropDown>
      <ParentComponent></ParentComponent>
      
    </div>
  );
}

export default App;
