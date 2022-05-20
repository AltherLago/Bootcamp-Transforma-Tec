// console.log("hello world!")

var currentNumberWrapper = document.getElementById('currentNumber');
var currentNumber = 0;

function decrement(){
   if(currentNumber > -10) currentNumber--;
   if(currentNumber <= 0) currentNumberWrapper.style.color = '#FF0000';
   currentNumberWrapper.innerHTML = currentNumber; }
function increment(){
   if(currentNumber < 10) currentNumber++; 
   if(currentNumber > 0) currentNumberWrapper.style.color = '#000000';
   currentNumberWrapper.innerHTML = currentNumber;
}


// document.addEventListener("click", function(){
  // document.demo.style.backgroundColor = "red";
// }); 


