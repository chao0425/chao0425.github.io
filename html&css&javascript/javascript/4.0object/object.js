var people = new Object()

people.name = "Bob";
people.age = 18;

people.sayMe = function(hobby) {
    console.log("My name is : " + this.name + " and my age is : " + this.age + " then my hobby is : " + hobby)
}

people.sayMe("nothing")

var people = {
    name : "Alice",
    "age" : 28,
    "job" : "teacher",
    sayMe : function(hobby) {
        console.log(
            "Hello my name is " + this.name + 
            " and my age is " + this.age + 
            " my job is " + this.job + 
            "my hobby is " + hobby)
    }
}

people.sayMe("nothing")