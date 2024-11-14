package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")

public class SenoCosenoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html lang='es'><head><title>Tabla de Seno y Coseno</title>");
        out.println("<link rel='stylesheet' href='styles.css'>");
        out.println("</head><body>");
        out.println("<h1>Tabla de Seno y Coseno</h1>");
        out.println("<table border='1'><tr><th>Ángulo (grados)</th><th>Seno</th><th>Coseno</th></tr>");

        for (int angle = 0; angle <= 360; angle += 15) {
            double radians = Math.toRadians(angle);
            double sineValue = Math.sin(radians);
            double cosineValue = Math.cos(radians);
            out.printf("<tr><td>%d</td><td>%.4f</td><td>%.4f</td></tr>", angle, sineValue, cosineValue);
        }
        out.println("</table>");
        out.println("</body></html>");
    }
}


