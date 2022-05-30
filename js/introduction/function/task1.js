const students = [
    {
        name: 'John',
        grade: 5,
        class: '1B'
    },
    {
        name: 'Sofia',
        grade: 9,
        class: '1B'
    },
    {
        name: 'Paul',
        grade: 6,
        class: '2C'
    }
]

function approvedStudents1(arr, average){
    let approveds = [];
    let count = 0;
    for(let i = 0; i<arr.length; i++){
        if(arr[i].grade > average){
            approveds[count] = arr[i];
            count++; 
        }   
    }
    // console.log('Inside function: ', approveds);
    return approveds;
}

function approvedStudents2(arr, average){
    let approveds = [];
    for(let i = 0; i<arr.length; i++){
        if(arr[i].grade >= average) approveds.push(arr[i].name);
    }
    return approveds;
}

// Object destructuring
function approvedStudents3(arr, average){
    let approveds = [];
    for(let i = 0; i<arr.length; i++){
        const {grade, name} = arr[i];
        if(grade >= average) approveds.push(name);
    }
    return approveds;
}



let goodStudents1 = approvedStudents1(students,7);
let goodStudents2 = approvedStudents2(students,7);
let goodStudents3 = approvedStudents3(students,7);

console.log(goodStudents1);
console.log(goodStudents2);
console.log(goodStudents3);
