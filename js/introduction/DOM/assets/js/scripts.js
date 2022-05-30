const button = document.getElementById('mode-selector');
const h1 = document.getElementById('page-title');
const body = document.getElementsByTagName('body')[0];
const footer = document.getElementsByTagName('footer')[0];
const darkModeClass = 'dark-mode';

button.addEventListener('click', changeMode);

function changeMode(){
    // TEST
    // console.log('clicked!');

    changeClasses();
    changeText();
}

function changeClasses(){
    button.classList.toggle(darkModeClass);
    h1.classList.toggle(darkModeClass);
    body.classList.toggle(darkModeClass);
    footer.classList.toggle(darkModeClass);
}

function changeText(){
    const lightMode = "Light Mode";
    const darkMode = "Dark Mode";

    // Test
    // console.log("Change text");
    
    if(body.classList.contains(darkModeClass)){
        button.innerHTML = lightMode;
        h1.innerHTML = darkMode +  ' ON';
        return;
    }

    button.innerHTML = darkMode;
    h1.innerHTML = lightMode + ' ON';
}

// Test
// console.log(button);
// console.log(h1);
// console.log(body);
// console.log(footer);



