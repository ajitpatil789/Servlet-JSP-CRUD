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
import java.util.List;

@WebServlet("/list")
public class ListUsersServlet extends HttpServlet {
    private UserDAO dao = new UserDAO();
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            List<User> users = dao.selectAllUsers();
            req.setAttribute("list", users);
            req.getRequestDispatcher("list-users.jsp").forward(req, res);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
