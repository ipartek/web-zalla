function addRow() {
    "use strict";
    var myName = document.getElementById("name"),
        age = document.getElementById("age"),
        email = document.getElementById("mail"),
        table = document.getElementById("myTableData"),

        rowCount = table.rows.length,
        row = table.insertRow(rowCount);

    row.insertCell(0).innerHTML = '<input type="button" value = "Delete" onClick="Javacsript:deleteRow(this)">';
    row.insertCell(1).innerHTML = myName.value;
    row.insertCell(2).innerHTML = age.value;
    row.insertCell(3).innerHTML = email.value;
}

function deleteRow(obj) {
    "use strict";
    var index = obj.parentNode.parentNode.rowIndex,
        table = document.getElementById("myTableData");
    table.deleteRow(index);

}
