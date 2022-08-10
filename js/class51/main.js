const cep = document.getElementById("cep")
const search = document.getElementById("search")
const clear = document.getElementById("clear")

const isCepValid = async (cep) => {
    return cep.length == 8 && /^[0-9]+$/.test(cep)
}

const searchCep = async() => {
    const cep_value = cep.value

    try{
        if(await isCepValid(cep_value)){
            const viacep_url =`https://viacep.com.br/ws/${cep_value}/json`
            console.log("VIACEP URL: ", viacep_url)

            const cep_data = await fetch(viacep_url)
            const cep_json = await cep_data.json()

            console.log("CEP data: ", cep_json)

            if(cep_json.hasOwnProperty('erro')){
                throw{
                    "name": "CEPError",
                    "message": "Informaded CEP not founded"
                }
            }else{
                await fillReply(cep_json)
            }
        } else{
            throw{
                "name": "CEPError",
                "message": "CEP Informaded invalid"
            }
        }
    }catch(erro){
        const erro_cep = document.createElement("p")
        erro_cep.setAttribute("id", "erro_cep")
        erro_cep.setAttribute("class", "erro_cep")
        erro_cep.innerHTML = erro.message
        
        document.body.appendChild(erro_cep)
    }
}

const fillReply = async (adress) => {
    console.log("fillReply")
    const div_reply = document.createElement("div")
    div_reply.setAttribute("id", "div_reply")
    div_reply.setAttribute("class", "container")

    const street = document.createElement("p")
    street.setAttribute("id", "street")
    street.setAttribute("class", "reply")
    street.innerHTML = adress.logradouro
    div_reply.appendChild(street)

    const district = document.createElement("p")
    district.setAttribute("id", "district")
    district.setAttribute("class", "reply")
    district.innerHTML = adress.bairro
    div_reply.appendChild(district)

    const city = document.createElement("p")
    city.setAttribute("id", "city")
    city.setAttribute("class", "reply")
    city.innerHTML = adress.localidade
    div_reply.appendChild(city)

    document.body.appendChild(div_reply)
}

const cleanData = async() => {
    const div_reply = document.getElementById("div_reply")
    
    const erro = document.getElementById("erro_cep")

    cep.value = ""

    if(div_reply){
        document.body.removeChild(div_reply)
    }else if(erro){
        document.body.removeChild(erro)
    }
}

search.addEventListener('click', searchCep)
clear.addEventListener('click', cleanData)
