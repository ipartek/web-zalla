$(function()
{

    $('#btn1').click(ajaxInterno);
    $('#btn2').click(ajaxExterno);
});

function ajaxInterno()
{
    // Las rutas del ajax no se recargan a menos que lo hagamos a la fuerza
    // (NO FUNCIONA Ctrl+Shift+R !!!!)
    $.ajax(
    {
        url: "./data/test.txt?v=2"
    }).done(function(data)
    {
        alert(data);
    }).fail(function()
    {
        alert('Ha habido un problema');
    });
}

function ajaxExterno()
{
    $.ajax('http://demo.wp-api.org/wp-json/wp/v2/posts').done(function(data)
    {
        console.log(data);
    }).fail(function() {
        console.error('ha habido un error. ¡¡¡ACCESS CONTROL ORIGIN CABRÓN!!!!');
    });
}