import React, {useState} from 'react'
import UsersTable from './UsersTable'
import AddUserForm from './AddUserForm'


export default function Users(){
 
    const stili = {
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'center'
    }


    const usersData = [
        { id: 1, name: 'Alther', email: 'alther@mail.com' },
        { id: 2, name: 'Althe', email: 'althe@mail.com' },
        { id: 3, name: 'Alth', email: 'alth@mail.com' }
    ] 

    // propriedade que será renderizada com um array de users
    const [users, setUsers] = useState(usersData)

    const addUser = (user) => {
        user.id = users.length + 1
        setUsers([...users, user])
    }

    return(
        <div style={stili}>
            <h2>
                Sing up users
            </h2>
            <div>
                <div>
                    <div>
                        <h3>New</h3>
                        <AddUserForm addUser={addUser}/>
                    </div>
                </div>
                <div>
                    <h3>Users list</h3>
                    <UsersTable users={users}/>
                </div>
            </div>
        </div>

    )
}


