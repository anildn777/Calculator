import java.util.Scanner;


public class Calculation {

    static Scanner scanner = new Scanner (System.in);

        public static void addition() {
            boolean running = true;
            System.out.println("Geben Sie nun die erste Zahl ein:");
            double firstNumberAdd = scanner.nextDouble();


            System.out.println("Geben Sie nun die zweite Zahl ein:");
            double secondNumberAdd = scanner.nextDouble();


            double result = Operations.addition(firstNumberAdd, secondNumberAdd);

            System.out.println("Ihr Ergebnis lautet: " + result);


            System.out.println("Möchten Sie Ihr Ergebnis " + result + " weiter verrechnen?(ja/nein)");

            while (running) {
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(result);

                } else if (response.equalsIgnoreCase("nein")) {
                    System.out.println("Programm ist beendet.");
                    running = false;
                }
            }
        }

        public static void substraction() {
            boolean running = true;
            System.out.println("Geben Sie nun die erste Zahl ein:");
            double firstNumberAdd = scanner.nextDouble();

            System.out.println("Geben Sie nun die zweite Zahl ein:");
            double secondNumberAdd = scanner.nextDouble();

            double result = Operations.subtraction(firstNumberAdd, secondNumberAdd);

            System.out.println("Ihr Ergebnis lautet: " + result);


            System.out.println("Möchten Sie Ihr Ergebnis " + result + " weiter verrechnen?(ja/nein)");

            while (running) {
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(result);

                } else if (response.equalsIgnoreCase("nein")) {
                    System.out.println("Programm ist beendet.");
                    running = false;
                }
            }

        }

        public static void multiplication() {
            boolean running = true;
            System.out.println("Geben Sie nun die erste Zahl ein:");
            double firstNumberAdd = scanner.nextDouble();

            System.out.println("Geben Sie nun die zweite Zahl ein:");
            double secondNumberAdd = scanner.nextDouble();


                double result = Operations.multiplication(firstNumberAdd, secondNumberAdd);

            System.out.println("Ihr Ergebnis lautet: " + result);


            System.out.println("Möchten Sie Ihr Ergebnis " + result + " weiter verrechnen?(ja/nein)");

            while (running) {
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(result);

                } else if (response.equalsIgnoreCase("nein")) {
                    System.out.println("Programm ist beendet.");
                    running = false;
                }
            }
        }

        public static void modulo() {
            boolean running = true;
            System.out.println("Geben Sie nun die erste Zahl ein:");
            double firstNumberAdd = scanner.nextDouble();

            System.out.println("Geben Sie nun die zweite Zahl ein:");
            double secondNumberAdd = scanner.nextDouble();

            double result = Operations.modulo(firstNumberAdd, secondNumberAdd);

            System.out.println("Ihr Ergebnis lautet: " + result);

            System.out.println("Möchten Sie Ihr Ergebnis " + result + " weiter verrechnen?(ja/nein)");

            while (running) {
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(result);

                } else if (response.equalsIgnoreCase("nein")) {
                    System.out.println("Programm ist beendet.");
                    running = false;
                }
            }
        }


        public static void division() {
            try {
                boolean running = true;
                System.out.println("Geben Sie nun die erste Zahl ein:");
                double firstNumberAdd = scanner.nextDouble();

                System.out.println("Geben Sie nun die zweite Zahl ein:");
                double secondNumberAdd = scanner.nextDouble();


                double result = Operations.division(firstNumberAdd, secondNumberAdd);
                if (firstNumberAdd == 0 || secondNumberAdd == 0) {
                    throw new ArithmeticException("Teilen durch 0 nicht möglich.");
                }
                System.out.println("Ihr Ergebnis lautet: " + result);

                System.out.println("Möchten Sie Ihr Ergebnis " + result + " weiter verrechnen?(ja/nein)");
                while (running) {
                    String response = scanner.nextLine();

                    if (response.equalsIgnoreCase("ja")) {
                        OperationMenu.menuInputContinue(result);

                    } else if (response.equalsIgnoreCase("nein")) {
                        System.out.println("Programm ist beendet.");
                        running = false;
                    }
                }
            } catch (ArithmeticException e) {
                System.out.println("Fehler: " + e.getMessage());
                OperationMenu.menuInput();
            } catch (Exception e) {
                System.out.println("Ungültige Eingabe! Bitte erneut eingeben:");
                scanner.nextLine();
            }
        }

        public static void sqrt() {
            boolean running = true;
            System.out.println("Geben Sie nun die Zahl ein: ");
            double firstNumberSqrt = scanner.nextDouble();

            double result = Operations.square(firstNumberSqrt);

            System.out.println("Das Ergebnis lautet: " + result);

            System.out.println("Möchten Sie Ihr Ergebnis " + result + " weiter verrechnen?(ja/nein)");
            while (running) {
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(result);
                } else if (response.equalsIgnoreCase("nein")) {
                    System.out.println("Programm ist beendet.");
                } else {

                }
            }
        }

        public static void log() {
            System.out.println("Geben Sie nun eine Zahl ein.");

            double logNumber = scanner.nextDouble();


            double result = Operations.log(logNumber);
            System.out.println("Das Ergebnis lautet: " + result);

            System.out.println("Möchten Sie Ihr Ergebnis " + result + " weiter verrechnen?(ja/nein)");

            boolean running = true;
            while (running) {
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(result);
                } else if (response.equalsIgnoreCase("nein")) {
                    System.out.println("Programm ist beendet.");
                    running = false;
                }
            }
        }


        public static void log10() {
            System.out.println("Geben Sie nun eine Zahl ein.");

            double logNumber = scanner.nextDouble();

            double result = Operations.log10(logNumber);
            System.out.println("Das Ergebnis lautet: " + result);

            System.out.println("Möchten Sie Ihr Ergebnis " + result + " weiter verrechnen?(ja/nein)");

            boolean running = true;
            while (running) {
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(result);
                } else if (response.equalsIgnoreCase("nein")) {
                    System.out.println("Programm ist beendet.");
                    running = false;
                }
            }
        }
        public static void potence () {
            System.out.println("Geben Sie nun die Basis ein.");

            double potNumberOne = scanner.nextDouble();

            System.out.println("Geben Sie nun den Exponent ein.");

            double potNumberTwo = scanner.nextDouble();

            double result = Operations.pow(potNumberOne, potNumberTwo);
            System.out.println("Das Ergebnis lautet: " + result);

            System.out.println("Möchten Sie Ihr Ergebnis " + result + " weiter verrechnen?(ja/nein)");

            boolean running = true;
            while (running) {
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("ja")) {
                    OperationMenu.menuInputContinue(result);
                } else if (response.equalsIgnoreCase("nein")) {
                    System.out.println("Programm ist beendet.");
                    running = false;
                }
            }
        }
    }

