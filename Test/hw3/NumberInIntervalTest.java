package hw3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;

public class NumberInIntervalTest {

    NumberInInterval numberInInterval = new NumberInInterval();

    @ParameterizedTest
    @ValueSource(ints = { 26, 99, 50, 27, 98 })
    void numberIsInInterval(int n) {
        assertThat(numberInInterval.numberInInterval(n)).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints = { 25, 100, 24, 101, -100, 350 })
    void numberIsNotInInterval(int n) {
        assertThat(numberInInterval.numberInInterval(n)).isEqualTo(false);
    }
}
