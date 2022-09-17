import React from 'react'

export default class StatePerson extends React.Component{
    constructor(props){
        super(props)

        this.state = {
            name: "Jose",
            job: "woodworker",
            age: 40
        }

        this.update = this.update.bind(this)
        
    }

    update(){
        this.setState({
            name: this.props.name,
            job: this.props.job,
            age: this.props.age
        })
    }


    render(){
        return(
            <>
                <h3>Name: {this.state.name}</h3>
                <h3>Name: {this.props.name}</h3>
                <h3>Job: {this.state.job}</h3>
                <h3>Age: {this.state.age}</h3>
                <button onClick={this.update}>Update</button>
            </>
        )
    }

}
