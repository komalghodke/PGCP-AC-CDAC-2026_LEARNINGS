function validate() {
    var data = document.getElementById("a1").value;
    //alert(data);
    var i = data.indexOf('@');
    if (i > 0) {
        var j = data.lastIndexOf('.');
        if (j > i) {
            console.log("Valid Format");
            alert("Valid")
        }
        else {
            console.log("Invalid Format ");
            alert("InValid")
        }
    }
    else {
        console.log("Invalid Format ");
        alert("InValid")
    }
}