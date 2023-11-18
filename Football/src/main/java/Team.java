import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team{
    private String teamId;
    private String teamName;
    private String establishmentYear;
    @JacksonXmlElementWrapper(useWrapping=false)
    private Footballer[] players;
    private String coach;

    public Team() {
    }

    public Team(String teamId, String teamName, String establishmentYear, Footballer[] players, String coach) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.establishmentYear = establishmentYear;
        this.players = players;
        this.coach = coach;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(String establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId='" + teamId + '\'' +
                ", teamName='" + teamName + '\'' +
                ", establishmentYear='" + establishmentYear + '\'' +
                ", players=" + Arrays.toString(players) +
                ", coach='" + coach + '\'' +
                '}';
    }
}

