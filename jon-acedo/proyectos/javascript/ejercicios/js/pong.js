var playGame;
var ball;
var canvas;
var playGame = false;
var xPosBall;
var yPosBall;
var radius = 10;
var xMoveBall = 1;
var yMoveBall = -1;
var yPlayer1 = 230;
var yPlayer2;
var random;
var max = 60;
var min = -20;
window.onload = function() {
    //variables del canvas
    canvas = document.getElementById("pong");
    canvas.width = 800;
    canvas.height = 500;


    //variables del jugador
    var speed = 3;
    yPlayer1 = 230;
    yPlayer2 = 230;
    var heightPlayer = 40;
    var widthPlayer = 10;

    // variables de la bola

    xPosBall = canvas.width / 2;
    yPosBall = canvas.height / 2;



    //----------------------------------------------------------Dibujando el juego
    //la máquina
    yPlayer2 = 230;
    var player2 = canvas.getContext("2d");
    player2.fillStyle = "#FFFFFF";
    player2.fillRect(10, yPlayer2, 10, 40);
    //El jugador
    var player1 = canvas.getContext("2d");
    player1.fillStyle = "#FFFFFF";
    player1.fillRect(780, yPlayer1, widthPlayer, heightPlayer);
    //Linea de puntos
    drawCenter();

    ball = canvas.getContext('2d');
    ball.beginPath();
    ball.arc(xPosBall, yPosBall, radius, 0, 2 * Math.PI, false);
    ball.fillStyle = '#C5C5C5';
    ball.fill();

    tx = canvas.getContext("2d");
    tx.fillStyle = '#C5C5C5';
    tx.font = "30px Arial";
    tx.fillText("Press      space", 295, 50);


    setInterval(function() {
        if (playGame) {
            drawBall();
            moveEnemy();
        }
    }, 10);


    window.addEventListener("keydown", function(event) {
        // movimiento del jugador
        if (event.key == "w") {
            if (yPlayer1 > 0) {
                setTimeout(function() {
                    player1.clearRect(780, yPlayer1, widthPlayer, heightPlayer);

                    yPlayer1 = yPlayer1 - speed;
                    player1.fillStyle = "#FFFFFF";
                    player1.fillRect(780, yPlayer1, widthPlayer, heightPlayer);
                }, 1);
            }
        }
        if (event.key == "s") {
            if (yPlayer1 <= canvas.height - 40) {
                setTimeout(function() {
                    player1.clearRect(780, yPlayer1, widthPlayer, heightPlayer);
                    yPlayer1 = yPlayer1 + speed;
                    player1.fillStyle = "#FFFFFF";
                    player1.fillRect(780, yPlayer1, widthPlayer, heightPlayer);
                }, 1);
            }
        }
        if (event.keyCode == 32) {
            setTimeout(function() {
                var clearTx = canvas.getContext("2d");
                clearTx.clearRect(295, 10, 90, 50);
                clearTx.clearRect(410, 10, 100, 50);
                clearTx.clearRect(10, yPlayer2, 10, 40);
                playGame = true;
                random = Math.floor(Math.random() * (max - min + 1) + min);
                console.log(random)
            }, 1);

        }
    }, true);
}

function drawCenter() {
    var center = canvas.getContext("2d");
    for (i = 0; i < 13; i++) {
        center.fillStyle = "#FFFFFF";
        center.fillRect(395, i * 45 + 5, 10, 35);
    }
}

function moveEnemy() {
    if (yPosBall <= canvas.height - 40) {
        player2 = canvas.getContext("2d");
        player2.clearRect(10, yPlayer2 + random, 10, 40);
        yPlayer2 = yPosBall;
        player2.fillRect(10, yPlayer2 + random, 10, 40);
    }
}

function drawBall() {
    ball = canvas.getContext('2d');
    ball.beginPath();
    ball.arc(xPosBall, yPosBall, radius, 0, 2 * Math.PI, false);
    ball.fill();
    ball.clearRect(xPosBall - radius, yPosBall - radius, radius * 2, radius * 2);
    drawCenter();
    xPosBall += xMoveBall;
    yPosBall += yMoveBall;
    ball.beginPath();
    ball.arc(xPosBall, yPosBall, radius, 0, 2 * Math.PI, false);
    ball.fill();
    if (yPosBall >= canvas.height - radius) {
        yMoveBall *= -1;
    } else if (yPosBall <= radius) {
        yMoveBall *= -1;
    } else if (xPosBall >= 780 - radius) {
        if (yPosBall >= yPlayer1 && yPosBall <= yPlayer1 + 40) {
            xMoveBall *= -1;
        } else {
            if (xPosBall >= canvas.width + radius) {
                playGame = false;
                ball.fillStyle = '#C5C5C5';
                ball.font = "30px Arial";
                ball.fillText("Press      space", 295, 50);
                xPosBall = canvas.width / 2;
                yPosBall = canvas.height / 2;
            }
        }

    } else if (xPosBall <= 20 + radius) {
        if (yPosBall >= yPlayer2 && yPosBall <= yPlayer2 + 40) {
            xMoveBall *= -1;
        } else {
            if (xPosBall >= 0) {
                playGame = false;
                ball.fillStyle = '#C5C5C5';
                ball.font = "30px Arial";
                ball.fillText("Press      space", 295, 50);
                xPosBall = canvas.width / 2;
                yPosBall = canvas.height / 2;
            }
        }
    }
}
