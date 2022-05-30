let name = "Alther";

console.log(name);

// var name = "Ricardo";
//
const localName = () => {
    let name = "Lago"
    console.log(name);
    return name;
} 

name += localName();

console.log(name);
