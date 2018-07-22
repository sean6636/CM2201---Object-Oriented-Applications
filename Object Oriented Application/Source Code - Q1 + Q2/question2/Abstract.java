abstract class Abstract {

    public Abstract() {

    }
    abstract void startGame() throws Exception;

    // Allows the random number to be passed to the either card or dice game
    abstract void randomGenerator(double randomChoice);

    abstract void gameIntro(); //intro for the different games

    abstract void getText();//provides text for winning/losing

    abstract void quickWin();
    

    // allows for intro of game, random number generated and two rolls of dice or two cards to be picked
    public void mainGame() throws Exception {
        RandomInterface r=new LinearCongruentialGenerator();

        gameIntro(); 
        
        for (int i=0; i<2; i++) {
            getText();
            UserInput.getInput();
            double randomChoice = r.next();
            randomGenerator(randomChoice);
            quickWin();
        }
    }

    abstract void declareWinner();
}