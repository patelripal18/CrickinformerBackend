package com.crick.apis.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "crick_matches")
public class Match {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;
    private String matchNumberVenue;
    private String bttingTeam;
    private String bettingTeamScore;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;

    private String matchlink;

    private String textcomplete;

    @Enumerated
    private MatchStatus status;
    private Date date = new Date();

    public Match(int matchId, String teamHeading, String matchNumberVenue, String bttingTeam, String bettingTeamScore, String bowlTeam, String bowlTeamScore, String liveText, String matchlink, String textcomplete, MatchStatus status, Date date) {
        this.matchId = matchId;
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.bttingTeam = bttingTeam;
        this.bettingTeamScore = bettingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.liveText = liveText;
        this.matchlink = matchlink;
        this.textcomplete = textcomplete;
        this.status = status;
        this.date = date;
    }

    public Match() {
    }
     //set the match status according to textcomplete

    public void setMatchStatus(){
        if(textcomplete.isBlank()){
            this.status= MatchStatus.LIVE;
        }else {
            this.status= MatchStatus.COMPLETED;
        }
    }
    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public String getBttingTeam() {
        return bttingTeam;
    }

    public void setBttingTeam(String bttingTeam) {
        this.bttingTeam = bttingTeam;
    }

    public String getBettingTeamScore() {
        return bettingTeamScore;
    }

    public void setBettingTeamScore(String bettingTeamScore) {
        this.bettingTeamScore = bettingTeamScore;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getMatchlink() {
        return matchlink;
    }

    public void setMatchlink(String matchlink) {
        this.matchlink = matchlink;
    }

    public String getTextcomplete() {
        return textcomplete;
    }

    public void setTextcomplete(String textcomplete) {
        this.textcomplete = textcomplete;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setBattingTeam(String battingTeam) {
        this.bttingTeam = battingTeam;
    }

    public void setBattingTeamScore(String score) {
        
    }

    public void setMatchLink(String matchLink) {
    }

    public void setTextComplete(String textComplete) {
    }
}
