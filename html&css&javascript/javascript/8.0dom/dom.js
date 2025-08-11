// function ready() {
//             var btn = document.getElementById("btn1");
//             btn.onclick = function() {
//                 alert("单击出的结果")
//             }
// }

console.log(wow)
var wow = "wow"

window.onload = function ready() {
    var btn1 = document.getElementById("btn1")
    btn1.onclick = function() {
        alert("单击的结果")
        d1.onclick()
    }
   
    var d1 = document.getElementById("d1")
    d1.onclick = function() {
        indexD1++;
        console.log(indexD1)
        if(indexD1 % 3 == 1) {
            d1.style.backgroundColor= "red"
        } else if (indexD1 % 3 == 2) {
            d1.style.backgroundColor= "green"
        } else {
            d1.style.backgroundColor= "black"
        }
    }
    
    var indexD1 = 0;
}