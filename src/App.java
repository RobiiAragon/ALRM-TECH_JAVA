import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repetir = true;
        int MenuPrincipal;

        while (repetir) {
            System.out.println("Bienvenido a ALRM-TECH Encuentra todo para tu PC ideal aquí");
            System.out.println("1. Piezas");
            System.out.println("2. Sistema de armado guiado");
            System.out.println();
            System.out.print("Ingrese su opción: ");
            MenuPrincipal = scanner.nextInt();

            switch (MenuPrincipal) {
                case 1:
                    System.out.println();
                    System.out.println("Bienvenido al ALRM-TECH Piezas");
                    repetir = false; // Salir del bucle después de procesar la opción 1
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Bienvenido al sistema de armado guiado de PC de ALRM-TECH");
                    repetir = false; // Salir del bucle después de procesar la opción 2
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    // No es necesario el while (MenuPrincipal != 1 && MenuPrincipal != 2);
            }
        }
    }
}