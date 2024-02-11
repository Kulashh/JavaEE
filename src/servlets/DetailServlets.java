//package servlets;
//
//
//
//import db.DBManager;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import models.Item;
//
//import java.io.IOException;
//
//public class DetailServlets extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {
//        Long id = Long.valueOf(req.getParameter("id"));
//        DBManager DbManager = new DBManager();
//        Item item = DBManager.getI(id);
//        req.setAttribute("OneItem", item);
//        req.getRequestDispatcher("detailsPage.jsp").forward(req,resp);
//    }
//
//}
