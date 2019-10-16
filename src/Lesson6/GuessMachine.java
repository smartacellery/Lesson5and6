package Lesson6;

public class GuessMachine {

    private int num;
    private int numguesses;
    private int guess;

    
    public GuessMachine() {
        guess = 0;
        numguesses = 0;
         num=(int)(Math.random()*100)+1;
    }

    public String giveHint() {
        if (guess > num) {
            return "Your guess is too high";
        } else if (guess < num) {
            return "Your guess is too low";
        } else {
            return "You got it right!!";
        }

    }

    public boolean setGuess(int nu) {
        boolean guessok = (nu >= 1 && nu <= 100);
        if (guessok) {
            guess = nu;
            numguesses++;
            return true;
        } else {
            return false;
        }
    }

    public int getnumGuesses() {
        return numguesses;
    }
    
    
    
}



