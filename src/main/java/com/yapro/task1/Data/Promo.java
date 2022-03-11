package com.yapro.task1.Data;

import java.util.ArrayList;
import java.util.List;

public class Promo {

    private int id = -1;
    private String name = null;
    private String description = null;
    private List<Prize> prizes;
    private List<Participant> participants;

    public Promo() {
        this.prizes = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public Promo(int id, String name, String description) {
        this.id = id;
        this.description = description;
        this.name = name;

        this.prizes = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public Promo(int id, String description, String name, List<Prize> prizes, List<Participant> participants) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.prizes = prizes;
        this.participants = participants;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Prize> prizes) {
        this.prizes = prizes;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
