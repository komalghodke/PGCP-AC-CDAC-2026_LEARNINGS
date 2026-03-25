import { BrowserRouter, Routes, Route, NavLink } from "react-router-dom";
import { createContext, useState } from "react";
import Login from "./Login";
import Home from "./Home";
import AboutUs from "./AboutUs";
import Contact from "./Contacts";
import Info from "./Info";
import Counter from "./Counter";

export const ctx = createContext();

export default function Index() {
  const [user, setUser] = useState("");

  return (
    <ctx.Provider value={{ username: user }}>
      <pre>
      Assignment 1:
      <br/>
      - Create Login Functional Component (username, password) <br/>
      - If username==iet and password==iet → show HomePage <br/>
      - Display Hello UserName on every page (Home, AboutUs, Contact) <br/>
      - Create Route "Info" → show API data using axios <br/>
      </pre>
      <BrowserRouter>
        <nav>
          <NavLink to="/">Login</NavLink> |{" "}
          <NavLink to="/home">Home</NavLink> |{" "}
          <NavLink to="/about">About Us</NavLink> |{" "}
          <NavLink to="/contact">Contact</NavLink> |{" "}
          <NavLink to="/info">Info</NavLink> |{" "}
          <NavLink to="/counter"> Counter Assignment </NavLink>
        </nav>

        <Routes>
          <Route path="/" element={<Login setUser={setUser} />} />
          <Route path="/home" element={<Home />} />
          <Route path="/about" element={<AboutUs />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/info" element={<Info />} />
          <Route path="/counter" element={<Counter/>}/>
        </Routes>
      </BrowserRouter>
    </ctx.Provider>
  );
}