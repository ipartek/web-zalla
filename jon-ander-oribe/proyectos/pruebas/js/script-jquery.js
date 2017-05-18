$(function() {

    $("#conmutar").click(function() {
        $("input[id!=conmutar]").fadeToggle(1000);
    })
    $("input[type=button]").on("click", function() {
        $("input[type=text]:nth-child(2)").val("BORRADO");
    });
    $("form").on("submit", function() {
        alert($("#nombre").val());
    });
    $('#opciones option').each(function() {
        alert(this.value);
    });

});
