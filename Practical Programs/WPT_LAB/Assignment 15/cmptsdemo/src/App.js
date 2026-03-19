import './App.css';
import Login from './DemoComponent';
import Counter from './CounterApp';

function App() {
  return (
    <div className="App">
      <Login> </Login>
      <Counter cnt={0}> </Counter>
    </div>
  );
}

export default App;
