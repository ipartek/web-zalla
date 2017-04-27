'use strict';

function buttonLoad()
{
    document.getElementById('btn-initialGame').onclick = f_initialGame;
    document.getElementById('btn-secondGame').onclick = f_secondGame;
    document.getElementById('btn-thirdGame').onclick = f_thirdGame;
    document.getElementById('btn-startGame').onclick = startGame;
    document.getElementById('btn-playGame').onclick = playGame;
}

function f_initialGame()
{
    console.log("GAME 1 START");

    let number = parseInt(Math.random() * 100);

    console.log(number);

    do {

        var playerNumber = parseInt(prompt('introduce tu numero'));

        console.log(playerNumber);

        if (!isNaN(playerNumber))
        {
            if (playerNumber > number)
            {
                alert('Te pasas');
            }
            else if (playerNumber < number)
            {
                alert('Te quedas corto');
            }

        }
        else
        {
            alert('¡Mendrugo! Eso no es un numero');
        }


    }
    while (playerNumber != number || isNaN(playerNumber));

    alert('Eres Genial. El numero era el ' + number);

}


/*-----------------------------*/

function f_secondGame()
{
    console.log("GAME 2 START");

    let number = parseInt(Math.random() * 100);

    console.log(number);

    let tries = 0;

    do {

        tries++;

        var playerNumber = parseInt(prompt('introduce tu numero'));

        if (!isNaN(playerNumber))
        {
            if (playerNumber > number)
            {
                alert('Te pasas');
            }
            else if (playerNumber < number)
            {
                alert('Te quedas corto');
            }
        }
        else
        {
            alert('¡Mendrugo! Eso no es un numero');
        }

    }
    while (playerNumber != number || isNaN(playerNumber));

    alert('Eres Genial. El numero era el ' + number + '\nLo has acertado en ' + tries + ' intentos');

}

/*-----------------------------*/

function f_thirdGame()
{
    console.log("GAME 3 START");

    var supLimit = undefined,
        infLimit = undefined;

    do {
        supLimit = parseInt(prompt('introduce el limite SUPERIOR'));

        if (isNaN(supLimit))
        {
            alert('Veamos como lo digo...\n ¡¡¡¡ ESO NO ES UN NUMERO !!!!');
        }
    }
    while (isNaN(supLimit));

    do {
        infLimit = parseInt(prompt('introduce el limite INFERIOR'));

        if (isNaN(infLimit))
        {
            alert('Veamos como lo digo...\n ¡¡¡¡ ESO NO ES UN NUMERO !!!!');
        }
        else if (infLimit >= supLimit)
        {
            alert('El numero introducido es mayor o igual que el limite superior. No intentes romperme');
        }
    }
    while (isNaN(supLimit) || infLimit >= supLimit);

    console.log('superior: ' + supLimit + '. inferior: ' + infLimit);

    let number = parseInt((Math.random() * (supLimit - infLimit + 1) + infLimit));

    console.log(number);

    let tries = 0;

    do {

        tries++;

        var playerNumber = parseInt(prompt('introduce tu numero'));

        if (!isNaN(playerNumber))
        {
            if (playerNumber > number)
            {
                alert('Te pasas');
            }
            else if (playerNumber < number)
            {
                alert('Te quedas corto');
            }
        }
        else
        {
            alert('¡Mendrugo! Eso no es un numero');
        }

    }
    while (playerNumber != number || isNaN(playerNumber));

    alert('Eres Genial. El numero era el ' + number + '\nLo has acertado en ' + tries + ' intentos');

}

var gameSupLimit = undefined,
    gameInfLimit = undefined,
    tries = undefined,
    gameNumber = undefined;

function startGame()
{
    gameSupLimit = parseInt(document.getElementById('sup-limit').value);
    gameInfLimit = parseInt(document.getElementById('inf-limit').value);

    console.log(gameInfLimit + ' - ' + gameSupLimit);

    if (gameInfLimit >= gameSupLimit)
    {
        alert('El numero inferior es mayor o igual que el superior');
    }
    else if (isNaN(gameInfLimit) || isNaN(gameSupLimit))
    {
        alert('Alguno de los numeros no es tal');
    }
    else
    {
        document.getElementById('sup-limit').disabled = true;
        document.getElementById('inf-limit').disabled = true;
        document.getElementById('btn-startGame').disabled = true;
        document.getElementById('btn-playGame').disabled = false;
        document.getElementById('player-answer').disabled = false;

        gameNumber = parseInt((Math.random() * (gameSupLimit - gameInfLimit + 1) + gameInfLimit));

        console.log(gameNumber);

        tries = 0;
    }
}

function playGame()
{
    tries++;

    let playerInNumber = parseInt(document.getElementById('player-answer').value);

    if (!isNaN(playerInNumber))
    {
        if (playerInNumber > gameNumber)
        {
            document.getElementById('game-answer').innerText = 'Te pasaste de largo';
        }
        else if (playerInNumber < gameNumber)
        {
            document.getElementById('game-answer').innerText = 'Te quedate corto';
        }
        else
        {
            document.getElementById('game-answer').innerText = 'Eres genial. En ' + tries + ' intentos';

            document.getElementById('sup-limit').disabled = false;
            document.getElementById('inf-limit').disabled = false;
            document.getElementById('btn-startGame').disabled = false;
            document.getElementById('btn-playGame').disabled = true;
            document.getElementById('player-answer').disabled = true;
        }
    }
    else
    {
        alert('ESO NO ES NUMERO');
    }

}

window.onload = buttonLoad;