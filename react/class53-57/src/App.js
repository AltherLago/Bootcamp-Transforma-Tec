import './App.css';

/*
import Hello  from './components/Hello';
import HelloDio from './components/HelloDio';
*/

/*
import HelloWorldDIO from './components/class54/HelloWorldDIO.jsx'
import HelloWorldDIOClass from './components/class54/HelloWorldDIOClass.jsx';
import HelloWorldDioDev from './components/class54/HelloWorldDIODev.jsx'
import HelloWorldCalculator from './components/class54/HelloWorldCalculator.jsx';
import HelloWorldFunction from './components/class54/HelloWorldFunction.jsx'
*/

/*
import HelloWorld from '../src/components/class55/HelloWorld'
import Car from './components/class55/Car.jsx'
import PersonRegister from './components/class55/PersonRegister.jsx'
import GameScore from './components/class55/GameScore.jsx'
*/

/*
import StateColor from './components/class56/StateColor';
import StateCar from './components/class56/StateCar'
import StatePerson from './components/class56/StatePerson'
import StateClass from './components/class57/StateClass';
import StateProps from './components/class57/StateProps';
import StateClock from './components/class56/StateClock'
*/

import StateFunction from './components/class57/StateFunction';
import StateClass from './components/class57/StateClass.jsx';
import StateProps from './components/class57/StateProps.jsx';
import FormExample from './components/class57/FormExample';
import FormMultiple from './components/class57/FormMultiple';

function App() {
  return (
    <div className="App">
   
    {/*Class 53

      <Hello/>
      <HelloDio dev_name="Alther"/>

    */}

    {/* Class 54 

      <HelloWorldDIO/>  
      <HelloWorldDIOClass/>  
      <HelloWorldDioDev name="Alther"/>
      <HelloWorldCalculator n1={3} n2={5}/>
      <HelloWorldFunction/>
    */}

    {/* Class 55

      <HelloWorld name="Alther"/>
      <Car owner="Alther pé de pano"/> 
    
      <PersonRegister name="Alther" age={32} lastName="Lago" job="Dev"/>
      <GameScore points={0}/>
    */}
 
    {/*Class56 
        <StateColor color="blue"/>
        <StateCar/>
        <StatePerson name="Joao" job="Painter" age={33}/>
        <StateClock/>
    */}

    {/*Class57 */}

        <StateFunction/> 
        <StateClass/>
        <StateProps color="blue"/>
        <FormExample/>
        <FormMultiple/>

    </div>
  );
}

export default App;
