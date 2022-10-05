import React from "react";

export default class UseStateClass extends React.Component{

    constructor(props){
        super(props)
        // start variable state
        this.state = {
            clicks: 1
        }
    }

    render(){
        return(
            <>
                <h3>Class Component</h3>
                <p>Amount clicks: {this.state.clicks}</p>
                <button onClick={
                    // update variable state
                    () => this.setState({clicks: this.state.clicks + 1})

                }>Click here!</button>
            </>
        )
    }
}
