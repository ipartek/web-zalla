'use strict';

function createArray()
{
    console.group('createArray');

    // Creamos un array sin ningún elemento
    // En un lenguaje de programación tradicional, los arrays son estrictos,
    // el tamaño del array es fijo.  En JS no lo es.  Funciona como una colección
    // de datos.
    var arr = new Array();

    // Podemos decir que inicie con 5 datos (vacíos)
    // Aunque hayas establecido 5 elementos, después puedes añadirle muchos más elementos.
    // No es habitual establecerlo porque puedes modificar el tamaño a posteriori
    var arr5 = new Array(5);

    // Array inicializado
    // Creamos el array y lo llenamos con datos.
    // Los datos pueden ser de distintos tipos (aunque no es lo habitual)
    var arrPreRellenado = new Array('pepe', new Date(), 5);

    console.info('Comprobar contenido de array');
    // Puedo comprobar el contenido de un array desde un console.log()
    console.log(arrPreRellenado);


    console.info('length');
    // Marca cuantos datos tiene el array
    console.log('arr: ' + arr.length);
    console.log('arr5: ' + arr5.length);
    console.log('arrPreRellenado: ' + arrPreRellenado.length);


    var nombresMeses = new Array('Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septimbre', 'Octubre', 'Noviembre', 'Diciembre');


    console.info('Acceder a datos');
    // Podemos acceder a los datos del array usando corchetes []
    console.log(nombresMeses[0]);
    // newDateGetMonth devuelve un numero, lo usamos como índice para mostrar el nombre que tenemos en el array.
    console.log('El mes actual es ' + nombresMeses[new Date().getMonth()]);


    // El indice de javscript puede ser no solo un entero. puede ser cualquier cosa.

    console.groupEnd();
}

function modificarArray()
{

    console.group('modificarArray');

    console.info('Modificar contenido de un Array');
    // Se puede modiciar el contenido de un array. Simplemente lo igualamos
    // con la posición
    var arrPreRellenado = new Array('pepe', new Date(), 5);
    console.log(arrPreRellenado);
    arrPreRellenado[0] = 'agapito';
    console.log(arrPreRellenado);


    console.info('Introducir datos a array');
    // Podemos introducirle nuevos datos en nuevas posiciones
    arrPreRellenado[3] = 'Soy Otro Dato';
    console.log(arrPreRellenado);


    console.info('Datos raros');
    // Podemos poner índices no numéricos
    arrPreRellenado['tururu'] = 'Estoy en un índice superExtraño';
    // Podemos introducir datos en posiciones no consecutivas
    arrPreRellenado[35] = 'Dato Super Alejado';
    console.log(arrPreRellenado);

    // La longitud del array está basada en los índices numéricos.
    // Al hacer el array length solo accedemos a los elementos numéricos, para
    // que el for no estalle.


    // Que los array permitan hacer estas mierdas... no significa que debamos usarlas


    // PARA QUE NOS HAGAMOS UNA IDEA. SON ARRAYs ASOCIATIVOS.

    // No existen los arrays multidimensionales. Existen los array dentro de arrays.

    console.groupEnd();
}

function createTablero()
{

    console.group('Tablero');

    console.info('tablero');
    // creamos el tablero
    var tablero = new Array(8);

    for (var i = 0; i < tablero.length; i++)
    {
        tablero[i] = new Array(8);
    }

    console.log(tablero);

    console.info('empieza el nuevo tablero');

    tablero = [
        ['t', 'c', 'a', 'q', 'k', 'a', 'c', 't'],
        ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
        ['x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'],
        ['x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'],
        ['x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'],
        ['x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'],
        ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
        ['t', 'c', 'a', 'q', 'k', 'a', 'c', 't']
    ];

    let posX = parseInt(prompt('Introduce la posición de fila'));
    let posY = parseInt(prompt('Introduce la posición de columna'));

    console.log('La pieza en la posición seleccionada es: ' + '"' + tablero[posX][posY] + '"');

    console.group('info filas');


    for (var fila = 0; fila < tablero.length; fila++)
    {

        let contenidoFila = '';
        // Contenido fila guarda los datos de contenido de cada fila
        // Lo creamos a cada for de "fila" y en el for de columna vamos guardando los datos.

        for (var columna = 0; columna < tablero[fila].length; columna++)
        {
            console.log('En la fila ' + fila + ' y la columna ' + columna + ' está la pieza "' + tablero[fila][columna] + '".');
            contenidoFila += (' ' + tablero[fila][columna]);
        }

        console.trace(' Contenido de Fila = ' + contenidoFila);
    }

    console.groupEnd();


    console.groupEnd();

}

