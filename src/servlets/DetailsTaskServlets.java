package servlets;

import db.DBManager;
import model.Tasks;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/details")
public class DetailsTaskServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long taskId = Long.parseLong(request.getParameter("taskId"));

        // Получаем задачу по ID из базы данных
        Tasks task = DBManager.getTask(taskId);

        // Передаем задачу в JSP для отображения деталей
        request.setAttribute("task", task);
        request.getRequestDispatcher("details.jsp").forward(request, response);
    }
}
