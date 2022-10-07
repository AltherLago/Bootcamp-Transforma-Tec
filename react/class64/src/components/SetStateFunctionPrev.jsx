import {useState} from "react";

export default function SetStateFunctionPrev(){
    const [state, setState] = useState({
        name: "Alther",
        age: 26
    })

    return(
        <>
            <button
                // do merge wits previus state
                onClick={
                    () => setState(
                        prevState => {
                            return{...prevState, name: "Alther Lago"}
                        }
                    )
                }
            >
                Update name
            </button>
            <p>
                {JSON.stringify(state)}
            </p>
        </>
    )
}
