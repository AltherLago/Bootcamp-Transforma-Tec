import { useState } from "react"
import React from "react";

export default function FormState(){
    // call more than state
    const [username, setUsername] = useState("")
    const [email, setEmail] = useState("")

    const showData = (event) => {
        // previne o comportamento padrão do objeto
        event.preventDefault()
        alert(username + " " + email)
    }
    
    return(
        <form onSubmit={showData}>
            <input
                type="text"
                value={username}
                onChange={event => setUsername(event.target.value)}
                name="username"
                placeholder="Username"
            />

            <input 
                type="text"
                value={email}
                onChange={event => setEmail(event.target.value)}
                name="email"
                placeholder="Email"
            />

            <button>Send</button>
        </form>
    )
}
