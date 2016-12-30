
public class Score {
    private int sets;
    private int games;
    private int points;

    public Score() {
        this.sets = 0;
        this.games = 0;
        this.points = 0;
    }

    public void incrementPoints() {
        this.points++;
    }

    public int incrementPointsTieBreak() {
        return this.points++;
    }

    public void incrementGames() {
        this.games++;
    }

    public void incrementSet() {
        this.sets++;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGames(int games) {
        this.games = games;
    }


    public int getPoints() {
        return points;
    }

    public int getGames() {
        return games;
    }

    public int getSets() {
        return sets;
    }


    public String toString() {
        return sets + ", " + games + ", " + points;
    }
}
