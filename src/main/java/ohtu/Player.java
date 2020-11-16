
package ohtu;

public class Player {
    private String name, nationality, team;
    private int assists,goals,penalties,games;


    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getAssists() {
        return assists;
    }

    public void setGoals(int goals) {
        this.goals= goals;
    }

    public int getGoals() {
        return goals;
    }

    public void setPenalties(int penalties) {
        this.penalties= penalties;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setGames(int games) {
        this.games= games;
    }

    public int getGames() {
        return games;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String ret = getName() + " team " + getTeam() + " goals " + String.valueOf(getGoals()) + " assists " + String.valueOf(getAssists());
        return ret;
    }

}
