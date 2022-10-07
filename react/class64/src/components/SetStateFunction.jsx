import {useState} from "react";

export default function SetStateFunction(){
    const [state, setState] = useState({
        name: "Alther",
        age: 26
    })

    return(
        <>
            <button
                onClick={() =>
                    setState({name: "Alther Lago"})
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
