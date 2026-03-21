import React, { useEffect, useState, useCallback } from 'react';

function PasswordGenerator() {
  const [password, setPassword] = useState('');
  const [length, setLength] = useState(12);
  const [includeNumbers, setIncludeNumbers] = useState(false);
  const [includeSymbols, setIncludeSymbols] = useState(false);

  const generatePassword = useCallback(() => {
    let characters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
    if (includeNumbers) characters += '0123456789';
    if (includeSymbols) characters += '!@#$%^&*()_+';

    let newPassword = '';
    for (let i = 0; i < length; i++) {
      newPassword += characters.charAt(
        Math.floor(Math.random() * characters.length)
      );
    }
    setPassword(newPassword);
  }, [length, includeNumbers, includeSymbols]);

  useEffect(() => {
    generatePassword();
  }, [generatePassword]);

  const copyToClipboard = () => {
    navigator.clipboard.writeText(password);
    alert('Password copied to clipboard!');
  };

  return (
    <>
    <pre> 
        <h1><b> ASSIGNMENT 17 </b> </h1>
        Q. 1) create RandomPassword Generator Function Component use useState ,
        <br/> useEffect and useCallBack Hooks as discussed in Lecture </pre>
    <div style={{ maxWidth: '400px', margin: '30px auto', padding: '20px', border: '1px solid #ccc', borderRadius: '8px' }}>
      <h2 style={{ textAlign: 'center' }}> Random Password Generator</h2>

      <div style={{ marginBottom: '10px' }}>
        <label>Password Length:</label><br />
        <input
          type="number"
          value={length}
          onChange={(e) => setLength(parseInt(e.target.value, 10))}
          min="1"
          max="32"
        />
      </div>

      <div style={{ marginBottom: '10px' }}>
        <label>
          <input
            type="checkbox"
            checked={includeNumbers}
            onChange={() => setIncludeNumbers(!includeNumbers)}
          />
          Include Numbers
        </label>
      </div>

      <div style={{ marginBottom: '10px' }}>
        <label>
          <input
            type="checkbox"
            checked={includeSymbols}
            onChange={() => setIncludeSymbols(!includeSymbols)}
          />
          Include Symbols
        </label>
      </div>

      <button onClick={generatePassword} style={{ width: '100%', padding: '8px', marginBottom: '15px' }}>
        Generate Password
      </button>

      <div style={{ display: 'flex' }}>
        <input type="text" value={password} readOnly style={{ flex: 1, padding: '6px' }} />
        <button onClick={copyToClipboard} style={{ marginLeft: '5px', padding: '6px 12px' }}>
          Copy
        </button>
      </div>
    </div>
    </>
  );
}

export default PasswordGenerator;