function moreArray()
{
    console.group('moreArray');

    // Creamos nuestro nuevo array :)
    let arr1 = new Array('pepe', new Date(), 5);
    let arr2 = new Array('bartolo', 'turiri', 6);
    let arr3 = new Array(5, 8, 12, 84, 6, 2, 1, 11, 79, 42, 68);

    console.info('- Nuestros Arrays');
    console.log(arr1);
    console.log(arr2);
    console.log(arr3);

    console.info('- concat');
    // juntamos dos arrays en uno.
    console.log(arr1.concat(arr2));

    console.info('- join');
    // junta todos los elementos en un string. Por defecto con coma (,)
    console.log(arr2.join());
    // También podemos decirle con que queremos juntarlo añadiendo la unión
    // en los parámetros
    console.log(arr2.join(' :_: '));

    console.info('- reverse');
    // Reverse da la vuelta al contenido de un array.
    console.log(arr2.reverse());

    console.info('- sort');
    // Ordena el contenido, pero lo hace alfabéticamente. Después del 1 no va el 2, va el 11 y demás...
    // :(
    console.log(arr3.sort());
    // Para ordenarlo correctamente, simplemente tenemos que añadir la siguiente función
    // sort() permite introducir una función como método de comparación
    console.log(arr3.sort(function(a, b)
    {
        return a - b;
    }));
    // si a es menor que b el resultado es negativo, por tanto es... false :)

    console.groupEnd();
}

function forEach_()
{

    console.group('- foreach');

    let arr3 = new Array(5, 8, 12, 84, 6, 2, 1, 11, 79, 42, 68);

    console.info('- foreach no funciona :(');

    // ESTE FOREACH TODAVÍA NO FUNCIONA :_(
    /*
    for each ( var item_ in arr3)
    {
        console.log(item_);
    }
    */

    // Con for of si que funciona
    console.info('- for of si que funciona :)');

    for (var item_ of arr3)
    {
        console.log(item_);
    }


    // Recoge los contadores que existen.
    // Pasa de los que están undefined pero los que tienen índice no numérico los recoge.
    console.info('for in');
    for (var item__ in arr3)
    {
        console.log(arr3[item__]);
    }



    console.info('- array.forEach');
    // foreach, función propia del array.
    // es equivalente al método for( x of y ).
    // Le tenemos que introducir una función. Tiene hasta 3 argumentos :S
    arr3.forEach(function(elemento_, indice_, array_)
    {
        console.log('elementos: ', elemento_, indice_, array_);
    });

    console.info('- funciones LAMBDA');
    // Me encantan
    arr3.forEach((elemento_, indice_, array_) =>
    {
        console.log('elementos: ', elemento_, indice_, array_);
    });

    console.groupEnd();

}

function fillArray()
{
    console.group('- fill');

    // pop
    // push
    // fill
    // MIRAR EN MDN :)

    console.error('AQUI NO HAY COSAS, LO SIENTO');

    console.groupEnd();
}

window.onload = function()
{
    // Clear Console
    document.getElementById('btn-clear').onclick = function()
    {
        console.clear();
    };

    document.getElementById('btn-array-01').onclick = createArray;
    document.getElementById('btn-array-02').onclick = modificarArray;
    document.getElementById('btn-array-03').onclick = createTablero;
    document.getElementById('btn-array-04').onclick = moreArray;
    document.getElementById('btn-array-05').onclick = forEach_;
    document.getElementById('btn-array-06').onclick = fillArray;
};