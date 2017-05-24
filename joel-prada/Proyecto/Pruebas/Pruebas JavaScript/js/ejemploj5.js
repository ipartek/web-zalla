

var ventana = window.open(
    "http://www.domainname.ext/path/ImgFile.png",
    "DescriptiveWindowName",
    
    "top=200, left=300 width=400, height=230, resizable, scrollbars=yes, estatus=1",
);

var d = ventana.document;

d.write("Bienvenido a JavaScript. Tu navegador es mio");
d.write("<a href='http://www.google.com' target='_blank'>" Google "</a>");
d.write("La pantalla tiene "+ screen.width +" de anchura");
