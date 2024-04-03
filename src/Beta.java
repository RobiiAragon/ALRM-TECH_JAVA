import java.util.Scanner;
import java.util.ArrayList;

public class Beta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        String[] procesadores = {"Intel Core i5", "AMD Ryzen 5", "Intel Core i7"};
        String[] tarjetasGraficas = {"NVIDIA GeForce GTX 1060", "AMD Radeon RX 580", "NVIDIA GeForce RTX 2060"};
        String[] monitores = {"LG 24MP59G", "Dell UltraSharp U2720Q", "BenQ PD2700U"};

        ArrayList<String> carrito = new ArrayList<>();

        while (!salir) {
            System.out.println("Bienvenido a la tienda. ¿Qué desea comprar?");
            System.out.println("1. Procesadores");
            System.out.println("2. Tarjetas gráficas");
            System.out.println("3. Monitores");
            System.out.println("4. Ver carrito");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Inténtelo de nuevo.");
                scanner.nextLine(); // Limpiar el buffer
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Procesadores disponibles:");
                    for (String procesador : procesadores) {
                        System.out.println(procesador);
                    }
                    System.out.print("Ingrese el nombre del procesador que desea comprar: ");
                    String compraProcesador = scanner.nextLine();
                    boolean encontradoProcesador = false;
                    for (String procesador : procesadores) {
                        if (procesador.equalsIgnoreCase(compraProcesador)) {
                            encontradoProcesador = true;
                            carrito.add(procesador);
                            System.out.println("Ha agregado un " + procesador + " al carrito.");
                            break;
                       }
                    }
                    if (!encontradoProcesador) {
                        System.out.println("El procesador ingresado no está disponible.");
                    }
                    break;
                case 2:
                    System.out.println("Tarjetas gráficas disponibles:");
                    for (String tarjeta : tarjetasGraficas) {
                        System.out.println(tarjeta);
                    }
                    System.out.print("Ingrese el nombre de la tarjeta gráfica que desea comprar: ");
                    String compraTarjeta = scanner.nextLine();
                    boolean encontradaTarjeta = false;
                    for (String tarjeta : tarjetasGraficas) {
                        if (tarjeta.equalsIgnoreCase(compraTarjeta)) {
                            encontradaTarjeta = true;
                            carrito.add(tarjeta);
                            System.out.println("Ha agregado una " + tarjeta + " al carrito.");
                            break;
                       }
                    }
                    if (!encontradaTarjeta) {
                        System.out.println("La tarjeta gráfica ingresada no está disponible.");
                    }
                    break;
                case 3:
                    System.out.println("Monitores disponibles:");
                    for (String monitor : monitores) {
                        System.out.println(monitor);
                    }
                    System.out.print("Ingrese el nombre del monitor que desea comprar: ");
                    String compraMonitor = scanner.nextLine();
                    boolean encontradoMonitor = false;
                    for (String monitor : monitores) {
                        if (monitor.equalsIgnoreCase(compraMonitor)) {
                            encontradoMonitor = true;
                            carrito.add(monitor);
                            System.out.println("Ha agregado un " + monitor + " al carrito.");
                            break;
                        }
                    }
                    if (!encontradoMonitor) {
                       System.out.println("El monitor ingresado no está disponible.");
                    }
                    break;
                case 4:
                    verCarrito(scanner, carrito);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        }
    }

    private static void verCarrito(Scanner scanner, ArrayList<String> carrito) {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (int i = 0; i < carrito.size(); i++) {
                System.out.println((i + 1) + ". " + carrito.get(i));
            }
            System.out.println("1. Eliminar un producto");
            System.out.println("2. Regresar al menú principal");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            if (opcion == 1) {
                System.out.print("Ingrese el número del producto que desea eliminar: ");
                int indice = scanner.nextInt() - 1;
                scanner.nextLine(); // Consumir el salto de línea pendiente
                if (indice >= 0 && indice < carrito.size()) {
                    String producto = carrito.remove(indice);
                    System.out.println("Se ha eliminado " + producto + " del carrito.");
                } else {
                    System.out.println("Índice inválido.");
                }
            }
        }
    }
}