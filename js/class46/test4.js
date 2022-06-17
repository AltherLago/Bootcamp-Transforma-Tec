let a = 50;
let b = 20;

try{
    let c = a + b;
    console.log("C: " + d)
}catch(error){
    if(error instanceof ReferenceError){
        console.log("Inexist variable");
    }else if(error instanceof RangeError){
        console.log("Out Range");
    }
}
