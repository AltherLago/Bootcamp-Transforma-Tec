import React from "react"

export default class UseEffectClass extends React.Component{
    constructor(props){
        super(props)
        
        this.state = {
            clicks: 0
        } 
    }

    // First render
    componentDidMount(){
        document.title = `Clicks: ${this.state.clicks}`
    }

    // Render when update state
    componentDidUpdate(){
        document.title = `Clicks: ${this.state.clicks}`
    }

    // Render on component destroy
    componentWillUpdate(){
        setTimeout(
            () => {
                console.log("Destroying")
            }, 3000
        )
        console.log("Destroyed")
    }

    render(){
        return(
            <>
                <h3>UseEffectClass</h3>
                <p>Clicks: {this.state.clicks}</p>
                <button
                    onClick={
                        () => this.setState({clicks: this.state.clicks + 1})
                    }
                >
                    Click here
                </button>
            </>
        )
    }
}
