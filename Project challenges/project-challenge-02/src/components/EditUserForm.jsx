import React, {useState, useEffect} from 'react'
import styled from 'styled-components'

const EditUserForm = (props) => {

    // Objects styles
    const editForm = {
        display: 'flex',
        flexDirection: 'column',
    }

    const CancelButton = styled.button`
        background-color: lightcoral
    `
    
    const [user, setUser] = useState(props.currentUser)

    useEffect(
        () => {
            setUser(props.currentUser)
        },
        [props]
    )

    const handleInputChange = (event) => {

        const {name, value} = event.target
        setUser({...user, [name]:value})

    }

    return(
        <form
            style={editForm}

            onSubmit={
                (event) => {
                    event.preventDefault()
                    props.updateUser(user.id, user)
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

            <button
                style={{'background-color': 'lightgreen'}}>
                Update
            </button>
        
            <CancelButton onClick={
                () => {
                    props.setEditing(false)
                }    
            }>
                Cancel
            </CancelButton>


        </form>
    )
}

export default EditUserForm
