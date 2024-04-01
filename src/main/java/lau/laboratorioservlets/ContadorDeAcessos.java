package lau.laboratorioservlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "contadordeacessos", value = "/contador-de-acessos")
public class ContadorDeAcessos extends HttpServlet {

    private int contadorDeAcessos = 0;
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        contadorDeAcessos++;

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>Número de acessos: " + contadorDeAcessos + "</h1>");
    }
}
