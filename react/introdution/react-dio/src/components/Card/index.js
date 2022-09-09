const Card = () =>{
    return(
        <div className="card">
            <div className="card-header">
                My first Card
            </div>
            <div className="card-body">
                <button type="button" className="btn btn-success">Adiction</button>
                <button type="button" class="btn btn-danger">Remove</button>
                <p>0</p>

            </div>
        </div>
    )
}

export default Card;