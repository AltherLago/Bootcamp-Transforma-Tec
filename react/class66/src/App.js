import './App.css';
// import FetchGitHubUsers from './components/API-GitHub/FetchGitHubUsers';
import Todos from './components/TodoList/Todos';
// import TrafficLight from "./components/TrafficLights/TrafficLight"

function App() {
  return (
    <div className="App">
      {/*
        // erro 403
        <FetchGitHubUsers/>

        <TrafficLight initialValue={0}/>
      */}
        <Todos className="Todo"/>
    </div>
  );
}

export default App;
