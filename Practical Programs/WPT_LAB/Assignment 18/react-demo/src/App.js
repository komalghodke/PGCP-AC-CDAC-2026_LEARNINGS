import './App.css';
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import DemoCounter from './DemoCounter';
import DemoError from './DemoError';
import BgColorDemo from './BgColorDemo';
import ErrorHandler from "./ErrorHandler";
import MyFunction from "./MyFunction";

function App() {
  return (
    <BrowserRouter>
      <div className="App">
        <nav style={{ backgroundColor: "#eee", padding: "10px" }}>
          <Link to="/"> Counter</Link> | 
          <Link to="/error"> Error Demo</Link> | 
          <Link to="/color"> Background Demo</Link> |
          <Link to="/runtime"> Runtime Error</Link>
        </nav>

        <Routes>
          <Route path="/" element={<DemoCounter />} />
          <Route path="/error" element={<DemoError />} />
          <Route path="/color" element={<BgColorDemo />} />
          <Route path="/runtime" element = {
            <ErrorHandler>
              <MyFunction />
            </ErrorHandler> }/>
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;