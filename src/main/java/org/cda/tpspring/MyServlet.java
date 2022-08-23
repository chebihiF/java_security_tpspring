package org.cda.tpspring;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {

    @Override //IOC ==> tomcat (req, resp)
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // trait
        String name = req.getParameter("name");
        String IP = req.getRemoteAddr().toString();

        req.setAttribute("name",name);
        req.getRequestDispatcher("hello.jsp").forward(req,resp);

        /*resp.setContentType("text/html");
        resp.getWriter().println("Hello from <b>Servlet</b> by "+name);
        resp.getWriter().println("IP : "+IP);*/
    }
}
