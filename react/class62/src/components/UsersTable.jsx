import React from "react";

const UsersTable = (props) => (

    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            {
                // users array
                props.users.length > 0 ? (
                    
                    props.users.map(user => (
                        // data of each user
                        <tr key={user.id}>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                        </tr>
                    ))
                ):(
                    <tr>
                        <td colSpan={2}>Empty list</td>
                    </tr>
                )
            }
        </tbody>
    </table>
)

export default UsersTable
