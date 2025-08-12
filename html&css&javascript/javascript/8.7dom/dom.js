function add() {
    var city = document.createElement("li")
    city.id = "hz"
    city.innerText = "杭州"
    var citys = document.getElementById("citys")
    citys.appendChild(city)
}

function add_100 () {
    for(var i = 0; i < 100; i++) {
        add()
    }
}

function addTJ() {
    var tj = document.createElement("li")
    tj.innerText = "天津"
    tj.id = "tj"
    var citys = document.getElementById("citys")
    citys.insertBefore(tj, document.getElementById("sh"))
}

function changeCity() {
    var cc = document.createElement("li")
    cc.innerText = "长春"
    cc.id = "cc"
    var citys = document.getElementById("citys")
    citys.replaceChild(cc,document.getElementById("gz"))
}

function rmCity() {
    document.getElementById("sz").remove()
}

function rmCitys() {
    while(document.getElementById("citys").firstChild != null) {
        document.getElementById("citys").firstChild.remove()
    }
}