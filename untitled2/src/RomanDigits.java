public class RomanDigits {
    enum InputRomeNumbers {I, II, III, IV, V, VI, VII, VIII, IX, X}



    public static String convert(int number) {
        String romanOnes = toRomanDigit(number % 10, "I", "V", "X");
        number /= 10;
        String romanTens = toRomanDigit(number % 10, "X", "L", "C");
        number /= 10;
        String romanHundreds = toRomanDigit(number % 10, "C", "", "");

        return romanHundreds + romanTens + romanOnes;
    }
    private static String toRomanDigit(int n, String one, String five, String ten) {
        return switch (n) {
            case 1 -> one;
            case 2 -> one + one;
            case 3 -> one + one + one;
            case 4 -> one + five;
            case 5 -> five;
            case 6 -> five + one;
            case 7 -> five + one + one;
            case 8 -> five + one + one + one;
            case 9 -> one + ten;
            default -> "";
        };
    }
    public static boolean isRoman(String sConversation) throws MyExceptions.IncorrectFormat {
        String[] digitsAndSign = sConversation.split(" ");
        if (digitsAndSign.length == 3) {
            String sNum1 = digitsAndSign[0];
            String sNum2 = digitsAndSign[2];

            boolean isRoman1 = true;
            try {
                InputRomeNumbers.valueOf(sNum1);
            } catch (IllegalArgumentException e) {
                isRoman1 = false;
            }
            boolean isRoman2 = true;
            try {
                InputRomeNumbers.valueOf(sNum2);
            } catch (IllegalArgumentException e) {
                isRoman2 = false;
            }
            if (isRoman1 && isRoman2) {
                return true;
            } else if (!isRoman1 && !isRoman2) {
                return false;
            } else {
                throw new MyExceptions.IncorrectFormat("Можно использовать только одну систему счисления и числа от 1 до 10.");
            }
        } else {
            throw new MyExceptions.IncorrectFormat("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
    }

    public static void calculateRoman(char sign, String sNum1, String sNum2) throws MyExceptions.RomanNumbersOnlyNatural {
        int first = InputRomeNumbers.valueOf(sNum1).ordinal() + 1;
        int second = InputRomeNumbers.valueOf(sNum2).ordinal() + 1;
        int result = Calculator.calculate(sign, first, second);
        if (result > 0) {
            String sRes = RomanDigits.convert(result);
            System.out.println(sRes);
        } else {
            throw new MyExceptions.RomanNumbersOnlyNatural("Результат может быть только натуральным числом.");

        }


    }
}

