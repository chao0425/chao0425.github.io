function lastPage() {
    history.back();
}

function nextPage() {
    history.forward();
}

function target() {
    location.href="https://www.bing.com"
}

function storeData() {
    sessionStorage.setItem("keyA", "value_A")
    localStorage.setItem("keyB", "value_B")
}

function readData() {
    console.log(sessionStorage.getItem("keyA"))
    console.log(localStorage.getItem("keyB"))
}

function clearData() {
    sessionStorage.removeItem("keyA")
    localStorage.removeItem("keyB")
}