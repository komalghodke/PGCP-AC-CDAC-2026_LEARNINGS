import { useContext } from "react";
import { ctx } from "./Router";

export default function Home() {
  const homeCtx = useContext(ctx);
  return (
    <>
      <pre>
        useContext demo — show username from context
      </pre>
      
      <h2>Home Page</h2>
      <p>Hello Context {homeCtx.username}</p>
    </>
  );
}
