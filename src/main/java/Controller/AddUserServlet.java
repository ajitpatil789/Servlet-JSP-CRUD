package Controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;

import Model.User;
import Model.UserDAO;

@WebServlet("/add")
public class AddUserServlet extends HttpServlet {
    private UserDAO dao = new UserDAO();
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");

        User user = new User(name, email, country);
        dao.insertUser(user); // No try-catch needed if SQLException is not thrown
        res.sendRedirect("list");
    }
}