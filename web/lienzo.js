var tipoPj = ["Elfo", "Enano", "Humano", "Hechicero"];
var tipoArma = ["Arco", "Martillo", "Espada", "Libro"];
var tipoArmadura = ["Armadura Ligera", "Armadura Pesada", "Cota de malla", "Tunica"];
var tipoMontura = ["Lobo", "Jabali", "Caballo", "Glifo"];
var tipoEscudo = ["Escudo Dorado", "Escudo de madera", "Escudo de Acero", "Escudo Etereo"];
var seleccion = 0;

function dibujar() {
    var s = window.location.search;
    s = s.split("=");
    var aux = new Array(6);
    for (i = 0; i < s.length; i++)
        aux[i] = s[i].toString().includes("true");
    for (i = 0; i < tipoPj.length; i++) {
        if (s[1].toString().includes(tipoPj[i])) {
            seleccion = i;
        }
    }
    if (aux[2]) {
        dibujarArma();
    }
    if (aux[3]) {
        dibujarArmadura();
    }
    if (aux[4]) {
        dibujarEscudo();
    }
    if (aux[5]) {
        dibujarMontura();
    }
}

function dibujarArma() {

    var tipo = seleccion;
    if (tipo === 0)
        arco();
    else if (tipo === 1)
        martillo();
    else if (tipo === 2)
        libro();
    else if (tipo === 3)
        espada();
}

function dibujarEscudo() {
    var tipo = seleccion;
    if (tipo === 0)
        escudoDorado();
    else if (tipo === 1)
        escudoRedondo();
    else if (tipo === 2)
        escudoEtereo();
    else if (tipo === 3)
        escudoAcero();
}

function dibujarMontura() {
    var tipo = seleccion;
    if (tipo === 0)
        lobo();
    else if (tipo === 1)
        jabali();
    else if (tipo === 2)
        grifo();
    else if (tipo === 3)
        caballo();
}

function dibujarArmadura() {
    var tipo = seleccion;
    if (tipo === 0)
        armaduraLigera();
    else if (tipo === 1)
        armaduraPesada();
    else if (tipo === 2)
        tunica();
    else if (tipo === 3)
        cotaDeMalla();
}

