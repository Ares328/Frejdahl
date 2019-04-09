package domain;

import java.time.LocalDateTime;

public class Viking {
    private String name;
    private String description;
    private String origin;
    private LocalDateTime dateOfOrigin;

    private Beer beer;

    public Viking() {

    }

    public Viking(String name, String description, String origin, LocalDateTime dateOfOrigin, Beer matchingBeer) {
        setName(name);
        setDescription(description);
        setOrigin(origin);
        setDateOfOrigin(dateOfOrigin);
        setBeer(matchingBeer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDateTime getDateOfOrigin() {
        return dateOfOrigin;
    }

    public void setDateOfOrigin(LocalDateTime dateOfOrigin) {
        this.dateOfOrigin = dateOfOrigin;
    }

    public Beer getBeer() {
        return beer;
    }

    public void setBeer(Beer beer) {
        this.beer = beer;
    }

    @Override
    public String toString() {
        return "Viking{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", origin='" + origin + '\'' +
                ", dateOfOrigin=" + dateOfOrigin +
                ", beer=" + beer +
                '}';
    }
}
