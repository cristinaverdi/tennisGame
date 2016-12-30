
public class Player {

    private String name;
    private PlayerPerformance performance;
    private Score score;

    public Player(String name, PlayerPerformance performance ) {
        this.name = name;
        this.performance = performance;
        this.score = new Score();
    }



    public String getName() {
        return name;
    }

    public PlayerPerformance getPerformance() {
        return performance;
    }

    public Score getScore() {
        return score;
    }

}
