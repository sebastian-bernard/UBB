//Template strings
myName = 'John';
myAge = 13;
console.log(`My name is ${myName} and I am ${myAge} years old`);

// Strings

// console.log(
//     myName.toUpperCase()
//     .toLowerCase()
//     .length
//     .split()
// );

// Arrays

const fruits = ['apples', 'pears', 'oranges'];

// fruits.push('greaps'); //insert at the end
//       .unshift('strawberries'); //insert at the beginning
//       .indexOf('oranges');
//       Array.isArray(fruits); // see the type      
// console.log(fruits[1]);


// Classes

const person = {
    firstName: 'John',
    lastName: 'Doe',
    age: 30,
    hibbies: ['music', 'sports', 'diving'],
    address: {
        street: 'Gusty Presecan',
        city: 'Cluj',
        zip: '1234'
    }
}

// Destructor = extract from var
// const {firstName, lastName, address:{city}} = person;
// console.log(city);



// // console.log('%cJavascript-starter-theory.js line:40 person', 'color: #007acc;', person);
// console.log('%cJavascript-starter-theory.js line:41 person.address.city', 'color: #26bfa5;', person.address.city);


// Send data to a server
// JSON.stringify(person);

const todos = [
    {
        id: 1,
        text: 'cleaning',
        isCompletted: false
    },
    {
        id: 2,
        text: 'js',
        isCompletted: false
    },
    {
        id: 3,
        text: 'php',
        isCompletted: false
    }
]

// loops
// for(let miau of todos){
//     console.log(miau);
// };

//forEach, map, filter
// - map: returns wha tis mapped

todos.forEach(function(miau){
    console.log('%cJavascript-starter-theory.js line:79 miau.text', 'color: #007acc;', miau.text);
});

// Classes
    // class Person{
    //     constructor(firstName, lastName, dob){
    //         this.firstName = firstName;
    //         this.lastName = lastName;
    //         this.dob = new Date(dob);
    //     }

    //     getBirthYear(){
    //         return this.dob.getFullYear();
    //     }

    //     getFullName(){
    //         return `${this.firstName} ${this.lastName}`;
    //     }
    // }

    // const person1 = new Person('John', 'Doe', '4-3-2000');
    // const person2 = new Person('Mary', 'Rose', '6-6-2006');

    // console.log(person1.getFullName());
    // console.log(person1.getBirthYear());
