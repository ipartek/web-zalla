'use strict';
var BloqForm;
var Bloq1;
var Bloq2;
var PosLiBoq;
var form;


window.onload = Inicio;



function Inicio() {
    BloqForm = document.getElementById("BloqueForm");
    Bloq1 = document.getElementById("BloqueP1");
    Bloq2 = document.getElementById("BloqueP2");
    PosLiBoq = document.getElementById("LiBloq").value;

    ocultarBloques();
    
    form = document.forms[0];

    var SBloque = form["sBloque"];
    SBloque.onchange = ElegirMostrar;

}

function ocultarBloques() {
    //despBloque(BloqForm);
    despBloque(Bloq1);
    despBloque(Bloq2);
}

function despBloque(Bloq) {
    Bloq.style.display = 'none';
}

function ElegirMostrar() {
	ocultarBloques();
	PosLiBoq = document.getElementById("LiBloq").value;
	alert("LLEGO");
    switch (PosLiBoq) {
        case '1':
            mostrar(Bloq1);
            break;
        case '2':
            mostrar(Bloq2);
    }
}

function mostrar(Bloq) {
    Bloq.style.display = 'block';
}
