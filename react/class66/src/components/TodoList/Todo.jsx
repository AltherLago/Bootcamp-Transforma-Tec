import "../../App.css"

export default function Todo({todo,
                              index,
                              completeTodo,
                              removeTodo}){

    return(
        <div
            className="Todo"
            style={{textDecoration: todo.isCompleted ? "line-through" : ""}}
        >
            {todo.text}
            <div>
                <button onClick={() => completeTodo(index)}>To complete</button>
                <button onClick={() => removeTodo(index)}>Delete</button>
            </div>
        </div>
    )
}
