const promise = new Promise(
    (solve, reject) => {
        let a = 2;
        let b = 3;

        // return
        /*function*/ solve(a * b);
    }
)

promise.then(
    res => {
        console.log("Promise result: " + res);
        return res;
    }
).then(
    res => {
        console.log("Other mesage: " +  res*2);
    }
).catch(
    erro => {
        console.log("Promise error: \n", erro);
    }
)
