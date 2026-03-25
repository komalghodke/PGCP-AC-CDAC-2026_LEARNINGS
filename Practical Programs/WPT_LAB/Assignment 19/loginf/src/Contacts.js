import { useContext } from "react";
import { ctx } from "./Routes";

export default function Contact() {
  const cctx = useContext(ctx);
  return (
    <>
      <h2>Contact Page</h2>
      <p>Hello {cctx.username}</p>
    </>
  );
}
