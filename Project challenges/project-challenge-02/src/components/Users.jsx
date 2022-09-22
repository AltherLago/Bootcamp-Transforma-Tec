import React, {useState} from 'react'
import AddUserForm from './AddUserForm'
import EditUserForm from './EditUserForm'
import UsersTable from './UsersTable'

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
        user.id = users.length + 1
        // add on user list
        setUsers([...users, user])
    }

    const deleteUser = (id) => {
        setEditing(false)

        // filter the id
        setUsers(users.filter(user => user.id !== id))
    }  

    const updateUser = (id, updatedUser) => {
        setEditing(false)

        setUsers(users.map(
            user => (user.id === id ? updatedUser : user)
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
            <div>
                <div>
                    {
                        editing?(
                            <div>
                                <h3>To edit user</h3>
                                <EditUserForm
                                    editing={editing}
                                    setEditing={setEditing}
                                    currentUser={currentUser}
                                    updateUser={updateUser}
                                />
                            </div>
                        ):(
                            <div>
                                <h3>New user</h3>    
                                <AddUserForm addUser={addUser}/>
                            </div>
                        
                        )
                    }
                </div>
                <div>
                    <h3>Users list</h3>
                    <UsersTable
                        users={users}
                        editRow={editRow}
                        deleteUser={deleteUser}
                    />
                </div>
            </div>
        </>
    )

}

export default Users
