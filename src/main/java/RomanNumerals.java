import com.github.chaosfirebolt.converter.RomanInteger;

public class RomanNumerals {

    enum RomanDigit {
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
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