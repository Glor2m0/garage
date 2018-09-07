package ru.store;

import ru.Garage.Client.Client;
import ru.service.Settings;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserEmailAndPassStorage  {

    final Connection connection;

    public UserEmailAndPassStorage() {
        final Settings settings = Settings.getInstance();
        try {
            this.connection = DriverManager.getConnection(settings.value("jdbc.url"), settings.value("jdbc.username"), settings.value("jdbc.password"));
        } catch (SQLException exc){
            throw new IllegalStateException(exc);
        }
    }

   public int add (String email, String pass, int hashuid){
        try (final PreparedStatement statement = this.connection.prepareStatement(
                "insert into hashbase ( hashuid, user_email, user_pass) values (?,?,?)", Statement.RETURN_GENERATED_KEYS)){
            statement.setInt(1, hashuid);
            statement.setString(2, email);
            statement.setString(3, pass);
            statement.executeUpdate();
            try(ResultSet generatedKeys = statement.getGeneratedKeys()){
                if (generatedKeys.next()){
                    return generatedKeys.getInt(1);
                }
            }

        } catch (SQLException exc){
            exc.printStackTrace();
        }
        throw new IllegalStateException("Cloud not create new user");
   }

   public void close (){
        try{
            connection.close();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }

   }


}
