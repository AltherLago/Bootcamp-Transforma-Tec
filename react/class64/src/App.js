import './App.css';
import ChangeColor from './components/ChangeColor';
import FormState from './components/FormState';
import LazyFunction from './components/LazyFunction';
import SetStateClass from './components/SetStateClass';
import SetStateFunction from './components/SetStateFunction';
import SetStateFunctionPrev from './components/SetStateFunctionPrev';
import PrevState from './components/PrevState';

function App() {
  return (
    <div className="App">
        <ChangeColor/>
        <LazyFunction/>
        <FormState/>
        <PrevState/>
        <SetStateClass/>
        <SetStateFunction/>
        <SetStateFunctionPrev/>
    </div>
  );
}

export default App;
