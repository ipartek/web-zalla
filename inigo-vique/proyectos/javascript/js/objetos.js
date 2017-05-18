'use strict';

var objeto3Gran,
    objeto4Gran;

$(function()
{

    $('#btn01').click(crearObjeto);
    $('#btn02').click(crearJSON);
    $('#btn03').click(crearClasesViejas);
    $('#btn04').click(conPrototipos);

});

function crearObjeto()
{
    console.group('Creamos Objeto');

    let o = new Object();

    o.id = parseInt(Math.random() * 134);
    o.nombre = 'Soy Nombre';

    o.mostrarId = function()
    {
        alert(this.id);
    };

    console.log('mostramos nombre del objeto', o.nombre);

    console.log('realizamos la función que está dentro del propio objeto, el ALERT');
    o.mostrarId();

    console.groupEnd();
}

function crearJSON()
{
    var objeto = {};

    console.log('Soy un objeto', objeto);

    var objeto2 = {
        name: "pepe",
        surname: "agapito",
        saludar: function()
        {
            console.log('Hola ' + this.name + ' ' + this.surname);
        }
    };

    console.log(objeto2);

    objeto2.saludar();
}

function crearClasesViejas()
{
    let persona_1 = new Persona('Agapito', 'Pelaez Mendez');
    let persona_2 = new Persona('Toribio', 'Leal Telmo');

    console.log(persona_1);

    persona_1.saludar();
    persona_2.saludar();
}

function conPrototipos()
{
    let f1 = new Factura(5, 'CLIENTE 5');
    let f2 = new Factura(2, 'CLIENTE 2');

    f1.muestraId();
    f2.muestraCliente();
}



/* CONSTRUCTORES */

function Persona(nombre_, apellidos_)
{
    this.nombre = nombre_;
    this.apellidos = apellidos_;

    this.saludar = function()
    {
        alert('Hola ' + this.nombre + ' ' + this.apellidos);
    };
}

function Factura(idFactura, idCliente)
{
    this.idFactura = idFactura;
    this.idCliente = idCliente;
}

Factura.prototype.muestraCliente = function()
{
    alert(this.idCliente);
};

Factura.prototype.muestraId = function()
{
    alert(this.idFactura);
};