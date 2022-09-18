package leetcode.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindNumbersWithEvenNumberOfDigitsndNumbersWithEvenNumberOfDigitsTest {

    private FindNumbersWithEvenNumberOfDigitsndNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigitsndNumbersWithEvenNumberOfDigitsUnderTest;

    @BeforeEach
    void setUp() {
        findNumbersWithEvenNumberOfDigitsndNumbersWithEvenNumberOfDigitsUnderTest = new FindNumbersWithEvenNumberOfDigitsndNumbersWithEvenNumberOfDigits();
    }

    @Test
    void testFindNumbers() {
        assertThat(findNumbersWithEvenNumberOfDigitsndNumbersWithEvenNumberOfDigitsUnderTest.findNumbers(
                new int[]{0})).isEqualTo(0);
    }

    @Test
    void testMain() {
        // Setup
        // Run the test
        FindNumbersWithEvenNumberOfDigitsndNumbersWithEvenNumberOfDigits.main(new String[]{"args"});

        // Verify the results
    }
}
