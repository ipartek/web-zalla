/*jslint browser: true*/
/*global $, jQuery, alert*/


$(document).ready(function () {
    "use strict";
    $("table").tablesorter({
        sortList: [[0, 0]]
    });
});


function edit_row(no) {
    "use strict";
    document.getElementById("edit_button" + no).style.display = "none";
    document.getElementById("save_button" + no).style.display = "block";

    //coge ID según número de fila
    var name = document.getElementById("name_row" + no),
        country = document.getElementById("country_row" + no),
        age = document.getElementById("age_row" + no),
        //coge valor según el ID anterior
        name_data = name.innerHTML,
        country_data = country.innerHTML,
        age_data = age.innerHTML;

    //crea un imput de texto con losvalores anteriores
    name.innerHTML = "<input type='text' id='name_text" + no + "' value='" + name_data + "'>";
    country.innerHTML = "<input type='text' id='country_text" + no + "' value='" + country_data + "'>";
    age.innerHTML = "<input type='text' id='age_text" + no + "' value='" + age_data + "'>";
}

function save_row(no) {
    "use strict";
    //Coge el valor introducido al editar usando la ID del imput y el número
    var name_val = document.getElementById("name_text" + no).value,
        country_val = document.getElementById("country_text" + no).value,
        age_val = document.getElementById("age_text" + no).value;

    //introduce esos valores en los TD por número
    document.getElementById("name_row" + no).innerHTML = name_val;
    document.getElementById("country_row" + no).innerHTML = country_val;
    document.getElementById("age_row" + no).innerHTML = age_val;

    document.getElementById("edit_button" + no).style.display = "block";
    document.getElementById("save_button" + no).style.display = "none";
}

function delete_row(no) {
    "use strict";
    // borra un TR (fila) dándole valor nulo
    document.getElementById("row" + no).outerHTML = "";
}

function add_row() {
    "use strict";
    //coge los valores de los imput de nueva fila
    var new_name = document.getElementById("new_name").value,
        new_country = document.getElementById("new_country").value,
        new_age = document.getElementById("new_age").value,

        //coge el id de la tabla para sacar la longitud de la fila
        table = document.getElementById("data_table"),
        table_len = (table.rows.length) - 1,

        //genera el código de la nueva línea con los valores dados y la longitud de la fila
        row = table.insertRow(table_len).outerHTML = "<tr id='row" + table_len + "'><td id='name_row" + table_len + "'>" + new_name + "</td><td id='country_row" + table_len + "'>" + new_country + "</td><td id='age_row" + table_len + "'>" + new_age + "</td><td><input type='button' id='edit_button" + table_len + "' value='Edit' class='edit' onclick='edit_row(" + table_len + ")'> <input type='button' id='save_button" + table_len + "' value='Save' class='save' onclick='save_row(" + table_len + ")'> <input type='button' value='Delete' class='delete' onclick='delete_row(" + table_len + ")'></td></tr>";

    document.getElementById("new_name").value = "";
    document.getElementById("new_country").value = "";
    document.getElementById("new_age").value = "";
}
