package com.yapro.task1.Data;

public class Prize {
    private int id = -1;
    private String description = null;

    public Prize(){}

    public Prize(int id, String description) {
        this.id = id;
        this.description = description;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
