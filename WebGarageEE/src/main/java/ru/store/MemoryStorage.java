package ru.store;

import ru.Garage.Client.Client;

import java.util.Collection;

public class MemoryStorage implements Storage {

    @Override
    public Collection<Client> values() {
        return null;
    }

    @Override
    public int add(Client client) {
        return 0;
    }

    @Override
    public void edit(Client client) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Client get(int id) {
        return null;
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
