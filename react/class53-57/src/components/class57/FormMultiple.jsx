import {useState} from 'react'

export default function FormMultiple(){
    
    const [inputs, setInputs] = useState({})

    const handleChange = (event) => {

        const inputName = event.target.name
        const inputValue = event.target.value

        setInputs(
            (values) => (
                console.log(values),
            {
                // percorrer o conjunto de campos (spread)
                ...values,[inputName]: inputValue
            })
        )
    }


    const handleSubmit = (event) => {
        // don't update page
        event.preventDefault()
        alert(JSON.stringify(inputs))
    }

    return(
        <>
            <h3>Form</h3>
            <form onSubmit={handleSubmit}>
                <input 
                    type="text"
                    name='username'
                    //Current state or {}
                    value={inputs.username || "" } 
                    placeholder="Username"
                    onChange={handleChange}
                />
                <input 
                    type="number"
                    name='age'
                    value={inputs.age|| "" } 
                    placeholder="Age"
                    onChange={handleChange}
                />
                <textarea 
                    name="description" 
                    cols="30" 
                    rows="10"
                    onChange={handleChange}
                    placeholder="Description"
                ></textarea>
                <input 
                    type="submit"
                    name="submit"
                    value="Send"
                />
            </form>
            <p>Name: {inputs.username}</p>
            <p>Age: {inputs.age}</p>
            <p>Description: {inputs.description}</p>
        </>
    )
}
