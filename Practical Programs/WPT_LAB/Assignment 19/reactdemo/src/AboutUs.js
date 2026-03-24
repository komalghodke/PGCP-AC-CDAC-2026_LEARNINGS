import { useContext } from "react";
import { ctx } from "./Router";

export default function AboutUs() {
  const actx = useContext(ctx);
  return (
    <>
      <pre>
      useContext demo — show username from context
      </pre>

      <h1>About Us</h1>
      <h2>Hello {actx.username}</h2>
    </>
  );
}
