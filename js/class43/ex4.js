for(let i = 0; i <= 10; i++){
    if(i == 0) {
        setTimeout(
            () => {
                console.log("D: ", i);
            }, 5000
        )
    }
    else if (i == 5) {
        setTimeout(
            () => {
                console.log("D: ", i);
            }, 1000
        )
    } else {
        console.log(i);
    }
}

