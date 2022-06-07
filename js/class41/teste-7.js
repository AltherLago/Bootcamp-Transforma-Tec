const data = '{"name": "John", "old": 30, "car": "chevet"}';

const people = JSON.parse(data);

for (const prop in people){
    console.log(prop);
}

for(const prop in people){
    console.log(people[prop]);
}
