import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @BeforeEach
    void setUp() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    void romanNumerals_should_return_no_value_on_0() {
        assertEquals("", romanNumerals.convertToNumber(0));
    }

    @ParameterizedTest
    @CsvSource({
            "I,1", "II,2", "III,3", "IV,4", "V,5",
            "VI,6", "VII,7", "VIII,8", "IX,9", "X,10",
            "XX,20", "XXX,30", "XL,40", "L,50",
            "LX,60","LXX,70","LXXX,80","XC,90","C,100"
    })
    void romanNumerals_should_return_correct_values_from_1_to_100(String result, int arabic) {
        assertEquals(result, romanNumerals.convertToNumber(arabic));
    }

    @Test
    void romanNumerals_should_work_with_359() {
        assertEquals("CCCLIX", romanNumerals.convertToNumber(359));
    }
}