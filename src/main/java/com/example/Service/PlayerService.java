package com.example.Service;

import com.example.DAO.PlayerDao;
import com.example.Entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public String addPlayer(Player player) {
        return playerDao.addPlayer(player);
    }

    public String addMultiplePlayers(List<Player> players) {
        return playerDao.addMultiplePlayers(players);
    }
}
