import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlbumsDao {
    private Connection connection = null;

    public AlbumsDao() {
        try {
            Config config = new Config();
            // STEP ONE: Register Driver
            DriverManager.registerDriver(new Driver());
            // STEP TWO: Create connection
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch(SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }

    public List<Album> all() {
        try {
            // STEP THREE: Create Statement object
            Statement stmt = connection.createStatement();
            // ResultSet needs to be handled so we create an instance.
            // STEP FOUR: Execute statement
            ResultSet rs = stmt.executeQuery("SELECT * FROM albums");
            List <Album> albums = new ArrayList<>();
            while (rs.next()) {
                // STEP FIVE: Interpret ResultSet
                albums.add(new Album(
                        rs.getLong("id"),
                        rs.getString("artist"),
                        rs.getString("name"),
                        rs.getInt("release_date"),
                        rs.getDouble("sales"),
                        rs.getString("genre")
                ));
            }
            return albums;

        } catch(SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }

    public static void main(String[] args) {
        AlbumsDao albumsDao = new AlbumsDao();
        List<Album> albums =  albumsDao.all();

        for (Album album : albums) {
            System.out.println(album.getName());
        }

    }



}
