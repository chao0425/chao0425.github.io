function testFocus() {
    console.log("获得焦点")
}

function testBlur() {
    console.log("失去焦点")
}

function testChange(value) {
    console.log("内容改变了，且内容改变为 : " + value)
}

function testChange_2(value) {
    console.log("选项发生了改变，且选项结果改变为 : " + value)
}

function testSub() {
    // alert("表单准备提交")
    if(!confirm("确定要提交表单吗？？？")) {
        event.preventDefault();  // 阻止组件的默认行为
    }
}

function testReset() {
    return confirm("确定要清空吗？？？")? true : false;
}