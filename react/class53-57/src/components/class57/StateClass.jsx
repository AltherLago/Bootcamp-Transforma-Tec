import React from "react";

export default class StateClass extends React.Component{

    constructor(){
        super();
        this.state = {
            number: 10
        }
    }

    setNumber(){
        let sum = this.state.number + 100
        this.setState({number: sum})
    }

    render(){
        return(
            <>
                <h2>Component of function</h2>
                <h3>Current number: {this.state.number}</h3>
                <button onClick={
                    () => this.setNumber()
                    }>
                    Sum 100
                </button>
            </>
        )
    }


}
