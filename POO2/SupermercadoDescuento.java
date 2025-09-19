import java.util.Scanner;

public class SupermercadoDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Ingrese productos. Cuando termine, escriba 'n' para no agregar más.");

        while (true) {
            System.out.print("¿Desea ingresar un producto? (s/n): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            } else if (!respuesta.equalsIgnoreCase("s")) {
                System.out.println("Respuesta inválida, responda 's' o 'n'.");
                continue;
            }

            System.out.print("Cantidad del producto (entero): ");
            int cantidad = sc.nextInt();

            System.out.print("Precio unitario (ej. 2.50): ");
            double precio = sc.nextDouble();

            total += cantidad * precio;
            System.out.printf("Subtotal actual: %.2f%n", total);
        }

        double descuentoPorc = 0.0;
        if (total >= 20 && total <= 35)
            descuentoPorc = 5.0;
        else if (total >= 36 && total <= 50)
            descuentoPorc = 8.0;
        else if (total > 50)
            descuentoPorc = 10.0;

        double descuento = total * (descuentoPorc / 100.0);
        double totalAPagar = total - descuento;

        System.out.println("\nResumen de compra:");
        System.out.printf("Total de la compra: $%.2f%n", total);
        System.out.printf("Descuento aplicado: %.0f%% -> $%.2f%n", descuentoPorc, descuento);
        System.out.printf("Total a pagar: $%.2f%n", totalAPagar);
        sc.close();
    }
}