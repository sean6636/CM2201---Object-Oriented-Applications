import java.io.*;
import java.util.*;

class CardGame extends Abstract {
    private static ArrayList<String> allCards;
    private static HashSet<String> chosenCards;
    RandomInterface r=new LinearCongruentialGenerator();

    public CardGame() {
        this.chosenCards = new HashSet<String>();
    }

    void gameIntro(){
        System.out.println("");
        System.out.println("-----Welcome to the Card Game!-----");
        System.out.println("Get an Ace to win!");
    }

    void startGame() throws Exception {
        // The initialisation phase:
        // Create a list of cards ... and shuffle them
        String cards[]={"AHrts", "2Hrts", "3Hrts", "4Hrts", "5Hrts", "6Hrts",
                "7Hrts", "8Hrts", "9Hrts", "10Hrts", "JHrts",
                "QHrts", "KHrts",
                "ADmnds", "2Dmnds", "3Dmnds", "4Dmnds", "5Dmnds",
                "6Dmnds", "7Dmnds", "8Dmnds", "9Dmnds", "10Dmnds",
                "JDmnds", "QDmnds", "KDmnds",
                "ASpds", "2Spds", "3Spds", "4Spds", "5Spds", "6Spds",
                "7Spds", "8Spds", "9Spds", "10Spds", "JSpds",
                "QSpds", "KSpds",
                "AClbs", "2Clbs", "3Clbs", "4Clbs", "5Clbs", "6Clbs",
                "7Clbs", "8Clbs", "9Clbs", "10Clbs", "JClbs",
                "QClbs", "KClbs"};
        this.allCards = new ArrayList<String> (Arrays.asList(cards));
        // Taking advantage of "generics" to tell the compiler all the elements will be Strings

        // cards are shuffled
        for (int i=0; i<100; i++) {
            // choose two random cards at random
            int firstIndex=((int) (r.next() * 52));
            int secondIndex=((int) (r.next() * 52));
            String temp=(String) allCards.get(firstIndex);
            allCards.set(firstIndex, allCards.get(secondIndex));
            allCards.set(secondIndex, temp);
        }

        // Print rest of cards
        System.out.println(allCards);
    }

    void randomGenerator(double randomChoice) {
        int cardChoice= (int)(randomChoice * allCards.size());
        System.out.println("You chose " + allCards.get(cardChoice));
        chosenCards.add(allCards.remove(cardChoice));
    }

    void getText() {
        System.out.println("Press <RETURN> to choose a card");
    }

    void quickWin(){
        if (chosenCards.contains("AHrts") || chosenCards.contains("ADmnds") ||
                chosenCards.contains("ASpds") || chosenCards.contains("AClbs")){
            declareWinner();
            System.exit(0);
    }
    }
    
    void declareWinner() {
 

        // User wins if one of them is an Ace
        System.out.println("The Cards that have been chosen are: " + chosenCards);
        System.out.println("The Remaining cards are: " + allCards);
        
        if (chosenCards.contains("AHrts") || chosenCards.contains("ADmnds") ||
                chosenCards.contains("ASpds") || chosenCards.contains("AClbs")) {
            System.out.println("\nCONGRATULATIONS YOU HAVE WON!");
        }
        else System.out.println("\nSorry, you have lost!");
    }
}