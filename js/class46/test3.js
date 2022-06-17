let x = 100;

try{
    if(x < 30){
        console.log("Valid number");
    }else{
        throw {
            "name":"Erro!InvalidNumber ",
            "message":"Erro! Invalid number"
        } 
    }
}catch(error){
    console.log(error.name);
    console.log(error.message);
}
