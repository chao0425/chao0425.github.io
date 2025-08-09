var month = 10

// var month = prompt("请输入一个数字");

console.log(typeof month)

var mon = Number.parseInt(month)

console.log(typeof mon)

if (month <= 6) {
    console.log("月份<=6")
} else {
    console.log("月份>6")
}


if (null) {
    console.log("true")
} else {
    console.log("false")
}

console.log("------------------------\n接下来内容属于函数的部分了，因为我们的循环写在了html里面")

function sum(a, b) {
console.log(arguments)
    return a + b;
}
var ans = sum(10,20)
console.log(ans)

var sum_2 = function (a, b) {
console.log(arguments)
return a + b;
}
var ans = sum_2(10,20)
console.log(ans)

ans = sum(1,2,3,4,5)
console.log(ans)
ans = sum(1)
console.log(ans)