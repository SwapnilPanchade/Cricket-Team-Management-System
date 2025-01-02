package com.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teamId;

    private String teamName;
//    private List<Player> playerList;
    private int totalMatches;
    private int totalWins;
    private int totalLosses;

//
//    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
//    private List<MatchRecord> matchRecords;
}
