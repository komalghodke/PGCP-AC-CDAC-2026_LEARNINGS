import logo from './logo.svg';
import './App.css';
import DemoCounter from './DemoCounter';
import MyFunction from './MyFunction';
import DemoError from './DemoError';
import BgColorDemo from './BgColorDemo';

function App() {
  return (
    <div className="App">
    <DemoCounter></DemoCounter>
    {/* <MyFunction></MyFunction> */}
    <DemoError></DemoError>
    <BgColorDemo></BgColorDemo>
    </div>
  );
}

export default App;
