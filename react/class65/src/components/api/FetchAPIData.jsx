import UseFetchData from "./UseFetchData";

export default function FetchAPIData(){

    const url = 'https://api.github.com/users/AltherLago/repos'
    const {data} = UseFetchData(url) 

    return(
        <>
            {/*if data...*/}
            {data && (
                data.map(
                    (repository) => (
                        <div key={repository.id}>
                            <p>Id: {repository.id} - Name: {repository.name}</p>
                        </div>
                ))
            )}
        </>
    )
    
}
