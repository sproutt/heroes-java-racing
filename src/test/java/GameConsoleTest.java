import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameConsoleTest {

    @Test
    public void 랜덤_값_부여_테스트() {
        //given
        GameConsole gameConsole = new GameConsole();

        //when
        for (int i = 0; i < 5; i++) {
            int randomValue = gameConsole.createRandomValue();
            //then
            assertThat(randomValue >= 0 && randomValue <= 9).isTrue();
        }
    }
}