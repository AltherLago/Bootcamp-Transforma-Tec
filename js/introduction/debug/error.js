function arrayValidation(arr, size){
    try{
        if(!arr && !size) throw new ReferenceError("Sent parameters");
        
        if(typeof arr !== 'object') throw new TypeError("Array needs to be object");

        if(typeof size !== 'number') throw new TypeError("Size needs to be number");

        if(arr.length !== size) throw new RangeError("Invilibe size");

        return arr;
    }
    catch(e){
        if(e instanceof ReferenceError){
            console.log("It is a ReferenceError");
            console.log(e.name);
            console.log(e.stack);
            console.log(e.message);
        } if(e instanceof TypeError){
            console.log("It is a TypeError");
            console.log(e.name);
            console.log(e.stack);
            console.log(e.message);
        } if(e instanceof RangeError){
            console.log("It is a RangeError");
            console.log(e.name);
            console.log(e.stack);
            console.log(e.message);
        } else{
            console.log("Unexpected erro" + e);
        }
   }
}

let arr = [1,2,3,4];
let size = 4; 

console.log(arrayValidation(arr, size));
