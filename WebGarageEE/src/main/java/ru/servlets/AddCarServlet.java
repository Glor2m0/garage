package ru.servlets;

import ru.Garage.Client.Client;
import ru.Garage.car.Car;
import ru.store.ClientCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class AddCarServlet extends HttpServlet {

   private ClientCache CLIENT = ClientCache.getClientCache();
    private AtomicInteger iter = new AtomicInteger();




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("client", CLIENT.get(Integer.valueOf(req.getParameter("id"))));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/AddCar.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // CLIENT.get(Integer.valueOf(req.getParameter("id"))).addCar(new Car(Integer.valueOf(req.getParameter("idCar")),req.getParameter("car")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/clients"));
    }
}
