import './App.css';

//import Hello  from './components/Hello';
//import HelloDio from './components/HelloDio';

import HelloWorldDIO from './components/class54/HelloWorldDIO.jsx'
import HelloWorldDIOClass from './components/class54/HelloWorldDIOClass.jsx';
import HelloWorldDioDev from './components/class54/HelloWorldDIODev.jsx'
import HelloWorldCalculator from './components/class54/HelloWorldCalculator.jsx';
import HelloWorldFunction from './components/class54/HelloWorldFunction.jsx'

function App() {
  return (
    <div className="App">
   
    {/*Class 53

      <Hello/>
      <HelloDio dev_name="Alther"/>

    */}

    {/* Class 54 */}

      <HelloWorldDIO/>  
      <HelloWorldDIOClass/>  
      <HelloWorldDioDev name="Alther"/>
      <HelloWorldCalculator n1={3} n2={5}/>
      <HelloWorldFunction/>
      
    
      
    </div>
  );
}

export default App;
