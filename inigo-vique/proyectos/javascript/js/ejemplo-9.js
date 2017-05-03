/* globals moment */

function objWindow()
{
    console.info('window.closed');
    // comprobamos si la ventana está cerrada
    console.log(window.closed);

    console.info('window.defaultStatus');
    // Contenido de la barra de estado (inferior)
    console.log(window.defaultStatus);

    console.info('window.history');
    // Nos devuelve un objeto
    // es el histórico del navegador.
    // El objeto history es autónomo, no tiene porque estar relacionado con window.
    // console.log ( 'history: ' + history);
    console.log(window.history);

    console.info('window.location');
    // La URL, podemos cambiarla para ir a otra página
    console.log(window.location);

    console.info('window.parent');
    // La ventana de la que ha venido la ventana que hemos abierto
    // Cuando tenemos un programa que abre ventanas extra, para que éstas sepan
    // de donde vienen y puedan actuar sobre ellas al ser cerradas
    console.log(window.parent);

    console.info('window.open');
    // Abre la URL en una ventana nueva
    // Lo toma como si fuese un popup, aunque normalmente lo abre en nuevas
    // pestañas
    // - Puedo guardar el objeto window.open y modificar el contenido de la ventana recien abierta
    // desde esta nueva
    // - Window Open también permite colocar la nueva ventana en distintas posiciones, con distintos tamaños,
    // etc..
    console.log(window.open);

    // window.document es igual a document, así que es mejor usar el objeto document


    // Podemos reproducir cualquier acción del navegador mediante Javascript

}

function windowHistoryBack()
{
    alert('volvemos atrás gracias a window.history.back()');
    // history.back();
    window.history.back();
}

function windowHistoryForward()
{
    alert('vamos hacia adelante gracias a window.history.forward()');
    // history.back();
    window.history.forward();
}

function windowLocation()
{
    window.location = prompt('introduce la ruta a la que ir');
}

function windowOpen()
{
    window.open(prompt('introduce la ruta a la que ir'));
}

function windowMegaOpen()
{
    alert('Abramos GitHup en pequenito');
    window.open('http://www.github.com', 'DescriptivWindowName', 'top=200,left=100,height=400, width=700');
}

function objDocument()
{
    console.info('document.images');
    // Recoge todas las imagenes que hay en la página en un array
    // puedo recoger el width, el alt..., el src...
    // p.e : document.images[0].src = 'tururur.png';
    console.log(document.images);

    console.info('document.links');
    // Listado de links
    console.log(document.links);

    console.info('document.forms');
    // Listado de forms
    console.log(document.forms);

    // No se suelen utilizar de esta manera, mejor usar el DOM.
}

function objLocation()
{
    console.info('location.href');
    // Nos dice la URL en la que estamos
    console.log(location.href);

    // Reinicia la página
    console.log(location.reload());
}

function objScreen()
{
    // nos da características de la pantalla en la que se está ejecutando

    console.info('screen.width');
    // Nos dice la resolución de pantalla horizontal
    console.log(screen.width);

    console.info('screen.height');
    // Nos dice la resolución de pantalla vertical
    console.log(screen.height);

    console.info('screen.orientation');
    // Nos dice la orientación de la pantalla
    console.log(screen.orientation);

}

function objNavigator()
{
    console.info('navigator');
    // Nos da información sobre el navegador
    console.log(navigator);

    console.info('navigator.userAgent');
    // Es la variable que nos da mejor información sobre el navegador
    console.log(navigator.userAgent);
}

