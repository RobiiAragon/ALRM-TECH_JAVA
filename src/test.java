import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;
        double subtotal = 0;
        double whatts = 0; // Inicializamos la variable para almacenar el consumo total de watts
        int opcionIntel, opcionMotherboard, DDR;
        String opcionSeleccionada; // Variable para almacenar la opción seleccionada por el usuario

        //----------------------------------Seleccion marca de Procesador
        String[] marcaCPU = {"INTEL", "AMD"};
        String[] intelGenCPU = {"Intel Core 12th", "Intel Core 13th", "Intel Core 14th"};
        double[] whattsintel = {100, 200, 300};
        //-------------------------------------------------------------------------------Generacion INTEL CPU
        String[] intel12thCPU = {"Intel Core i3 12100", "Intel Core i5 12600", "Intel Core i7 12700", "Intel Core i9 12900"};
        double[] whattsintel12th = {100, 200, 300, 400};
        double[] preciosintel12th = {2299, 2399, 5169, 6918};
        String[] intel13thCPU = {"Intel Core i3 13100", "Intel Core i5 13600", "Intel Core i7 13700", "Intel Core i9 13900"};
        double[] whattsintel13th = {100, 200, 300, 400};
        double[] preciosintel13th = {2209, 3854, 4904, 11530};
        String[] intel14thCPU = {"Intel Core i3 14100", "Intel Core i5 14600", "Intel Core i7 14700", "Intel Core i9 14900"};
        double[] whattsintel14th = {100, 200, 300, 400};
        double[] preciosintel14th = {2259, 5013, 4904, 12059};
        //--------------------------------------Motherboards INTEL
        String[] lga1700 = {"MSI Micro-ATX PRO H610M-G, S-1700, MAX 64GB DDR4", "MSI Micro-ATX PRO B760M-A, S-1700, MAX 192GB DDR5", "ASUS ROG Strix ATX Z790-F, S-1700, MAX 128GB DDR5"};
        double[] precioslga1700 = {1269, 2778, 6255};
        double[] whattslga1700 = {100, 100, 100};
        //--------------------------------------Gabinetes
        String[] tamañoCase = {"MicroATX", "ATX"};
        String[] catalogoPlacaMicroATX = {"Game Factor CSG550 con Ventana, 2 Ventiladores, Micro ATX, Negro", "NZXT H510, RGB, Cristal Templado, 2 Ventiladores, ATX, Negro", "Corsair 3000D, Cristal Templado 2 Ventiladores ATX, Negro", "Corsair 4000D, Cristal Templado, 2 Ventiladores, ATX, Blanco"};
        double[] precioMicroATX = {2500, 3000, 3000, 3000};
        String[] catalogoPlacaATX = {"NZXT H510, RGB, Cristal Templado, 2 Ventiladores, ATX, Negro", "Corsair 3000D, Cristal Templado 2 Ventiladores ATX, Negro", "Corsair 4000D, Cristal Templado, 2 Ventiladores, ATX, Blanco"};
        double[] precioATX = {3000, 3000, 3000};
        //--------------------------------------RAM
        String[] DDR4 = {"Corsair Dominator RGB 8GB DDR4, 3200MHz, 1x8GB", "Corsair Dominator RGB 16GB DDR4, 3200MHz, 2x8GB", "Kingston FURY Beast 32GB DDR4, 3200MHz, 1X32GB", "Kingston FURY Beast 64GB DDR4, 3200MHz, 2X32GB"};
        double[] preciosDDR4 = {500, 800, 1200, 2400};
        String[] DDR5 = {"RAM DDR5 G.Skill Trident Z Neo, 16GB (2x8GB), 8400MHz, CL36, Negro", "RAM DDR5 G.Skill Trident Z Neo, 32GB (2x16GB), 8400MHz, CL36, Negro", "RAM DDR5 G.Skill Trident Z Neo, 64GB (4x16GB), 8400MHz, CL36, Negro"};
        double[] preciosDDR5 = {1200, 2400, 4800};
        //--------------------------------------Almacenamiento
        String[] TipoAlmacenamiento = {"HDDsata","SSDsata","NVMe"};
        String[] HDDsata = {"HDD Seagate Barracuda 3.5, 2TB, SATA III, 6 Gbit/s, 7200RPM, 256MB Cache", "HDD WD Blue 2.5, 500GB, SATA III, 6 Gbit/s, 5400RPM, 16MB Cache", "HDD WD Black 3.5, 2TB, SATA III, 6 Gbit/s, 7200RPM, 64MB Cache"};
        double[] preciosHDD = {939, 759, 2069};
        String[] SSDsata = {"SSD Western Digital Blue, 250GB, SATA III, 2.5", "SSD Western Digital WD Green, 1TB, SATA III, 2.5", "SSD Team Group T-Force Vulcan, 1TB, SATA III, 2.5"};
        double[] preciosSSD = {749, 899, 1059};
        String[] NVMe = {"NVMe Kingston NV2, 1TB, PCI Express 4.0", "NVMe PNY CS1030, 500GB, PCI Express 3.0", "NVMe WD Blue SN580, 2TB, PCI Express 4.0"};
        double[] preciosNVMe = {969, 659, 2089};
        

        while (repetir) {
            System.out.println("Bienvenido a sistema de armado guiado de PC de ALRM-TECH");
            System.out.println();

            System.out.println("Empezemos con el Procesador");
            System.out.println();
            for (int i = 0; i < marcaCPU.length; i++) {
                System.out.println((i + 1) + ". " + marcaCPU[i]);
            }
            System.out.println();
            System.out.print("Ingrese su opción: ");

            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println();
                System.out.println("Entrada inválida. Inténtelo de nuevo.");
                System.out.println();
                scanner.nextLine();
                continue;
            }
            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Ha seleccionado " + marcaCPU[opcion - 1]); // Se corrige aquí
                    System.out.println("Seleccione la generación de su procesador:");
                    System.out.println();
                    for (int i = 0; i < intelGenCPU.length; i++) {
                        System.out.println((i + 1) + ". " + intelGenCPU[i]);
                    }
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    opcionIntel = scanner.nextInt();
                    scanner.nextLine();
                    whatts += whattsintel[opcionIntel - 1];
                    System.out.println();
                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                    switch (opcionIntel) {
                        case 1:
                            System.out.println("Ha seleccionado " + intelGenCPU[opcionIntel - 1]); // Se corrige aquí
                            System.out.println();
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < intel12thCPU.length; i++) {
                                System.out.println((i + 1) + ". " + intel12thCPU[i] + " $" + preciosintel12th[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionCPU = scanner.nextInt();
                            scanner.nextLine();
                            whatts += whattsintel12th[opcionCPU - 1]; // Suma el consumo de watts del procesador seleccionado
                            System.out.println();
                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                            subtotal += preciosintel12th[opcionCPU - 1]; // Suma el precio del procesador seleccionado
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.println();
                            System.out.println("Continuemos con las Motherboards");
                            System.out.println("Estas son las Motherboards compatibles con tu CPU");
                            System.out.println();
                            for (int i = 0; i < lga1700.length; i++) {
                                System.out.println((i + 1) + ". " + lga1700[i] + " $" + precioslga1700[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            opcionMotherboard = scanner.nextInt();
                            System.out.println();
                            scanner.nextLine();

                            DDR = (opcionMotherboard <= 2) ? 4 : 5;
                            System.out.println("Ha seleccionado " + lga1700[opcionMotherboard - 1]);
                            System.out.println();
                            if (opcionMotherboard >= 1 && opcionMotherboard <= 3) {
                                whatts += whattslga1700[opcionMotherboard - 1];
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                                subtotal += precioslga1700[opcionMotherboard - 1];
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));

                                // Mostrar el catálogo de RAM correspondiente
                                System.out.println();
                                System.out.println("Ahora toca seleccionar la memoria RAM");
                                System.out.println("Debido a que tu Motherboard es DDR" + DDR + ", estos son el catálogo de RAMs disponibles para tu Motherboard");
                                System.out.println();
                                if (DDR == 4) {
                                    for (int i = 0; i < DDR4.length; i++) {
                                        System.out.println((i + 1) + ". " + DDR4[i] + " $" + preciosDDR4[i]);
                                    }
                                } else if (DDR == 5) {
                                    for (int i = 0; i < DDR5.length; i++) {
                                        System.out.println((i + 1) + ". " + DDR5[i] + " $" + preciosDDR5[i]);
                                    }
                                } else {
                                    System.out.println("No hay catálogo de RAM disponible para este tipo de placa base.");
                                }
                                System.out.println();
                                System.out.print("Ingrese su opción: ");
                                int opcionRAM = scanner.nextInt();
                                double precioRAM = 0;
                                if (DDR == 4 && opcionRAM >= 1 && opcionRAM <= DDR4.length) {
                                    precioRAM = preciosDDR4[opcionRAM - 1];
                                } else if (DDR == 5 && opcionRAM >= 1 && opcionRAM <= DDR5.length) {
                                    precioRAM = preciosDDR5[opcionRAM - 1];
                                } else {
                                    System.out.println("Opción inválida. No se ha seleccionado RAM.");
                                }
                                subtotal += precioRAM;
                                System.out.println();
                                opcionSeleccionada = (DDR == 4) ? DDR4[opcionRAM - 1] : DDR5[opcionRAM - 1];
                                System.out.println();
                                System.out.println("Ha seleccionado " + opcionSeleccionada);
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts); // Imprimimos el consumo total de watts
                            }

                            System.out.println();
                            System.out.println("Es turno de que selecciones un tipo de almacenamiento");
                            System.out.println();
                            for (int i = 0; i < TipoAlmacenamiento.length; i++) {
                                System.out.println((i + 1) + ". " + TipoAlmacenamiento[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionAlmacenamiento = scanner.nextInt();
                            opcionSeleccionada = TipoAlmacenamiento[opcionAlmacenamiento - 1]; // Asignar la opción seleccionada
                            switch (opcionAlmacenamiento) {
                                case 1:
                                    System.out.println();
                                    System.out.println("Has seleccionado HDD");
                                    System.out.println("Estas son las opciones de HDD disponibles:");
                                    System.out.println();
                                    for (int i = 0; i < HDDsata.length; i++) {
                                        System.out.println((i + 1) + ". " + HDDsata[i] + " $" + preciosHDD[i]);
                                    }
                                    System.out.println();
                                    System.out.print("Ingrese su opción: ");
                                    int opcionHDD = scanner.nextInt();
                                    scanner.nextLine();
                                    opcionSeleccionada = HDDsata[opcionHDD - 1]; // Asignar la opción seleccionada
                                    System.out.println();
                                    System.out.println("Ha seleccionado el " + opcionSeleccionada);
                                    System.out.println();
                                    subtotal += preciosHDD[opcionHDD - 1]; // Suma el precio del HDD seleccionado al subtotal
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    break;
                                case 2:
                                    System.out.println();
                                    System.out.println("Has seleccionado SSD");
                                    System.out.println("Estas son las opciones de SSD disponibles:");
                                    for (int i = 0; i < SSDsata.length; i++) {
                                        System.out.println((i + 1) + ". " + SSDsata[i] + " $" + preciosSSD[i]);
                                    }
                                    System.out.println();
                                    System.out.print("Ingrese su opción: ");
                                    int opcionSSD = scanner.nextInt();
                                    scanner.nextLine();
                                    opcionSeleccionada = SSDsata[opcionSSD - 1]; // Asignar la opción seleccionada
                                    System.out.println();
                                    System.out.println("Ha seleccionado " + opcionSeleccionada);
                                    System.out.println();
                                    subtotal += preciosSSD[opcionSSD - 1]; // Suma el precio del SSD seleccionado al subtotal
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    break;
                                case 3:
                                    System.out.println();
                                    System.out.println("Has seleccionado NVMe");
                                    System.out.println("Estas son las opciones de NVMe disponibles:");
                                    for (int i = 0; i < NVMe.length; i++) {
                                        System.out.println((i + 1) + ". " + NVMe[i] + " $" + preciosNVMe[i]);
                                    }
                                    System.out.println();
                                    System.out.print("Ingrese su opción: ");
                                    int opcionNVMe = scanner.nextInt();
                                    scanner.nextLine();
                                    opcionSeleccionada = NVMe[opcionNVMe - 1]; // Asignar la opción seleccionada
                                    System.out.println();
                                    System.out.println("Ha seleccionado " + opcionSeleccionada);
                                    System.out.println();
                                    subtotal += preciosNVMe[opcionNVMe - 1]; // Suma el precio del NVMe seleccionado al subtotal
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    break;
                                default:
                                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                                    break;
                            }
                            System.out.println();
                            System.out.println("Es hora se seleccionar un Gabinete");
                            System.out.println();
                            System.out.println("Este es el catalogo de gabinetes disponibles compatibles con tu placa madre");

                            if(tamañoCase !ATX){
                                System.out.println("Este es el catalogo de gabinetes disponibles compatibles con tu placa madre");
                            }
                            break;
                        default:
                            System.out.println("Opción inválida. Inténtelo de nuevo.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}
