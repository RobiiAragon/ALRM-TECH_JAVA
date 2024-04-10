import java.util.Scanner;

public class Preensamble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;
        double subtotal = 0;
        double whatts = 0;
        int opcionIntel, opcionAMD, opcionNvidia, opcionMotherboard, DDR;
        String opcionSeleccionada; // Variable para almacenar la opción seleccionada por el usuario
        opcionAMD = 0;
        opcionNvidia = 0;

        //----------------------------------Seleccion marca de Procesador
        String[] marcaCPU = {"INTEL", "AMD"};
        //--------------------------------------------------------------------------INTEL
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

        //-------------------------------------------------------------------------------------Motherboards INTEL
        String[] lga1700 = {"MSI Micro-ATX PRO H610M-G, S-1700, MAX 64GB DDR4", "MSI Micro-ATX PRO B760M-A, S-1700, MAX 192GB DDR5", "ASUS ROG Strix ATX Z790-F, S-1700, MAX 128GB DDR5"};
        double[] precioslga1700 = {1269, 2778, 6255};
        double[] whattslga1700 = {100, 100, 100};

        //--------------------------------------------------------------------------AMD
        String[] amdGenCPU = {"AMD Ryzen 3000", "AMD Ryzen 5000", "AMD Ryzen 7000"};
        double[] whattsAmd = {100, 200, 300};
        //-------------------------------------------------------------------------------Generacion AMD CPU
        String[] amd3000CPU = {"AMD Ryzen 3 3100", "AMD Ryzen 5 3600", "AMD Ryzen 7 3700X", "AMD Ryzen 9 3900X"};
        double[] whattsAmd3000 = {100, 200, 300, 400};
        double[] preciosAmd3000 = {1359, 2447, 4906, 13402}; 
        String[] amd5000CPU = {"AMD Ryzen 3 5100", "AMD Ryzen 5 5600", "AMD Ryzen 7 5700X", "AMD Ryzen 9 5900X"};
        double[] whattsAmd5000 = {100, 200, 300, 400};
        double[] preciosAmd5000 = {1500, 2880, 3435, 5741};
        String[] amd7000CPU = {"AMD Ryzen 3 7100", "AMD Ryzen 5 7600", "AMD Ryzen 7 7700X", "AMD Ryzen 9 7900X"};
        double[] whattsAmd7000 = {100, 200, 300, 400};
        double[] preciosAmd7000 = {2259, 5013, 4904, 12059};
        //---------------------------------------------------------------------------------------Motherboards AMD
        //-------------------------------------------------------------------------------AMD AM4
        String[] amd3000 = {"MSI Micro-ATX PRO H610M-G DDR4, S-1700, Intel H610, 64GB DDR4", "MSI Micro-ATX PRO B760M-A WIFI, S-1700, Intel B760, 192GB DDR5", "ASUS GAMING ATX ROG Strix Z790-F WIFI, S-1700, Intel Z790, 128GB DDR5"};
        double[] preciosMotheramd3000 = {1269, 2778, 6255};
        double[] whattsMotheramd3000 = {100,100,100};
        //-------------------------------------------------------------------------------AMD AM5
        String[] amd5000 = {"MSI Micro-ATX PRO H610M-G DDR4, S-1700, Intel H610, 64GB DDR4", "MSI Micro-ATX PRO B760M-A WIFI, S-1700, Intel B760, 192GB DDR5", "ASUS GAMING ATX ROG Strix Z790-F WIFI, S-1700, Intel Z790, 128GB DDR5"};
        double[] preciosMotheramd5000 = {1269, 2778, 6255};
        double[] whattsMotheramd5000 = {100,100,100};

        //-------------------------------------------------------------------------------Refrigeraciónes
        String[] refrigeracion = {"Corsair Refrigeración Líquida Hydro H100i RGB PLATINUM, Radiador 240mm, Dos Ventiladores ML PRO", "Cooler Master Refrigeración Líquida MasterLiquid ML240L RGB V2, Radiador 240mm, Dos Ventiladores SickleFlow", "NZXT Refrigeración Líquida Kraken X53, Radiador 240mm, Dos Ventiladores AER P 120mm"};
        double[] preciosRefrigeracion = {2500, 2000, 3000};

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
        //--------------------------------------Gabinetes
        String[] catalogoPlacaMicroATX = {"Game Factor CSG550 con Ventana, 2 Ventiladores, Micro ATX, Negro", "NZXT H510, RGB, Cristal Templado, 2 Ventiladores, ATX, Negro", "Corsair 3000D, Cristal Templado 2 Ventiladores ATX, Negro", "Corsair 4000D, Cristal Templado, 2 Ventiladores, ATX, Blanco"};
        double[] precioMicroATX = {2500, 3000, 3000, 3000};
        String[] catalogoPlacaATX = {"NZXT H510, RGB, Cristal Templado, 2 Ventiladores, ATX, Negro", "Corsair 3000D, Cristal Templado 2 Ventiladores ATX, Negro", "Corsair 4000D, Cristal Templado, 2 Ventiladores, ATX, Blanco"};
        double[] precioATX = {3000, 3000, 3000};
        //--------------------------------------Nvidia Geforce
        String[] NvidiaGenGPU = {"RTX 2000", "RTX 3000", "RTX 4000"};
        double[] whattsNvidia = {100, 200, 300};
        //--------------------------------------RTX 2000
        String[] NvidiaRTX2000 = {"Asus dual RTX 2060 12GB GDDR6", "MSI RTX 2070 8GB GDDR6", "GIGABYTE RTX 2080 8GB GDDR6"};
        double[] PreciosRTX2000 = {4065, 4829, 5244};
        double[] whattsRTX2000 = {100, 200, 300, 400};
        //--------------------------------------RTX 3000
        String[] NvidiaRTX3000 = {"Asus RTX 3060 12GB GDDR6", "MSI RTX 3070 8GB GDRR6", "Gigabyte RTX 3080 10GB GDDR6X", "PNY RTX 3090 24 GB XLR8"};
        double[] PreciosRTX3000 = { 5726, 12664, 16344, 22069};
        double[] whattsRTX3000 = {100, 200, 300, 400};
        //--------------------------------------RTX 4000
        String[] NvidiaRTX4000 = {"ZOTAC RTX 4060 8 GB GDDR6", "ASUS RTX 4070 12GB GDDR6X", "MSI RTX 4080 16GB GDDR6X", "Asus RTX 4090 24GB GDDR6X"};
        double[] PreciosRTX4000 = {5709, 10993, 26660, 35748};
        double[] whattsRTX4000 = {100, 200, 300, 400};

        //--------------------------------------AMD Radeon
        String[] AMDGenGPU = {"RX 5000", "RX 6000", "RX 7000"};
        double[] whattsAMD = {100, 200, 300};

        //--------------------------------------RX 5000
        String[] AMDRX5000 = {"ASUS RX 5600 XT GDDR6", "Gigabyte RX 5700 XT 8GB GDDR6"};
        double[] PreciosRX5000 = {4000, 5280};
        double[] whattsRX5000 = {100, 200, 300};

        //--------------------------------------RX 6000
        String[] AMDRX6000 = {"MSI RX 6600 8GB GDDR6", "ASUS RX 6700 XT 12GB GDDR6", "Sapphire RX 6800 16GB GDDR6"};
        double[] PreciosRX6000 = {6850, 10069, 11809};
        double[] whattsRX6000 = {100, 200, 300};

        //--------------------------------------RX 7000
        String[] AMDRX7000 = {"ASUS RX 7600 8GB GDDR6", "ASUS RX 7700 XT 12GB GDDR6", "Sapphire RX 7800 XT 16GB GDDR6"};
        double[] PreciosRX7000 = {5609, 8629, 9889};
        double[] whattsRX7000 = {100, 200, 300};

        //--------------------------------------Fuentes de poder
        String[] PSUs600 = {"Fuente de Poder EVGA 80 PLUS Gold, Modular, 600W", "Fuente de Poder Cybercore 80 PLUS Platinum, 600W", "Fuente de Poder EVGA 80 PLUS Gold, Modular, 800W", "Fuente de Poder Cybercore 80 PLUS Platinum, 800W"};
        double[] preciosPSUs600 = {1500, 2000, 2000, 2500};
        String[] PSUs800 = {"Fuente de Poder EVGA 80 PLUS Gold, Modular, 800W", "Fuente de Poder Cybercore 80 PLUS Platinum, 800W", "Fuente de Poder EVGA 80 PLUS Gold, Modular, 1200W", "Fuente de Poder Cybercore 80 PLUS Platinum, 1200W"};
        double[] preciosPSUs800 = {2000, 2500, 2500, 3000};
        String[] PSUs1200 = {"Fuente de Poder EVGA 80 PLUS Gold, Modular, 1200W", "Fuente de Poder Cybercore 80 PLUS Platinum, 1200W", "Fuente de Poder EVGA 80 PLUS Gold, Modular, 1600W", "Fuente de Poder Cybercore 80 PLUS Platinum, 1600W"};
        double[] preciosPSUs1200 = {2500, 3000, 3000, 3500};
        String[] PSUs1600 = {"Fuente de Poder EVGA 80 PLUS Gold, Modular, 1600W", "Fuente de Poder Cybercore 80 PLUS Platinum, 1600W"};
        double[] preciosPSUs1600 = {3000, 3500};


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
                    System.out.println("Ha seleccionado " + marcaCPU[opcion - 1]); 
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
                        case 1://--------------------------------------------------------------------------------------------INTEL
                            System.out.println("Ha seleccionado " + intelGenCPU[opcionIntel - 1]); 
                            System.out.println();
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < intel12thCPU.length; i++) {
                                System.out.println((i + 1) + ". " + intel12thCPU[i] + " $" + preciosintel12th[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionCPU = scanner.nextInt();
                            scanner.nextLine();
                            whatts += whattsintel12th[opcionCPU - 1]; 
                            System.out.println();
                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                            subtotal += preciosintel12th[opcionCPU - 1]; 
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            break;
                        case 2:
                            System.out.println("Ha seleccionado " + intelGenCPU[opcionIntel - 1]); 
                            System.out.println();
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < intel13thCPU.length; i++) {
                                System.out.println((i + 1) + ". " + intel13thCPU[i] + " $" + preciosintel13th[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            opcionCPU = scanner.nextInt();
                            scanner.nextLine();
                            whatts += whattsintel13th[opcionCPU - 1]; 
                            System.out.println();

                            subtotal += preciosintel13th[opcionCPU - 1]; 
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                            break;
                        case 3:
                            System.out.println("Ha seleccionado " + intelGenCPU[opcionIntel - 1]); 
                            System.out.println();
                            System.out.println("Seleccione la gama del procesador:");
                            for (int i = 0; i < intel14thCPU.length; i++) {
                                System.out.println((i + 1) + ". " + intel14thCPU[i] + " $" + preciosintel14th[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            opcionCPU = scanner.nextInt();
                            scanner.nextLine();
                            whatts += whattsintel14th[opcionCPU - 1]; 
                            System.out.println();

                            subtotal += preciosintel14th[opcionCPU - 1]; 
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                            break;
                        default:
                            System.out.println("Opción inválida. Inténtelo de nuevo.");
                            break;
                    }
                    // Agregar selección de motherboards INTEL
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
                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                            //--------------------------------------Refrigeración
                            System.out.println();
                            System.out.println("Es hora de seleccionar un sistema de refrigeración");
                            System.out.println();
                            for (int i = 0; i < refrigeracion.length; i++) {
                                System.out.println((i + 1) + ". " + refrigeracion[i] + " $" + preciosRefrigeracion[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionRefrigeracion = scanner.nextInt();
                            scanner.nextLine();
                            String refrigeracionSeleccionada = refrigeracion[opcionRefrigeracion - 1];
                            double precioRefrigeracion = preciosRefrigeracion[opcionRefrigeracion - 1];
                            System.out.println();
                            System.out.println("Ha seleccionado " + refrigeracionSeleccionada);
                            System.out.println();
                            subtotal += precioRefrigeracion; // Sumar el precio de la refrigeración al subtotal
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.println();

                            //--------------------------------------RAM
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

                            System.out.println();
                    //-----------------------------------------------------------------------------------Almacenamiento
                            System.out.println("Es turno de que selecciones un tipo de almacenamiento");
                            System.out.println();
                            for (int i = 0; i < TipoAlmacenamiento.length; i++) {
                                System.out.println((i + 1) + ". " + TipoAlmacenamiento[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionAlmacenamiento = scanner.nextInt();
                            scanner.nextLine();
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
                                System.out.println("Es hora de seleccionar un Gabinete");
                                System.out.println();
                                System.out.println("Este es el catálogo de gabinetes disponibles compatibles con tu placa madre");
                                System.out.println();

                                if (opcionMotherboard <= 2) { // Si es una placa MicroATX
                                    for (int i = 0; i < catalogoPlacaMicroATX.length; i++) {
                                        System.out.println((i + 1) + ". " + catalogoPlacaMicroATX[i] + " $" + precioMicroATX[i]);
                                    }
                                } else { // Si es una placa ATX
                                    for (int i = 0; i < catalogoPlacaATX.length; i++) {
                                        System.out.println((i + 1) + ". " + catalogoPlacaATX[i] + " $" + precioATX[i]);
                                    }
                                }

                                System.out.println();
                                System.out.print("Ingrese su opción: ");
                                int opcionGabinete = scanner.nextInt();
                                scanner.nextLine();
                                String gabineteSeleccionado = (opcionMotherboard <= 2) ? catalogoPlacaMicroATX[opcionGabinete - 1] : catalogoPlacaATX[opcionGabinete - 1];
                                double precioGabinete = (opcionMotherboard <= 2) ? precioMicroATX[opcionGabinete - 1] : precioATX[opcionGabinete - 1];
                                System.out.println();
                                System.out.println("Ha seleccionado " + gabineteSeleccionado);
                                System.out.println();
                                subtotal += precioGabinete; // Sumar el precio del gabinete al subtotal
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                System.out.println();

                                System.out.println("Es hora de seleccionar una Tarjeta Gráfica");
                                System.out.println("Este es el catálogo de Tarjetas Gráficas disponibles:");
                                System.out.println();
                                System.out.println("1. Nvidia Geforce");
                                System.out.println("2. AMD Radeon");
                                System.out.println();
                                System.out.print("Ingrese su opción (1 para Nvidia, 2 para AMD): ");
                                int opcionGPU = scanner.nextInt();
                                scanner.nextLine();

                                switch (opcionGPU) {
                                    case 1: // Nvidia
                                        System.out.println();
                                        System.out.println("Has seleccionado Nvidia Geforce");
                                        System.out.println("Estas son las generaciones de Nvidia Geforce disponibles:");
                                        for (int i = 0; i < NvidiaGenGPU.length; i++) {
                                            System.out.println((i + 1) + ". " + NvidiaGenGPU[i]);
                                        }
                                        System.out.println();
                                        System.out.print("Ingrese su opción: ");
                                        int opcionGenNvidia = scanner.nextInt();
                                        scanner.nextLine();
                                        String genSeleccionada = NvidiaGenGPU[opcionGenNvidia - 1];
                                        whatts += whattsNvidia[opcionGenNvidia - 1]; 
                                        System.out.println();
                                        System.out.println("Has seleccionado " + genSeleccionada);
                                        System.out.println("Estas son las opciones disponibles para " + genSeleccionada + ":");
                                        String[] opcionesNvidia = null;
                                        double[] preciosNvidia = null;
                                        double[] wattsNvidia = null;
                                        switch (genSeleccionada) {
                                            case "RTX 2000":
                                                opcionesNvidia = NvidiaRTX2000;
                                                preciosNvidia = PreciosRTX2000;
                                                wattsNvidia = whattsRTX2000;
                                                break;
                                            case "RTX 3000":
                                                opcionesNvidia = NvidiaRTX3000;
                                                preciosNvidia = PreciosRTX3000;
                                                wattsNvidia = whattsRTX3000;
                                                break;
                                            case "RTX 4000":
                                                opcionesNvidia = NvidiaRTX4000;
                                                preciosNvidia = PreciosRTX4000;
                                                wattsNvidia = whattsRTX4000;
                                                break;
                                            default:
                                                System.out.println("Opción inválida. Inténtelo de nuevo.");
                                                break;
                                        }
                                        if (opcionesNvidia != null) {
                                            for (int i = 0; i < opcionesNvidia.length; i++) {
                                                System.out.println((i + 1) + ". " + opcionesNvidia[i] + " $" + preciosNvidia[i]);
                                            }
                                            System.out.println();
                                            System.out.print("Ingrese su opción: ");
                                            opcionNvidia = scanner.nextInt();
                                            scanner.nextLine();
                                            String gpuNvidiaSeleccionada = opcionesNvidia[opcionNvidia - 1];
                                            whatts += wattsNvidia[opcionNvidia - 1]; 
                                            subtotal += preciosNvidia[opcionNvidia - 1];
                                            System.out.println();
                                            System.out.println("Ha seleccionado " + gpuNvidiaSeleccionada);
                                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                            System.out.println();
                                        }
                                        break;
                                    case 2: // AMD
                                        System.out.println();
                                        System.out.println("Has seleccionado AMD Radeon");
                                        System.out.println("Estas son las generaciones de AMD Radeon disponibles:");
                                        for (int i = 0; i < AMDGenGPU.length; i++) {
                                            System.out.println((i + 1) + ". " + AMDGenGPU[i]);
                                        }
                                        System.out.println();
                                        System.out.print("Ingrese su opción: ");
                                        int opcionGenAMD = scanner.nextInt();
                                        scanner.nextLine();
                                        String genAMDSeleccionada = AMDGenGPU[opcionGenAMD - 1];
                                        whatts += whattsAMD[opcionGenAMD - 1]; 
                                        System.out.println();
                                        System.out.println("Has seleccionado " + genAMDSeleccionada);
                                        System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                        System.out.println("Estas son las opciones disponibles para " + genAMDSeleccionada + ":");
                                        String[] opcionesAMD = null;
                                        double[] preciosAMD = null;
                                        double[] wattsAMD = null;
                                        switch (genAMDSeleccionada) {
                                            case "RX 5000":
                                                opcionesAMD = AMDRX5000;
                                                preciosAMD = PreciosRX5000;
                                                wattsAMD = whattsRX5000;
                                                break;
                                            case "RX 6000":
                                                opcionesAMD = AMDRX6000;
                                                preciosAMD = PreciosRX6000;
                                                wattsAMD = whattsRX6000;
                                                break;
                                            case "RX 7000":
                                                opcionesAMD = AMDRX7000;
                                                preciosAMD = PreciosRX7000;
                                                wattsAMD = whattsRX7000;
                                                break;
                                            default:
                                                System.out.println("Opción inválida. Inténtelo de nuevo.");
                                                break;
                                        }
                                        if (opcionesAMD != null) {
                                            for (int i = 0; i < opcionesAMD.length; i++) {
                                                System.out.println((i + 1) + ". " + opcionesAMD[i] + " $" + preciosAMD[i]);
                                            }
                                            System.out.println();
                                            System.out.print("Ingrese su opción: ");
                                            opcionAMD = scanner.nextInt();
                                            scanner.nextLine();
                                            String gpuAMDSeleccionada = opcionesAMD[opcionAMD - 1];
                                            whatts += wattsAMD[opcionAMD - 1]; 
                                            subtotal += preciosAMD[opcionAMD - 1];
                                            System.out.println();
                                            System.out.println("Ha seleccionado " + gpuAMDSeleccionada);
                                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                            System.out.println();
                                        }
                                        break;
                                    default:
                                        System.out.println("Opción inválida. Inténtelo de nuevo.");
                                        break;
                            }
                        System.out.println();
                        System.out.println("ya para finalizar selecciona una fuente de poder");
                        System.out.println();

                        if (whatts <= 600) {// si el consumo es menor o igual a 600 watts

                            System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                            System.out.println();
                            for (int i = 0; i < PSUs600.length; i++) {
                                System.out.println((i + 1) + ". " + PSUs600[i] + " $" + preciosPSUs600[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionFuente = scanner.nextInt();
                            scanner.nextLine();
                            String fuenteSeleccionada = PSUs600[opcionFuente - 1];
                            double precioFuente = preciosPSUs600[opcionFuente - 1];
                            System.out.println();
                            System.out.println("Ha seleccionado " + fuenteSeleccionada);
                            System.out.println();
                            subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.println();
                            
                            
                        } else if (whatts <= 800) {// si el consumo es menor o igual a 800 watts

                            System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                            System.out.println();
                            for (int i = 0; i < PSUs800.length; i++) {
                                System.out.println((i + 1) + ". " + PSUs800[i] + " $" + preciosPSUs800[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionFuente = scanner.nextInt();
                            scanner.nextLine();
                            String fuenteSeleccionada = PSUs800[opcionFuente - 1];
                            double precioFuente = preciosPSUs800[opcionFuente - 1];
                            System.out.println();
                            System.out.println("Ha seleccionado " + fuenteSeleccionada);
                            System.out.println();
                            subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.println();

                        } else if (whatts <=1200){// si el consumo es menor o igual a 1200 watts

                            System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                            System.out.println();
                            for (int i = 0; i < PSUs1200.length; i++) {
                                System.out.println((i + 1) + ". " + PSUs1200[i] + " $" + preciosPSUs1200[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionFuente = scanner.nextInt();
                            scanner.nextLine();
                            String fuenteSeleccionada = PSUs1200[opcionFuente - 1];
                            double precioFuente = preciosPSUs1200[opcionFuente - 1];
                            System.out.println();
                            System.out.println("Ha seleccionado " + fuenteSeleccionada);
                            System.out.println();
                            subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.println();

                        } else {// si el consumo es mayor a 1200 watts

                            System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                            System.out.println();
                            for (int i = 0; i < PSUs1600.length; i++) {
                                System.out.println((i + 1) + ". " + PSUs1600[i] + " $" + preciosPSUs1600[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionFuente = scanner.nextInt();
                            scanner.nextLine();
                            String fuenteSeleccionada = PSUs1600[opcionFuente - 1];
                            double precioFuente = preciosPSUs1600[opcionFuente - 1];
                            System.out.println();
                            System.out.println("Ha seleccionado " + fuenteSeleccionada);
                            System.out.println();
                            subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.println();

                        }
                        System.out.println();
                    System.out.println("Muy bonito tu ensamble, pero ahora es momento de pasar por caja ╰(*°▽°*)╯");
                    System.out.println();
                    System.out.println("Imprimiendo ticket de compra...");
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("                PC COMPONENTES");
                    System.out.println("--------------------------------------------------");
                    String fuenteSeleccionada = "";
                    int i = 0;
                    System.out.println();
                    System.out.println("Procesador: " + opcionSeleccionada);
                    System.out.println("Motherboard: " + opcionSeleccionada);
                    System.out.println("Refrigeración: " + refrigeracionSeleccionada);
                    System.out.println("RAM: " + opcionSeleccionada);
                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                    System.out.println("Gabinete: " + gabineteSeleccionado);
                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                    System.out.println("Fuente de poder: " + fuenteSeleccionada + " $" + preciosPSUs1600[i]);
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                    System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                    double iva = subtotal * 0.16; // IVA
                    System.out.println("Total: $" + String.format("%.2f", subtotal + iva));

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
                    try {
                        Thread.sleep(500); // 500 milisegundos = medio segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Recibo de pago en efectivo:");
                    System.out.println("Número de recibo: " + numeroRecibo);
                    System.out.println("Detalles del pago:");
                    System.out.println("--------------------------------------------------");
                    System.out.println("                PC COMPONENTES");
                    System.out.println("--------------------------------------------------");
                    System.out.println();
                    System.out.println("Procesador: " + opcionSeleccionada);
                    System.out.println("Motherboard: " + opcionSeleccionada);
                    System.out.println("Refrigeración: " + refrigeracionSeleccionada);
                    System.out.println("RAM: " + opcionSeleccionada);
                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                    System.out.println("Gabinete: " + gabineteSeleccionado);
                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                    System.out.println("Fuente de poder: " + fuenteSeleccionada + " $" + preciosPSUs1600[i]);
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                    System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                    System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                    System.out.println("Presente este recibo para recoger su compra en una tienda de conveniencia (Oxxo, 7eleven, etc.).");
                    System.out.println("Nota: el numero de recivo expira en 7 días.");
                    System.out.println("Gracias por su compra.");

                    } else if (metodoPago == 2) {
                    System.out.print("Ingrese el nombre del titular de la tarjeta: ");
                    String titularTarjeta = scanner.nextLine();
                    try {
                        Thread.sleep(500); // 500 milisegundos = medio segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("Ingrese los 16 dígitos de la tarjeta: ");
                    String numeroTarjeta = scanner.nextLine();
                    try {
                        Thread.sleep(500); // 500 milisegundos = medio segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (numeroTarjeta.length() != 16) {
                        System.out.println();
                        System.out.println("El número de tarjeta debe tener exactamente 16 dígitos.");
                        System.out.println();
                    break;
                    }
                    System.out.print("Ingrese la fecha de vencimiento (MM/AA): ");
                    String fechaVencimiento = scanner.nextLine();
                    try {
                        Thread.sleep(500); // 500 milisegundos = medio segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Verificar si la longitud de la cadena es correcta (5 caracteres incluyendo la barra)
                    if (fechaVencimiento.length() != 5) {
                    System.out.println();
                    System.out.println("Ingrese una fecha de vencimiento válida en formato MM/AA");
                    System.out.println();
                    break;
                    }

                    // Verificar si la cadena contiene solo dígitos y la barra en la posición correcta
                    for (i = 0; i < fechaVencimiento.length(); i++) {
                        if (i == 2) {
                            if (fechaVencimiento.charAt(i) != '/') {
                                System.out.println();
                                System.out.println("Ingrese una fecha de vencimiento válida en formato MM/AA");
                                System.out.println();
                            break;
                            }
                        } else {
                            if (!Character.isDigit(fechaVencimiento.charAt(i))) {
                                System.out.println();
                                System.out.println("Ingrese una fecha de vencimiento válida en formato MM/AA");
                                System.out.println();
                            break;
                            }
                        }
                    }

                    // Verificar si el mes está en el rango válido (01 - 12)
                    int mes = Integer.parseInt(fechaVencimiento.substring(0, 2));
                    if (mes < 1 || mes > 12) {
                        System.out.println();
                        System.out.println("El mes debe estar entre 01 y 12");
                        System.out.println();
                    break;
                    }
                    // Verificar si el año está en el rango válido (25 - 99)
                    int año = Integer.parseInt(fechaVencimiento.substring(3));
                    if (año < 25 || año > 99) {
                        System.out.println();
                        System.out.println("El año debe estar entre 00 y 99");
                        System.out.println();
                    break;
                    }
                    //-----------------------------------------------------------------validar codigo de seguridad
                    System.out.print("Ingrese el código de seguridad (3 dígitos): ");
                    String codigoSeguridad = scanner.nextLine();
                    if (codigoSeguridad.length() != 3) {
                        System.out.println();
                        System.out.println("El codigo de seguridad debe tener exactamente 3 dígitos.");
                        System.out.println();
                    break;
                    }
                                                
                    System.out.println("Procesando el pago con tarjeta a nombre de " + titularTarjeta + "...");
                    System.out.println();
                    System.out.println("Pago realizado con éxito.");
                    System.out.println("Detalles del pago:");
                    System.out.println("--------------------------------------------------");
                    System.out.println("                PC COMPONENTES");
                    System.out.println("--------------------------------------------------");
                    System.out.println();
                    System.out.println("Procesador: " + opcionSeleccionada);
                    System.out.println("Motherboard: " + opcionSeleccionada);
                    System.out.println("Refrigeración: " + refrigeracionSeleccionada);
                    System.out.println("RAM: " + opcionSeleccionada);
                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                    System.out.println("Gabinete: " + gabineteSeleccionado);
                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                    System.out.println("Fuente de poder: " + fuenteSeleccionada + " $" + preciosPSUs1600[i]);
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                    System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                    System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                    System.out.println("Gracias por su compra.");
                    
                }

                        }
                break;

                case 2://--------------------------------------------------------------------------------------------------------------------------------AMD
                    System.out.println();
                    System.out.println("Ha seleccionado " + marcaCPU[opcion - 1]); 
                    System.out.println("Seleccione la generación de su procesador:");
                    System.out.println();
                        for (int i = 0; i < amdGenCPU.length; i++) {
                            System.out.println((i + 1) + ". " + amdGenCPU[i]);
                        }
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    opcionAMD = scanner.nextInt();
                    scanner.nextLine();
                    whatts += whattsAmd[opcionAMD - 1];
                    System.out.println();
                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                        switch (opcionAMD) {
                            case 1:
                                System.out.println("Ha seleccionado " + amdGenCPU[opcionAMD - 1]); 
                                System.out.println();
                                System.out.println("Seleccione el procesador:");
                                for (int i = 0; i < amd3000CPU.length; i++) {
                                    System.out.println((i + 1) + ". " + amd3000CPU[i] + " $" + preciosAmd3000[i]);
                                }
                                System.out.println();
                                System.out.print("Ingrese su opción: ");
                                int opcionCPU = scanner.nextInt();
                                scanner.nextLine();
                                whatts += whattsAmd3000[opcionCPU - 1]; 
                                System.out.println();
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                                subtotal += preciosAmd3000[opcionCPU - 1]; 
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                break;
                            case 2:
                                System.out.println("Ha seleccionado " + amdGenCPU[opcionAMD - 1]); 
                                System.out.println();
                                System.out.println("Seleccione el procesador:");
                                for (int i = 0; i < amd5000CPU.length; i++) {
                                    System.out.println((i + 1) + ". " + amd5000CPU[i] + " $" + preciosAmd5000[i]);
                                }
                                System.out.println();
                                System.out.print("Ingrese su opción: ");
                                opcionCPU = scanner.nextInt();
                                scanner.nextLine();
                                whatts += whattsAmd5000[opcionCPU - 1]; 
                                System.out.println();
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                                subtotal += preciosAmd5000[opcionCPU - 1]; 
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                break;
                            case 3:
                                System.out.println("Ha seleccionado " + amdGenCPU[opcionAMD - 1]); 
                                System.out.println();
                                System.out.println("Seleccione el procesador:");
                                for (int i = 0; i < amd7000CPU.length; i++) {
                                    System.out.println((i + 1) + ". " + amd7000CPU[i] + " $" + preciosAmd7000[i]);
                                }
                                System.out.println();
                                System.out.print("Ingrese su opción: ");
                                opcionCPU = scanner.nextInt();
                                scanner.nextLine();
                                whatts += whattsAmd7000[opcionCPU - 1]; 
                                System.out.println();
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                                subtotal += preciosAmd7000[opcionCPU - 1]; 
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                break;
                                
                            default:
                            System.out.println("Opción inválida. Inténtelo de nuevo.");
                            break;
                        }
            
                        // Agregar selección de motherboards AMD
                        System.out.println();
                        System.out.println("Continuemos con las Motherboards");
                        System.out.println("Estas son las Motherboards compatibles con tu CPU");
                        System.out.println();
                        if (opcionAMD == 1) { // AMD Ryzen 3000
                            for (int i = 0; i < amd3000.length; i++) {
                                System.out.println((i + 1) + ". " + amd3000[i] + " $" + preciosMotheramd3000[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            opcionMotherboard = scanner.nextInt();
                            System.out.println();
                            scanner.nextLine();

                            DDR = (opcionMotherboard <= 2) ? 4 : 5;
                            System.out.println("Ha seleccionado " + amd3000[opcionMotherboard - 1]);
                            System.out.println();
                            if (opcionMotherboard >= 1 && opcionMotherboard <= 3) {
                                whatts += whattsMotheramd3000[opcionMotherboard - 1];

                                subtotal += preciosMotheramd3000[opcionMotherboard - 1];
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                            }
                            } else { // AMD Ryzen 5000 o 7000
                            for (int i = 0; i < amd5000.length; i++) {
                                System.out.println((i + 1) + ". " + amd5000[i] + " $" + preciosMotheramd5000[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            opcionMotherboard = scanner.nextInt();
                            System.out.println();
                            scanner.nextLine();

                            DDR = (opcionMotherboard <= 2) ? 4 : 5;
                            System.out.println("Ha seleccionado " + amd5000[opcionMotherboard - 1]);
                            System.out.println();
                            if (opcionMotherboard >= 1 && opcionMotherboard <= 3) {
                                whatts += whattsMotheramd5000[opcionMotherboard - 1];
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);

                                subtotal += preciosMotheramd5000[opcionMotherboard - 1];
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                            }

                        //--------------------------------------Refrigeración
                        System.out.println();
                        System.out.println("Es hora de seleccionar un sistema de refrigeración");
                        System.out.println();
                        for (int i = 0; i < refrigeracion.length; i++) {
                            System.out.println((i + 1) + ". " + refrigeracion[i] + " $" + preciosRefrigeracion[i]);
                        }
                        System.out.println();
                        System.out.print("Ingrese su opción: ");
                        int opcionRefrigeracion = scanner.nextInt();
                        scanner.nextLine();
                        String refrigeracionSeleccionada = refrigeracion[opcionRefrigeracion - 1];
                        double precioRefrigeracion = preciosRefrigeracion[opcionRefrigeracion - 1];
                        System.out.println();
                        System.out.println("Ha seleccionado " + refrigeracionSeleccionada);
                        System.out.println();
                        subtotal += precioRefrigeracion; // Sumar el precio de la refrigeración al subtotal
                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                        System.out.println();

                        //--------------------------------------RAM
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
                        System.out.println();
                        //------------------------------------------------------------------------------Almacenamiento
                        System.out.println("Es turno de que selecciones un tipo de almacenamiento");
                        System.out.println();
                        for (int i = 0; i < TipoAlmacenamiento.length; i++) {
                            System.out.println((i + 1) + ". " + TipoAlmacenamiento[i]);
                        }
                        System.out.println();
                        System.out.print("Ingrese su opción: ");
                        int opcionAlmacenamiento = scanner.nextInt();
                        scanner.nextLine();
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
                            System.out.println("Es hora de seleccionar un Gabinete");
                            System.out.println();
                            System.out.println("Este es el catálogo de gabinetes disponibles compatibles con tu placa madre");
                            System.out.println();

                            if (opcionMotherboard <= 2) { // Si es una placa MicroATX
                                for (int i = 0; i < catalogoPlacaMicroATX.length; i++) {
                                    System.out.println((i + 1) + ". " + catalogoPlacaMicroATX[i] + " $" + precioMicroATX[i]);
                                }
                            } else { // Si es una placa ATX
                                for (int i = 0; i < catalogoPlacaATX.length; i++) {
                                    System.out.println((i + 1) + ". " + catalogoPlacaATX[i] + " $" + precioATX[i]);
                                }
                            }

                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            int opcionGabinete = scanner.nextInt();
                            scanner.nextLine();
                            String gabineteSeleccionado = (opcionMotherboard <= 2) ? catalogoPlacaMicroATX[opcionGabinete - 1] : catalogoPlacaATX[opcionGabinete - 1];
                            double precioGabinete = (opcionMotherboard <= 2) ? precioMicroATX[opcionGabinete - 1] : precioATX[opcionGabinete - 1];
                            System.out.println();
                            System.out.println("Ha seleccionado " + gabineteSeleccionado);
                            System.out.println();
                            subtotal += precioGabinete; // Sumar el precio del gabinete al subtotal
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.println();

                            System.out.println();
                            System.out.println("Es hora de seleccionar una Tarjeta Gráfica");
                            System.out.println();
                            System.out.println("Este es el catálogo de Tarjetas Gráficas disponibles:");
                            System.out.println();

                            System.out.println("1. Nvidia Geforce");
                            System.out.println("2. AMD Radeon");

                            System.out.println();
                            System.out.print("Ingrese su opción (1 para Nvidia, 2 para AMD): ");
                            int opcionGPU = scanner.nextInt();
                            scanner.nextLine();

                            switch (opcionGPU) {
                                case 1: // Nvidia
                                    System.out.println();
                                    System.out.println("Has seleccionado Nvidia Geforce");
                                    System.out.println("Estas son las generaciones de Nvidia Geforce disponibles:");
                                    for (int i = 0; i < NvidiaGenGPU.length; i++) {
                                        System.out.println((i + 1) + ". " + NvidiaGenGPU[i]);
                                    }
                                    System.out.println();
                                    System.out.print("Ingrese su opción: ");
                                    int opcionGenNvidia = scanner.nextInt();
                                    scanner.nextLine();
                                    String genSeleccionada = NvidiaGenGPU[opcionGenNvidia - 1];
                                    whatts += whattsNvidia[opcionGenNvidia - 1]; 
                                    System.out.println();
                                    System.out.println("Has seleccionado " + genSeleccionada);
                                    System.out.println("Estas son las opciones disponibles para " + genSeleccionada + ":");
                                    String[] opcionesNvidia = null;
                                    double[] preciosNvidia = null;
                                    double[] wattsNvidia = null;
                                    switch (genSeleccionada) {
                                        case "RTX 2000":
                                            opcionesNvidia = NvidiaRTX2000;
                                            preciosNvidia = PreciosRTX2000;
                                            wattsNvidia = whattsRTX2000;
                                            break;
                                        case "RTX 3000":
                                            opcionesNvidia = NvidiaRTX3000;
                                            preciosNvidia = PreciosRTX3000;
                                            wattsNvidia = whattsRTX3000;
                                            break;
                                        case "RTX 4000":
                                            opcionesNvidia = NvidiaRTX4000;
                                            preciosNvidia = PreciosRTX4000;
                                            wattsNvidia = whattsRTX4000;
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Inténtelo de nuevo.");
                                            break;
                                    }
                                    if (opcionesNvidia != null) {
                                        for (int i = 0; i < opcionesNvidia.length; i++) {
                                            System.out.println((i + 1) + ". " + opcionesNvidia[i] + " $" + preciosNvidia[i]);
                                        }
                                        System.out.println();
                                        System.out.print("Ingrese su opción: ");
                                        opcionNvidia = scanner.nextInt();
                                        scanner.nextLine();
                                        String gpuNvidiaSeleccionada = opcionesNvidia[opcionNvidia - 1];
                                        whatts += wattsNvidia[opcionNvidia - 1]; 
                                        subtotal += preciosNvidia[opcionNvidia - 1];
                                        System.out.println();
                                        System.out.println("Ha seleccionado " + gpuNvidiaSeleccionada);
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                        System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                        System.out.println();
                                    }
                                    break;
                                case 2: // AMD
                                    System.out.println();
                                    System.out.println("Has seleccionado AMD Radeon");
                                    System.out.println("Estas son las generaciones de AMD Radeon disponibles:");
                                    for (int i = 0; i < AMDGenGPU.length; i++) {
                                        System.out.println((i + 1) + ". " + AMDGenGPU[i]);
                                    }
                                    System.out.println();
                                    System.out.print("Ingrese su opción: ");
                                    int opcionGenAMD = scanner.nextInt();
                                    scanner.nextLine();
                                    String genAMDSeleccionada = AMDGenGPU[opcionGenAMD - 1];
                                    whatts += whattsAMD[opcionGenAMD - 1]; 
                                    System.out.println();
                                    System.out.println("Has seleccionado " + genAMDSeleccionada);
                                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                    System.out.println("Estas son las opciones disponibles para " + genAMDSeleccionada + ":");
                                    String[] opcionesAMD = null;
                                    double[] preciosAMD = null;
                                    double[] wattsAMD = null;
                                    switch (genAMDSeleccionada) {
                                        case "RX 5000":
                                            opcionesAMD = AMDRX5000;
                                            preciosAMD = PreciosRX5000;
                                            wattsAMD = whattsRX5000;
                                            break;
                                        case "RX 6000":
                                            opcionesAMD = AMDRX6000;
                                            preciosAMD = PreciosRX6000;
                                            wattsAMD = whattsRX6000;
                                            break;
                                        case "RX 7000":
                                            opcionesAMD = AMDRX7000;
                                            preciosAMD = PreciosRX7000;
                                            wattsAMD = whattsRX7000;
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Inténtelo de nuevo.");
                                        break;
                                    }
                            if (opcionesAMD != null) {
                            for (int i = 0; i < opcionesAMD.length; i++) {
                                System.out.println((i + 1) + ". " + opcionesAMD[i] + " $" + preciosAMD[i]);
                            }
                            System.out.println();
                            System.out.print("Ingrese su opción: ");
                            opcionAMD = scanner.nextInt();
                            scanner.nextLine();
                            String gpuAMDSeleccionada = opcionesAMD[opcionAMD - 1];
                            whatts += wattsAMD[opcionAMD - 1]; 
                            subtotal += preciosAMD[opcionAMD - 1];
                            System.out.println();
                            System.out.println("Ha seleccionado " + gpuAMDSeleccionada);
                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                            System.out.println();
                        }
                        break;
                        default:
                            System.out.println("Opción inválida. Inténtelo de nuevo.");
                        break;
                        }

                    System.out.println();
                    System.out.println("ya para finalizar selecciona una fuente de poder");
                    System.out.println();

                    if (whatts <= 600) {// si el consumo es menor o igual a 600 watts

                    System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                    System.out.println();
                        for (int i = 0; i < PSUs600.length; i++) {
                            System.out.println((i + 1) + ". " + PSUs600[i] + " $" + preciosPSUs600[i]);
                        }
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    int opcionFuente = scanner.nextInt();
                    scanner.nextLine();
                    String fuenteSeleccionada = PSUs600[opcionFuente - 1];
                    double precioFuente = preciosPSUs600[opcionFuente - 1];
                    System.out.println();
                    System.out.println("Ha seleccionado " + fuenteSeleccionada);
                    System.out.println();
                    subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                    System.out.println();
                            
                            
                    } else if (whatts <= 800) {// si el consumo es menor o igual a 800 watts

                    System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                    System.out.println();
                        for (int i = 0; i < PSUs800.length; i++) {
                            System.out.println((i + 1) + ". " + PSUs800[i] + " $" + preciosPSUs800[i]);
                        }
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    int opcionFuente = scanner.nextInt();
                    scanner.nextLine();
                    String fuenteSeleccionada = PSUs800[opcionFuente - 1];
                    double precioFuente = preciosPSUs800[opcionFuente - 1];
                    System.out.println();
                    System.out.println("Ha seleccionado " + fuenteSeleccionada);
                    System.out.println();
                    subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                    System.out.println();

                    } else if (whatts <=1200){// si el consumo es menor o igual a 1200 watts
                    System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                    System.out.println();
                        for (int i = 0; i < PSUs1200.length; i++) {
                            System.out.println((i + 1) + ". " + PSUs1200[i] + " $" + preciosPSUs1200[i]);
                        }
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    int opcionFuente = scanner.nextInt();
                    scanner.nextLine();
                    String fuenteSeleccionada = PSUs1200[opcionFuente - 1];
                    double precioFuente = preciosPSUs1200[opcionFuente - 1];
                    System.out.println();
                    System.out.println("Ha seleccionado " + fuenteSeleccionada);
                    System.out.println();
                    subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                    System.out.println();

                    } else {// si el consumo es mayor a 1200 watts

                    System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                    System.out.println();
                        for (int i = 0; i < PSUs1600.length; i++) {
                            System.out.println((i + 1) + ". " + PSUs1600[i] + " $" + preciosPSUs1600[i]);
                        }
                    System.out.println();
                    System.out.print("Ingrese su opción: ");
                    int opcionFuente = scanner.nextInt();
                    scanner.nextLine();
                    String fuenteSeleccionada = PSUs1600[opcionFuente - 1];
                    double precioFuente = preciosPSUs1600[opcionFuente - 1];
                    System.out.println();
                    System.out.println("Ha seleccionado " + fuenteSeleccionada);
                    System.out.println();
                    subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                    System.out.println();

                    }
                    System.out.println();
                    System.out.println("Muy bonito tu ensamble, pero ahora es momento de pasar por caja ╰(*°▽°*)╯");
                    System.out.println();
                    System.out.println("Imprimiendo ticket de compra...");
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("                PC COMPONENTES");
                    System.out.println("--------------------------------------------------");
                    String fuenteSeleccionada = "";
                    int i = 0;
                    System.out.println();
                    System.out.println("Procesador: " + opcionSeleccionada);
                    System.out.println("Motherboard: " + opcionSeleccionada);
                    System.out.println("Refrigeración: " + refrigeracionSeleccionada);
                    System.out.println("RAM: " + opcionSeleccionada);
                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                    System.out.println("Gabinete: " + gabineteSeleccionado);
                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                    System.out.println("Fuente de poder: " + fuenteSeleccionada + " $" + preciosPSUs1600[i]);
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                    System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                    double iva = subtotal * 0.16; // IVA
                    System.out.println("Total: $" + String.format("%.2f", subtotal + iva));

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
                    try {
                        Thread.sleep(500); // 500 milisegundos = medio segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Recibo de pago en efectivo:");
                    System.out.println("Número de recibo: " + numeroRecibo);
                    System.out.println("Detalles del pago:");
                    System.out.println("--------------------------------------------------");
                    System.out.println("                PC COMPONENTES");
                    System.out.println("--------------------------------------------------");
                    System.out.println();
                    System.out.println("Procesador: " + opcionSeleccionada);
                    System.out.println("Motherboard: " + opcionSeleccionada);
                    System.out.println("Refrigeración: " + refrigeracionSeleccionada);
                    System.out.println("RAM: " + opcionSeleccionada);
                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                    System.out.println("Gabinete: " + gabineteSeleccionado);
                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                    System.out.println("Fuente de poder: " + fuenteSeleccionada + " $" + preciosPSUs1600[i]);
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                    System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                    System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                    System.out.println("Presente este recibo para recoger su compra en una tienda de conveniencia (Oxxo, 7eleven, etc.).");
                    System.out.println("Nota: el numero de recivo expira en 7 días.");
                    System.out.println("Gracias por su compra.");

                    } else if (metodoPago == 2) {
                    System.out.print("Ingrese el nombre del titular de la tarjeta: ");
                    String titularTarjeta = scanner.nextLine();
                    try {
                        Thread.sleep(500); // 500 milisegundos = medio segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("Ingrese los 16 dígitos de la tarjeta: ");
                    String numeroTarjeta = scanner.nextLine();
                    try {
                        Thread.sleep(500); // 500 milisegundos = medio segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (numeroTarjeta.length() != 16) {
                        System.out.println();
                        System.out.println("El número de tarjeta debe tener exactamente 16 dígitos.");
                        System.out.println();
                    break;
                    }
                    System.out.print("Ingrese la fecha de vencimiento (MM/AA): ");
                    String fechaVencimiento = scanner.nextLine();
                    try {
                        Thread.sleep(500); // 500 milisegundos = medio segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Verificar si la longitud de la cadena es correcta (5 caracteres incluyendo la barra)
                    if (fechaVencimiento.length() != 5) {
                    System.out.println();
                    System.out.println("Ingrese una fecha de vencimiento válida en formato MM/AA");
                    System.out.println();
                    break;
                    }

                    // Verificar si la cadena contiene solo dígitos y la barra en la posición correcta
                    for (i = 0; i < fechaVencimiento.length(); i++) {
                        if (i == 2) {
                            if (fechaVencimiento.charAt(i) != '/') {
                                System.out.println();
                                System.out.println("Ingrese una fecha de vencimiento válida en formato MM/AA");
                                System.out.println();
                            break;
                            }
                        } else {
                            if (!Character.isDigit(fechaVencimiento.charAt(i))) {
                                System.out.println();
                                System.out.println("Ingrese una fecha de vencimiento válida en formato MM/AA");
                                System.out.println();
                            break;
                            }
                        }
                    }

                    // Verificar si el mes está en el rango válido (01 - 12)
                    int mes = Integer.parseInt(fechaVencimiento.substring(0, 2));
                    if (mes < 1 || mes > 12) {
                        System.out.println();
                        System.out.println("El mes debe estar entre 01 y 12");
                        System.out.println();
                    break;
                    }
                    // Verificar si el año está en el rango válido (25 - 99)
                    int año = Integer.parseInt(fechaVencimiento.substring(3));
                    if (año < 25 || año > 99) {
                        System.out.println();
                        System.out.println("El año debe estar entre 00 y 99");
                        System.out.println();
                    break;
                    }
                    //-----------------------------------------------------------------validar codigo de seguridad
                    System.out.print("Ingrese el código de seguridad (3 dígitos): ");
                    String codigoSeguridad = scanner.nextLine();
                    if (codigoSeguridad.length() != 3) {
                        System.out.println();
                        System.out.println("El codigo de seguridad debe tener exactamente 3 dígitos.");
                        System.out.println();
                    break;
                    }
                                                
                    System.out.println("Procesando el pago con tarjeta a nombre de " + titularTarjeta + "...");
                    System.out.println();
                    System.out.println("Pago realizado con éxito.");
                    System.out.println("Detalles del pago:");
                    System.out.println("--------------------------------------------------");
                    System.out.println("                PC COMPONENTES");
                    System.out.println("--------------------------------------------------");
                    System.out.println();
                    System.out.println("Procesador: " + opcionSeleccionada);
                    System.out.println("Motherboard: " + opcionSeleccionada);
                    System.out.println("Refrigeración: " + refrigeracionSeleccionada);
                    System.out.println("RAM: " + opcionSeleccionada);
                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                    System.out.println("Gabinete: " + gabineteSeleccionado);
                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                    System.out.println("Fuente de poder: " + fuenteSeleccionada + " $" + preciosPSUs1600[i]);
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                    System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                    System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                    System.out.println("Gracias por su compra.");
                    
                }
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