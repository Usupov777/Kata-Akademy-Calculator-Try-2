public class ArabicNumerals {
    public static void calculateArabic(char sign, String sNum1, String sNum2) throws MyExceptions.IncorrectFormat {
    int first = Integer.parseInt(sNum1);
    int second = Integer.parseInt(sNum2);
            if (first > 10 || first < 1 || second > 10 || second < 1) {
                throw new MyExceptions.IncorrectFormat("Калькулятор принимает числа только от 1 до 10");
            }
    int result = Calculator.calculate(sign, first, second);
        System.out.println(result);
    }
}
