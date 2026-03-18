import logo from './logo.svg';
import './App.css';
import SayHello from './dataAccess';
import Addition from './Add';
import IsPalindrome from './Palindrome';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}

      <h1>REACT DEMO PROJ</h1>
      <SayHello name={"GK"}> </SayHello>
      <Addition num1={10} num2={20} ></Addition>
      <IsPalindrome num={12321}> </IsPalindrome>
    </div>
  );
}

export default App;
