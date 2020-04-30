package bowling.game;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class BowlingGameTest {
    BowlingGame bowlingGame = new BowlingGame();

    @Test
    public void whenRollingAllGutterBallsThenScoreIsZero() {
        rollManyTimes(20, 0);

        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void whenKnockingDownOnePinPerRollThenScoreIsTwenty() {
        rollManyTimes(20, 1);

        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void whenRollingASpareThenScoreIsTenPlusNextRoll() {
        bowlingGame.roll(3);
        bowlingGame.roll(7);

        bowlingGame.roll(7);
        rollManyTimes(17, 0);

        assertEquals(24, bowlingGame.score());
    }

    private void rollManyTimes(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            bowlingGame.roll(pins);
        }
    }
}
