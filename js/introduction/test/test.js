// var preco = 2;
const PRECO = 2;
var descont = 0.2;

var total = PRECO - descont;

function sum(a,b){
    console.log(a+b);
    return a+b;
}

sum(3,5);

console.log("Hello world!");

function returnEvenValues(array){
    var evenNums = [];
    var oddNums = [];
    for(let i = 0; i < array.length; i++){
        if(array[i] % 2 === 0){
            evenNums.push(array[i]);
            console.log(evenNums);
        }else{
            oddNums.push(array[i]);
        }
    }
    console.log('Even numbers are: ', evenNums);
    console.log('Odd numbers are: ', oddNums);
    // console.log('Even numbers: ', JSON.stringify(evenNums));
}

let array = [1,2,3,4,5,7,8];

returnEvenValues(array);
