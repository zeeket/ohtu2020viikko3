
package ohtu;

public class Player implements Comparable<Player>{
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

   public int compareTo(Player p) {
       int myPoints = this.goals + this.assists;
       int theirPoints = p.goals + p.assists;
      return Integer.compare(myPoints,theirPoints);
   }

    public int compare(Player p, Player p1) {
      return (p.goals+p.assists) - (p1.goals+p1.assists);
    }

    @Override
    public String toString() {
        String ret = getName() + "  " + getTeam() + "  " + String.valueOf(getGoals()) + " + " + String.valueOf(getAssists())+" = " + String.valueOf(getGoals()+getAssists());
        return ret;
    }

}
