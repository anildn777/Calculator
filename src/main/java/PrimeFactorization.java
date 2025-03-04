import java.util.Arrays;

public class PrimeFactorization {


        public static Boolean[] primeFactor() {
            System.out.println("Gib deine Zahl nun ein: ");
            int n = ManualInput.scanner.nextInt();

            Boolean[] primeArray = new Boolean[n + 1];
            Arrays.fill(primeArray, true);
            primeArray[0] = false;
            primeArray[1] = false;
            for (int i = 2; i * i <= n; i++) {
                if (primeArray[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        primeArray[j] = false;
                    }
                }
            }
            System.out.println("Die Primfaktoren sind: ");
            for (int i = 2; i <= n; i++) {
                if (primeArray[i]) {
                    System.out.print(i + " | ");  // Gib jede Primzahl aus
                }
            }
            System.out.println();  // Zeilenumbruch am Ende
            return primeArray;  // Gibt das Array zurück, das angibt, ob eine Zahl prim ist
        }
    }


