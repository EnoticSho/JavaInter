package servlets;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(name = "BasicServlet", urlPatterns = "/hello")
public class BasicServlet implements Servlet {

    private transient ServletConfig config;
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("<h1>Hello World</h1>");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
