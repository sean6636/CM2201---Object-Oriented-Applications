import java.io.*;
import java.util.*;

public class Factory {

public static Abstract newGame(String id) {
        
    if(id.equals("d")){
        return new DiceGame();
    } 
    else if(id.equals("c")){
        return new CardGame();
    } 
    else {

        System.out.println("\n There is an Error! \n");
        System.out.println("Exiting Game");
        System.exit(0);
        return null;
    }

}
}



