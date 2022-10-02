import './App.css';
import {Link, Outlet} from 'react-router-dom'

function App() {
  return (
    <div>
        <h2>Invoice list</h2>
        <nav
            style={{
                borderBottom: 'solid 1px',
                paddingBottom: '1rem'
            }}
        >
            <Link to='/invoices'>Invoice</Link>
            <Link to='/expenses'>Expenses</Link>
        </nav>
        <Outlet/> 
    </div>
  );
}

export default App;
