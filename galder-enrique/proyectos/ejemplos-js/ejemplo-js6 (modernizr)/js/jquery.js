$(function() {
    // $("form")
    // $("#nombre")

    $("#borrar").on("click", function() {
        $("input[type=text]").val("BORRADO");
    });

    $("#conmutar").click(function() {
        $("input[id!=conmutar]").fadeOut(3000).fadeIn(3000);
    });

    $("form").on("submit", function() {

        alert($("#nombre").val());

        $("#opciones option").each(function() {
            alert(this.value);
        });
        return false;
    });
});
