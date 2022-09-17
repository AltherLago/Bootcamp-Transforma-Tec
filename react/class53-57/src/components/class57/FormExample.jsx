import React from 'react'

export default class FormExample extends React.Component{

    constructor(props){
        super(props)
        this.state = {
            email:''
        }

       // para não escrever a arrow function 
       this.handleSubmit = this.handleSubmit.bind(this); 
       this.handleInputChange = this.handleInputChange.bind(this); 
    }


    // manipular submit
    handleSubmit(event){
        // don't update webpage when input submit
        event.preventDefault()

        alert(this.state.email)
    }

    // manipular campo de entrada
    handleInputChange(event){
        return this.setState({
            email: event.target.value
            //evento.campo-de-entrada.valor-da-entrada
        })
    }

    render(){
        return(
            <>
                <h2>Form Exemple</h2>
                <form onSubmit={this.handleSubmit}>
                    <input type="text" placeholder='Email' onChange={this.handleInputChange} />
                    <button>Send</button>
                </form>
                <h3>Email: {this.state.email}</h3>
            </>
        )
    }
}


