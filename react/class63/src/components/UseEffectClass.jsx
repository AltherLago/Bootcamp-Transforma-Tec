import React from "react";

export default class UseEffectClass extends React.Component {
    constructor(props){
        super(props)
        this.state = {
            clicks: 0
        }
    }

    // update component only first rendering
    componentDidMount(){
        document.title = `Amount clicks: ${this.state.clicks}`
    }

    // update all rendering
    componentDidUpdate(){
        document.title = `Amount click: ${this.state.clicks}`
    }
    render(){
        return(
            <>
                <h3>UseEffect in Class</h3>
                <p>Amount of clicks: {this.state.clicks}</p>
                <button onClick={
                    // updade variable
                    () => this.setState({clicks: this.state.clicks + 1})
                }>
                    Click here!
                </button>
            </>
        )
    }
}
