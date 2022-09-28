import React, {useState} from 'react'

const AddUserForm = (props) => {

    const addButton = {
        backgroundColor: `lightgreen`
    }


    const initForm = {id: null, name: null, username: null, email: null}

    const [user, setUser] = useState(initForm)

    const handleInputChange = (event) => {
        const {name, value} = event.target
        setUser({...user, [name]:value})
    }

    return(
        <form
            style={{
                display: 'flex',
                flexDirection: 'column'
            }}
            onSubmit={
                (event) => {
                    // don't update page
                    event.preventDefault()

 
                if (!user.name || !user.email || !user.username) {
                    return
                }

                    // inside component USER
                    props.addUser(user)
                    // empty form
                    setUser(initForm)
                }
            }>

            <label>Name</label>
            <input type="text"
                   name="name"
                   value={user.name}
                   onChange={handleInputChange}
                   placeholder="User name"
            />
            <label>Username</label>
            <input type="text"
                   name="username"
                   value={user.username}
                   onChange={handleInputChange}
                   placeholder="User nickname"
            />
            <label>Email</label>
            <input type="email"
                   name="email"
                   value={user.email}
                   onChange={handleInputChange}
                   placeholder="User email"
            />

            <button style={addButton}>Register</button>


        </form>
    )
}

export default AddUserForm 
