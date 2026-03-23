import { useEffect } from "react";

export default function MyFunction() {
  useEffect(() => {
    throw new Error("Something went Wrong");
  }, []);

  return <h1>MyFunction</h1>;
}