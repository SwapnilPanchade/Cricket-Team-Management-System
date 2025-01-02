package com.example.Entity;

import lombok.Data;
import org.hibernate.annotations.SQLDeleteAll;
import org.springframework.web.bind.annotation.DeleteMapping;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity
@Data
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;


    @ManyToOne
    @JoinColumn(name = "team1ID", nullable = false)
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "team2Id", nullable = false)
    private Team team2;

    private String result;
    private int team1Score = 0;
    private int team2Score = 0;

}
