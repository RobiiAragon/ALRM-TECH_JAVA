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
                    int CatalogoPrincipal;
                    System.out.println();
                    System.out.println("Que tipo de componente llevara el dia de hoy?");
                    System.out.println("1. Procesadores");
                    System.out.println("2. Motherbords");
                    System.out.println("3. Memorias RAM");
                    System.out.println("4. Almacenamientos");
                    System.out.println("5. Fuentes de poder (PSU)");
                    System.out.println("6. Gabinetes");
                    System.out.println("7. Monitores");
                    System.out.println("8. Teclados");
                    System.out.println("9. Mouses");
                    System.out.println("10. Alfombrillas");
                    System.out.println("11. Auriculares");
                    System.out.println("12. Microfonos");
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    CatalogoPrincipal = scanner.nextInt();
                    repetir = false; // Salir del bucle después de procesar la opción 1
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Bienvenido al sistema de armado guiado de PC de ALRM-TECH");
                    int opcionMarcaCPU;
                    System.out.println("¿Qué tipo de procesador desea elegir?");
                    System.out.println("1. Intel");
                    System.out.println("2. AMD");
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    opcionMarcaCPU = scanner.nextInt();
                    repetir = false; // Salir del bucle después de procesar la opción 2
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    // No es necesario el while (MenuPrincipal != 1 && MenuPrincipal != 2);
            }
        }
    }
}