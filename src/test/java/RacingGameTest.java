import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RacingGameTest {
    @Test
    public void testRacingCarNameValid() {
        RacingGame racingGame = new RacingGame("ionX, magmaX, plasmaXPT", 5);
        assertThat(racingGame.getRacingCarNames()).isEqualTo("ionX, Unnamed Car 1, Unnamed Car 2");
    }
}