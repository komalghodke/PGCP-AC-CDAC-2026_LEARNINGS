import './App.css';
import CounterF from './CounterF';
import DropDown from './Dropdown';
import ParentComponent from './ParentComponent';
import LifecycleDemoFunc from './FunctionCLifeCycle';
import ShopStockLoad from './ShopStock'

function App() {
  return (
    <div className="App">
      <CounterF></CounterF>
      <DropDown></DropDown>
      <ParentComponent></ParentComponent>
      <LifecycleDemoFunc></LifecycleDemoFunc>
      <ShopStockLoad></ShopStockLoad>
    </div>
  );
}

export default App;
