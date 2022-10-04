import React, {useState} from "react"

const AddUserForm = (props) => {

    const formStyle= {
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'center',
    }

    const addButton = {
        color: "#565e0a",
        borderRadius: "5px",
        border: "transparent"
    }


    const initialState = {id:null, name:'', email:''}
    const [user, setUser] = useState(initialState)

    const handleInputChange = (event) => {
        const {name, value} = event.target

        setUser({...user, [name]:value})
    }

    return(
        <form 
            style={formStyle}
            onSubmit={
                (event) => {
                    event.preventDefault()
                    
                    props.addUser(user)
                    setUser(initialState)
                }
            }>
            <label>Name</label>
            <input type="text" name="name" value={user.name}onChange={handleInputChange} />
            <label>Email</label>
            <input type="text" name="email" value={user.email}onChange={handleInputChange} />
            <button style={addButton}>Sing up</button>
        </form>
    )
}

export default AddUserForm
