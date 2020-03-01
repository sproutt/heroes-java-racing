package util;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RandomNumberGeneratorTest {

    private List<Integer> integers;

    @Before
    public void setup() {
        integers = RandomNumberGenerator.createIntegers(100, 10);
    }

    @Test
    public void createIntegersLengthTest() {
        assertEquals(integers.size(), 100);
    }

    @Test
    public void createIntegersLimitTest() {
        for (Integer integer : integers) {
            assertThat(integer).isLessThanOrEqualTo(9).isGreaterThanOrEqualTo(0);
        }
    }
}
