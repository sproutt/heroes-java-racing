package util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class RandomNumberGeneratorTest {
    @Test
    public void 영에서9까지의_난수_1개를_생성한다() {
        for (int i = 0; i < 50; i++) {
            assertTrue(isInRange(RandomNumberGenerator.createOneRandomNumber()));
        }
    }

    private boolean isInRange(int number) {
        if (number > 0 && number <= 9) {
            return true;
        }
        return false;
    }

    @Test
    public void 영에서9까지_난수_여러개_리스트를생성한다() {
        assertThat(RandomNumberGenerator.createRandomNumbers(2).size(), equalTo(2));
        assertThat(RandomNumberGenerator.createRandomNumbers(4).size(), equalTo(4));
        assertThat(RandomNumberGenerator.createRandomNumbers(5).size(), equalTo(5));
    }
}