package assignment4.src.com.company;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conncetionDb {
    boolean flah;
    ArrayList<Item> items = new ArrayList<>();
    public void databaseOperatons() throws Exception{
        Operations operations = new Operations();
        Item item = new Item();
        try {
            Connection connection = DriverManager.getConnection(dbDetails.dbAddress, dbDetails.userName, dbDetails.password);
            Statement smt = connection.createStatement();
            ResultSet resultSet = smt.executeQuery(dbDetails.query);
            while(resultSet.next()){
                item.setName(resultSet.getString(1));
                item.setQuantity(resultSet.getInt(2));
                item.setPrice(resultSet.getDouble(3));
                item.setType(resultSet.getString(4));
                items.add(item);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        operations.display(items);
    }

}
