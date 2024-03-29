import { useState } from "react";
import Button from "../Button";

const Card = () =>{

    const [value, setValue] = useState(0)

    function Adction(){
        setValue(value + 1)
    }
    
    function Remove(){
        setValue(value - 1)
    }

    return(
        <div className="card">
            <div className="card-header">
                My first Card
            </div>
            <div className="card-body">
                <Button 
                    className="btn btn-success"
                    onClick={Adction}>
                        Adiction
                </Button>
                <Button 
                    className="btn btn-danger"
                    onClick={Remove}>
                        Remove
                </Button>
                <p>{value}</p> 

            </div>
        </div>
    )
}

export default Card;