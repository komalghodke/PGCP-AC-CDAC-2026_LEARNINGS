import { useState } from "react";
import { useNavigate } from "react-router-dom";

export default function Login({ setUser }) {
  const [uname, setUname] = useState("");
  const [pwd, setPwd] = useState("");
  const navigate = useNavigate();

  const handleLogin = () => {
    if (uname === "iet" && pwd === "iet") {
      setUser(uname);
      navigate("/home");
    } else {
      alert("Invalid credentials");
    }
  };

  return (
    <>
      <h2>Login Page</h2>
      <input
        type="text"
        placeholder="Username"
        value={uname}
        onChange={(e) => setUname(e.target.value)}
      />
      <br />
      <input
        type="password"
        placeholder="Password"
        value={pwd}
        onChange={(e) => setPwd(e.target.value)}
      />
      <br />
      <button onClick={handleLogin}>Login</button>
    </>
  );
}