import React from "react"
import {Routes, Route, Link} from "react-router-dom" 
import About from './About'
import Users from './Users'

export default function Home(){

    const linkStyle = {
        margin: "1rem",
        textDecoration: "none",
        color: "#5e0a56"
    }

    const divStyle = {
        height: "15px",
        display: "flex",
        justifyContentt: "center",
        alignItems: "center",
        width: "100%"
    }

    const all = {
        backgroundColor: "#0a565e"
    }
    
    return (
        <div style={all}>
            <header style={divStyle}>
                <Link to='/' style={linkStyle}>Home</Link>
                <Link to='/about' style={linkStyle}>About</Link>
                <Link to='/users' style={linkStyle}>Users</Link>
            </header>
            <main>
                <Routes>
                    <Route path="/" component={<Home/>} exact />
                    <Route path="/about" element={<About/>}></Route>
                    <Route path="/users" element={<Users/>}></Route>
                </Routes>
                <h3>This page is Home</h3>
            </main>
        </div>
    )
    
}
