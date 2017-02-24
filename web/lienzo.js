var tipoPj = ["Humano", "Enano", "Elfo", "Hechicero"];
var tipoArma = ["Espada", "Arco", "Martillo", "Libro"];
var tipoMontura = ["Caballo", "Jabali", "Lobo", "Glifo"];
var tipoEscudo = ["Humano", "Enano", "Elfo", "Hechicero"];
//plano();
function dibujar() {
    var tipo, arma, montura, armadura, escudo;
    tipo = document.getElementById("tipoPj").value;
    arma = document.getElementById("arma").value;
    montura = document.getElementById("montura").value;
    armadura = document.getElementById("armadura").value;
    escudo = document.getElementById("escudo").value;
    dibujarArma(arma);
}

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

function dibujarArma(i) {
    if (i === 1)
        espada();
    else if (i === 3)
        arco();
}

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