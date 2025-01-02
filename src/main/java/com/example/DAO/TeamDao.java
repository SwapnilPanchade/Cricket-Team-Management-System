package com.example.DAO;

import com.example.Entity.Player;
import com.example.Entity.Team;
import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class TeamDao {

    @Autowired
    private SessionFactory sessionFactory;

    public String addTeam(Team team) {
        try{
            Session session = sessionFactory.openSession();
            session.save(team);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.err.println("Team added successfully");
        }


        return "Team added successfully";
    }

    @Transactional
    public String addMultiples(List<Team> teams) {
        int cnt=0;
        try{
            Session session = sessionFactory.openSession();

            for(Team team: teams){
                session.save(team);
                cnt++;
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return cnt+" teams added successfully";
    }

    public List<Player> getTeamPlayers(int id) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Player.class);

         return criteria.add(Restrictions.eq("team.teamId", id)).list();

    }
}
