'use strict';

var canvas,
    ctx,
    tools;

window.onload = startCanvas;

function startCanvas()
{
    canvas = document.getElementById('miCanvas');
    ctx = canvas.getContext('2d');
    tools = new Tools();

    //setBox();
    //drawThing();

    document.getElementById('btn01').onclick = () =>
    {
        setBox();
        drawThing();
    };

    drawBox();

}

function setBox()
{
    ctx.fillStyle = tools.createRandomColor();
    ctx.fillRect(tools.createPoint(400), tools.createPoint(400), tools.createPoint(400), tools.createPoint(400));
    //ctx.clearRect(45, 25, 60, 60);
    //ctx.strokeRect(8, 8, 54, 54);
}

function drawThing()
{
    ctx.fillStyle = tools.createRandomColor();
    ctx.beginPath();
    ctx.moveTo(100, 100);
    ctx.lineTo(80, 120);
    ctx.lineTo(80, 140);
    ctx.lineTo(100, 160);
    ctx.fill();
}

function drawBox()
{
    var rectangle = new Path2D();
    rectangle.rect(50, 150, 50, 50);
    ctx.fillStyle = tools.createRandomColor();
    ctx.fill(rectangle);
}



function Tools()
{

    this.createRandomColor = function()
    {

        let colorsArray = new Array();

        for (let i = 0; i < 3; i++)
        {
            let newColor = parseInt((Math.random() * 255));
            colorsArray.push(newColor);
        }

        let transparency = Math.random() * 1.25;
        if (transparency > 1)
        {
            transparency = 1;
        }

        return 'rgba(' + colorsArray[0] + ',' + colorsArray[1] + ',' + colorsArray[2] + ',' + transparency + ')';

    };

    this.createPoint = function(max_ = 200 ,min_ = 0)
    {
        return (Math.random() * (max_ - min_ )) + min_;
    };

}