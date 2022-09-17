import {useState} from "react"

export default function StateProps(props){

    const [color, setColor] = useState("?")

    return(
        <>
            <h2>Component of function with Props</h2>
            <h3>My favorite Color: {color}</h3>
            <button onClick={
                () => setColor(props.color)
                }>
                My favorite color
            </button>
        </>
    )
}
