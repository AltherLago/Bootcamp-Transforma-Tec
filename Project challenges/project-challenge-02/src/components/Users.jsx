import React, {useState} from "react"

const Users = () => {

    const usersData = [
        {id: 1, name: 'Alther', username: 'AltherL', email:'alther@gmail.com'},
        {id: 2, name: 'Jose', username: 'JoseS', email:'jose@gmail.com'},
        {id: 3, name: 'Carlos', username: 'CarlosP', email:'carlos@gmail.com'}
    ]

    const initForm = {id:null, name:'', username:'', email:''}

    const [users, setUsers] = useState(usersData)
    // currentUser is empty
    const [currentUser, setCurrentUser] = useState(initForm)
    // flag editing or insert mode
    const [editing, setEditing] = useState(false)
    
    const addUser = (user) => {
        user.id = user.length + 1
        // add on user list
        setUsers([...users, user])
    }

    // const deleteUser = (id) => {
        // setEditing(false)

        // setUsers(
            // users.filter(
                // (user) => {
                    // user.id !== id
                // }
            // )
        // )
    // }  

    const deleteUser = (id) => {
        setEditing(false)

        // filter the id
        setUsers(users.filter(user => user.id !== id))
    }  

    const updateUser = (id, updateUser) => {
        setEditing(false)

        setUsers(users.map(
            user => (user.id === id ? updateUser : user)
        ))
    }

    const editRow = (user) => {
        setEditing(true)
        setCurrentUser({id: user.id,
                        name: user.name,
                        username: user.username,
                        email: user.email})
    }

    return(
        <>
            <h2>Sing up</h2>
        </>
    )

}
