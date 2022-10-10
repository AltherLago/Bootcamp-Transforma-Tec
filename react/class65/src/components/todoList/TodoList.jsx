import { useState } from "react"
import Todos from "./Todos"

export default function TodoList(){
    const [count, setCount] = useState(0)
    const [todos, setTodos] = useState([])

    console.log('Render father component')

    const increment = () => {
        setCount((c) => c + 1)
    }
    const addTodo = () => {
        setTodos((t) => [...t, "New Item"])
    }

    return (
        <>
          <Todos todos={todos} addTodo={addTodo} />
          <hr />
          <div>
            Count: {count}
            <button onClick={increment}>+</button>
          </div>
        </>
    )
}
