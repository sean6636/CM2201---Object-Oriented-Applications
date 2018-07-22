import java.io.*;
import java.util.*;

public class UserInput {
    // Used to get input from user to be used throughout program
    public static String getInput() throws Exception {
        // The BufferedReader used throughout
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}