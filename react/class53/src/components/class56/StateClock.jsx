import React from 'react'

export default class StateClock extends React.Component{
    constructor(){
        super()
        this.state ={
            hour: new Date()
        }
    }

    tickTack(){
        this.setState({hour: new Date()})
    }

    componentDidMount(){
        this.time = setInterval(
            () => this.tickTack(),
            1000)
    }

    render(){
        return(
            <div className='clock'>
                <h2>
                    Current time: {this.state.hour.toLocaleTimeString()}
                </h2>
            </div>
        )
    }
}
