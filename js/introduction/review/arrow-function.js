var sum = function(a,b){
    return a + b;
}

var result = sum(3,4)

console.log("Result conventional function: ", result);

// Arrow function
sum = (a,b) => a + b;

result = sum(5,6);
console.log("Result Arrow Function: ", result);


