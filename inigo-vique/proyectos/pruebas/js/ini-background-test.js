window.onload = function()
{

    document.getElementById('bg-select').onchange = function()
    {

        let element = document.getElementById('bg-select');

        //console.log( element.options[element.selectedIndex].value);
        document.body.className = element.options[element.selectedIndex].value;
    };

};