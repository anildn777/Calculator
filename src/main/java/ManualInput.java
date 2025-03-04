import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManualInput {

        static Scanner scanner = new Scanner(System.in);

        public static void UserQuery() {
            System.out.println("Manuelle Eingabe wurde gewählt:");
            System.out.println("Gebe nun deine Rechnung ein:");
            String userInput = scanner.nextLine().trim();

            // Klammern zuerst berechnen
            userInput = calculateParenthesis(userInput);

            // Restliche Berechnung
            double result = calculateExpression(userInput);

            System.out.println("Das Ergebnis lautet: " + result);
        }

        public static String calculateParenthesis(String userInput) {
            while (userInput.contains("(")) {
                int start = userInput.lastIndexOf("(");
                int end = userInput.indexOf(")", start);
                if (end == -1) {
                    System.out.println("Fehler: Ungültige Klammern!");
                    return "0";
                }
                String valueInParenthesis = userInput.substring(start + 1, end);
                String result = String.valueOf(calculateExpression(valueInParenthesis));
                userInput = userInput.substring(0, start) + result + userInput.substring(end + 1);
            }
            return userInput;
        }

        public static double calculateExpression(String userInput) {
            // Entferne Leerzeichen und ersetze ':' durch '/'
            userInput = userInput.replace(" ", "").replace(":", "/");

            Stack<Double> numbers = new Stack<>();
            Stack<Character> operators = new Stack<>();
            Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)?)|([+\\-*/])");
            Matcher matcher = pattern.matcher(userInput);

            while (matcher.find()) {
                if (matcher.group(1) != null) {
                    numbers.push(Double.parseDouble(matcher.group(1)));
                } else if (matcher.group(3) != null) {
                    char op = matcher.group(3).charAt(0);
                    while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(op)) {
                        applyOperator(numbers, operators.pop());
                    }
                    operators.push(op);
                }
            }

            while (!operators.isEmpty()) {
                applyOperator(numbers, operators.pop());
            }

            return numbers.pop();
        }

        private static int precedence(char operator) {
            return switch (operator) {
                case '*', '/' -> 2;
                case '+', '-' -> 1;
                default -> 0;
            };
        }

        private static void applyOperator(Stack<Double> numbers, char operator) {
            if (numbers.size() < 2) return;
            double b = numbers.pop();
            double a = numbers.pop();
            switch (operator) {
                case '+' -> numbers.push(a + b);
                case '-' -> numbers.push(a - b);
                case '*' -> numbers.push(a * b);
                case '/' -> numbers.push(b != 0 ? a / b : Double.NaN);
            }
        }
    }

