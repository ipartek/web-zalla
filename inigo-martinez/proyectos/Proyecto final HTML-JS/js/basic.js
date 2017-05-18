'use strict'

var form;
var bMostrar, bModificar, bRellenar, bIncluir;
var inID, inNombre, inPrice, inStock, inDate;
var cTR, cTH, aModif, aBorrar, tdID, tdNombre, tdPrice, tdStock, tdFecha, imgModif, imgBorrar;
var tbBody;
var fila = 3;

window.onload = cargar;

function cargar() {

    tdID = document.getElementById("ID" + fila);

    form = document.forms[0];
    form.style.display = "none";

    bMostrar = document.getElementById("Mostrar");
    bMostrar.onclick = mostrar;

    bModificar = document.getElementsByClassName("Modificar");
    bModificar.onclick = modificar;

    bRellenar = document.getElementById("Rellenar");

    bRellenar.onclick = rellenar


    bIncluir = document.getElementById("Incluir");
    bIncluir.onclick = implementar;
}

function mostrar() {

    if (bMostrar.value == "Mostrar") {

        form = document.forms[0];
        bMostrar = document.getElementById("Mostrar");


        bMostrar.value = "Ocultar";
        form.style.display = "block";
    } else {

        inID = document.getElementById("inID");
        inNombre = document.getElementById("nombre");
        inPrice = document.getElementById("Price");
        inStock = document.getElementById("Stock");
        inDate = document.getElementById("fecha");

        inID.value = "";
        inNombre.value = "";
        inPrice.value = "";
        inStock.value = "";
        inDate.value = "";

        bMostrar.value = "Mostrar";
        form.style.display = "none";

        bRellenar.value = "Rellenar";

    }

}

function modificar() {

    inID = document.getElementById("inID");
    inID.value = "EOEOEOEOEO";

}

function rellenar() {

    if (bRellenar.value == "Rellenar") {

        inID = document.getElementById("inID");
        inNombre = document.getElementById("nombre");
        inPrice = document.getElementById("Price");
        inStock = document.getElementById("Stock");
        inDate = document.getElementById("fecha");

        inID.value = "4";
        inNombre.value = "PATATA";
        inPrice.value = "1.75";
        inStock.value = "847";
        inDate.value = "1999-01-01";

        bRellenar.value = "Incrustar"

    } else {

        incrustar();

    }

}

function implementar() {

    if (tdID.innerHTML != "") {

        fila += 1;

        tbBody = document.getElementsByTagName("tbody");
        tbBody = tbBody[0];

        cTR = document.createElement("tr");
        cTH = document.createElement("th");
        aModif = document.createElement("a");
        imgModif = document.createElement("img");
        imgBorrar = document.createElement("img");
        aBorrar = document.createElement("href");
        tdID = document.createElement("td");
        tdNombre = document.createElement("td");
        tdPrice = document.createElement("td");
        tdStock = document.createElement("td");
        tdFecha = document.createElement("td");

        cTR.id = "linea5";
        tbBody.appendChild(cTR);

        cTR.appendChild(cTH);

        aModif.href = "#";
        aBorrar.href = "#";
        cTH.appendChild(aModif);
        cTH.appendChild(aBorrar);

        tbBody.appendChild(cTH);

        aModif.appendChild(imgModif);
        aBorrar.appendChild(imgBorrar);

        imgModif.src = "src/Custom-Icon-Design-Mono-General-1-Alert (1).png";
        imgBorrar.src = "src/Cancel-128.png";

        cTR.appendChild(tdID);
        cTR.insertBefore(cTH, tdID);
        cTR.appendChild(tdNombre);
        cTR.appendChild(tdPrice);
        cTR.appendChild(tdStock);
        cTR.appendChild(tdFecha);

        tdID.id = "ID" + fila;
        tdNombre.id = "Nombre" + fila;
        tdPrice.id = "precio" + fila;
        tdStock.id = "stock" + fila;
        tdFecha.id = "fecha" + fila;


    } else {

        alert("La fila actual está vacía.");

    }


}

function incrustar() {

    inID = document.getElementById("inID");
    inNombre = document.getElementById("nombre");
    inPrice = document.getElementById("Price");
    inStock = document.getElementById("Stock");
    inDate = document.getElementById("fecha");

    if (tdID.innerHTML == "") {

        tdID.innerHTML = inID.value;
        tdNombre.innerHTML = inNombre.value;
        tdPrice.innerHTML = inPrice.value;
        tdStock.innerHTML = inStock.value;
        tdFecha.innerHTML = inDate.value;

        bRellenar.value = "Rellenar";

    } else {

        alert(" LA FILA QUE INTENTAS SELECCIONAR NO ESTÁ HABILITADA PARA MODIFICAR. ");

    }

}
