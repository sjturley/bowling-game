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
        for (int i = 0; i < 21; i++) {
            if (rolls[i] + rolls[i + 1] == 10) {
                score += 10 + rolls[i + 2];
            } else {
                score += rolls[i];
            }
        }
        return score;
    }
}
