function promise(){
    return new Promise(

        (resolve) => {
            let a = 2;
            let b = 3;

            resolve(a * c);
        }

    )    
}

const sum = async function() {
    const valor = await promise();
    console.log('Result promise:', valor, '\n');
    console.log('Result sum:', valor+2, '\n');
    return valor + 2;
}

const sum2 = async function(){
    const valor2 = await sum();
    console.log('Result sum2:', valor2+3, '\n');
    return valor2 + 3;
}

const sum3 = async function(){
    const valor3 = await sum2();
    console.log('Result sum3:', valor3+4, '\n');
    return valor3 + 4;
}

sum3().then(
    res =>  {console.log('Res Asynd/Await: ', res, '\n')}
).catch(
    erro => {
        console.log("Erro Async/Await:", erro, '\n');
    }
)

