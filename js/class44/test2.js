var start = new Date()

const promisse = new Promise((resolution, reject) => {

    let a = 2 + 3;
    let b = 2 * 3;
    let c = 2**3;

   var result = {
        "a": a,
        "b": b,
        "c": c
    }


    setTimeout(
        () => resolution(result),
        3000
    )

});

// then & catch

promisse.then(
    (res) => {
        console.log(res);
    }
).catch(
    error => {
       console.log("Error!\n,", error + "\n");
    }
)


