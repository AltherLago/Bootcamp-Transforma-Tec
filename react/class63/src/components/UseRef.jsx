import React,{
    useState,
    useEffect,
    useRef
} from "react";

export default function UseRef(){

    const initialValue = ""
    const [inputValue, setInputValue] = useState(initialValue)
    // useRef -> stored a data before change state
    const previusInputValue = useRef(initialValue)

    useEffect(() => {
        previusInputValue.current = inputValue
    }, [inputValue])

    return (
        <>
            <h3>UseRef</h3>
            <input type="text"
                    value={inputValue}
                onChange={
                    (event) => setInputValue(event.target.value)
                }    
            />
            <h4>
                Current value: {inputValue}
            </h4>
            <h4>
                Previus value: {previusInputValue.current}
            </h4>
        </>
    )
    
}

