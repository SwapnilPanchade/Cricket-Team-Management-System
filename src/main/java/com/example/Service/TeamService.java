package com.example.Service;

import com.example.DAO.TeamDao;
import com.example.Entity.Player;
import com.example.Entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamDao teamDao;

    public String addTeam(Team team) {
        return teamDao.addTeam(team);
    }

    public String addMultiples(List<Team> teams) {
        return teamDao.addMultiples(teams);
    }

    public List<Player> getTeamPlayers(int id) {
        return teamDao.getTeamPlayers(id);
    }
}
