import HelloWorldAdd from "./HelloWorldAdd";

export default function HelloWorldFunction(){

    const addNumber = (n1,n2) => {
        return n1 + n2;
    }

    return(
        <HelloWorldAdd addNumber={addNumber}/>
    )
}

