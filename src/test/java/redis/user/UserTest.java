package redis.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    private User userUnderTest;

    @BeforeEach
    void setUp() {
        userUnderTest = new User();
    }

    @Test
    void testToString() {
        assertThat(userUnderTest.toString()).isEqualTo("result");
    }

    @Test
    void testEquals() {
        assertThat(userUnderTest.equals("o")).isFalse();
    }

    @Test
    void testCanEqual() {
        assertThat(userUnderTest.canEqual("other")).isFalse();
    }

    @Test
    void testHashCode() {
        assertThat(userUnderTest.hashCode()).isEqualTo(0);
    }
}
