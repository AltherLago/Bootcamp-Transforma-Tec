const promisse = new Promise((resolution, reject) => {

    let a = 2 + 5;

    setTimeout(
        () => resolution(a),
        3000
    )
});

// then & catch

promisse.then(
    sum => {
        console.log("SUM:", sum);
    }
)

