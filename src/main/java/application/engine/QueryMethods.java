package application.engine;

import application.models.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

public class QueryMethods {

    private final Connection connection = SQLConnection.connect();

    public boolean isConnected() {
        return (connection != null);
    }

    public boolean addArtistToDB(Artist artist) throws SQLException {
        String query = "INSERT INTO artist (name, origin, formation, active) VALUES (?, ?, ?, ?);";

        try {
            PreparedStatement ps = connection != null ? connection.prepareStatement(query) : null;
            ps.setString(1, artist.getName());
            ps.setString(2, artist.getOrigin());
            ps.setDate(3, artist.getFormation());
            ps.setBoolean(4, artist.isActive());

            ps.executeUpdate();
            ps.close();

            return true;
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addAlbumToDB (Album album) {
        String query = "INSERT INTO album (title, releaseDate, label, genre, style, limited, color) VALUES (?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement ps = connection != null ? connection.prepareStatement(query) : null;
            ps.setString(1, album.getTitle());
            ps.setDate(2, album.getReleaseDate());
            ps.setString(3, album.getLabel());
            ps.setArray(4, (Array) album.getGenre());
            ps.setArray(5, (Array) album.getStyle());
            ps.setInt(6, album.getLimited().getDBIndex());
            ps.setString(7, album.getColor());

            ps.executeUpdate();
            ps.close();

            return true;
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
            return false;
        }


    }


}
