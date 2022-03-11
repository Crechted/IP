package com.yapro.task1.Data;

public class Result {
    private Participant participant = null;
    private Prize prize = null;

    public Result(){}

    public Result(Participant participant, Prize prize){
        this.participant = participant;
        this.prize = prize;
    }

    //Getters ans Setters
    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Prize getPrize() {
        return prize;
    }

    public void setPrize(Prize prize) {
        this.prize = prize;
    }
}
