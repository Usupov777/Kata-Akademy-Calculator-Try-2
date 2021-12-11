public class Calculator {
    public static void main(String[] args) throws MyExceptions.IncorrectFormat, MyExceptions.RomanNumbersOnlyNatural {
        String sConversation = InputData.read();
        boolean isRoman = RomanDigits.isRoman(sConversation);
        String[] digitsAndSign;
        digitsAndSign = sConversation.split(" ");
        String sNum1 = digitsAndSign[0];
        String sNum2 = digitsAndSign[2];
        char sign = digitsAndSign[1].charAt(0);

        if (isRoman) {
            RomanDigits.calculateRoman(sign, sNum1, sNum2);
        } else {
            ArabicNumerals.calculateArabic(sign, sNum1, sNum2);
        }
        }
    public static int calculate(char sign, int first, int second) {
        return switch (sign) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            case '/' -> first / second;
            default -> 0;
        };
    }
    }

