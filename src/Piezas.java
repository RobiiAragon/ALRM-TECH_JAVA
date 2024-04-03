import java.util.Scanner;
import java.util.ArrayList;

public class Piezas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Arreglos de productos con precios
        String[] procesadores = {"Intel Core i5", "AMD Ryzen 5", "Intel Core i7"};
        double[] preciosProcesadores = {250.0, 200.0, 300.0};
        String[] tarjetasGraficas = {"NVIDIA GeForce GTX 1060", "AMD Radeon RX 580", "NVIDIA GeForce RTX 2060"};
        double[] preciosTarjetasGraficas = {300.0, 250.0, 400.0};
        String[] monitores = {"LG 24MP59G", "Dell UltraSharp U2720Q", "BenQ PD2700U"};
        double[] preciosMonitores = {180.0, 350.0, 450.0};

        ArrayList<String> carrito = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

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
                    comprarProductos(scanner, procesadores, preciosProcesadores, carrito, precios);
                    break;
                case 2:
                    comprarProductos(scanner, tarjetasGraficas, preciosTarjetasGraficas, carrito, precios);
                    break;
                case 3:
                    comprarProductos(scanner, monitores, preciosMonitores, carrito, precios);
                    break;
                case 4:
                    verCarrito(scanner, carrito, precios);
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

    private static void comprarProductos(Scanner scanner, String[] productos, double[] precios, ArrayList<String> carrito, ArrayList<Double> preciosCarrito) {
        System.out.println("Productos disponibles:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - $" + precios[i]);
        }
        System.out.print("Ingrese el nombre del producto que desea comprar: ");
        String compra = scanner.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(compra)) {
                encontrado = true;
                carrito.add(productos[i]);
                preciosCarrito.add(precios[i]);
                System.out.println("Ha agregado un " + productos[i] + " al carrito.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El producto ingresado no está disponible.");
        }
    }

    private static void verCarrito(Scanner scanner, ArrayList<String> carrito, ArrayList<Double> precios) {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            double subtotal = 0.0;
            System.out.println("Productos en el carrito:");
            for (int i = 0; i < carrito.size(); i++) {
                System.out.println((i + 1) + ". " + carrito.get(i) + " - $" + precios.get(i));
                subtotal += precios.get(i);
            }
            double iva = subtotal * 1.16 - subtotal; // Iva
            double total = subtotal + iva; // Subtotal + 16% de impuestos
            System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
            System.out.println("IVA: $" + String.format("%.2f", iva));
            System.out.println("Total (incluye el iva): $" + String.format("%.2f", total));
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
                    double precio = precios.remove(indice);
                    System.out.println("Se ha eliminado " + producto + " del carrito.");
                } else {
                    System.out.println("Índice inválido.");
                }
            }
        }
    }
}