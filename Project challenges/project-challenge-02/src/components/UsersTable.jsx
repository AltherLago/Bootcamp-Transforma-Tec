import React from "react"

// why is use "("?
const UsersTable = (props) => (
    <table>
    
        <thead>
            <tr>
                <th>Name</th>
                <th>UsersName</th>
                <th>Email</th>
                <th>Actions</th>
            </tr>
        </thead>

        <tbody>
            {
                props.users.length > 0 ?
                    (
                        props.users.map(user => (

                            <tr key={user.id}>

                                <td>{user.name}</td>
                                <td>{user.username}</td>
                                <td>{user.email}</td>

                            <button onClick={
                                () => {
                                    props.editRow(user)
                                }
                            }>
                                Edit
                            </button>

                            <button onClick={
                                () => {
                                    props.deleteUser(user.id)
                                }
                            }>
                                Delete
                            </button>
                            
                            </tr>
                        ))
                    ):(
                        <tr>
                            <td colSpan={4}>Empty list</td>
                        </tr>
                    )
            }
        </tbody>

    </table>
)

export default UsersTable
