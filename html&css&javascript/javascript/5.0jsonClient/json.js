var personStr = '{"name":"Bob", "age":23, "hobby":["eat","sleep","game"] }';

var person = JSON.parse(personStr);

console.log(personStr)
console.log(person)


console.log(person.name)
console.log(person.age)
console.log(person.hobby)