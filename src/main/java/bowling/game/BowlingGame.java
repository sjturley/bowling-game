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
            if (rolls[currentRoll] + rolls[currentRoll + 1] == 10) {
                score += 10 + rolls[currentRoll + 2];
            } else {
                score += rolls[currentRoll] + rolls[currentRoll + 1];
            }
            currentRoll += 2;
        }
        return score;
    }
}
