const calculator = () => {

    let number_1 = document.getElementById("number_1").value
    let number_2 = document.getElementById("number_2").value
    const op = document.getElementById("operation").value

    number_1 = Number(number_1)
    number_2 = Number(number_2)

    result(number_1, number_2, op)

}

const result = (n1, n2, op) => {

    let result = 0

    switch(op){
        case '+':
            result = n1+n2
            break;
        case '-':
            result = n1-n2
            break;
        case '*':
            result = n1*n2
            break;
        case '/':
            result = n1+n2
            break;

        default:
            console.log("Invalid Operation")
            break;

    }

    console.log("Result: ", result)
}
