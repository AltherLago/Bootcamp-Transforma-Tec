import React, {
    useState,
    useContext,
    createContext
} from "react";

// uma forma de distribuir a variável global
const UserNameContext = createContext()

export default function FirstComponete(){
    const [userName, setUserName] = useState('Alther')

    return(
        <div style={{border: '1px solid'}}>
            <UserNameContext.Provider value={userName}>
                <h3>UseContext Exemple</h3>
                <p>First component</p>
                <p>{`Hello ${userName}`}</p>

                <SecondComponent userName = {userName}/>
            </UserNameContext.Provider>
        </div>
    )
}

function SecondComponent(){
    return(
        <div style={{border: `1px solid`}}>
            <p>Second component</p>
            <ThirdComponent/>
        </div>
    )
}
function ThirdComponent(){
    return (
        <div style={{border: '1px solid'}}>
            <p>Terceiro  componente</p>

            <FourthComponent/>
        </div>
    )
}
function FourthComponent(){

    const userName = useContext(UserNameContext)

    return (
        <div style={{border: '1px solid'}}>
            <p>Quarto componente</p>
            <p>{`Olá  ${userName} no quarto componente`}</p>
            <QuintoComponente />
        </div>
    )
}
function QuintoComponente (){
    return (
        <div style={{border: '1px solid'}}>
            <p>Quinto componente</p>

            <SextoComponente />
        </div>
    )
}

function SextoComponente (){
    const userName = useContext(UserNameContext)
    return(

        <div style={{border: '1px solid'}}>
            <p>Sexto componente</p>
            <p>{`Olá novamente ${userName}`}</p>
        </div>
    )
}
