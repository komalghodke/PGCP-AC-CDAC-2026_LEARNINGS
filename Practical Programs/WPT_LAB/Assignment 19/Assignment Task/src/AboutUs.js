import { useContext } from "react";
import { ctx } from "./Routes";

export default function AboutUs() {
  const actx = useContext(ctx);
  return (
    <>
      <h2>About Us Page</h2>
      <p>Hello {actx.username}</p>
    </>
  );
}