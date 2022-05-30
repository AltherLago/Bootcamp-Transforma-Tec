let alphabet = "ABCDEFGHIKLMNIOPQRSTUVWXYZ";

var letters = Array.from(alphabet);

function ex(){

    for(letter of letters){
        console.log(letter);
    }

    for(letter of letters.entries()){
        console.log(letter);
    }
}

// ex();

let oldPlate = "BCP1077";

let oldPlateLetters = Array.from(oldPlate);

for(let letter of oldPlateLetters.entries()){
   console.log(letter);
}

let newPlate = (oPL) => {
    let plate = oPL;
    plate[4] = letters[oPL[4]];
    // console.log(plate);
    return plate;
} 


console.log(newPlate(oldPlateLetters));
