import React from 'react'

export default class StateCar extends React.Component{

    constructor(props){
        super(props)
        this.model = "Bettle"
        this.state = {
            on: false,
            velocity: 0
        }
    }

    onOff(){
        this.setState({on: !this.state.on})
    }

    speedUp(){
        if(this.state.on){
            let vel = this.state.velocity + 5
            this.setState({velocity: vel})
        }
    }
    
    break(){
        if(this.state.velocity > 0){
            let vel = this.state.velocity - 5
            this.setState({velocity: vel})
        }
    }


    render(){
        return(
            <>
                <p>Car: {this.model}</p>
                <p>On: {this.state.on ? "Yes" : "No"}</p>
                <p>Velocity: {this.state.velocity}</p>
               
                <button onClick={
                    () => this.onOff()
                }>
                    Turn the Key
                </button>
                <button onClick={
                    () => this.speedUp()
                }>
                    Speed Up
                </button>
                <button onClick={
                    () => this.break()
                }>
                    Break 
                </button>
            </>
        )
    }
}
