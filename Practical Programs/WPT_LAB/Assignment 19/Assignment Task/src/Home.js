import { useContext } from "react";
import { ctx } from "./Routes";

export default function Home() {
  const homeCtx = useContext(ctx);
  return (
    <>
      <h2>Home Page</h2>
      <p>Hello {homeCtx.username}</p>
    </>
  );
}