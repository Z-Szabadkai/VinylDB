package application.models;

import java.sql.Date;
import java.util.List;

public class Album {

    private String title;
    private Date releaseDate;
    private String label;
    private List<String> genre;
    private List<String> style;
    private Ltd_Release limited;
    private String color;

    public Album(String title, Date releaseDate, String label, List<String> genre, List<String> style, Ltd_Release limited, String color) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.label = label;
        this.genre = genre;
        this.style = style;
        this.limited = limited;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getStyle() {
        return style;
    }

    public void setStyle(List<String> style) {
        this.style = style;
    }

    public Ltd_Release getLimited() {
        if (!getColor().equals("black")) {
            return Ltd_Release.REGULAR;
        }
        return Ltd_Release.COLORED;
    }

    public void setLimited(Ltd_Release limited) {
        this.limited = limited;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
