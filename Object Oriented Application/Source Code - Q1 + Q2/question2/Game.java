import java.io.*;
import java.util.*;

public class Game {

        //begins game
    public static void playGame(String game) throws Exception {
        //Gets input from 'Factory.java' - either card or die game
        Abstract newGame = Factory.newGame(game);
        newGame.startGame();
        newGame.mainGame();
        newGame.declareWinner();
    }


    public static void main (String[] args) throws Exception { //main function, initiated when the file is run
        System.out.print("Type (c) to play the Card game and (d) to play the Die game! ");
        String gameChoice = UserInput.getInput();
        playGame(gameChoice);
}


}