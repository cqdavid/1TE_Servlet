package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "infoRequest", urlPatterns = {"/infoRequest"})
public class infoRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Informacion del Objeto Request</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Request</h3>");
            out.println("Metodo: " + request.getMethod() + "<br>");
            out.println("Direccion URL: " + request.getRequestURL() + "<br>");
            out.println("Protocolo: " + request.getProtocol() + "<br>");
            out.println("Ruta Contexto: " + request.getContextPath() + "<br>");
            out.println("Servidor: " + request.getServerName() + "<br>");
            out.println("</body>");
            out.println("</html>");
    }

}