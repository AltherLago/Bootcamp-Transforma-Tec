new Promise((resolution, reject) =>{
    console.log("Promise pending");
    let r = 0;
    resolution(r+e);
})
.then((res) => {
    
    console.log("Promise Resolution:", res);

}).catch((error) =>{

    console.log("Promise Reject:", error + "\n");

}).finally(() => {

    console.log("Run anyway");

})

