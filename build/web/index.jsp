<%-- 
    Document   : index
    Created on : Feb 22, 2017, 9:48:40 AM
    Author     : konan
--%>
<%--librerias de JSP y JSF--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.


-->
<html>
    <head>
        <title>Personajes</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body background="Background\1SAO.png">

    <center>    
        <div><FONT COLOR=#FFFFFF>Bienvenido ^^</FONT></div>
        <form id="tipoPersonaje" action="IndexServlet">
            <section text-align="center" >
                <div aling="center">
                    <br> 
                    <table>
                        <tr><td><FONT COLOR=#FFFFFF>Seleccione la clase de su personaje.</FONT></td></tr>
                        <tr><td> <select name="tipo" >
                                    <option value="Elfo">Elfo</option>
                                    <option value="Enano">Enano</option>
                                    <option value="Humano">Humano</option>
                                    <option value="Hechicero">Hechicero</option>
                                </select> 
                            </td>
                        </tr>
                        <tr><td>¿Desea a su personaje con un arma?</td>
                            <td><input type="radio" name="arma" value=true>Si</td>
                            <td><input type="radio" name="arma" value=false>No</td>
                        </tr>
                        
                        <tr><td>¿Desea a su personaje con una armadura?</td>
                            <td><input type="radio" name="armadura" value=true>Si</td>
                            <td><input type="radio" name="armadura" value=false>No</td>
                        </tr>
                        
                        <tr><td>¿Desea a su personaje con un escudo?</td>
                            <td><input type="radio" name="escudo" value=true>Si</td>
                            <td><input type="radio" name="escudo" value=false>No</td>
                        </tr>
                        
                        <tr><td>¿Desea a su personaje con una montura?</td>
                            <td><input type="radio" name="montura" value=true>Si</td>
                            <td><input type="radio" name="montura" value=false>No</td>
                        </tr>
                        <input type="submit" value="Siguiente"/>
                    </table>
                </div>
            </section>  
        </form>

    </center>
    <div  class="modal-footer">
        <a target="_blank" href="https://www.google.com/search?q=sao&client=ubuntu&hs=V9E&channel=fs&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiaupvd7KPSAhUKPiYKHVu-AuIQ_AUICCgB&biw=1366&bih=646"> Link del cual fue sacado la imagen </a>

    </div>



</body>
</html>
