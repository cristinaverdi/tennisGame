import java.util.Random;

public class TennisMain {
    public static void main(String[] args) {
        //num sets, nun juegos, num puntos.
        // 1s 3g 30p
        //0s 4g 15p
        // 1:3:15
        // 1:5:30

        // si van 40 a 40, gana el juego quien marque dos puntos seguidos.
        //si can 6 a 6, gana el que haga dos juegos seguidos.
        //modalidad tie brak: si van 6 a 6, se juega el tie break:
        // sumas punto a punto y gana el que llegue a siete o más con dos de diferencia (ventaja).

        //si hay tres sets, gana el jugador que gane 2 sets
        //cada set son 6 juegs
        //cada juego haces puntos así: 0, 15, 30, 40, juego.
        //                             0, 1, 2, 3, 4

        //random indica quien ha ganado.



        Player player1 = new Player("Nadal", new PlayerPerformance( 7, 8, 10 ));
        Player player2 = new Player("Federer", new PlayerPerformance( 8, 9, 8 ));

        Match match = new Match(player1, player2);
        match.start();

       // match.tieBreak();

    }
}
