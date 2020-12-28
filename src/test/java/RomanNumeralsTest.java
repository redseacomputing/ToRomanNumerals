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

    @ParameterizedTest
    @CsvSource({
            "CC,200","CCC,300","CCCXXX,330","CD,400","CDXL,440",
            "D,500","DL,550","DC,600","DCLX,660","DCC,700",
            "DCCLXX,770","DCCC,800", "DCCCLXXX,880", "CM,900","CMXC,990",
            "M,1000","MM,2000","MMM,3000","MMMCMXCIX, 3999"
    })
    void romanNumerals_should_return_correct_values_from_200_to_3999(String expected, int arabic) {
        assertEquals(expected, romanNumerals.convertToNumber(arabic) );
    }

}