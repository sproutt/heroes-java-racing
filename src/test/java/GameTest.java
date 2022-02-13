import game.Game;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameTest {
    @Test
    public void 자동차수가_음수가_입력되었을때_예외를_던진다() {
        assertThatThrownBy(() -> new Game(-1, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("[ERROR]");
    }

    @Test
    public void 시도수가_음수가_입력되었을때_예외를_던진다() {
        assertThatThrownBy(() -> new Game(3, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("[ERROR]");
    }

    @Test
    public void 랜덤값이_주어졌을때_0이상_9사이인지_테스트한다() {
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