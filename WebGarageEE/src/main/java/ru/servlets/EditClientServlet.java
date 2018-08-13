package ru.servlets;

import ru.Garage.Client.Client;
import ru.store.ClientCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class EditClientServlet extends HttpServlet {


private  final ClientCache CLIENT = ClientCache.getClientCache();

    final AtomicInteger ids = new AtomicInteger();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user", this.CLIENT.get(Integer.valueOf(req.getParameter("id"))));
       // req.setAttribute("cars", CLIENT.get(Integer.valueOf(req.getParameter("id"))).getCars());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/EditClient.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.CLIENT.edit(new Client(this.ids.incrementAndGet(),req.getParameter("name"),
                //age, telephone, sity, this.CLIENT.get(Integer.valueOf(req.getParameter("id"))).getCars()));
                //изменить под нового клиента если вообзе сервлеты будут юзабельны
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/clients"));
    }
}
