import com.github.chaosfirebolt.converter.RomanInteger;

public class RomanNumerals {

    enum RomanDigit {
        I(1),
        V(5),
        X(10);

        private int value;

        RomanDigit(int value) {

            this.value = value;
        }
    }

    public String convertToNumber(int arabicNumber) {
        for (RomanDigit roman :
                RomanDigit.values()) {
            if (arabicNumber == roman.value) {
                return roman.name();
            } else if (arabicNumber == roman.value) {
                return roman.name();
            } else if (arabicNumber == roman.value) {
                return roman.name();
            }
        }
        return "";

    }
}