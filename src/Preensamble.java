import java.util.Scanner;

public class Preensamble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true; // inicializamos repetir como true
        double subtotal = 0; // inicializamos el subtotal en 0
        double whatts;
        
        //----------------------------------Procesadores
        //-------------------------------------------------------------------------------INTEL
        String[] marcaCPU = {"INTEL","AMD"};
        String[] intelGenCPU = {"Intel Core 12th", "Intel Core 13th", "Intel Core 14th"};
        double[] whattsintel = { 100, 200, 300};
        //-------------------------------------------------------------------------------Generacion CPU
        String[] intel12thCPU = {"Intel Core i3 12100", "Intel Core i5 12600", "Intel Core i7 12700", "Intel Core i9 12900"};
        double[] whattsintel12th = { 100, 200, 300, 400};
        double[] preciosintel12th = { 2299, 2399, 5169, 6918};
        String[] intel13thCPU = {"Intel Core i3 13100", "Intel Core i5 13600", "Intel Core i7 13700", "Intel Core i9 13900"};
        double[] whattsintel13th = { 100, 200, 300, 400};
        double[] preciosintel13th = { 2209, 3854, 4904, 11530};
        String[] intel14thCPU = {"Intel Core i3 14100", "Intel Core i5 14600", "Intel Core i7 14700", "Intel Core i9 14900"};
        double[] whattsintel14th = { 100, 200, 300, 400};
        double[] preciosintel14th = { 2259, 5013, 4904, 12059};
        //--------------------------------------------------------------------------AMD
        String[] amdGenCPU = {"AMD Ryzen 3000", "AMD Ryzen 5000", "AMD Ryzen 7000"};
        double[] whattsamd = { 100, 200, 300};
        //-------------------------------------------------------------------------------Generacion CPU
        String[] amd3000CPU = {"AMD Ryzen 3 3100", "AMD Ryzen 5 3600", "AMD Ryzen 7 3700X", "AMD Ryzen 9 3900X"};
        double[] whattsamd3000 = { 100, 200, 300, 400};
        double[] preciosamd3000 = { 1359, 2447, 4906, 13402}; 
        String[] amd5000CPU = {"AMD Ryzen 3 5100", "AMD Ryzen 5 5600", "AMD Ryzen 7 5700X", "AMD Ryzen 9 5900X"};
        double[] whattsamd5000 = { 100, 200, 300, 400};
        double[] preciosamd5000 = { 1500, 2880, 3435, 5741};
        String[] amd7000CPU = {"AMD Ryzen 3 7100", "AMD Ryzen 5 7600", "AMD Ryzen 7 7700X", "AMD Ryzen 9 7900X"};
        double[] whattsamd7000 = { 100, 200, 300, 400};
        double[] preciosamd7000 = { 2259, 5013, 4904, 12059};
        //--------------------------------------Motherboards
        //-------------------------------------------------------------------------------INTEL
        String[] lga1700 = {"MSI Micro-ATX PRO H610M-G DDR4, S-1700, Intel H610, 64GB DDR4", "MSI Micro-ATX PRO B760M-A WIFI, S-1700, Intel B760, 192GB DDR5", "ASUS GAMING ATX ROG Strix Z790-F WIFI, S-1700, Intel Z790, 128GB DDR5"};
        double[] precioslga1700 = {1269, 2778, 6255};
        
        
        
        while (repetir) {
            System.out.println("Bienvenido a sistema de armado guiado de PC de ALRM-TECH");
            System.out.println();
            System.out.println("¿Qué desea comprar?");
            System.out.println();
            for (int i = 0; i < marcaCPU.length; i++) {
                System.out.println((i + 1) + ". " + marcaCPU[i]);
            }
            System.out.println();
            System.out.print("Ingrese su opción: ");
            whatts = 0;

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
                    System.out.println("Ha seleccionado INTEL");
                    System.out.println("Seleccione la generación de su procesador:");
                    for (int i = 0; i < intelGenCPU.length; i++) {
                        System.out.println((i + 1) + ". " + intelGenCPU[i]);
                    }
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    int opcionIntel = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    whatts = whatts + whattsintel;
                    
                    // Manejar la selección de la generación de procesador Intel
                    switch (opcionIntel) {
                        case 1:
                            System.out.println("Ha seleccionado Intel Core 12th");
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < intel12thCPU.length; i++) {
                                System.out.println((i + 1) + ". " + intel12thCPU[i] + " $" + preciosintel12th[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionIntel12th = scanner.nextInt();
                            scanner.nextLine();
                            subtotal += preciosintel12th[opcionIntel12th - 1];
                            System.out.println(subtotal);
                            switch(Motherboards){}
                            break;
                        case 2:
                            System.out.println("Ha seleccionado Intel Core 13th");
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < intel13thCPU.length; i++) {
                                System.out.println((i + 1) + ". " + intel13thCPU[i] + " $" + preciosintel13th[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionIntel13th = scanner.nextInt();
                            scanner.nextLine();
                            subtotal += preciosintel13th[opcionIntel13th - 1];
                            System.out.println(subtotal);
                            break;
                        case 3:
                            System.out.println("Ha seleccionado Intel Core 14th");
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < intel14thCPU.length; i++) {
                                System.out.println((i + 1) + ". " + intel14thCPU[i] + " $" + preciosintel14th[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionIntel14th = scanner.nextInt();
                            scanner.nextLine();
                            subtotal += preciosintel14th[opcionIntel14th - 1];
                            System.out.println(subtotal);
                            break;
                        default:
                            System.out.println("Opción inválida. Inténtelo de nuevo.");
                            break;
                    }                    
                    break;/* 
                case 2:
                    System.out.println("Ha seleccionado AMD");
                    System.out.println("Seleccione la generación de su procesador:");
                    for (int i = 0; i < amdGenCPU.length; i++) {
                        System.out.println((i + 1) + ". " + amdGenCPU[i]);
                    }
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    int opcionAMD = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    
                    // Manejar la selección de la generación de procesador AMD
                    switch (opcionAMD) {
                        case 1:
                            System.out.println("Ha seleccionado AMD Ryzen 3000");
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < amd3000CPU.length; i++) {
                                System.out.println((i + 1) + ". " + amd3000CPU[i]);
                            }
                            // Agregar más opciones aquí si es necesario
                            break;
                        case 2:
                            System.out.println("Ha seleccionado AMD Ryzen 5000");
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < amd5000CPU.length; i++) {
                                System.out.println((i + 1) + ". " + amd5000CPU[i]);
                            }
                            // Agregar más opciones aquí si es necesario
                            break;
                        case 3:
                            System.out.println("Ha seleccionado AMD Ryzen 7000");
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < amd7000CPU.length; i++) {
                                System.out.println((i + 1) + ". " + amd7000CPU[i]);
                            }
                            // Agregar más opciones aquí si es necesario
                            break;
                        default:
                            System.out.println("Opción inválida. Inténtelo de nuevo.");
                            break;
                    }
                    break;*/
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}
