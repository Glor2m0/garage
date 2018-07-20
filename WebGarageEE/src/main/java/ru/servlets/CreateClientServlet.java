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
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class CreateClientServlet extends HttpServlet {

    private final ClientCache CLIENT = ClientCache.getClientCache();

    private AtomicInteger ati = new AtomicInteger();
    private AtomicInteger atic = new AtomicInteger();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CLIENT.add(new Client(ati.incrementAndGet(),req.getParameter("name"), new LinkedList<Car>()));
        CLIENT.get(ati.get()).addCar(new Car(atic.incrementAndGet(),req.getParameter("car")));


        resp.sendRedirect(String.format("%s%s",req.getContextPath(),"/start"));
    }
}
