package com.comision5.salvo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
public class GamePlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private Date joinDate;
    private long gameID;
    private long playerID;

    public GamePlayer(){}

    public GamePlayer(long id, Date joinDate, long gameID, long playerID) {
        this.id = id;
        this.joinDate = joinDate;
        this.gameID = gameID;
        this.playerID = playerID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public long getGameID() {
        return gameID;
    }

    public void setGameID(long gameID) {
        this.gameID = gameID;
    }

    public long getPlayerID() {
        return playerID;
    }

    public void setPlayerID(long playerID) {
        this.playerID = playerID;
    }
}
