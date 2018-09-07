package ru.test;

import ru.Garage.Client.Client;
import ru.service.Settings;
import ru.store.Storage;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class jdbcStorageTest2 implements Storage {

    final Connection connection;

    public jdbcStorageTest2() {
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
                clients.add(new Client(resultSet.getInt("idClient"), resultSet.getString("firstname"), resultSet.getString("lastname"),
                        resultSet.getInt("age"), resultSet.getString("telehpone"), resultSet.getString("city"), null));
            }
        }catch (SQLException exc){
            exc.printStackTrace();
        }
        return clients;
    }

    @Override
    public int add(Client client) {
        try(final PreparedStatement statement = this.connection.prepareStatement(
                "insert into client (firstname, lastname, age, telephone, city) values (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS)){
            statement.setString(1, client.getFirstname());
            statement.setString(2, client.getLastname());
            statement.setInt(3, client.getAge());
            statement.setString(4, client.getTelephone());
            statement.setString(5, client.getSity());
            statement.executeUpdate();
            try( ResultSet generatedKeys = statement.getGeneratedKeys()){
                if (generatedKeys.next()){
                    return generatedKeys.getInt(1);
                }
            }
        } catch (SQLException exc){
            exc.printStackTrace();
        }

   //     try (final PreparedStatement statement = this.connection.prepareStatement("insert into car (client_id, carname, color, number) values (?,?,?,?)"), Statement.RETURN_GENERATED_KEYS){  }



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
        try(final PreparedStatement statement = this.connection.prepareStatement("select * from client where idClient=(?)")) {
            statement.setInt(1, id);
            try (final ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    return new Client(resultSet.getInt("idClient"), resultSet.getString("firstname"), resultSet.getString("lastname"),
                            resultSet.getInt("age"), resultSet.getString("telephone"), resultSet.getString("city"), null);
                }
            }
        }catch (SQLException exc){
            exc.printStackTrace();
        }
        throw new IllegalStateException(String.format("Client %s does't exist"));
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
        try{
            connection.close();
        }catch (SQLException exc){
            exc.printStackTrace();
        }

    }
}
