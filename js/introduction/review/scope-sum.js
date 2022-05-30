let i = 20;

let soma = 0;

let result = 0;

//variavel i de escopo de bloco
for(let i = 0; i < 10; i++ ){

    console.log("Variável 'i' de escopo de bloco: ",i)

    soma = soma + i

}

console.log("Resultado da soma: ",soma)
