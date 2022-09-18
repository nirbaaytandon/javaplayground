package leetcode.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareOfSortedArrayTest {

    private SquareOfSortedArray squareOfSortedArrayUnderTest;

    @BeforeEach
    void setUp() {
        squareOfSortedArrayUnderTest = new SquareOfSortedArray();
    }

    @Test
    void testSortedSquares() {
        assertThat(squareOfSortedArrayUnderTest.sortedSquares(new int[]{0})).isEqualTo(new int[]{0});
        assertThat(squareOfSortedArrayUnderTest.sortedSquares(new int[]{0})).isEqualTo(new int[]{});
    }

    @Test
    void testSortedSquares2() {
        assertThat(squareOfSortedArrayUnderTest.sortedSquares2(new int[]{0})).isEqualTo(new int[]{0});
        assertThat(squareOfSortedArrayUnderTest.sortedSquares2(new int[]{0})).isEqualTo(new int[]{});
    }
}
