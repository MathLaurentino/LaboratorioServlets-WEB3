package lau.laboratorioservlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "lifeCycleServlet", value = "/life-cycle-servlet")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println("Inicializando a LifeCycleServlet");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Chamou o método service");
    }

    @Override
    public void destroy() {
        System.out.println("Destruindo a LifeCycleServlet");
    }
}
