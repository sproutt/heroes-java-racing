import game.Game;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameTest {
    @Test
    public void 차대수_음수_입력값_테스트() {
        assertThatThrownBy(() -> new Game(-1, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("[ERROR]");
    }

    @Test
    public void 시도수_음수_입력값_테스트() {
        assertThatThrownBy(() -> new Game(3, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("[ERROR]");
    }

    @Test
    public void 랜덤_값_부여_테스트() {
        //given
        Game game = new Game(3,5);
        //when
        for (int i = 0; i < 5; i++) {
            int randomValue = game.createRandomValue();
            //then
            assertThat(randomValue >= 0 && randomValue <= 9).isTrue();
        }
    }
}