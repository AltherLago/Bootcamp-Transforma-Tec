let x = 100;

try{
    if(x < 30){
        console.log("Valid number");
    }else{
        throw "Erro! Invalid number Number"
    }
}catch(error){
    console.log(error);
}
