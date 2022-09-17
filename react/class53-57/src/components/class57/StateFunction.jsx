import React, {useState} from 'react';

export default function StateFunction (){

    // initial state
    const [number, setNumber] = useState(10)

    return(
        <>
            <h2>Component of function</h2>
            <h3>Current number: {number}</h3>
            <button
                onClick={
                    () => setNumber(number + 100)
                }>
                To sum 100
            </button>
        </>
    )
}
