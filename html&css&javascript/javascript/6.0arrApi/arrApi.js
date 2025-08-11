var arr = new Array();
console.log("length is : " + arr.length + " and arr is : " + arr);
arr[0] = "Bob"
arr[1] = 0
arr[4] = true
console.log("length is : " + arr.length + " and arr is : " + arr);

var arr = new Array(5);
console.log("length is : " + arr.length + " and arr is : " + arr);

var arr = new Array(2,4,6,8);
console.log("length is : " + arr.length + " and arr is : " + arr);

var arr = [1, 3, "好奇怪", true, 7, 9]
console.log("length is : " + arr.length + " and arr is : " + arr);

var people = ["Bob", "Eric", "Alice", "Jenn"]

var animal = ["Dog", "Cat", "Pig"]
console.log(people.concat(animal))

console.log(people.pop())
console.log(people)

console.log(people.push("Steve"))
console.log(people)

console.log(people.indexOf("Jenn"))

var ans = people.reverse()
console.log(ans)
console.log(people)

console.log(people.join(" && "))

console.log(people.slice(0,2))

var arr = [0,1,2,3,4,5,6];
// 元素就是索引方便我们展示插入删除、我们插入元素均为字符串
console.log(arr.splice(2,2,"第一个插入的元素","第二个插入的元素","第三个插入的元素"))
console.log(arr)