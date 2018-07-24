package ru.store;

import ru.Garage.Client.Client;
import ru.service.Settings;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class jdbcStorage implements Storage {

    final Connection connection;

    public jdbcStorage() {
        final Settings settings = Settings.getInstance();
        try {
            this.connection = DriverManager.getConnection(settings.value("jdbc.url"), settings.value("jdbc.username"), settings.value("jdbc.password"));
        } catch (SQLException exc){
            throw new IllegalStateException(exc);
        }
    }

    @Override
    public Collection<Client> values() {
        final List<Client> clients = new ArrayList<>();
        try(final Statement statement= this.connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("select * from client")){
            while (resultSet.next()){
                clients.add(new Client(resultSet.getInt("uid"), resultSet.getString("name"), null));
            }
        }catch (SQLException exc){
            exc.printStackTrace();
        }
        return clients;
    }

    @Override
    public int add(Client client) {
        try(final PreparedStatement statement = this.connection.prepareStatement("insert into client (name) values (?)", Statement.RETURN_GENERATED_KEYS)){
            statement.setString(1, client.getName());
            statement.executeUpdate();
            try( ResultSet generatedKeys = statement.getGeneratedKeys()){
                if (generatedKeys.next()){
                    return generatedKeys.getInt(1);
                }
            }
        } catch (SQLException exc){
            exc.printStackTrace();
        }
        throw new IllegalStateException("Cloud not create new client");
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
