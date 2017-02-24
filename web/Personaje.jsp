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
        <script>
            function capturar() {
                var s = window.location.search;
                s = s.split("=");
                s = s[1];
                document.getElementById("tipoPj").value = s;
                dibujar();
            }
        </script>
    </head>
    <body onload="capturar();">
        <div class="dibujo-canvas" aling="center">
            <canvas id="canvas" width="300" height="300"></canvas>
        </div>
        <form action="PersonajeServlet" method="GET">
            <input type="hidden" name="tipoPj" id="tipoPj"/>
            <table aling="center">
                <tr><td>Arma del personaje</td></tr>
                <tr>
                    <td><input type="radio" name="arma" value="1" id="arma" checked/>Espada</td>
                    <td><input type="radio" name="arma" value="2" id="arma"/>Arco</td>
                    <td><input type="radio" name="arma" value="3" id="arma"/>Martillo</td>
                    <td><input type="radio" name="arma" value="4" id="arma"/>Libro</td>
                </tr>
                <tr><td>Montura</td></tr>
                <tr>
                    <td><input type="radio" name="montura" value="Caballo" checked id="montura"/>Caballo</td>
                    <td><input type="radio" name="montura" value="Javali" id="montura"/>Javali</td>
                    <td><input type="radio" name="montura" value="Lobo" id="montura"/>Lobo</td>
                    <td><input type="radio" name="montura" value="Glifo" id="montura"/>Glifo</td>
                </tr>
                <tr><td>Vestimenta</td></tr>
                <tr>
                    <td><input type="radio" name="armadura" value="Cota de malla" checked id="armadura"/>Cota de malla</td>
                    <td><input type="radio" name="armadura" value="Armadura Ligera" id="armadura"/>Armadura Ligera</td>
                    <td><input type="radio" name="armadura" value="Armadura Pesada" id="armadura"/>Armadura Pesada</td>
                    <td><input type="radio" name="armadura" value="Tunica" id="armadura"/>Tunica</td>
                </tr>
                <tr><td>Escudo</td></tr>
                <tr>
                    <td><input type="radio" name="escudo" value="Escudo de Acero" checked id="escudo"/>Escudo de Acero</td>
                    <td><input type="radio" name="escudo" value="Escudo de Madera" id="escudo"/>Escudo de Madera</td>
                    <td><input type="radio" name="escudo" value="Escudo Dorado" id="escudo"/>Escudo Dorado</td>
                    <td><input type="radio" name="escudo" value="Sin Escudo" id="escudo"/>Sin Escudo</td>
                </tr>
            </table>
            <input type="button" value="Crear" action="PersonajeServlet" onclick="dibujar()"/>
        </form>
    </body>

</html>