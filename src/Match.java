

import java.util.Random;

public class Match {
    private Player player1;
    private Player player2;

    private Random random;
    private Player  winner;
    private Player loser;

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();

    }

    /**
     * Plays Ball until there is a winner.
     * Prints scores to the console.
     */
    public void start() {


        while (!thereIsWinner()) {
            playBall();
            System.out.println(player1.getScore().toString() + " - " + player2.getScore().toString());
        }
    }

    /**
     * return wheter there is a winner in the match.
     * @return
     */
    private boolean thereIsWinner() {

        return player1.getScore().getSets() == 2 || player2.getScore().getSets() == 2;
    }

    /**
     * Simulates a ball in play,
     * 1- decides the player that wins the ball,
     * 2- and updates the scores.
     */

    //Secuencia, bucle o control de flujo.

    private void playBall() {

        whoServes();
        incrementPoints();
        incrementGames();
        incrementSets();

    }

    private void incrementSets() {
        int gamesWinner = winner.getScore().getGames();
        int gamesLoser = loser.getScore().getGames();

        if (gamesWinner == 6 && gamesLoser == 6) {
            tieBreak();
            winner.getScore().setPoints(0);
            winner.getScore().setGames(0);
            loser.getScore().setPoints(0);
            loser.getScore().setGames(0);
            System.out.println("Tie Break set for: " + winner.getName());

        } else if (gamesWinner >= 6 && gamesWinner - gamesLoser >= 2) {
            winner.getScore().incrementSet();
            winner.getScore().setGames(0);
            loser.getScore().setGames(0);
            System.out.println("Set for: " + winner.getName() );
        }
    }

    private void incrementGames() {
        int pointsWinner = winner.getScore().getPoints();
        int pointsLoser = loser.getScore().getPoints();

        if ( pointsWinner >= 4 && pointsWinner -pointsLoser >= 2 ) {
            winner.getScore().incrementGames();
            winner.getScore().setPoints(0);
            loser.getScore().setPoints(0);
            System.out.println("Game for: " + winner.getName());
        }
    }

    /**
     * Prints scores to the console.
     * Decides a winner for each round.
     * Increments winner's points  score by one until winner's points
     * is greater or equal to 7 and it's score points is at least two points greater.
     * Then, Increments winner's set score by one.
     */
    private void tieBreak() {
        System.out.println("Tie Break starts");
        System.out.println(player1.getScore().toString() + " - " + player2.getScore().toString());

        whoServes();
        int pointsWinner = winner.getScore().getPoints();
        int pointsLoser = loser.getScore().getPoints();


        while( !(pointsWinner >=7 && (pointsWinner - pointsLoser) >=2) ) {
            whoServes();
            pointsWinner =  winner.getScore().incrementPointsTieBreak();
            winner.getScore().getPoints();
            loser.getScore().getPoints();
            System.out.println(player1.getScore().toString() + " - " + player2.getScore().toString());
        }
        winner.getScore().incrementSet();

        System.out.println(winner.getName() + " wins, tieBreak ends");


    }

    private void incrementPoints() {
        winner.getScore().incrementPoints();
    }

    /**
     * Decides whether winner is player1 or player2.
     * @return
     */
    private Player whoServes() {
        int result = random.nextInt(2);

        if (result == 0 ) {
            winner = player1;
            loser = player2;
            return winner;

        } else {
            winner = player2;
            loser = player1;
            return winner;
        }

    }



}

