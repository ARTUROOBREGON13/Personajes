/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonajeServlet", urlPatterns = {"/PersonajeServlet"})
public class PersonajeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String accion = (String) request.getParameter("accion");
        if (accion.equals("true")) {
            int n = Integer.parseInt(request.getParameter("cantidad").toString());
            Constructor.clonar(n);
            PrintWriter out = response.getWriter();
            String title = "Army";
            out.println("<html>\n"
                    + "<head><title>" + title + "</title>"
                    + "<script> var n = +" + n + ";"
                    + " function dibujarTodo(){\n"
                    + "	clave = document.getElementById(\"canvas\");\n"
                    + "    canvas = clave.getContext(\"2d\");\n"
                    + "    canvas.lineWidth = 1;\n"
                    + "    canvas.strokeStyle = '#000';\n"
                    + "	var j=0,posX=6,posY=2;\n"
                    + "	\n"
                    + "	for(i=0;i<n;i++){\n"
                    + "		j=1;\n"
                    + "		posX*=i;\n"
                    + "		while(posX>canvas.width){\n"
                    + "			posX-=canvas.width;\n"
                    + "			j++;\n"
                    + "		}\n"
                    + "		posY*=j;\n"
                    + "		\n"
                    + "		canvas.fillText(i+1,posX,posY);\n"
                    + "	}\n"
                    + "}</script> " + "</head>\n"
                    + "<body onLoad=\"dibujarTodo()\">\n"
                    + "<canvas id=\"canvas\" width=\"" + 12 * n + "\" height=\"" + 4 * n + "\"></canvas>"
                    + "</body></html>");
        }else{
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