function objDate()
{
    // El navegador no lo crea de por sí.

    let fecha01 = new Date();
    console.log(fecha01);

    console.info('getTime()');
    // Nos da los milisegundos a partir de una fecha de referencia
    // 1 de enero de 1970 UTC
    // Puede trabajar con fechas negativas.
    console.log(fecha01.getTime());

    console.info('getYear()');
    // Get Year. da el año al que hay que sumar 1900
    // Mejor usar getFullYear
    console.log(fecha01.getYear());
    console.log(fecha01.getFullYear());

    console.info('getDay()');
    // GetDay nos da el día de la semana
    // 0 - domingo
    // 1 - lunes
    // etc...
    console.log(fecha01.getDay());

    console.info('toLocaleDateString()');
    // Nos lo devuelve en el modelo de fecha local para nosotros
    // Locale es lo que se refiere al estilo culturarl de nuestro equipo.
    console.log(fecha01.toLocaleDateString());


    // CUIDADO CON EL MES, empieza por 0
    let fecha02 = new Date(2016, 11, 4, 12, 54, 21);
    console.log(fecha02);

}

function createDate()
{
    console.log(new Date(parseInt(prompt('introduce milisegundos para poner una horica'))));
}

function objString()
{
    let texto = prompt('introduce un texto. Recuerda que busca la palabra "otro"').toString();

    console.debug(texto);

    console.info('Longitud del texto');
    console.log(texto.length);

    console.info('IndexOf');
    // Marca dónde empieza la palabra en el texto
    // Si no encuentra nada te da una posición negativa 
    // Empieza a contar desde 0
    console.log(texto.indexOf('otro'));


    console.info('SubString');
    // Nos muestra un cachito de texto
    console.log(texto.substring(6, 12));


    console.info('ToUpperCase');
    // Lo pone en mayúsculas
    console.log(texto.toUpperCase());


    console.info('toLowerCase');
    // Lo pone en minúsculas
    console.log(texto.toLowerCase());


    console.info('charAt');
    // Dame la letra a esa posición
    console.log(texto.charAt(12));


    console.info('replace');
    // Modifica el texto que encuentre por el que le digamos
    // Podemos sustituir todas las vocales de un texto, por ejemplo :)
    console.log(texto.replace('otro','gatito'));
    // Le podemos añadir un REGEX para que modifique unos bloques específicos
    console.log(texto.replace(/[aeiou]/g,'o'));

}

function momentTest()
{
    let a = moment(new Date());
    let b = moment([1989, 10, 24]);

    console.log('Días desde día guay son ' + a.diff(b, 'days'));
    console.log('Segundos desde día guay son ' + a.diff(b, 'seconds'));
}

function momentSecond()
{

    // ESTE ESTÁ DEPRECATED
    let fechaActual = moment().lang('es').format('[Hoy es] D [de] MMMM [del año] YYYY [y son las] HH:mm:ss ');

    console.log(fechaActual);
    alert(fechaActual);

}

function momentThird()
{
    moment.locale('es');
    console.log(moment().format('[Hoy es] D [de] MMMM [del año] YYYY [y son las] hh:mm:ss '));
}

// CARACTERÍSTICAS DE DEPURACIÓN DEL MÓVIL EN CHROME
// Mirar remote devices en el navegador con el móvil, con Chrome
// en el móvil



window.onload = function()
{
    // Window
    document.getElementById('btn-window-01').onclick = objWindow;
    document.getElementById('btn-window-02').onclick = windowHistoryBack;
    document.getElementById('btn-window-03').onclick = windowHistoryForward;
    document.getElementById('btn-window-04').onclick = windowLocation;
    document.getElementById('btn-window-05').onclick = windowOpen;
    document.getElementById('btn-window-06').onclick = windowMegaOpen;


    // Others
    document.getElementById('btn-others-01').onclick = objDocument;
    document.getElementById('btn-others-02').onclick = objLocation;
    document.getElementById('btn-others-03').onclick = objScreen;
    document.getElementById('btn-others-04').onclick = objNavigator;
    document.getElementById('btn-others-05').onclick = objDate;
    document.getElementById('btn-others-06').onclick = createDate;
    document.getElementById('btn-others-07').onclick = objString;

    // MomentJS
    document.getElementById('btn-moment-01').onclick = momentTest;
    document.getElementById('btn-moment-02').onclick = momentSecond;
    document.getElementById('btn-moment-03').onclick = momentThird;

};