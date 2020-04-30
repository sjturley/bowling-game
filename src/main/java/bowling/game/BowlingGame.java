package bowling.game;

public class BowlingGame {
    int[] rolls = new int[21];
    int rollIndex;

    public void roll(int pins) {
        rolls[rollIndex] = pins;
        rollIndex++;
    }

    public int score() {
        int score = 0;
        int currentRoll = 0;
        for (int frame = 0; frame < 10; frame++) {
            score += rolls[currentRoll] + rolls[currentRoll + 1];
        }
        return score;
    }
}
