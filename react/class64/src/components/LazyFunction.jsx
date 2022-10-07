import React, {useState} from "react"

export default function LazyFunction(){
    function numberGerator(){
        return Math.random()
    }

    const [myState, setMyState] = useState(numberGerator())

    return(
        <>
            <h3>Initial value state: {myState}</h3>
            <button
                onClick={
                    () => setMyState(myState + 1)
                } 
            >
                Click here!
            </button>
        </>
    )
}
