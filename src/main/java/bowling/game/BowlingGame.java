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
            if (isSpare(currentRoll)) {
                score += calculateSpareScore(currentRoll);
            } else {
                score += calculateOpenFrameScore(currentRoll);
            }
            currentRoll += 2;
        }
        return score;
    }

    private int calculateOpenFrameScore(int currentRoll) {
        return rolls[currentRoll] + rolls[currentRoll + 1];
    }

    private int calculateSpareScore(int currentRoll) {
        return 10 + rolls[currentRoll + 2];
    }

    private boolean isSpare(int currentRoll) {
        return rolls[currentRoll] + rolls[currentRoll + 1] == 10;
    }
}
