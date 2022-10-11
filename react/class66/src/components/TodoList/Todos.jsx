import '../../App.css';
import {useCallback, useState} from "react";
import Todo from "./Todo";
import TodoForm from "./TodoForm";

export default function Todos(){

    const[todos, setTodos] = useState([
        {
            text: "TransformaTec class",
            isCompleted: false
        },
        {
            text: "Finish portfolio",
            isCompleted: false
        }
    ])

    const addTodo = useCallback(
        // insert text value
        (text) => {
            const newTodos = [...todos, {text}]
            setTodos(newTodos)
        }, [todos]
    )

    const completeTodo = (index) => {
        const newTodos = [...todos]
        newTodos[index].isCompleted = true
        setTodos(newTodos)
    }

    const removeTodo = (index) => {
        const newTodos = [...todos]
        newTodos.splice(index, 1)
        setTodos(newTodos)
    }

    return(
        <div className="Todos">
            <div className="Todos-list">
                {
                    todos.map(
                        (todo, index) => (
                            <Todo
                                key={index}
                                index={index}
                                todo={todo}
                                completeTodo = {completeTodo}
                                removeTodo = {removeTodo}
                            />
                        )
                    )
                }
            <TodoForm addTodo={addTodo}/>
            </div>
        </div>
    )
}
