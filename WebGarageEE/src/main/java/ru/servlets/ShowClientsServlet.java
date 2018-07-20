package ru.servlets;

import ru.Garage.Client.Client;
import ru.Garage.car.Car;
import ru.store.ClientCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class ShowClientsServlet extends HttpServlet {

    private final ClientCache CLIENT = ClientCache.getClientCache();
    private AtomicInteger itr = new AtomicInteger();


    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("clients",CLIENT.values());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/ShowClients.jsp");
        dispatcher.forward(req,resp);

    }


}
