package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet2")
public class Servlet2  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");

        response.setContentType("text/html");
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html lang='es'>");
        response.getWriter().println("<head><title>Bienvenida</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Bienvenida " + nombre + "!</h1>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
