package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html lang='es'>");
        response.getWriter().println("<head><title>Formulario</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Formulario de Bienvenida</h1>");
        response.getWriter().println("<form action='Servlet2' method='POST'>");
        response.getWriter().println("<label for='nombre'>Introduce tu nombre:</label>");
        response.getWriter().println("<input type='text' id='nombre' name='nombre' required>");
        response.getWriter().println("<button type='submit'>Enviar</button>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
