import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    public void 차이름_다섯글자_이하_테스트() throws OutOfLengthException {
        assertThat(new Car("ionX").getName()).isEqualTo("ionX");
        assertThat(new Car("KLX").getName()).isEqualTo("KLX");
    }

    @Test
    public void 차이름_다섯글자_초과_테스트() {
        assertThatThrownBy(() -> {
            new Car("magmaX");
        }).isInstanceOf(OutOfLengthException.class)
                .hasMessageContaining("The length of car name 'magmaX' is over 5. Length : 6");

        assertThatThrownBy(() -> {
            new Car("solidXPT");
        }).isInstanceOf(OutOfLengthException.class)
                .hasMessageContaining("The length of car name 'solidXPT' is over 5. Length : 8");

    }

    @Test
    public void move() throws OutOfLengthException {
        Car ionX = new Car("ionX");
        ionX.move(7);
        ionX.move(3);
        ionX.move(4);
        assertThat(ionX.getLastPosition()).isEqualTo(2);
    }

    @Test
    public void 모든_위치_저장되는지_테스트() throws OutOfLengthException {
        Car ionX = new Car("ionX");
        ionX.move(9);
        ionX.move(1);
        ionX.move(6);
        assertThat(ionX.getAllPositions()).isEqualTo(Arrays.asList(1, 1, 2));
    }
}