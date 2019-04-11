package domain;

import java.time.LocalDateTime;

public class Viking {
    private String name;
    private String description;
    private Origin origin;
    private LocalDateTime dateOfOrigin;

    public Viking() {

    }

    public Viking(String name, String description, Origin origin) {
        setName(name);
        setDescription(description);
        setOrigin(origin);
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

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public LocalDateTime getDateOfOrigin() {
        return dateOfOrigin;
    }

    public void setDateOfOrigin(LocalDateTime dateOfOrigin) {
        this.dateOfOrigin = dateOfOrigin;
    }

    @Override
    public String toString() {
        return "Viking{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", origin=" + origin +
                ", dateOfOrigin=" + dateOfOrigin +
                '}';
    }
}
