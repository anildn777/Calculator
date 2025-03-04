import java.util.Scanner;

public class CalculationContinue {

    static Scanner scanner = new Scanner (System.in);

    public static void continueAdd(double result) {
            boolean running = true;
            System.out.println("Gib eine Zahl ein: ");

            double numberAdd = scanner.nextDouble();
            double calculationAdd = result + numberAdd;

            System.out.println("Ergebnis: " + calculationAdd + " weiter verrechnen?(ja/nein)");
            while (running) {
                String responseContinue = scanner.nextLine();
                if (responseContinue.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(calculationAdd);
                } else if (responseContinue.equalsIgnoreCase("nein")) {
                    System.out.println("Wert wird auf 0 zurückgesetzt.");
                    OperationMenu.startCalculator();
                    running = false;
                }
            }

        }

        public static void continueSub(double result) {
            boolean running = true;
            System.out.println("Gib eine Zahl ein: ");
            double numberSub = scanner.nextDouble();
            double calculationSub = result - numberSub;

            System.out.println("Ergebnis: " + calculationSub + " weiter verrechnen?(ja/nein)");
            while (running) {
                String responseContinue = scanner.nextLine();
                if (responseContinue.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(calculationSub);
                } else if (responseContinue.equalsIgnoreCase("nein")) {
                    System.out.println("Wert wird auf 0 zurückgesetzt.");
                    OperationMenu.startCalculator();
                    running = false;
                }
            }
        }

        public static void continueMulti(double result) {
            boolean running = true;
            System.out.println("Gib eine Zahl ein: ");
            double numberMulti = scanner.nextDouble();
            double calculationMulti = result * numberMulti;

            System.out.println("Ergebnis: " + calculationMulti + " weiter verrechnen?(ja/nein)");
            while (running) {
                String responseContinue = scanner.nextLine();
                if (responseContinue.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(calculationMulti);
                } else if (responseContinue.equalsIgnoreCase("nein")) {
                    System.out.println("Wert wird auf 0 zurückgesetzt.");
                    OperationMenu.startCalculator();
                    running = false;
                }
            }
        }

        public static void continueDivision(double result) {
            boolean running = true;

            try {
                System.out.println("Gib eine Zahl ein: ");

                double numberDivision = scanner.nextDouble();
                double calculationDivision = result / numberDivision;




                if (calculationDivision == 0 || numberDivision == 0) {
                    throw new ArithmeticException("Teilen durch 0 ist nicht erlaubt!"); }

                System.out.println("Ergebnis: " + calculationDivision + " weiter verrechnen?(ja/nein)");
                while (running) {
                    String responseContinue = scanner.nextLine();
                    if (responseContinue.equalsIgnoreCase("ja")) {
                        OperationMenu.menuInputContinue(calculationDivision);
                    } else if (responseContinue.equalsIgnoreCase("nein")) {
                        System.out.println("Wert wird auf 0 zurückgesetzt.");
                        OperationMenu.startCalculator();
                        running = false;
                    }
                }
            } catch (ArithmeticException e) {
                System.out.println("Fehler: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ungültige Eingabe! Bitte erneut eingeben:");
                scanner.nextLine();
            }
        }


        public static void continuePotence(double result) {
            boolean running = true;
            System.out.println("Gib eine Zahl ein: ");
            double numberPotence = scanner.nextDouble();
            double calculationPotence = Math.pow(result, numberPotence);

            System.out.println("Ergebnis: " + calculationPotence + " weiter verrechnen?(ja/nein)");
            while (running) {
                String responseContinue = scanner.nextLine();
                if (responseContinue.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(calculationPotence);
                } else if (responseContinue.equalsIgnoreCase("nein")) {
                    System.out.println("Wert wird auf 0 zurückgesetzt.");
                    OperationMenu.startCalculator();
                    running = false;
                }
            }
        }

        public static void continueSqrt(double result) {
            boolean running = true;

            double calculationSqrt = Math.sqrt(result);

            System.out.println("Ergebnis: " + calculationSqrt + " weiter verrechnen?(ja/nein)");
            while (running) {
                String responseContinue = scanner.nextLine();
                if (responseContinue.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(calculationSqrt);
                } else if (responseContinue.equalsIgnoreCase("nein")) {
                    System.out.println("Wert wird auf 0 zurückgesetzt.");
                    OperationMenu.startCalculator();
                    running = false;
                }
            }

        }

        public static void continueLog(double result) {
            boolean running = true;
            double calculationLog = Math.log(result);

            System.out.println("Ergebnis: " + calculationLog + " weiter verrechnen?(ja/nein)");
            while (running) {
                String responseContinue = scanner.nextLine();
                if (responseContinue.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(calculationLog);
                } else if (responseContinue.equalsIgnoreCase("nein")) {
                    System.out.println("Wert wird auf 0 zurückgesetzt.");
                    OperationMenu.startCalculator();
                    running = false;
                }
            }
        }

        public static void continueLog10(double result) {
            boolean running = true;
            double calculationLog10 = Math.log10(result);

            System.out.println("Ergebnis: " + calculationLog10 + " weiter verrechnen?(ja/nein)");
            while (running) {
                String responseContinue = scanner.nextLine();
                if (responseContinue.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(calculationLog10);
                } else if (responseContinue.equalsIgnoreCase("nein")) {
                    System.out.println("Wert wird auf 0 zurückgesetzt.");
                    OperationMenu.startCalculator();
                    running = false;
                }
            }
        }

        public static void continueModulo(double result) {
            boolean running = true;
            System.out.println("Gib eine Zahl ein: ");
            double numberMod = scanner.nextDouble();
            double calculationMod = result % numberMod;

            System.out.println("Ergebnis: " + calculationMod + " weiter verrechnen?(ja/nein)");
            while (running) {
                String responseContinue = scanner.nextLine();
                if (responseContinue.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(calculationMod);
                } else if (responseContinue.equalsIgnoreCase("nein")) {
                    System.out.println("Wert wird auf 0 zurückgesetzt.");
                    OperationMenu.startCalculator();
                    running = false;
                }
            }
        }


    }
