package domain;

import java.time.LocalDateTime;

public class Viking {
    private String name;
    private String description;
    private String origin;
    private LocalDateTime dateOfOrigin;
    //private Beer beer; TODO: Each Beer has a Viking or each Viking has a beer, not both

    public Viking() {

    }

    public Viking(String name, String description, String origin, LocalDateTime dateOfOrigin) {
        setName(name);
        setDescription(description);
        setOrigin(origin);
        setDateOfOrigin(dateOfOrigin);
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
}
