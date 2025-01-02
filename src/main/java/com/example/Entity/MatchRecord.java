package com.example.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.IdentityHashMap;

@Entity
@Data
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;

    @ManyToOne
    @JoinColumn(name = "teamId", nullable = false)
    private Team team;

    private int matchId;
    private int runsScord;
    private boolean isWin;

}
