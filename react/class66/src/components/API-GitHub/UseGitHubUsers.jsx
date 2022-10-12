import {useEffect, useState} from "react";

export default function UseGitHubUsers(){

    const [query, setQuery] = useState("")
    const [results, setResults] = useState([])
    const [loading, setLoading] = useState(false)
    
    // each render
    useEffect(() => {
        setLoading(true)
        fetch(`https://api.github.com/search/users?q=${query}`,
            {method: "GET"}).then(req => {
                return req.json()
            }).then(data => {
                setResults(data.items)
            }).catch(error => console.error(error))
    },[query])

    return{
        query,
        setQuery,
        setLoading,
        results,
        loading
    }
}

