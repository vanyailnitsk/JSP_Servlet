package com.example.demo;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import service.Cart;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World asd as!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        HttpSession session = request.getSession();
//        Cart cart = (Cart) session.getAttribute("cart");
//        if (cart==null) {
//            cart = new Cart();
//            cart.setName(request.getParameter("name"));
//            cart.setQuantity(Integer.parseInt(request.getParameter("quantity")));
//        }
//        session.setAttribute("cart",cart);

//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1> Your count is: " + + "</h1>");
//        out.println("</body></html>");
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);
    }

    public void destroy() {
    }
}