public class MyExceptions {
    public static class RomanNumbersOnlyNatural extends Exception {

        public RomanNumbersOnlyNatural(String message) {
            super(message);
        }
    }

    public static class IncorrectFormat extends Exception {

        public IncorrectFormat(String message) {
            super(message);
        }
    }
}
