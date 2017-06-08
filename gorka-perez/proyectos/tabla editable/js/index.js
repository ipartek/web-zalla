/*jslint browser: true*/
/*global $, jQuery, alert*/


$(document).ready(function () {
    "use strict";
    $("table")
        .tablesorter({
            sortList: [[0, 0]],
            headers: {
                3: {
                    sorter: false
                }
            }
        });
});

function InsertNewRow() {
    "use strict";
    var table = document.getElementById("myTable");
    var row = table.insertRow(1);
    var cell = row.insertCell(4);
    cell.innerHTML = "New row";
}

/*
$('table').on('click', 'input[type="button"]', function (e) {
    "use strict";
    $(this).closest('tr').remove();
});
*/
