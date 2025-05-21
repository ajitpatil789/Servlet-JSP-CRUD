package Controller;

import Model.User;
import Model.UserDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/edit")
public class EditUserServlet extends HttpServlet {
    private UserDAO dao = new UserDAO();
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        try {
            User user = dao.selectUser(id);
            req.setAttribute("user", user);
            req.getRequestDispatcher("edit-user.jsp").forward(req, res);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
