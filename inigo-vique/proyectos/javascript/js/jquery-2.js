$(function()
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
});