import {useState} from 'react'

export default function StateColor(props){
    const [color, setColor] = useState("red")
    const [name, ] = useState("Alther")

    return(
        <div>
            <p>My favorite color is: {color}</p>
            <p>My name is: {name}</p>
            <button type="button" onClick={
                () => setColor(props.color)
            }>
                Change Color
            </button>
        </div>
    )
}
