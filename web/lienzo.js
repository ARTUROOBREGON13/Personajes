var tipoPj = ["Elfo", "Enano", "Humano", "Hechicero"];
var tipoArma = ["Arco", "Martillo", "Espada", "Libro"];
var tipoArmadura = ["Armadura Ligera", "Armadura Pesada", "Cota de malla", "Tunica"];
var tipoMontura = ["Lobo", "Jabali", "Caballo", "Glifo"];
var tipoEscudo = ["Escudo Dorado", "Escudo de madera", "Escudo de Acero", "Escudo Etereo"];
var seleccion = 0;
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

function dibujarArma() {

    var tipo = seleccion;
    if (tipo == 0)
        espada();
    else if (tipo == 1)
        espada();
    else if (tipo == 2)
        arco();
    else if (tipo == 3)
        arco();
}
function dibujarEscudo() {
    var tipo = seleccion;
    if (tipo == 0)
        espada();
    else if (tipo == 1)
        espada();
    else if (tipo == 2)
        arco();
    else if (tipo == 3)
        arco();
}
function dibujarMontura() {

    var tipo = seleccion;
    if (tipo == 0)
        espada();
    else if (tipo == 1)
        espada();
    else if (tipo == 2)
        arco();
    else if (tipo == 3)
        arco();
}
function dibujarArmadura() {

    var tipo = seleccion;
    if (tipo == 1)
        espada();
    else if (tipo == 1)
        espada();
    else if (tipo == 1)
        arco();
    else if (tipo == 1)
        arco();
}


function espada() {
    canvas.clearRect(0, 0, canvas.width, canvas.height);
    canvas.fillStyle = "#bbbbbb";
    canvas.beginPath();
    canvas.moveTo(50, 110);
    canvas.lineTo(100, 27);
    canvas.lineTo(135, 111);
    canvas.lineTo(114, 289);
    canvas.lineTo(70, 289);
    canvas.fill();
    canvas.fillStyle = "#4b3621";
    canvas.beginPath();
    canvas.moveTo(49, 287);
    canvas.lineTo(140, 290);
    canvas.lineTo(140, 330);
    canvas.lineTo(117, 331);
    canvas.lineTo(117, 402);
    canvas.lineTo(82, 406);
    canvas.lineTo(80, 330);
    canvas.lineTo(55, 332);
    canvas.fill();
}


function arco() {

    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");
    canvas.lineWidth = 2;

    canvas.beginPath();
    canvas.strokeStyle = "black";
    canvas.arc(110, 150, 100, -0.5 * Math.PI, 0.5 * Math.PI);
    canvas.moveTo(110, 240);
    canvas.lineTo(110, 250);
    canvas.arc(110, 150, 90, -0.5 * Math.PI, 0.5 * Math.PI);
    canvas.moveTo(110, 60);
    canvas.lineTo(110, 50);
    canvas.stroke();

    canvas.beginPath();
    canvas.moveTo(100, 150);
    canvas.lineTo(220, 150);
    canvas.moveTo(220, 155);
    canvas.lineTo(220, 145);
    canvas.lineTo(225, 150);
    canvas.fill();
    canvas.stroke();
}