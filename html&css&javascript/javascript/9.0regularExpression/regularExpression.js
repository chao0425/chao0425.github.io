var reg = /contain/

var str = "this is contain the reg"

var str2 = "this is con split tain the reg"

console.log(reg.test(str))

console.log(reg.test(str2))

var reg = /el/g

var str3 = "hello world el try tyrel?"

console.log(str3.match(reg))

var reg = /o/gi

console.log("HELLO world".replace(reg, " ans "))

console.log("-----------------")

var test1 = 'we will test java'
var test2 = 'Java is boring'

console.log(/java$/i.test(test1))
console.log(/^java/i.test(test2))
console.log(/^java$/i.test("java"))

function inputStr() {
    var str = prompt("请输入")
    var reg = /^[a-z][a-zA-Z0-9]{5,9}$/
    if(reg.test(str)) {
        alert("yep")
    } else {
        alert("fu*k")
    }
}