import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repetir = true;
        int MenuPrincipal;
        //--------------------------------------------------Comienzan declaraciones del apartado de piezas
        boolean salir = false;

        String[] categorias = {"Procesadores", "Tarjetas gráficas", "Monitores", "Motherboards", "Memorias RAM",
                "Almacenamientos", "Fuentes de poder PSUs", "Gabinetes", "Teclados", "Ratones", "Cascos",
                "Alfombrillas", "Material Conductivo", "Refrigeraciones", "Microfonos"};

        double[][] precios = {
                //--------Procesadores
                {2299, 2399, 5169, 6918, 2209, 3854, 4904, 11530, 2259, 5013, 4904, 12059, 1359, 2447, 4906, 13402, 1500, 2880, 3435, 5741, 2259, 5013, 4904, 12059},
                //--------Tarjetas Graficas
                {4065, 4829, 5244, 5726, 12664, 16344, 22069, 5709, 10993, 26660, 35748, 4000, 5280, 6850, 10069, 11809, 5609, 8629, 9889},
                //--------Monitores
                {2639, 4589, 5779, 7099},
                //--------Motherboards
                {1269, 2778, 6255, 829, 1659, 2459, 1399, 2719, 6959, 1079, 2339, 6699},
                //--------RAM
                {500, 800, 1200, 2400, 4800, 1200, 2400, 4800, 9600},
                //--------Almacenamientos
                {939, 759, 2069, 749, 899, 1059, 969, 659, 2089},
                //--------PSUs
                {1979, 1669, 1559, 1549, 2899, 2909, 2119, 2979, 5409},
                //--------Gabinetes
                {2500, 3000, 3000, 3000},
                //--------Teclados
                {800, 662, 500, 620},
                //--------Ratones
                {1999, 485, 3013, 1299, 1045, 2176},
                //--------Headsets
                {546, 1350, 1194},
                //--------Alfombrillas para raton
                {800, 1200, 800},
                //--------Material de Conductividad termica
                {300, 600, 350},
                //--------Refrigeraciones
                {950, 1600, 300, 700},
                //--------Microfonos
                {2068, 3976, 799, 2315}
        };

        String[][] productos = {
                //--------Procesadores
                {"Intel Core i3-12100", "Intel Core i5-12400", "Intel Core i7-12700", "Intel Core i9-12900K", "Intel Core i3-13100", "Intel Core i5-13600", "Intel Core i7-13700", "Intel Core i9-13900Kf", "Intel Core i3-14100", "Intel Core i5-14500", "Intel Core i7-14700k", "Intel Core i9-14900", "AMD Ryzen 3 3200g", "AMD Ryzen 5 3600", "AMD Ryzen 7 3700X", "AMD Ryzen 9 3950X", "AMD Ryzen 3 5300g", "AMD Ryzen 5 5600X", "AMD Ryzen 7 5700X", "AMD Ryzen 9 5900X", "AMD Ryzen 3 8300g", "AMD Ryzen 5 7600X", "AMD Ryzen - 7 7700X", "AMD Ryzen - 9 7900X"},
                //--------Tarjetas Graficas
                {"Asus dual RTX 2060 12GB GDDR6", "MSI RTX 2070 8GB GDDR6", "GIGABYTE RTX 2080 8GB GDDR6", "Asus RTX 3060 12GB GDDR6", "MSI RTX 3070 8GB GDRR6", "Gigabyte RTX 3080 10GB GDDR6X", "PNY RTX 3090 24 GB XLR8", "ZOTAC RTX 4060 8 GB GDDR6", "ASUS RTX 4070 12GB GDDR6X", "MSI RTX 4080 16GB GDDR6X", "Asus RTX 4090 24GB GDDR6X", "ASUS RX 5600 XT GDDR6", "Gigabyte RX 5700 XT 8GB GDDR6", "MSI RX 6600 8GB GDDR6", "ASUS RX 6700 XT 12GB GDDR6", "Sapphire RX 6800 16GB GDDR6", "ASUS RX 7600 8GB GDDR6", "ASUS RX 7700 XT 12GB GDDR6", "Sapphire RX 7800 XT 16GB GDDR6"},
                //--------Monitores
                {"Odyssey MTX27G 27 1080p 144Hz", "Odyssey G5 27 1440p 144Hz", "Odyssey G4 25 1080p 240Hz", "MSI G274QPX 27 1440p 240Hz"},
                //--------Motherboards
                {"Madre MSI Micro-ATX PRO H610M-G DDR4, S-1700, Intel H610, 64GB DDR4", "Madre MSI Micro-ATX PRO B760M-A WIFI, S-1700, Intel B760, 192GB DDR5", "ASUS GAMING ATX ROG Strix Z790-F WIFI, S-1700, Intel Z790, 128GB DDR5", "Biostar micro ATX A520MH, S-AM4, AMD A520, HDMI, 64GB DDR4", "MSI B550M ATX PRO-VDH, S-AM4, AMD B550, HDMI, 128GB DDR4", "Gigabyte ATX B550, S-AM4, AMD B550, HDMI, 128GB DDR4", "Gigabyte Micro ATX B450M H, S-AM4, AMD B450, HDMI, 32GB DDR4", "ASUS ATX Prime B550-Plus, S-AM4, AMD B550, HDMI, 128GB DDR4", "Gigabyte AORUS X570S, S-AM4, AMD X507, USB 3.2, 128GB DDR4", "MSI Micro-ATX PRO A620M-E, S-AM5, AMD A620, HDMI, 96GB DDR5", "Gigabyte Micro-ATX A620M, S-AM5, AMD A620, HDMI, 192GB DDR5", "Acer ATX 620M-H, S-AM5, AMD 620, HDMI, 256GB DDR5"},
                //--------RAM
                {"RAM DDR5 G.Skill Trident Z Neo, 16GB (2x8GB), 8400MHz, CL36, Negro", "RAM DDR5 G.Skill Trident Z Neo, 32GB (2x16GB), 8400MHz, CL36, Negro", "RAM DDR5 G.Skill Trident Z Neo, 64GB (4x16GB), 8400MHz, CL36, Negro", "RAM DDR5 Corsair Dominator Platinum RGB, 128GB (4x32GB), 9600MHz, CL40, Blanco"},
                //--------Almacenamientos
                {"Kingston SSD NVMe PCIe 500GB Gen 4, Lectura 7000 MB/s, Escritura 3500 MB/s", "WD HDD Externo 2TB Elements Portable, 2.5, USB 3.0, Negro", "Samsung SSD 980 NVMe PCIe 2TB, Lectura 3500 MB/s, Escritura 3200 MB/s, Negro", "Seagate HDD 16TB, Exos X16 Enterprise, 7200 RPM, SATA 6Gb/s, 3.5"},
                //--------PSUs
                {"CORSAIR Fuente de Poder 750W RM750 80+ Gold Modular, ATX", "GIGABYTE Fuente de Poder 700W GP-P700G 80+ Gold Modular, ATX", "Seasonic Fuente de Poder 850W FOCUS GX-850, 80+ Gold, ATX, Modular"},
                //--------Gabinetes
                {"Corsair Gabinete ATX Midi-Tower 4000D Airflow, Cristal Templado, Negro", "NZXT Gabinete ATX Mid-Tower H510i Compact, Cristal Templado, Negro", "Lian Li Gabinete ATX Full Tower PC-O11 Dynamic, Cristal Templado, Negro"},
                //--------Teclados
                {"Razer Teclado Mecánico Gaming BlackWidow V3, Switch Verde, RGB", "Logitech Teclado Mecánico Gaming G413 Carbon, Switch Romer-G, Iluminación Roja", "Corsair Teclado Mecánico Gaming K95 RGB PLATINUM XT, Cherry MX Speed, RGB, Aluminio"},
                //--------Ratones
                {"Logitech Ratón Gamer G502 HERO, 16000 DPI, RGB", "Razer Ratón Gamer DeathAdder V2 Mini, 8500 DPI, RGB", "SteelSeries Ratón Gamer Rival 3, 8500 DPI, RGB"},
                //--------Headsets
                {"Razer Auriculares Gaming Kraken Ultimate USB, THX Spatial Audio, RGB", "HyperX Auriculares Gaming Cloud Alpha S 7.1, Cableado, Surround Sound, Negro", "Logitech Auriculares Gaming G PRO X, Sonido Envolvente 7.1, Negro"},
                //--------Alfombrillas para raton
                {"Razer Alfombrilla de Ratón Goliathus Extended Chroma RGB, Suave, Negro", "HyperX Alfombrilla de Ratón FURY S Pro Gaming, Tela, Tamaño M, Negro", "Corsair Alfombrilla de Ratón MM300 Anti-Fray Cloth Gaming, Tamaño Extendido, Negro"},
                //--------Material de Conductividad termica
                {"Geltérmico térmico GD900 para CPU GPU, Pasta de Grasa Térmica, 30g", "Pasta Térmica Arctic MX-4, Alto Rendimiento, 4g", "Pasta Térmica Noctua NT-H2, 3.5g"},
                //--------Refrigeraciones
                {"Corsair Refrigeración Líquida Hydro H100i RGB PLATINUM, Radiador 240mm, Dos Ventiladores ML PRO", "Cooler Master Refrigeración Líquida MasterLiquid ML240L RGB V2, Radiador 240mm, Dos Ventiladores SickleFlow", "Noctua Refrigeración por Aire NH-D15, Ventilador de Doble Torre, Secuencias PWM"},
                //--------Microfonos
                {"Razer Micrófono USB Seiren X, Unidireccional, Reducción de Ruido", "HyperX Micrófono QuadCast, Condensador, Patrón de captura Estéreo, Anti-Golpes, Rojo", "Blue Yeti Micrófono USB, Patrón Múltiple, Mute, Negro"}
        };

        String[] carrito = new String[100];
        double[] preciosCarrito = new double[100];
        int indiceCarrito = 0;
        //----------------------------------------------------------------termina declaraciones del apartado de piezas

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
                    repetir = false; // Salir del bucle después de procesar la opción 1
                    while (!salir) {
                        System.out.println("Bienvenido al ALRM-TECH Piezas");
                        System.out.println();
                        System.out.println("¿Qué desea comprar?");
                        System.out.println();
                        for (int i = 0; i < categorias.length; i++) {
                            System.out.println((i + 1) + ". " + categorias[i]);
                        }
                        System.out.println((categorias.length + 1) + ". Ver carrito");
                        System.out.println((categorias.length + 2) + ". Salir");
                        System.out.println();
                        System.out.print("Ingrese su opción: ");
            
                        int opcion;
                        try {
                            opcion = scanner.nextInt();
                            scanner.nextLine(); // Limpiar el buffer del scanner
                        } catch (java.util.InputMismatchException e) {
                            System.out.println();
                            System.out.println("Entrada inválida. Inténtelo de nuevo.");
                            System.out.println();
                            scanner.nextLine(); // Limpiar la cache
                            continue;
                        }
            
                        switch (opcion) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                                int categoriaSeleccionada = opcion - 1;
                                System.out.println();
                                System.out.println("Productos disponibles en la categoría \"" + categorias[categoriaSeleccionada] + "\":");
                                System.out.println();
                                for (int i = 0; i < productos[categoriaSeleccionada].length; i++) {
                                    System.out.println(productos[categoriaSeleccionada][i] + " - $" + precios[categoriaSeleccionada][i]);
                                }
                                System.out.print("Ingrese el nombre del producto que desea comprar: ");
                                String compraProducto = scanner.nextLine();
                                boolean encontradoProducto = false;
                                for (int i = 0; i < productos[categoriaSeleccionada].length; i++) {
                                    if (productos[categoriaSeleccionada][i].equalsIgnoreCase(compraProducto)) {
                                        encontradoProducto = true;
                                        carrito[indiceCarrito] = productos[categoriaSeleccionada][i];
                                        preciosCarrito[indiceCarrito] = precios[categoriaSeleccionada][i];
                                        System.out.println();
                                        System.out.println("Ha agregado un " + productos[categoriaSeleccionada][i] + " al carrito.");
                                        System.out.println();
                                        indiceCarrito++;
                                        break;
                                    }
                                }
                                if (!encontradoProducto) {
                                    System.out.println();
                                    System.out.println("El producto ingresado no está disponible.");
                                    System.out.println();
                                }
                                break;
                            case 16:
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
                                    scanner.nextLine(); // Consumir el salto de linea
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
                                                System.out.println("Presente este recibo para recoger su compra en una tienda de conveniencia (Oxxo, 7eleven, etc.).");
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
                            case 17:
                                salir = true;
                                break;
                            default:
                                System.out.println();
                                System.out.println("Opción inválida. Inténtelo de nuevo.");
                                System.out.println();
                                break;
                        }
                    }
                
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Bienvenido al sistema de armado guiado de PC de ALRM-TECH");
                    repetir = false; // Salir del bucle después de procesar la opción 2
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}