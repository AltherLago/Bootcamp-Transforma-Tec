import React from "react"
import styled from 'styled-components'
import styles from './styles.scss'

// main button
const  Button = styled.button`
    margin-left: 10px;
    margin-right: 10px;
    font-size: 14px;
` 

// inheritance main button
const EditButton = styled(Button)`
    background-color: lightyellow;
`

// inheritance main button
const RemoveButton = styled(Button)`
    background-color: lightcoral;
`



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

                            <EditButton onClick={
                                () => {
                                    props.editRow(user)
                                }
                            }>
                                Edit
                            </EditButton>

                            <RemoveButton onClick={
                                () => {
                                    props.deleteUser(user.id)
                                }
                            }>
                                Delete
                            </RemoveButton>
                            
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
