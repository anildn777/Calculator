import java.util.Scanner;

import static java.lang.Math.sqrt;

public class OperationMenu {

    public static Scanner scanner = new Scanner(System.in);

    public static void startCalculator() {
        startIntroduction();
    }

    public static void startIntroduction() {

        System.out.println("ANILX777Calculator.");

        menuInput();
    }

    public static void menuInput() {

        System.out.println("Operator eingeben (+/-/*/:/sqrt/log/log10/^) beenden: q");
        System.out.println("Alternative Eingabe: a");
        System.out.println("RPN Calculator: r");
        System.out.println("Primfaktorzerlegung: p");

        String input = scanner.nextLine().toLowerCase();

        switch (input) {
            case "+" -> Calculation.addition();
            case "-" -> Calculation.substraction();
            case "*" -> Calculation.multiplication();
            case ":" -> Calculation.division();
            case "sqrt" -> Calculation.sqrt(); //√
            case "log" -> Calculation.log();
            case "log10" -> Calculation.log10();
            case "%" -> Calculation.modulo();
            case "^" -> Calculation.potence();
            case "a" -> ManualInput.UserQuery();
            case "r" ->RPNCalculator.RPNStack();
            case "p" -> PrimeFactorization.primeFactor();
            case "q" -> {
                System.out.println("Das Programm wird beendet.");

            }
//            case "a" -> alternateParsingInput.alternateParseDouble();
//            default -> {
//                System.out.println("Eingabe ungültig. Erneut versuchen.");
        }
    }

    public static double menuInputContinue(double result) {
        System.out.println("Gib deinen Operator ein (+/-/*/:/sqrt/log/log10/^) beenden: q//Alternative Eingabe: a ");

        boolean calculationCont = true;
        while (calculationCont) {
            String response = scanner.nextLine().toLowerCase();

            switch (response) {
                case "+" -> CalculationContinue.continueAdd(result);
                case "-" -> CalculationContinue.continueSub(result);
                case "*" -> CalculationContinue.continueMulti(result);
                case ":" -> CalculationContinue.continueDivision(result);
                case "sqrt" -> CalculationContinue.continueSqrt(result);
                case "log" -> CalculationContinue.continueLog(result);
                case "log10" -> CalculationContinue.continueLog10(result);
                case "^" -> CalculationContinue.continuePotence(result);
                case "%" -> CalculationContinue.continueModulo(result);
                case "q" -> {
                    System.out.println("Das Programm wird beendet.");
                    calculationCont = false;
                }
                case "a" -> {
                    ManualInput.UserQuery();
                }
                default -> {
                    System.out.println("Eingabe ungültig. Erneut versuchen.");
                    menuInputContinue(result);
                }
            }
        }
        return result;
    }
}



