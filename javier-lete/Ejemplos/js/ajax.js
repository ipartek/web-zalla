$.ajax("txt/misdatos.txt")
    .done(function (datos) {
        alert(datos);
    })
    .fail(function (xhr, errorTexto) {
        alert("Jiuston, tenemos un problema: " + errorTexto);
    });
