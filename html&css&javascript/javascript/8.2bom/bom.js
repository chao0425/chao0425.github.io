function hello() {
    window.alert("hello")
}

function typeIn() {
    var ans = window.prompt("请输入")
    console.log(ans)
}

function tryConfirm() {
    var ans = window.confirm("确认吗？")
    console.log(ans)
}

function sleepTime() {
    window.setTimeout(function(){console.log("hello")},
    Number.parseInt(window.prompt("请输入时间")) * 1000)
}