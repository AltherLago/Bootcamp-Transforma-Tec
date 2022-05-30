const people1 = {
    name: 'Mary',
    old: 30
};

const peopler2 = {
    name: 'Carl',
    old: 26
};

const animal = {
    name: 'Fiona',
    idade: 5,
    breed: 'Pug'
}

function oldCalculator(olds){
    return `${olds} years from know, ${this.name} will be ${this.old + olds} years old.`;
}

console.log(oldCalculator.call(peopler2, 30));
console.log(oldCalculator.apply(people1, [4]));
