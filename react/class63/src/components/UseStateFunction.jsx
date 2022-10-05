import React, {useState} from "react";

export default function UseStateClass(){
    // hook setState
    const [clicks,setClicks] = useState(0)

    return(
        <>
            <h3>Function component</h3>
            <p>Amount clicks: {clicks}</p>
            <button
                onClick={
                    () => setClicks(clicks + 1)
            } >
                Click here!     
            </button>
        </>
    )
}
