import java.util.Scanner;

public class SeisNumerosMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 6 números (pueden ser decimales):");

        // Leemos el primero para inicializar max y min
        System.out.print("Número 1: ");
        double num = sc.nextDouble();
        double max = num;
        double min = num;

        for (int i = 2; i <= 6; i++) {
            System.out.print("Número " + i + ": ");
            num = sc.nextDouble();
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        System.out.println("\nEl número mayor es: " + max);
        System.out.println("El número menor es: " + min);
        sc.close();
    }
}