function getElement_ById() {
    var ele = document.getElementById("fButton")
    console.log(ele)
}

function getElement_ByTag() {
    var ele = document.getElementsByTagName("input")
    for(var i = 0; i < ele.length; i++) {
        console.log(ele[i])
    }
}

function getElement_ByName() {
    var ele = document.getElementsByName("button")
    for(var i = 0; i < ele.length; i++) {
        console.log(ele[i])
    }
}

function getElement_ByClass() {
    var ele = document.getElementsByClassName("test")
    for(var i = 0; i < ele.length; i++) {
        console.log(ele[i])
    }
}

function fatherGetChildren() {
    var ele = document.getElementById("tChild");
    var childrens = ele.children // 注意这是属性，没有括号。获取全部的子元素  
    for(var i = 0; i < childrens.length; i++) {
        console.log(childrens[i])
    }
    console.log("-----------------")
    var children_1 = ele.firstElementChild; // 注意这是属性
    console.log(children_1)
    var children_2 = ele.lastElementChild; // 注意这是属性
    console.log(children_2)
}

function ChildrenGetFather() {
    var ele = document.getElementById("fButton");
    var father = ele.parentElement; // 注意这也是属性
    console.log(father)
}

function getBrother() {
    var ele = document.getElementById("sChild");
    var brotherFront = ele.previousElementSibling; // 注意这也是属性
    console.log(brotherFront)
    var brotherNext = ele.nextElementSibling; // 注意这也是属性
    console.log(brotherNext)
}