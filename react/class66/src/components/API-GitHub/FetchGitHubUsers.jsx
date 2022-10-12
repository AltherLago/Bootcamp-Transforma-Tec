import UseGitHubUsers from "./UseGitHubUsers"

export default function FetchGitHubUsers(){

    const {setQuery, results} = UseGitHubUsers();

    return(
        <div>
            <input onChange={e => setQuery(e.target.value)} />
            <ul>
                <li>Loading</li>
                {
                    results && results.map(
                        (item, index) =>
                            <li key={index}>{item.login}</li>
                    )
                }
            </ul>
        </div>
    )
}
