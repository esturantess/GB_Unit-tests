package hw3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class EvenOddNumberTest {

    EvenOddNumber evenOddNumber = new EvenOddNumber();

    @Test
    void evenNumberTest() {
        assertThat(evenOddNumber.evenOddNumber(2)).isEqualTo(true);
    }

    @Test
    void oddNumberTest() {
        assertThat(evenOddNumber.evenOddNumber(1)).isEqualTo(false);
    }
}
