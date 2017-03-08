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
    </head>
    <body>
        <div class="dibujo-canvas" aling="center">
            <canvas id="canvas" width="1200" height="300"></canvas>
        </div>
        <input type="hidden" name="tipoPj" id="tipoPj"/>
        <table aling="center">
            <tr>
                <td><button id="arma" onclick="dibujar()"> Dibujar Personaje </button></td>
            </tr>
        </table>
        <form id="formulario" action="PersonajeServlet" method="POST">
            <button type="submit">Volver</button>
        </form>
    </body>

</html>