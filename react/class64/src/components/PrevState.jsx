import { useState } from "react"

export default function PrevState(){
    const initialState = 100
    const [balance, setBalance] = useState(initialState)

    // update state with correct value
    const deposit = () => {
        setTimeout(() => {
            // outdated state
            // setBalance(balance + 100)
            
            // updated state
            // prevState is a reserved word
            setBalance((prevState) => prevState + 100)
        }, 3000)
    }

    return(
        <div style={{padding: "50px"}}>
            <h3>My balance is: {balance}</h3>
            <button onClick={deposit}>
                Deposit 100
            </button>
            <button 
                onClick={()=> setBalance(balance - 200)}
            >
                Withdraw 200
            </button>
        </div>
    )
}
