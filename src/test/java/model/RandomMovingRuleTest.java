package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomMovingRuleTest {

    MovingRule randomMovingRule;

    @BeforeEach
    void setUp() {
        randomMovingRule = new RandomMovingRule();
    }

    @Test
    @DisplayName("랜덤 수를 받을 때 수가 3 초과일 경우 참을 반환한다.")
    void testWhenIfNumberOverThreeReturnTrue() {
        assertThat(randomMovingRule.judge(4)).isEqualTo(true);
    }

    @Test
    @DisplayName("랜덤 수를 받을 때 수가 4 미만일 경우 거짓을 반환한다.")
    void testWhenIfNumberDownFourReturnFalse(){
        assertThat(randomMovingRule.judge(2)).isEqualTo(false);
    }
}