public class FibonacciPrimos {
    public static void main(String[] args) {
        int countTerms = 15;
        long a = 0;
        long b = 1;
        int primos = 0;
        int noPrimos = 0;

        System.out.println("Términos de Fibonacci (hasta " + countTerms + "):");
        for (int i = 1; i <= countTerms; i++) {
            long term;
            if (i == 1)
                term = a;
            else if (i == 2)
                term = b;
            else {
                term = a + b;
                a = b;
                b = term;
            }

            // Mostrar si es primo (solo si > 1)
            if (esPrimo(term)) {
                System.out.println(i + ": " + term + " -> PRIMO");
                primos++;
            } else {
                System.out.println(i + ": " + term + " -> NO primo");
                noPrimos++;
            }
        }

        System.out.println("\nCantidad de números primos: " + primos);
        System.out.println("Cantidad de números no primos: " + noPrimos);
    }

    // Método que determina si n es primo. n puede ser 0,1,2,...
    private static boolean esPrimo(long n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0)
            return false;
        long limite = (long) Math.sqrt(n);
        for (long i = 3; i <= limite; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}