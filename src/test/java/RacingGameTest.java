import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class RacingGameTest {
    @Test
    public void 유효하지_않은_경주차_이름_있을때_테스트() {
        RacingGame racingGame = new RacingGame("ionX, magmaX, solid", 4);
        assertThat(racingGame.getRacingCarNames()).isEqualTo(Arrays.asList("ionX", "solid"));
    }
}