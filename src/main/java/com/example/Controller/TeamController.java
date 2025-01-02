package com.example.Controller;

import com.example.Entity.Player;
import com.example.Entity.Team;
import com.example.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamService teamService;


    @PostMapping("/addteam")
    public String addTeam(@RequestBody Team team){
        return teamService.addTeam(team);
    }

    @PostMapping("/addmultipleteams")
    public String addMultiples(@RequestBody List<Team> teams){
        return teamService.addMultiples(teams);
    }

    @GetMapping("/teamplayers/{id}")
    public List<Player> getAllTeamPlayers(@PathVariable int id){
        return teamService.getTeamPlayers(id);
    }
}
