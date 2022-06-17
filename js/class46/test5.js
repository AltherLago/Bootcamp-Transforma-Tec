class ErroForm extends Error{
    constructor(message){
        super(message)

        this.name = "ErroForm";
    }
}

class ErroCPF extends Error{
     constructor(message){
        super(message)

        this.name = "ErroCPF";
    }
   
}

try{
    let name = "Alther";
    let old = 26;
    let job = "Developer";
    let cpf = "000000000000";

    if(name == null || !old || !job || !cpf){
        let erroForm = new ErroForm("blank fields not allowed")

        throw erroForm;
    }else{
        if(cpf.length != 11){
            let erroCPF = new ErroCPF("CPF lenght differs 11 numbers");
            throw erroCPF;
        }
        console.log("Sing up User")
    }
}catch(erro){
    console.log(erro);
    console.log(erro.name);
    console.log(erro.message);
}
