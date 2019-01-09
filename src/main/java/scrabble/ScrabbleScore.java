package scrabble;

public class ScrabbleScore {

    private final String word;

    public ScrabbleScore(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getScore() {
        int score = 0;
        char[] scrabbleWordArray = word.toLowerCase().toCharArray();

        for (char a : scrabbleWordArray) {
            score += scoreFor(a);
        }

        return score;
    }

    int scoreFor(char letter) {
        switch(letter) {
            case 'd':
            case 'g':
                return 2;

            case 'b':
            case 'c':
            case 'm':
            case 'p':
                return 3;

            case 'f':
            case 'h':
            case 'v':
            case 'w':
            case 'y':
                return 4;

            case 'k':
                return 5;

            case 'j':
            case 'x':
                return 8;

            case 'z':
            case 'q':
                return 10;

            default:
                return 1;
        }
    }
}