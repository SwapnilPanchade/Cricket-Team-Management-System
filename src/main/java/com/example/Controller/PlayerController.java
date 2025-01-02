package com.example.Controller;

import com.example.Entity.Player;
import com.example.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/addplayer")
    public String addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }

    @PostMapping("/addplayers")
    public String addMultiple(@RequestBody List<Player> players){
        return playerService.addMultiplePlayers(players);
    }
}
