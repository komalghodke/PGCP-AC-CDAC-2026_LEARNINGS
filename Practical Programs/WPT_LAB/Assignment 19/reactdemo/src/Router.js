import { BrowserRouter, Routes, Route, NavLink } from "react-router-dom";
import { createContext } from "react";
import Home from "./Home";
import AboutUs from "./AboutUs";
import Contact from "./Contacts";
import ControlledDemo from "./ControlledDemo";
import UncontrolledDemo from "./UncontrolledDemo";

export const ctx = createContext();

export default function Index() {
  return (
    <ctx.Provider value={{ username: "Komal" }}>
      <center>
        <b> ASSIGNMENT - 24th March</b>
      <pre>
      Q. 1) Do programs for below concepts as shown in Lecture <br/>
      1) useContext
      2) Controlled Component
      3) UnControlled Component
      </pre>
      <BrowserRouter>
        <nav>
          <NavLink to="/">Home</NavLink> |{" "}
          <NavLink to="/about">About Us</NavLink> |{" "}
          <NavLink to="/contact">Contact</NavLink> |{" "}
          <NavLink to="/controlled">Controlled</NavLink> |{" "}
          <NavLink to="/uncontrolled">Uncontrolled</NavLink>
        </nav>

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<AboutUs />} />
          <Route path="/contact" element={<Contact user="Komal" />} />
          <Route path="/controlled" element={<ControlledDemo />} />
          <Route path="/uncontrolled" element={<UncontrolledDemo />} />
        </Routes>
      </BrowserRouter>
      </center>
    </ctx.Provider>
  );
}