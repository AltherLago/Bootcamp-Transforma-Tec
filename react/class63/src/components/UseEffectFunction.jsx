import React, {
    useEffect,
    useState,
}from "react";

export default function UseEffectFunction(){
    const [clicks, setClicks] = useState(0)

    useEffect(() => {
        document.title = `Amount of Clicks: ${clicks}`
    }, [clicks])

    return(
        <>
            <h3>UseEffectFunction</h3>
            <p>Amount of clicks: {clicks}</p>
            <button onClick={
                () => setClicks(clicks + 1)
                }>
                Click here!
            </button>
        </>
    )
}
