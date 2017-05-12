var regex1 = /[abcdez15]/; //  Cualquiera de esas letras;

var regex2 = /[a-z]/; //  Una de las letras dentro de ese rango, en minúscula
//  Tener cuidado con la ñ

var regex3 = /[0-9]/; //  Cualquier digito. La otra también vale
var regex4 = /\d/;

var regex5 = /[a-zA-z_0-9]/; //  Cualquier letra o número (caracter)
var regex6 = /\w/; //  Funciona igual

var regex7 = /[0-9][0-9][0-9]/; //  Tres dígitos seguidos

/* EXISTEN LOS MULTIPLICADORES */

var regex8 = /\d{5}/; //  Quiero 5 dígitos, ni más ni menos

var regex9 = /\d{8}[A-Z]/; //  Quiero 8 dígitos y después una letra mayúscula

var regex10 = /\d{8}[A-Z]?/; //  La interrogación es que nos hace falta o no. Puede estar, o no.

var regex11 = /\d{1,5}/; //  Introduce de uno a 5 dígitos

var regex12 = /\d{2,}/; //  Al menos dos dígitos

var regex13 = /\d*/; //  Desde ninguno hasta infinito
var regex14 = /[a-z]{0,}/;

var regex15 = /\d+/; //  Desde uno hasta infinito
var regex16 = /[a-z]{1,}/;

var regex17 = /^\d$/; //  ^ Simboliza inicio, $ simboliza final

var regex18 = /^[a-z]/; //  Tiene que iniciar con al menos una letra. Después puede tener lo que quiera

var regex19 = /[A-z]/g; //  Al poner la g al final, es global. No sólo afecta al primero, si no a todos lo que haya.

var regex20 = /[ñ]/g; //  Al poner la g al final, es global. No sólo afecta al primero, si no a todos lo que haya.


var regexArray = new Array();

// HACER ESTO ES UNA GUARRADA MUY PELIGROSA
// MUUUUCHO PELIGRO. NO HACER BAJO NINGUNA CIRCUNSTANCIA :S:S:S:S:S:S:S
for (var i = 1; i; i++)
{
    //console.log(this['regex' + i]);

    let regex_ = this['regex' + i];

    if (regex_ == undefined)
    {
        break;
    }

    regexArray.push(this['regex' + i]);
}


window.onload = () =>
{

    var txtBlock = document.getElementById('txt');
    var btn = document.getElementById('btn-check');
    var block = document.getElementById('block');

    appendRegexesToBlock(block);

    btn.onclick = () =>
    {

        alert('Este sistema comprobará el número de expresiones regulares insertadas abajo que cumple el texto introducido');

        let texto = txtBlock.value.toString();
        let contador = 0;

        for (let i = 0; i < regexArray.length; i++)
        {
            if (texto.match(regexArray[i]))
            {
                contador++;
            }
        }

        alert('El texto enviado cumple ' + contador + ' de las expresiones regulares. ¿Seguro? 🙈');

    };

};

function appendRegexesToBlock(block_)
{
    let writeTxt = '<h1>Tenemos ' + regexArray.length + ' expresiones regulares</h1>';

    writeTxt += '<ul style="font-family:monospace">';

    for (let regex_ of regexArray)
    {
        console.log(regex_);

        writeTxt += '<li>' + regex_.toString()/*.replace(/[/]/g, '')*/ + '</li>';
    }

    writeTxt += '</ul>';

    block_.innerHTML = writeTxt;
}