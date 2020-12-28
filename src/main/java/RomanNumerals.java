import com.github.chaosfirebolt.converter.RomanInteger;

public class RomanNumerals {

    enum RomanDigit {
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        private int value;

        RomanDigit(int value) {

            this.value = value;
        }
    }

    public String convertToNumber(int arabicNumber) {
        for (RomanDigit roman :
                RomanDigit.values()) {
            if (arabicNumber >= roman.value) {
                return roman.name() + convertToNumber(arabicNumber - roman.value);
            }
        }
        return "";
    }
}