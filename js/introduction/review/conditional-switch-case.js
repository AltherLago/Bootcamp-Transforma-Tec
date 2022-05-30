let option = "*";
let number1 = 3;
let number2 = 4;

switch(option){
    case "+":
        console.log(number1 + number2);
        break;
    case "-":
        console.log(number1 - number2);
        break;
    case "*":
        console.log(number1 * number2);
        break;
    case "/":
        console.log(number1 /  number2);
        break;
    default:
        console.log("Invalid Operation")
        break;
}

