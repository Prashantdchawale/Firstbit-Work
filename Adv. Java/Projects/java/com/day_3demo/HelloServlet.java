package com.day_3demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Service Layer Component
@WebServlet("/authenticate")
public class HelloServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        System.out.println("Jinklas Mitra");

        // Fetching request parameters
        String cardnumber = req.getParameter("card_no");
        String name = req.getParameter("name");
        String expirydate = req.getParameter("expiry_date");
        String cvv = req.getParameter("cvv");

        // VerifyUser object
        VerifyUser ref = new VerifyUser();
        boolean result = ref.isValid(cardnumber, name, expirydate, cvv);

        PrintWriter out = res.getWriter();

//        if (result == true) {
//            out.print("Valid User");
//        } else {
//            out.print("Invalid User");
//        }
        
        if (result == true) {
            // Redirect to success HTML page
            res.sendRedirect("valid.html");
        } else {
            // Redirect to failure HTML page
            res.sendRedirect("invalid.html");
        }

        // Console Logging
        System.out.println("CARD_NO     = " + cardnumber);
        System.out.println("NAME        = " + name);
        System.out.println("EXPIRY_DATE = " + expirydate);
        System.out.println("CVV         = " + cvv);
    }
}