//funciones que utilizan el canvas

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
//armas
function espada() {
    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");
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

function martillo() {
    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");

    canvas.beginPath();
    canvas.fillStyle = "#000000";
    canvas.fillRect(150, 170, 50, 80);
    canvas.beginPath();
    canvas.fillStyle = "#505050";
    canvas.fillRect(100, 80, 150, 90);
    canvas.beginPath();
    canvas.moveTo(100, 80);
    canvas.lineTo(90, 90);
    canvas.lineTo(90, 160);
    canvas.lineTo(100, 170);
    canvas.fill();

    canvas.beginPath();
    canvas.moveTo(250, 80);
    canvas.lineTo(260, 90);
    canvas.lineTo(260, 160);
    canvas.lineTo(250, 170);
    canvas.fill();
}

function libro() {
    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");
    canvas.fillStyle = "#bbbbbb";
    canvas.beginPath(); //Pongo el lapiz
    canvas.lineWidth = 1;
    canvas.strokeStyle = "black";
    //Curva superior
    canvas.beginPath();
    canvas.moveTo(40, 150);
    canvas.bezierCurveTo(76, 125, 112, 125, 150, 150);
    canvas.stroke();
    canvas.moveTo(150, 150);
    canvas.bezierCurveTo(186, 125, 222, 125, 260, 150);
    canvas.stroke();
    canvas.moveTo(40, 250);
    canvas.bezierCurveTo(76, 225, 112, 225, 150, 250);
    canvas.stroke();
    canvas.moveTo(40, 250);
    canvas.bezierCurveTo(76, 235, 112, 235, 150, 250);
    canvas.stroke();
    canvas.moveTo(40, 250);
    canvas.bezierCurveTo(76, 245, 112, 245, 150, 250);
    canvas.stroke();
    canvas.moveTo(150, 250);
    canvas.bezierCurveTo(186, 225, 222, 225, 260, 250);
    canvas.stroke();
    canvas.moveTo(150, 250);
    canvas.bezierCurveTo(186, 235, 222, 235, 260, 250);
    canvas.stroke();
    canvas.moveTo(150, 250);
    canvas.bezierCurveTo(186, 245, 222, 245, 260, 250);
    canvas.stroke();

    //linea izquierda
    canvas.beginPath();
    canvas.moveTo(40, 150);
    canvas.lineTo(40, 250);
    canvas.stroke();
    canvas.closePath();



    canvas.beginPath();
    canvas.moveTo(37, 150);
    canvas.lineTo(37, 250);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(34, 150);
    canvas.lineTo(34, 250);
    canvas.stroke();
    canvas.closePath();

    //linea central
    canvas.beginPath();
    canvas.moveTo(150, 150);
    canvas.lineTo(150, 250);
    canvas.stroke();
    canvas.closePath();


    //linea derecha
    canvas.beginPath();
    canvas.moveTo(260, 150);
    canvas.lineTo(260, 250);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(263, 150);
    canvas.lineTo(263, 250);
    canvas.stroke();
    canvas.closePath();
    canvas.beginPath();
    canvas.moveTo(266, 150);
    canvas.lineTo(266, 250);
    canvas.stroke();
    canvas.closePath();
    var my_gradient = canvas.createLinearGradient(0, 0, 0, 170);

    my_gradient.addColorStop(1, "red");
    canvas.fillStyle = my_gradient;
    canvas.fillRect(150, 150, 10, 115);
}
//escudos

//monturas
function caballo() {
    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");
    canvas.beginPath(); //Pongo el lapiz
    //cuerpo de arriba
    canvas.beginPath();
    canvas.moveTo(340, 150);
    canvas.bezierCurveTo(350, 100, 500, 100, 550, 150);
    canvas.stroke();
    //cuerpo abajo
    canvas.beginPath();
    canvas.moveTo(340, 180);
    canvas.bezierCurveTo(500, 220, 550, 200, 520, 150);
    canvas.stroke();
    colas = 50;
    for (var i = 0; i < colas; i++) {
        canvas.beginPath();
        canvas.moveTo(345, 140);
        canvas.lineTo(300 + i, 200);
        canvas.stroke();
        canvas.closePath();
        i += 3;
    }
    //linea pierda tracera
    canvas.beginPath();
    canvas.moveTo(340, 150);
    canvas.lineTo(340, 250);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(380, 150);
    canvas.lineTo(340, 250);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(380, 190);
    canvas.lineTo(380, 250);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(400, 192);
    canvas.lineTo(380, 250);
    canvas.stroke();
    canvas.closePath();
    //PATAS DELANTERAS
    canvas.beginPath();
    canvas.moveTo(480, 250);
    canvas.lineTo(450, 190);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(485, 190);
    canvas.lineTo(480, 250);
    canvas.stroke();
    canvas.closePath();
    //patica delantera
    canvas.beginPath();
    canvas.moveTo(500, 200);
    canvas.lineTo(490, 250);
    canvas.stroke();
    canvas.closePath();
    //patica delantera
    canvas.beginPath();
    canvas.moveTo(488, 200);
    canvas.lineTo(490, 250);
    canvas.stroke();
    canvas.closePath();

    //cara
    canvas.fillStyle = "#F5941D";
    canvas.beginPath();
    canvas.ellipse(555, 155, 30, 45, 55 * Math.PI / 100000000, 0, 2 * Math.PI);
    canvas.stroke();

    canvas.fillStyle = "black";
    canvas.beginPath();
    canvas.arc(580, 140, 10, 0, 2 * Math.PI);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();

    canvas.beginPath();
    canvas.arc(570, 140, 10, 0, 2 * Math.PI);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();

    canvas.fillStyle = "black";
    canvas.beginPath();
    canvas.moveTo(550, 130);
    canvas.lineTo(500, 80);
    canvas.lineTo(520, 150);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();

    canvas.beginPath();
    canvas.moveTo(580, 125);
    canvas.lineTo(520, 80);
    canvas.lineTo(530, 115);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();
}

function lobo() {
    var canvas = document.getElementById('canvas');
    var canvas = canvas.getContext('2d');
    canvas.clearRect(0, 0, canvas.width, canvas.height);
    canvas.beginPath(); //Pongo el lapiz
    canvas.strokeStyle = "black";
    //cuerpo de arriba
    canvas.beginPath();
    canvas.moveTo(340, 150);
    canvas.bezierCurveTo(350, 100, 500, 100, 550, 150);
    canvas.stroke();
    //cuerpo abajo
    canvas.beginPath();
    canvas.moveTo(340, 180);
    canvas.bezierCurveTo(500, 220, 550, 250, 550, 150);
    canvas.stroke();

    colas = 50;
    for (var i = 0; i < colas; i++) {
        //colas
        canvas.beginPath();
        canvas.moveTo(340, 150);
        canvas.lineTo(300 + i, 200);
        canvas.stroke();
        canvas.closePath();

        i += 2;
    }
    //linea pierda tracera
    canvas.beginPath();
    canvas.moveTo(340, 150);
    canvas.lineTo(340, 250);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(380, 190);
    canvas.lineTo(340, 250);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(380, 190);
    canvas.lineTo(380, 250);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(420, 200);
    canvas.lineTo(380, 250);
    canvas.stroke();
    canvas.closePath();
    //PATAS DELANTERAS
    canvas.beginPath();
    canvas.moveTo(480, 250);
    canvas.lineTo(450, 190);
    canvas.stroke();
    canvas.closePath();

    canvas.beginPath();
    canvas.moveTo(500, 190);
    canvas.lineTo(480, 250);
    canvas.stroke();
    canvas.closePath();
    //patica delantera
    canvas.beginPath();
    canvas.moveTo(510, 215);
    canvas.lineTo(490, 250);
    canvas.stroke();
    canvas.closePath();
    //patica delantera
    canvas.beginPath();
    canvas.moveTo(488, 225);
    canvas.lineTo(490, 250);
    canvas.stroke();
    canvas.closePath();

    //cara
    canvas.fillStyle = "#black";
    canvas.beginPath();
    canvas.arc(550, 150, 40, 0, 2 * Math.PI);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();

    canvas.fillStyle = "blue";
    canvas.beginPath();
    canvas.arc(580, 140, 10, 0, 2 * Math.PI);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();

    canvas.beginPath();
    canvas.arc(570, 140, 10, 0, 2 * Math.PI);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();

    canvas.fillStyle = "black";
    canvas.beginPath();
    canvas.moveTo(550, 130);
    canvas.lineTo(500, 80);
    canvas.lineTo(520, 150);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();

    canvas.beginPath();
    canvas.moveTo(580, 125);
    canvas.lineTo(520, 80);
    canvas.lineTo(530, 115);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();
}

//armaduras
function ArmaduraPesada() {
    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");
    var my_gradient = canvas.createLinearGradient(600, 0, 600, 170);
    my_gradient.addColorStop(0, "red");
    my_gradient.addColorStop(1, "black");
    canvas.fillStyle = my_gradient;
    canvas.fillRect(730, 105, 70, 110);

    var my_gradient = canvas.createLinearGradient(600, 0, 600, 170);
    my_gradient.addColorStop(0, "black");
    my_gradient.addColorStop(1, "white");
    canvas.fillStyle = my_gradient;
    // Triángulo rellenado
    canvas.beginPath();
    canvas.moveTo(800, 200);
    canvas.lineTo(855, 200);
    canvas.lineTo(800, 105);
    canvas.fill();

    // Triángulo contorneado
    canvas.beginPath();
    canvas.moveTo(730, 130);
    canvas.lineTo(855, 130);
    canvas.lineTo(730, 105);
    canvas.fill();

    var my_gradient = canvas.createLinearGradient(600, 0, 600, 170);
    my_gradient.addColorStop(1, "black");
    my_gradient.addColorStop(0, "red");
    canvas.fillStyle = my_gradient;
    canvas.fillRect(720, 220, 35, 15);
    canvas.fillRect(770, 220, 35, 15);


}

function tunica() {
    clave = document.getElementById("canvas");
    canvas = clave.getContext("2d");
    var gradient = canvas.createLinearGradient(600, 0, 600, 170);
    gradient.addColorStop(1, "black");
    gradient.addColorStop(0.8, "#00FFFF");
    canvas.fillStyle = gradient;
    canvas.beginPath();
    canvas.moveTo(780, 150);
    canvas.lineTo(750, 150);
    canvas.lineTo(700, 250);
    canvas.lineTo(850, 250);
    canvas.stroke();
    canvas.closePath();
    canvas.fill();
    var gradient = canvas.createLinearGradient(600, 0, 600, 170);
    gradient.addColorStop(1, "black");
    gradient.addColorStop(0, "#DAA520");
    canvas.fillStyle = gradient;
    canvas.fillRect(730, 105, 70, 110);

    gradient.addColorStop(1, "black");
    gradient.addColorStop(0, "#00FFFF");
    canvas.fillStyle = gradient;
    canvas.beginPath();
    canvas.moveTo(800, 200);
    canvas.lineTo(850, 200);
    canvas.lineTo(800, 105);
    canvas.fill();
    canvas.beginPath();
    canvas.moveTo(730, 130);
    canvas.lineTo(855, 130);
    canvas.lineTo(730, 105);
    canvas.fill();

    canvas.fillRect(730, 260, 35, 15);
    canvas.fillRect(780, 260, 35, 15);
}