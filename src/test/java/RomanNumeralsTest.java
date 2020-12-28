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

    @Test
    void romanNumerals_should_add_a_second_I_from_1_to_2() {
        assertEquals("II", romanNumerals.convertToNumber(2));
    }

    @Test
    void romanNumerals_should_work_with_larger_number_till_38() {
        assertEquals("XXXVIII",romanNumerals.convertToNumber(38) );
    }
    @Test
    void romanNumerals_should_work_with_lower_number_till_39() {
        assertEquals("XXXIX",romanNumerals.convertToNumber(39) );
    }

    @Test
    void romanNumerals_should_work_with_L_on_50() {
        assertEquals("L", romanNumerals.convertToNumber(50));
    }

    @Test
    void romanNumerals_should_return_XL_on_40() {
        assertEquals("XL", romanNumerals.convertToNumber(40));
    }

    @Test
    void romanNumerals_should_return_C_on_100() {
        assertEquals("C", romanNumerals.convertToNumber(100));
    }

    @Test
    void romanNumerals_should_work_with_359() {
        assertEquals("CCCLIX", romanNumerals.convertToNumber(359));
    }
}