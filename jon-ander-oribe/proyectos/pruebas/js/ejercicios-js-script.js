function copiarInvertir() {

    var corte = document.getElementById("text1").value;
    var resul = corte.split("").reverse().join("");
    document.getElementById("text2").value = resul;

}

function conteo() {
    var cuenta = document.getElementById("text1").value;
    var resul = cuenta.length;
    document.getElementById("text3").value = resul;
    return resul;
}

function analizar() {
    var total = conteo();

    if (total <= 6) {
        document.getElementById("text4").value = "Palabra corta";
    } else if (total == 7) {
        document.getElementById("text4").value = "Palabra normal";
    } else {
        document.getElementById("text4").value = "Palabra larga";
    }
}
