package com.example.demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "FileServlet", value = "/file")
public class FileServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Oops...Nothing here";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        
    }

    public void destroy() {
    }
}