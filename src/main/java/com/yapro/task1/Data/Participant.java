package com.yapro.task1.Data;

public class Participant {

    private int id = -1;
    private String name = null;

    public Participant(){}

    public Participant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
