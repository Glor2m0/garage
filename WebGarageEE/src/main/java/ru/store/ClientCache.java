package ru.store;

import ru.Garage.Client.Client;
import ru.Garage.car.Car;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class ClientCache {

    private static final ClientCache CLIENT_CAHE = new ClientCache();


    private final ConcurrentHashMap<Integer, Client> clients = new ConcurrentHashMap<Integer, Client>();

    public static ClientCache getClientCache() {
        return CLIENT_CAHE;
    }

    public Collection<Client> values(){ return this.clients.values();}

    public void add(final Client client){
        this.clients.put(client.getId(), client);
    }

    public void edit (final Client client){
        this.clients.replace(client.getId(), client);
    }

    public void delete (final int id){
        this.clients.remove(id);
    }

    public Client get(final int id) {
        return this.clients.get(id);
    }

    public Client getAll (){
        for (Client c : CLIENT_CAHE.values())
            return c;
            return new Client(0,"",new LinkedList<Car>());
    }




}

