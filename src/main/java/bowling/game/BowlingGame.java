package bowling.game;

public class BowlingGame {
    int score;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
