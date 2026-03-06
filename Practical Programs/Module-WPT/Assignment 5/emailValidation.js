function validate() {
    var data = document.getElementById("a1").value;
    //alert(data);
    var i = data.indexOf('@');
    if (i > 0) {
        var j = data.lastIndexOf('.');
        if (j > i) {
            console.log("Valid Format");
        }
        else {
            console.log("Invalid Format ");
        }
    }
    else {
        console.log("Invalid Format ");
    }
}