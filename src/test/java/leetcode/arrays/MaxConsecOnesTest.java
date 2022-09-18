package leetcode.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxConsecOnesTest {

    private MaxConsecOnes maxConsecOnesUnderTest;

    @BeforeEach
    void setUp() {
        maxConsecOnesUnderTest = new MaxConsecOnes();
    }

    @Test
    void testFindMaxConsecutiveOnes() {
        assertThat(maxConsecOnesUnderTest.findMaxConsecutiveOnes(new int[]{0})).isEqualTo(0);
    }

    @Test
    void testFastersol() {
        assertThat(maxConsecOnesUnderTest.fastersol(new int[]{0})).isEqualTo(0);
    }

    @Test
    void testMain() {
        // Setup
        // Run the test
        MaxConsecOnes.main(new String[]{"args"});

        // Verify the results
    }
}
