
//plano();


function plano() {
    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");
    canvas.lineWidth = 1;
    canvas.strokeStyle = '#000';

    //EJEX
    canvas.beginPath();
    canvas.moveTo(150, 0);
    canvas.lineTo(150, 300);
    canvas.stroke();
    canvas.closePath();

    //EJE Y
    canvas.beginPath();
    canvas.moveTo(0, 150);
    canvas.lineTo(300, 150);
    canvas.stroke();
    canvas.closePath();
}

/*function espada() {
 
 canvas.beginPath();
 canvas.moveTo(0,0);
 canvas.quadraticCurveTo(200, 200, 200, 100)
 canvas.stroke();
 canvas.closePath();
 }*/

function espada() {
    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");
    canvas.lineWidth = 2;
    canvas.strokeStyle = "rgb(0, 0, 0)";

    canvas.beginPath();
    canvas.arc(123, 100, 70, -3, (1 / 2) * Math.PI, true);
    canvas.stroke();

    canvas.beginPath();
    canvas.arc(123, 169, 10, 0, 2 * Math.PI, true);
    canvas.stroke();

    canvas.moveTo(130, 170);
    canvas.lineTo(169, 170);
    canvas.stroke();
    canvas.closePath();
}


function arco() {
    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");
    canvas.lineWidth = 2;
    canvas.strokeStyle = "rgb(0, 0, 0)";

    canvas.beginPath();
    
    canvas.arc(123, 100, 70, -3, (1 / 2) * Math.PI, true);
    canvas.stroke();

    canvas.beginPath();
    canvas.arc(123, 169, 10, 0, 2 * Math.PI, true);
    canvas.stroke();

    canvas.moveTo(130, 170);
    canvas.lineTo(169, 170);
    canvas.stroke();
    canvas.closePath();
}