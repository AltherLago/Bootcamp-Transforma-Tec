import React from "react";
import Home from './components/Home'

function App() {
  
  const stili = {
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    justifyContent: 'center'
  }

  return (
    <div style={stili} className="main">
        <Home/>
    </div>
  )
}

export default App;
