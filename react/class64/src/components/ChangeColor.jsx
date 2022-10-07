import { useState } from "react";

export default function ChangeColor(){
    // initial state
    const [color, setColor] = useState("Blue")


    return(
        <>
            <h3>
                My favorite color is {color}
            </h3>
            <button
                // update state
                onClick={
                    () => {
                        setColor("cyan")
                    }
                }
            >
                Change color  
            </button>
        </>
    )
}
