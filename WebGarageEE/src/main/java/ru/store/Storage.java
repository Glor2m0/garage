package ru.store;

import ru.Garage.Client.Client;

import java.util.Collection;

public interface Storage {

    public Collection<Client> values();

    public int add (final Client client);

    public void edit (final Client client);

    public void delete (final int id);

    public Client get (final int id);

    public Client findByName (final String name);

    public int generateId();

    public void close();
}
