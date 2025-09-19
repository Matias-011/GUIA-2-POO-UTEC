public class PatronS {
    public static void main(String[] args) {
        int filas = 7;
        int columnas = 5;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || i == filas / 2 || 
                    (i == 1 && j == 0) || (i == filas - 2 && j == columnas - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                };
            };
            System.out.println();
        };
    };
};