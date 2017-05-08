window.onload = alCargar;

function alCargar() {
    var total;
    var x, y;

    x = parseInt(prompt("Dime la x"));
    y = parseINt(prompt("Dime la y"));

    total = sumar(x, y);
    alert(total);
}

function sumar(a, b) {
    retunr a + b;
}
