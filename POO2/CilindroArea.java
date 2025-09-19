import java.util.Scanner;

public class CilindroArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio (r): ");
        double r = sc.nextDouble();
        System.out.print("Ingrese la altura (h): ");
        double h = sc.nextDouble();

        double area = 2 * Math.PI * r * (r + h);
        System.out.println("El área del cilindro es: " + area);
        sc.close();
    };
};
