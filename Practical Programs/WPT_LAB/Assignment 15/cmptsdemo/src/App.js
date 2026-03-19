import './App.css';
import Login from './Login';
import Counter from './CounterApp';
import Demo from './DemoComponent';

function App() {
  return (
    <div className="App">
      <Demo> </Demo>
      <Counter cnt={0}> </Counter>
      <Login user={"Gk"}> </Login>
    </div>
  );
}

export default App;
