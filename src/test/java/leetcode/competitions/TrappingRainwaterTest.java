package leetcode.competitions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrappingRainwaterTest {

    @Test
    void testTrap() {
        assertThat(TrappingRainwater.trap(new int[]{0})).isEqualTo(0);
    }

    @Test
    void testMain() {
        // Setup
        // Run the test
        TrappingRainwater.main(new String[]{"args"});

        // Verify the results
    }
}
