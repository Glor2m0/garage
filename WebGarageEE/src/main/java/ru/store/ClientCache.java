package ru.store;

import ru.Garage.Client.Client;
import ru.Garage.car.Car;

import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class ClientCache implements Storage {

    private static final ClientCache CLIENT_CAHE = new ClientCache();

    private final Storage storage = new MemoryStorage();


    private final ConcurrentHashMap<Integer, Client> clients = new ConcurrentHashMap<Integer, Client>();

    public static ClientCache getClientCache() {
        return CLIENT_CAHE;
    }
    @Override
    public Collection<Client> values(){ return this.clients.values();}
    @Override
    public int add(final Client client){
        return this.storage.add(client);
    }
    @Override
    public void edit (final Client client){
        this.clients.replace(client.getId(), client);
    }
    @Override
    public void delete (final int id){
        this.clients.remove(id);
    }
    @Override
    public Client get(final int id) {
        return this.clients.get(id);
    }

    @Override
    public Client findByName(String name) {
        return null;
    }

    @Override
    public int generateId() {
        return 0;
    }

    @Override
    public void close() {

    }






}

