package com.example.DAO;

import com.example.Entity.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PlayerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public String addPlayer(Player player) {
        Session session = sessionFactory.openSession();
        session.save(player);
        session.getTransaction().commit();
        return "Player added successfully into the account ";
    }

    @Transactional
    public String addMultiplePlayers(List<Player> players) {
        int cnt = 0;
        try{
            Session session = sessionFactory.openSession();

            for(Player player : players){
                session.save(player);
                cnt++;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        return cnt+" Players added successfully";
    }
}
