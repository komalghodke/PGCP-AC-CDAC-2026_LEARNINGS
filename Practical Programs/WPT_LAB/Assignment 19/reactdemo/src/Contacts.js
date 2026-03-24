export default function Contact(props) {
  return (
    <>
      <pre>
      Simple props demo — show username passed as prop
      </pre>

      <h1>Contact Page</h1>
      <h2>Hello {props.user}</h2>
    </>
  );
}