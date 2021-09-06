package application.models;

import java.time.Year;
import java.util.List;

public class Artist {

    private long id;
    private String name;
    private String origin;
    private Year formation;
    private boolean active;

    private List<Album> albums;

    public Artist(String name, String origin, Year formation, boolean active) {
        this.name = name;
        this.origin = origin;
        this.formation = formation;
        this.active = true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Year getFormation() {
        return formation;
    }

    public void setFormation(Year formation) {
        this.formation = formation;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return  name + " - " +
                origin + " - " +
                formation + " - " +
                active;
    }
}
