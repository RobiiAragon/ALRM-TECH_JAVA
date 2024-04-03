import java.util.Scanner;

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

        String[] carrito = new String[10]; // Máximo 10 productos en el carrito
        double[] preciosCarrito = new double[10];
        int indiceCarrito = 0;

        while (!salir) {
            System.out.println("Bienvenido al ALRM-TECH Piezas");
            System.out.println();
            System.out.println("¿Qué desea comprar?");
            System.out.println();
            System.out.println("1. Procesadores");
            System.out.println("2. Tarjetas gráficas");
            System.out.println("3. Monitores");
            System.out.println("4. Ver carrito");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // evitar error si el usuario salta una linea vacia permitiendo seleccionar
            } catch (java.util.InputMismatchException e) {
                System.out.println();
                System.out.println("Entrada inválida. Inténtelo de nuevo.");
                System.out.println();
                scanner.nextLine(); // Limpiar la cache
                continue;
            }

            switch (opcion) {
                case 1:
                System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < procesadores.length; i++) {
                        System.out.println(procesadores[i] + " - $" + preciosProcesadores[i]);
                    }
                    System.out.print("Ingrese el nombre del procesador que desea comprar: ");
                    String compraProcesador = scanner.nextLine();
                    boolean encontradoProcesador = false;
                    for (int i = 0; i < procesadores.length; i++) {
                        if (procesadores[i].equalsIgnoreCase(compraProcesador)) {
                            encontradoProcesador = true;
                            carrito[indiceCarrito] = procesadores[i];
                            preciosCarrito[indiceCarrito] = preciosProcesadores[i];
                            System.out.println();
                            System.out.println("Ha agregado un " + procesadores[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoProcesador) {
                        System.out.println();
                        System.out.println("El procesador ingresado no está disponible.");
                        System.out.println();
                    }
                    break;
                case 2:
                System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < tarjetasGraficas.length; i++) {
                        System.out.println(tarjetasGraficas[i] + " - $" + preciosTarjetasGraficas[i]);
                    }
                    System.out.print("Ingrese el nombre de la tarjeta gráfica que desea comprar: ");
                    String compraTarjeta = scanner.nextLine();
                    boolean encontradoTarjeta = false;
                    for (int i = 0; i < tarjetasGraficas.length; i++) {
                        if (tarjetasGraficas[i].equalsIgnoreCase(compraTarjeta)) {
                            encontradoTarjeta = true;
                            carrito[indiceCarrito] = tarjetasGraficas[i];
                            preciosCarrito[indiceCarrito] = preciosTarjetasGraficas[i];
                            System.out.println();
                            System.out.println("Ha agregado una " + tarjetasGraficas[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoTarjeta) {
                        System.out.println();
                        System.out.println("La tarjeta gráfica ingresada no está disponible.");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < monitores.length; i++) {
                        System.out.println(monitores[i] + " - $" + preciosMonitores[i]);
                    }
                    System.out.print("Ingrese el nombre del monitor que desea comprar: ");
                    String compraMonitor = scanner.nextLine();
                    boolean encontradoMonitor = false;
                    for (int i = 0; i < monitores.length; i++) {
                        if (monitores[i].equalsIgnoreCase(compraMonitor)) {
                            encontradoMonitor = true;
                            carrito[indiceCarrito] = monitores[i];
                            preciosCarrito[indiceCarrito] = preciosMonitores[i];
                            System.out.println();
                            System.out.println("Ha agregado un " + monitores[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoMonitor) {
                        System.out.println();
                        System.out.println("El monitor ingresado no está disponible.");
                        System.out.println();
                    }
                    break;
                case 4:
                    if (indiceCarrito == 0) {
                        System.out.println();
                        System.out.println("El carrito está vacío.");
                        System.out.println();
                    } else {
                        double subtotal = 0.0;
                        System.out.println();
                        System.out.println("Productos en el carrito:");
                        System.out.println();
                        for (int i = 0; i < indiceCarrito; i++) {
                            System.out.println((i + 1) + ". " + carrito[i] + " - $" + preciosCarrito[i]);
                            subtotal += preciosCarrito[i];
                        }
                        double iva = subtotal * 0.16; // IVA
                        double total = subtotal + iva; // Subtotal + 16% de impuestos
                        System.out.println();
                        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                        System.out.println("IVA: $" + String.format("%.2f", iva));
                        System.out.println("Total (incluye el IVA): $" + String.format("%.2f", total));
                        System.out.println();
                        System.out.println("1. Eliminar un producto");
                        System.out.println("2. Pagar");
                        System.out.println("3. Regresar al menú principal");
                        System.out.print("Ingrese su opción: ");
                        int opcionCarrito = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea pendiente
                        switch (opcionCarrito) {
                            case 1:
                                System.out.println();
                                System.out.print("Ingrese el número del producto que desea eliminar: ");
                                int indice = scanner.nextInt() - 1;
                                scanner.nextLine();
                                if (indice >= 0 && indice < indiceCarrito) {
                                    for (int i = indice; i < indiceCarrito - 1; i++) {
                                        carrito[i] = carrito[i + 1];
                                        preciosCarrito[i] = preciosCarrito[i + 1];
                                    }
                                    carrito[indiceCarrito - 1] = null;
                                    preciosCarrito[indiceCarrito - 1] = 0.0;
                                    indiceCarrito--;
                                    System.out.println();
                                    System.out.println("Producto eliminado del carrito.");
                                    System.out.println();
                                } else {
                                    System.out.println();
                                    System.out.println("Índice inválido.");
                                    System.out.println();
                                }
                                break;
                            case 2:
                                System.out.println();
                                System.out.println("Seleccione el método de pago:");
                                System.out.println("1. Efectivo");
                                System.out.println("2. Tarjeta");
                                System.out.print("Ingrese su opción: ");
                                int metodoPago = scanner.nextInt();
                                scanner.nextLine(); // Consumir el salto de línea pendiente
                                if (metodoPago == 1) {
                                    // Generar un número de recibo simple
                                    long numeroRecibo = Math.abs((long) (Math.random() * 9000000000L) + 1000000000L);
                                    System.out.println("Recibo de pago en efectivo:");
                                    System.out.println("Número de recibo: " + numeroRecibo);
                                    System.out.println("Detalles del pago:");
                                    for (int i = 0; i < indiceCarrito; i++) {
                                        System.out.println((i + 1) + ". " + carrito[i] + " - $" + preciosCarrito[i]);
                                    }
                                    System.out.println();
                                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                    System.out.println("IVA: $" + String.format("%.2f", iva));
                                    System.out.println("Total: $" + String.format("%.2f", total));
                                    System.out.println();
                                    System.out.println("Presente este recibo para recoger su compra en una tienda de conveniencia.");
                                    salir = true;
                                } else if (metodoPago == 2) {
                                    System.out.print("Ingrese el nombre del titular de la tarjeta: ");
                                    String titularTarjeta = scanner.nextLine();
                                    System.out.print("Ingrese los 16 dígitos de la tarjeta: ");
                                    String numeroTarjeta = scanner.nextLine();
                                    if (numeroTarjeta.length() != 16) {
                                        System.out.println();
                                        System.out.println("El número de tarjeta debe tener exactamente 16 dígitos.");
                                        System.out.println();
                                        break;
                                    }
                                    System.out.print("Ingrese la fecha de vencimiento (MM/AA): ");
                                    String fechaVencimiento = scanner.nextLine();
                                    System.out.print("Ingrese el código de seguridad (3 dígitos): ");
                                    String codigoSeguridad = scanner.nextLine();

                                    System.out.println("Procesando el pago con tarjeta a nombre de " + titularTarjeta + "...");
                                    System.out.println();
                                    System.out.println("Pago realizado con éxito.");
                                    System.out.println("Detalles del pago:");
                                    for (int i = 0; i < indiceCarrito; i++) {
                                        System.out.println((i + 1) + ". " + carrito[i] + " - $" + preciosCarrito[i]);
                                    }
                                    System.out.println();
                                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                    System.out.println("IVA: $" + String.format("%.2f", iva));
                                    System.out.println("Total: $" + String.format("%.2f", total));
                                    System.out.println("Titular de la tarjeta: " + titularTarjeta);
                                    salir = true;
                                } else {
                                    System.out.println();
                                    System.out.println("Opción de pago inválida.");
                                    System.out.println();
                                }
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println();
                                System.out.println("Opción inválida.");
                                System.out.println();
                                break;
                        }
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    System.out.println();
                    break;
            }
        }
    }
}
