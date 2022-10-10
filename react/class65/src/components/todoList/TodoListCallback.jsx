import {useCallback, useState} from "react"
import Todos from "./Todos"

export default function TodoListCallback(){
    const [count, setCount] = useState(0)
    const [todos, setTodos] = useState([])

    console.log("Render father component - Callback")

    const increment = () => {
    setCount((c) => c + 1)
    }
    const addTodo = useCallback(() => {
    setTodos((t) => [...t, "New Todo"])
    }, [])

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

