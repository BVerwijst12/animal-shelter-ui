package Dal;

import Dal.DTO.AnimalDTO;
import java.sql.*;
import java.util.ArrayList;

public class AnimalMySQLContext {
    private  static  String connectionString = "Server=studmysql01.fhict.local;Uid=dbi387128;Database=dbi387128;Pwd=Wachtwoord1;";

    public ArrayList<AnimalDTO> GetAllAnimals() throws SQLException {
        String query = "SELECT * FROM animal";

        ArrayList<AnimalDTO> allAnimals = new ArrayList<AnimalDTO>();
        Connection connection = DriverManager.getConnection(connectionString);
        Statement stmt= connection.createStatement();
        ResultSet rs=stmt.executeQuery("select * from animal");
        while (rs.next()){
            AnimalDTO animalinfo = new AnimalDTO(
                    rs.getInt(0),
                    rs.getString(1),
                    rs.getString(2)
            );
            allAnimals.add(animalinfo);
        }

        return allAnimals;
    }
}
