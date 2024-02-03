package question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "customer", urlPatterns = "/customer")
public class Customer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getHeader("FName");
        String lastName = req.getHeader("LName");
        System.out.println("Hello Mr. "+firstName+" "+lastName+"!");
        var age = req.getParameter("age");
        System.out.println("Your age is : "+age);
    }
}
