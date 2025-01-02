package com.example.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;
    private String playerName;
    @ManyToOne
    @JoinColumn(name = "teamId", nullable = false)
    private Team team;


    private int totalRuns;
    private int totalMatches;
    private double playerAvg;

    //! got a suggetion from the ChatGpt for avg
    //? Writing the logic below to update the average everytime
    public void updatePlayerAvg(){
        if(totalMatches>0){
            this.playerAvg = Math.round(((double) this.totalRuns / totalMatches)*100)/100;

        }else this.playerAvg = 0.0;
    }

    public void setTotalRuns(int totalRuns){
        this.totalRuns = totalRuns;
        updatePlayerAvg();
    }

    public void setTotalMatches(int totalMatches){
        this.totalMatches = totalMatches;
        updatePlayerAvg();
    }
}
