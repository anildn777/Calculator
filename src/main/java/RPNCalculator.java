import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


    public class RPNCalculator {

        static Scanner scanner = new Scanner(System.in);
        static boolean isOperator = true;
        MyStack myStack = new MyStack(50);

        public static void RPNStack() {
            MyStack myStack = new MyStack(50);
//        Stack<Double> Results = new Stack<>(); // 37 + 5 * 2 = RPN Converter = 375 + 2 *

            System.out.println("Gebe deine Rechnung ein (In RPN Notation): ");
            String calculationTerm = scanner.nextLine().trim(); // 55 * 7 +

            //jetzt rechne: Zwei arrays, erkenne einmal operator, einmal Zahlen

            Pattern pattern = Pattern.compile("(\\d+)|([+\\-*/])");
            Matcher matcher = pattern.matcher(calculationTerm);


            // durchläuft ganzen code
            while (matcher.find()) {
                if (matcher.group(1) != null) {
                    myStack.push(Double.parseDouble(matcher.group(1)));
                    isOperator = false;
                }
                if (matcher.group(2) != null) {
                    isOperator = true;


                    double number = myStack.pop();
                    double numberTwo = myStack.pop();
                    double result = 0;
                    char operator = matcher.group(2).charAt(0);

                    switch (operator) {
                        case '+':
                            result = numberTwo + number;
                            break;
                        case '-':
                            result = numberTwo - number;
                            break;
                        case '*':
                            result = numberTwo * number;
                            break;
                        case '/':
                            if (number == 0) {
                                System.out.println("Fehler");
                                return;
                            } else {
                                result = numberTwo / number;
                            }
                            break;
                    }
                    myStack.push(result);
                    System.out.println("Zwischenergebnis: " + result);
                }
            }
            if (!myStack.isEmpty()) {
                System.out.println("Ergebnis: " + myStack.pop());  // Endergebnis wird ausgegeben
            } else {
                System.out.println("Fehler: Kein Ergebnis verfügbar.");
            }
        }
    }



