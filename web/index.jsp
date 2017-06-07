<%-- 
    Document   : index
    Created on : Feb 22, 2017, 9:48:40 AM    
--%>
<%--librerias de JSP y JSF--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Personajes</title>
        <meta charset="UTF-8"/>
            <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
    <center>    
        <div><FONT COLOR=#FFFFFF>Bienvenido ^^</FONT></div>
        <section text-align="center" >
            <div aling="center">
                <br> <FONT COLOR=#FFFFFF>Seleccione la clase de su personaje.</FONT>
                <form id="tipoPersonaje" action="IndexServlet">
                    <br> <select name="tipo" >
                        <option value="Elfo">Elfo</option>
                        <option value="Enano">Enano</option>
                        <option value="Hechicero">Hechicero</option>
                        <option value="Humano">Humano</option>
                    </select> 
                    <input type="submit" value="Siguiente"/>
                </form>
            </div>
        </section>  
    </center>
    
    <footer>
        <div  class="modal-footer">
            <a target="_blank" href="https://www.google.com/search?q=sao&client=ubuntu&hs=V9E&channel=fs&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiaupvd7KPSAhUKPiYKHVu-AuIQ_AUICCgB&biw=1366&bih=646"> Link del cual fue sacado la imagen </a>
        </div>
    </footer>    
    
</body>
</html>
