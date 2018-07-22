import java.io.*;
import java.util.*;

class DiceGame extends Abstract {
    private static HashSet<Integer> numRolled;

    public DiceGame() {
        this.numRolled = new HashSet<Integer>();
    }

    void startGame() throws Exception {
        return;
    }

    void gameIntro() {
        System.out.println("");
        System.out.println("-----Welcome to the Dice Game!-----");
        System.out.println("Roll a 1 to win!");
    }

    void randomGenerator(double randomChoice) {
        int dieRoll = (int)(randomChoice * 6) + 1;

        System.out.println("You rolled " + dieRoll);
        numRolled.add(new Integer(dieRoll));
    }

    void quickWin(){ //used so that if 1 is generated on first turn, the game ends and user wins
        if (numRolled.contains(new Integer(1))){
            declareWinner();
            System.exit(0);
    }
    }
    

    void declareWinner() { //used to find out whether the user has won or not
        // if number rolled is 1 then user wins, if not then user loses
        if (numRolled.contains(new Integer(1))) {
            System.out.println("\nCONGRATULATIONS YOU HAVE WON!");
        }
        else System.out.println("\nSorry, you have lost!");
    }

    void getText() {
        System.out.println("Press <RETURN> to roll the die");
    }
}