import React from "react";

export default class SetStateClass extends React.Component{
    // updade object in class component (merge)
    constructor(props){
        super(props)
        this.state = {
            name: "Alther",
            age: 32
        }
    }

    render(){
        return(
            <div style={{padding: "10px"}}>
                <button 
                    onClick={
                        () => this.setState({name: "Alther Lago"})
                }>
                    Update name
                </button>
                <p>
                    {JSON.stringify(this.state)}
                </p>
            </div>
        )
    }
}
