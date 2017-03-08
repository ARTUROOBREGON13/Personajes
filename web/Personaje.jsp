<%-- 
    Document   : Humano
    Created on : 22-feb-2017, 22:40:11
    Author     : R2D2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <title>Personaje</title>
        <script src="lienzo.js"></script>
        <script lang="javascript">
            function capturar() {
                var s = window.location.search;
                s = s.split("=");
                s = s[1];
                document.getElementById("tipoPj").value = s;
                for (i = 0; i < tipoPj.length; i++) {
                    if (s === tipoPj[i]) {
                        s = i;
                        break;
                    }
                }
                seleccion = s;
            //    alert(seleccion); Comprobante del uso del metodo correctamente
            }
        </script>
    </head>
    <body  onload="capturar();">
        <div class="dibujo-canvas" aling="center">
            <canvas id="canvas" width="300" height="300"></canvas>
        </div>
        <input type="hidden" name="tipoPj" id="tipoPj"/>
        <table aling="center">
            <tr><td><p id="tipoArma" onload="javascript:dw('' + tipoArma[s])"></p></td></tr>
            <tr>
                <td><button id="arma" onclick="dibujarArma()"> Crear Arma </button></td>
            </tr>
            <tr><td><p id="tipoMontura"></p></td></tr>
            <tr>
                <td><button id="montura" onclick="dibujarMontura()"> Crear Montura </button></td>
            </tr>
            <tr><td><p id="tipoArmadura"></p></td></tr>
            <tr>
                <td><button id="armadura" onclick="dibujarArmadura()"> Crear Armadura </button></td>
            </tr>
            <tr><td><p id="tipoEscudo"></p></td></tr>
            <tr>
                <td><button id="escudo" onclick="dibujarEscudo()"> Crear Esucdo </button></td>
            </tr>
        </table>
        <form id="formulario" action="PersonajeServlet" method="POST">
            <button type="submit">Volver</button>
        </form>
    </body>

</html>
