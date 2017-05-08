var ventana = window.open(
    "http://www.domainname.ext/path/ImgFile.png",
    "DescriptiveWindowName",
    "top=200,left=600,width=420,height=230,resizable,scrollbars=yes,status=1"
  );

var d = ventana.document;
d.write("Bienvenido a JavaScript. Tu navegador es mío<br />");
d.write("<a href='http://www.google.es' target='_blank'>Google</a><br />");

d = document;

d.write("La pantalla tiene " + screen.width + " píxeles de ancho<br />");
d.write("Tu navegador es " + navigator.userAgent + "<br />");

var ahora = new Date();
var fecha = new Date(2017, 3-1, 28, 9, 0, 0);

d.write(ahora.getFullYear());
d.write("/");
d.write(ahora.getMonth() + 1);
d.write("/");
d.write(ahora.getDate());
d.write(" ");
d.write(ahora.getHours());
d.write(":");
d.write(ahora.getMinutes());
d.write(":");
d.write(ahora.getSeconds());
d.write("<br />");

d.write(ahora.toLocaleString());
d.write("<br />");
d.write(ahora.toLocaleDateString());
d.write("<br />");
d.write(ahora.toLocaleTimeString());
d.write("<br />");

var a = moment(ahora);
var b = moment(fecha);

moment.locale('es');

d.write(a.diff(b, 'days'));
d.write("<br />");

d.write(moment().format('[Hoy es] D [de] MMMM [del] YYYY [y son las] HH:mm:ss'));

d.write("<br />");

var texto = 'En un lugar de la Mancha';

d.write(texto.length);
d.write("<br />");
d.write(texto.indexOf('l'));
d.write("<br />");
d.write(texto.lastIndexOf('l'));
d.write("<br />");
d.write(texto.substring(6,10));
d.write("<br />");
d.write(texto.toUpperCase());
d.write("<br />");
d.write(texto.toLowerCase());
d.write("<br />");
d.write(texto.charAt(6));
d.write("<br />");
d.write('3,500'.replace(',','.'));
d.write("<br />");
d.write('hola que tal'.replace(/[aeiou]/g, 'o')); // RegEx
d.write("<br />");
