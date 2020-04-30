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
            if (isStrike(currentRoll)) {
              score += calculateStrikeScore(currentRoll);
                currentRoll += 1;
            } else if (isSpare(currentRoll)) {
                score += calculateSpareScore(currentRoll);
                currentRoll += 2;
            } else {
                score += calculateOpenFrameScore(currentRoll);
                currentRoll += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int currentRoll) {
        return rolls[currentRoll] == 10;
    }

    private int calculateStrikeScore(int currentRoll) {
        return 10 + rolls[currentRoll + 1] + rolls[currentRoll + 2];
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
