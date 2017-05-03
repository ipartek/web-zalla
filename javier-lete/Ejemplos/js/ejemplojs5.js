var ventana = window.open(
    "http://www.domainname.ext/path/ImgFile.png",
    "DescriptiveWindowName",
    "top=200,left=300,width=420,height=230,resizable,scrollbars=yes,status=1"
  );

var d = ventana.document;
d.write("Bienvenido a JavaScript. Tu navegador es mío<br />");
d.write("<a href='http://www.google.es' target='_blank'>Google</a><br />");
d.write("La pantalla tiene " + screen.width + " píxeles de ancho<br />");
d.write("Tu navegador es " + navigator.userAgent + "<br />");