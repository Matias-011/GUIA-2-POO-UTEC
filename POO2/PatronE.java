public class PatronE {

    public static void main(String[] args) {

        int filas = 7;
        int columnas = 5;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Si estamos en la primera fila, la fila del medio, la última fila o la primera columna,
                // imprimimos un asterisco.
                if (i == 0 || i == filas / 2 || i == filas - 1 || j == 0) {
                    System.out.print("* ");
                } else {
                    // De lo contrario, imprimimos un espacio en blanco.
                    System.out.print("  ");
                };
            };
            // Después de cada fila, saltamos a la siguiente línea.
            System.out.println();
        };
    };
};