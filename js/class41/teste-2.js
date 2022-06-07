var fruits = '["grape", "apple", "pear"]';

var fruitsObj = JSON.parse(fruits);

console.log(fruitsObj);
console.log(fruitsObj[0]);

// JSON Object
var population = [
    {"name": "John", "old":25},
    {"name": "Jose", "old": 23}
]

console.log(population);
console.log(population[0]);
console.log(population[1].old);


