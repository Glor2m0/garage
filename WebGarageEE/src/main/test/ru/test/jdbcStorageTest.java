package ru.test;

import org.junit.Test;
import ru.Garage.Client.Client;
import ru.store.jdbcStorage;

import static org.junit.Assert.*;

public class jdbcStorageTest {


    @Test
    public void testCreate() throws Exception{
        final jdbcStorage storage = new jdbcStorage();
        final int id = storage.add(new Client(-1,"test", null));
        final Client client = storage.get(id);
        assertEquals(id, client.getId());
        storage.close();
    }


}