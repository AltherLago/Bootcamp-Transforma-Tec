function getAdmins(map){
    let adms = [];
    for([key,value] of map){
        if(value === 'Adm') adms.push(key);
    }
    return  adms;
}

const users = new Map();

users.set('Luiz', 'Adm');
users.set('Stephany', 'Adm');
users.set('Natátia', 'Adm');
users.set('Jorge', 'User');

console.log(getAdmins(users));
