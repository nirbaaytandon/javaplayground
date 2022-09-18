package leetcode.competitions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrappingRainWaterTwoTest {

    private TrappingRainWaterTwo trappingRainWaterTwoUnderTest;

    @BeforeEach
    void setUp() {
        trappingRainWaterTwoUnderTest = new TrappingRainWaterTwo();
    }

    @Test
    void testTrapRainWater() {
        // Setup
        final int[][] heightMap = new int[][]{{0}};

        // Run the test
        final int result = trappingRainWaterTwoUnderTest.trapRainWater(heightMap);

        // Verify the results
        assertThat(result).isEqualTo(0);
    }
}
