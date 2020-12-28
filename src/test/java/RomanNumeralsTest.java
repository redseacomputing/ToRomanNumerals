import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @BeforeEach
    void setUp() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    void test_method_exists() {
        assertEquals("", romanNumerals.convertToNumber(0));
    }

    @Test
    void romanNumerals_should_return_I_on_1() {
        assertEquals("I", romanNumerals.convertToNumber(1));
    }

    @Test
    void romanNumerals_should_return_V_on5() {
        assertEquals("V", romanNumerals.convertToNumber(5));
    }

    @Test
    void romanNumerals_should_return_X_on_10() {
        assertEquals("X", romanNumerals.convertToNumber(10));
    }

    @Test
    void romanNumerals_should_return_IX_on_9() {
        assertEquals("IX", romanNumerals.convertToNumber(9));
    }

    @Test
    void romanNumerals_should_return_IV_on_4() {
        assertEquals("IV", romanNumerals.convertToNumber(4));
    }

}