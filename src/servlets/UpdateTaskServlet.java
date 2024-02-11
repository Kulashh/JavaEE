package servlets;
import db.DBManager;
import model.Tasks;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateTaskServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long taskId = Long.parseLong(request.getParameter("taskId"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String deadline = request.getParameter("deadline");

        // Получаем задачу по ID из базы данных
        Tasks task = DBManager.getTask(taskId);
        if (task != null) {
            // Обновляем данные задачи
            task.setName(name);
            task.setDescription(description);
            task.setDeadlineDate(deadline);
            // Сохраняем обновленную задачу в базе данных
            DBManager.updateTask(task);
        }

        // После обновления перенаправляем пользователя на страницу с деталями задачи
        response.sendRedirect("details?taskId=" + taskId);
    }
}