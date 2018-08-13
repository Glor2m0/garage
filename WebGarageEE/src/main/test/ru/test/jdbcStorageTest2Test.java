package ru.test;

import org.junit.Test;
import ru.Garage.Client.Client;
import ru.Garage.car.Car;

import java.util.List;

import static org.junit.Assert.*;

public class jdbcStorageTest2Test {


    @Test
    public void testCreate2() throws Exception{
        final jdbcStorageTest2 storage = new jdbcStorageTest2();
       // final int id = storage.add(new Client(-1,"TEST", "TEST", 00, "TEST", "Moscow", new Car (1,"xxx","Blue","aa777a")));
        final int id = storage.add(new Client(-1,"TEST", "TEST", 00, "TEST", "Moscow", null));
        final Client client = storage.get(id);
        assertEquals(id, client.getId());
        storage.close();
    }



}