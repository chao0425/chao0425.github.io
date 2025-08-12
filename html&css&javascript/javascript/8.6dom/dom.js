function iChange() {
    var ele = document.getElementById("fInput")
    ele.value = prompt("请输入你希望填入的结果")
    // alert("type is : " + ele.type + "          and id is : " + ele.id + "          and new value is : " + ele.value)
    console.log(("type is : " + ele.type + "          and id is : " + ele.id + "          and new value is : " + ele.value))
    ele.style.backgroundColor = "lightgray"
    ele.style.color = prompt("请输入你希望字体改变的结果颜色(英文全小写输入):")
}

function cChange() {
    var ele = document.getElementById("fContent");
    ele.innerText = prompt("你希望将这段文本改为什么") // <strong>我想说的重点是这个属性，即innerText，可以达到操作文本的效果</strong>
    // ele.innerHTML = "<br><strong>如果使用innerHTML可以识别html标签，但是innerText则不可以的</strong><br>"
    ele.style.border = "2px solid black"
    ele.style.marginLeft = "50px"
    ele.style.marginRight = "50px"
    ele.style.marginTop = "10px"
}