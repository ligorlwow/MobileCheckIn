package models;

/**
 * Created by Igor Sychev on 03.11.14.
 */
public class Named {
    public String name;
    public boolean deleted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
