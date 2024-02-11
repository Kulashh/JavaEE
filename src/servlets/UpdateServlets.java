//package servlets;
//
//import db.DBManager;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//
//@WebServlet(value = "/updateItem")
//public class UpdateServlets extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String id = req.getParameter("id");
//        String name = req.getParameter("name");
//        String price = req.getParameter("price");
//        String amount = req.getParameter("amount");
//        models.Item item = new models.Item();
//        item.setId(Long.valueOf(id));
//        item.setName(name);
//        item.setPrice(Double.parseDouble(price));
//        item.setAmount(Integer.parseInt(amount));
//        DBManager.updateItem(item);
//        resp.sendRedirect("/items");
//    }
//}
