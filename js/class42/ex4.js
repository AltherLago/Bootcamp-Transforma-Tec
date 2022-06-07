const data = '{"name": "John", "old": "30", "car": null}';
const people = JSON.parse(data);

for(const prop in people){
    console.log("Property: ", prop);
    console.log("Value: ", people[prop]);

}
