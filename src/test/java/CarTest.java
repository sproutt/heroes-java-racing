import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    public void testCarNameIsValid() {
        assertThat(new Car("magmaX").getName()).isEqualTo("Unnamed Car 1");
        assertThat(new Car("ionX").getName()).isEqualTo("ionX");
    }
}