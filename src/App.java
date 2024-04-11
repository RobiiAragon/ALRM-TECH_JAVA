import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int MenuPrincipal, opcion, indiceCarrito;
        boolean repetir = true;
        boolean salir = false;
        String[] carrito = new String[1000];
        double[] preciosCarrito = new double[1000];
        double precioSeleccionado;
        indiceCarrito = 0;
        double subtotal = 0.0;
        // --------------------------------------------------Comienzan declaraciones del apartado de piezas
        String[] categorias = { "Procesadores", "Tarjetas gráficas", "Monitores", "Motherboards", "Memorias RAM",
                "Almacenamientos", "Fuentes de poder PSUs", "Gabinetes", "Teclados", "Ratones", "Headsets",
                "Alfombrillas para raton", "Material de Conductividad termica", "Refrigeraciones", "Microfonos" };

        double[][] precios = {
                // --------Procesadores
                { 2299, 2399, 5169, 6918, 2209, 3854, 4904, 11530, 2259, 5013, 4904, 12059, 1359, 2447, 4906, 13402,
                        1500, 2880, 3435, 5741, 2259, 5013, 4904, 12059 },
                // --------Tarjetas Graficas
                { 4065, 4829, 5244, 5726, 12664, 16344, 22069, 5709, 10993, 26660, 35748, 4000, 5280, 6850, 10069,
                        11809, 5609, 8629, 9889 },
                // --------Monitores
                { 2639, 4589, 5779, 7099 },
                // --------Motherboards
                { 1269, 2778, 6255, 829, 1659, 2459, 1399, 2719, 6959, 1079, 2339, 6699 },
                // --------RAM
                { 500, 800, 1200, 2400, 4800, 1200, 2400, 4800, 9600 },
                // --------Almacenamientos
                { 939, 759, 2069, 749, 899, 1059, 969, 659, 2089 },
                // --------PSUs
                { 1979, 1669, 1559, 1549, 2899, 2909, 2119, 2979, 5409 },
                // --------Gabinetes
                { 2500, 3000, 3000, 3000 },
                // --------Teclados
                { 800, 662, 500, 620 },
                // --------Ratones
                { 1999, 485, 3013, 1299, 1045, 2176 },
                // --------Headsets
                { 546, 1350, 1194 },
                // --------Alfombrillas para raton
                { 800, 1200, 800 },
                // --------Material de Conductividad termica
                { 300, 600, 350 },
                // --------Refrigeraciones
                { 950, 1600, 300, 700 },
                // --------Microfonos
                { 2068, 3976, 799, 2315 }
        };

        String[][] productos = {
                // --------Procesadores
                { "Intel Core i3-12100", "Intel Core i5-12400", "Intel Core i7-12700", "Intel Core i9-12900K",
                        "Intel Core i3-13100", "Intel Core i5-13600", "Intel Core i7-13700", "Intel Core i9-13900Kf",
                        "Intel Core i3-14100", "Intel Core i5-14500", "Intel Core i7-14700k", "Intel Core i9-14900",
                        "AMD Ryzen 3 3200g", "AMD Ryzen 5 3600", "AMD Ryzen 7 3700X", "AMD Ryzen 9 3950X",
                        "AMD Ryzen 3 5300g", "AMD Ryzen 5 5600X", "AMD Ryzen 7 5700X", "AMD Ryzen 9 5900X",
                        "AMD Ryzen 3 8300g", "AMD Ryzen 5 7600X", "AMD Ryzen - 7 7700X", "AMD Ryzen - 9 7900X" },
                // --------Tarjetas Graficas
                { "Asus dual RTX 2060 12GB GDDR6", "MSI RTX 2070 8GB GDDR6", "GIGABYTE RTX 2080 8GB GDDR6",
                        "Asus RTX 3060 12GB GDDR6", "MSI RTX 3070 8GB GDRR6", "Gigabyte RTX 3080 10GB GDDR6X",
                        "PNY RTX 3090 24 GB XLR8", "ZOTAC RTX 4060 8 GB GDDR6", "ASUS RTX 4070 12GB GDDR6X",
                        "MSI RTX 4080 16GB GDDR6X", "Asus RTX 4090 24GB GDDR6X", "ASUS RX 5600 XT GDDR6",
                        "Gigabyte RX 5700 XT 8GB GDDR6", "MSI RX 6600 8GB GDDR6", "ASUS RX 6700 XT 12GB GDDR6",
                        "Sapphire RX 6800 16GB GDDR6", "ASUS RX 7600 8GB GDDR6", "ASUS RX 7700 XT 12GB GDDR6",
                        "Sapphire RX 7800 XT 16GB GDDR6" },
                // --------Monitores
                { "Odyssey MTX27G 27 1080p 144Hz", "Odyssey G5 27 1440p 144Hz", "Odyssey G4 25 1080p 240Hz",
                        "MSI G274QPX 27 1440p 240Hz" },
                // --------Motherboards
                { "MSI Micro-ATX PRO H610M-G DDR4, S-1700, Intel H610, MAX 64GB DDR4",
                        "MSI Micro-ATX PRO B760M-A WIFI, S-1700, Intel B760, MAX 192GB DDR5",
                        "ASUS GAMING ATX ROG Strix Z790-F WIFI, S-1700, Intel Z790, MAX 128GB DDR5",
                        "Biostar micro ATX A520MH, S-AM4, AMD A520, HDMI, MAX 64GB DDR4",
                        "MSI B550M ATX PRO-VDH, S-AM4, AMD B550, HDMI, MAX 128GB DDR4",
                        "Gigabyte ATX B550, S-AM4, AMD B550, HDMI, MAX 128GB DDR4",
                        "Gigabyte Micro ATX B450M H, S-AM4, AMD B450, HDMI, MAX 32GB DDR4",
                        "ASUS ATX Prime B550-Plus, S-AM4, AMD B550, HDMI, MAX 128GB DDR4",
                        "Gigabyte AORUS X570S, S-AM4, AMD X507, USB 3.2, MAX 128GB DDR4",
                        "MSI Micro-ATX PRO A620M-E, S-AM5, AMD A620, HDMI, MAX 96GB DDR5",
                        "Gigabyte Micro-ATX A620M, S-AM5, AMD A620, HDMI, MAX 192GB DDR5",
                        "Acer ATX 620M-H, S-AM5, AMD 620, HDMI, MAX 256GB DDR5" },
                // --------RAM
                { "Corsair Dominator RGB 8GB DDR4, 3200MHz, 1x8GB", "Corsair Dominator RGB 16GB DDR4, 3200MHz, 2x8GB",
                        "Kingston FURY Beast 32GB DDR4, 3200MHz, 1X32GB",
                        "Kingston FURY Beast 64GB DDR4, 3200MHz, 2X32GB",
                        "Kingston FURY Beast 128GB DDR4, 3200MHz, 4X32GB",
                        "RAM DDR5 G.Skill Trident Z Neo, 16GB (2x8GB), 8400MHz, CL36, Negro",
                        "RAM DDR5 G.Skill Trident Z Neo, 32GB (2x16GB), 8400MHz, CL36, Negro",
                        "RAM DDR5 G.Skill Trident Z Neo, 64GB (4x16GB), 8400MHz, CL36, Negro",
                        "RAM DDR5 Corsair Dominator Platinum RGB, 128GB (4x32GB), 9600MHz, CL40, Blanco" },
                // --------Almacenamientos
                { "Kingston SSD NVMe PCIe 500GB Gen 4, Lectura 7000 MB/s, Escritura 3500 MB/s",
                        "WD HDD Externo 2TB Elements Portable, 2.5, USB 3.0, Negro",
                        "Samsung SSD 980 NVMe PCIe 2TB, Lectura 3500 MB/s, Escritura 3200 MB/s, Negro",
                        "Seagate HDD 16TB, Exos X16 Enterprise, 7200 RPM, SATA 6Gb/s, 3.5" },
                // --------PSUs
                { "CORSAIR Fuente de Poder 750W RM750 80+ Gold Modular, ATX",
                        "GIGABYTE Fuente de Poder 700W GP-P700G 80+ Gold Modular, ATX",
                        "Seasonic Fuente de Poder 850W FOCUS GX-850, 80+ Gold, ATX, Modular" },
                // --------Gabinetes
                { "Corsair Gabinete ATX Midi-Tower 4000D Airflow, Cristal Templado, Negro",
                        "NZXT Gabinete ATX Mid-Tower H510i Compact, Cristal Templado, Negro",
                        "Lian Li Gabinete ATX Full Tower PC-O11 Dynamic, Cristal Templado, Negro" },
                // --------Teclados
                { "Razer Teclado Mecanico Gaming BlackWidow V3, Switch Verde, RGB",
                        "Logitech Teclado Mecanico Gaming G413 Carbon, Switch Romer-G, Iluminacion Roja",
                        "Corsair Teclado Mecanico Gaming K95 RGB PLATINUM XT, Cherry MX Speed, RGB, Aluminio" },
                // --------Ratones
                { "Logitech Raton Gamer G502 HERO, 16000 DPI, RGB",
                        "Razer Raton Gamer DeathAdder V2 Mini, 8500 DPI, RGB",
                        "SteelSeries Raton Gamer Rival 3, 8500 DPI, RGB" },
                // --------Headsets
                { "Razer Auriculares Gaming Kraken Ultimate USB, THX Spatial Audio, RGB",
                        "HyperX Auriculares Gaming Cloud Alpha S 7.1, Cableado, Surround Sound, Negro",
                        "Logitech Auriculares Gaming G PRO X, Sonido Envolvente 7.1, Negro" },
                // --------Alfombrillas para raton
                { "Razer Alfombrilla de Raton Goliathus Extended Chroma RGB, Suave, Negro",
                        "HyperX Alfombrilla de Raton FURY S Pro Gaming, Tela, Negro",
                        "Corsair Alfombrilla de Raton MM300 Anti-Fray Cloth Gaming, Negro" },
                // --------Material de Conductividad termica
                { "Geltermico termico GD900 para CPU GPU, Pasta de Grasa Termica, 30g",
                        "Pasta Termica Arctic MX-4, Alto Rendimiento, 4g", "Pasta Termica Noctua NT-H2, 3.5g" },
                // --------Refrigeraciones
                { "Corsair Refrigeracion Liquida Hydro H100i RGB PLATINUM, Radiador 240mm, Dos Ventiladores ML PRO",
                        "Cooler Master Refrigeracion Liquida MasterLiquid ML240L RGB V2, Radiador 240mm, Dos Ventiladores SickleFlow",
                        "Noctua Refrigeracion por Aire NH-D15, Ventilador de Doble Torre, Secuencias PWM" },
                // --------Microfonos
                { "Razer Microfono USB Seiren X, Unidireccional, Reduccion de Ruido",
                        "HyperX Microfono QuadCast, Condensador, Patron de captura Estereo, Anti-Golpes, Rojo",
                        "Blue Yeti Microfono USB, Patron Multiple, Mute, Negro" }
        };

        // ----------------------------------------------------------------termina declaraciones del apartado de piezas
        // --------------------------------------------------Comienzan declaraciones del apartado Preensamblado
        // ----------------------------------Seleccion marca de Procesador
        String[] marcaCPU = { "INTEL", "AMD" };
        // --------------------------------------------------------------------------INTEL Generacion
        String[] intelGenCPU = { "Intel Core 12th", "Intel Core 13th", "Intel Core 14th" };
        double[] whattsintel = { 100, 200, 300 };
        // -------------------------------------------------------------------------------INTEL CPU
        String[] intel12thCPU = { "Intel Core i3 12100", "Intel Core i5 12600", "Intel Core i7 12700", "Intel Core i9 12900" };
        double[] whattsintel12th = { 100, 200, 300, 400 };
        double[] preciosintel12th = { 2299, 2399, 5169, 6918 };
        String[] intel13thCPU = { "Intel Core i3 13100", "Intel Core i5 13600", "Intel Core i7 13700", "Intel Core i9 13900" };
        double[] whattsintel13th = { 100, 200, 300, 400 };
        double[] preciosintel13th = { 2209, 3854, 4904, 11530 };
        String[] intel14thCPU = { "Intel Core i3 14100", "Intel Core i5 14600", "Intel Core i7 14700", "Intel Core i9 14900" };
        double[] whattsintel14th = { 100, 200, 300, 400 };
        double[] preciosintel14th = { 2259, 5013, 4904, 12059 };
        // -------------------------------------------------------------------------------------Motherboards INTEL
        String[] lga1700 = { "MSI Micro-ATX PRO H610M-G, S-1700, MAX 64GB DDR4",
                "MSI Micro-ATX PRO B760M-A, S-1700, MAX 192GB DDR5",
                "ASUS ROG Strix ATX Z790-F, S-1700, MAX 128GB DDR5" };
        double[] precioslga1700 = { 1269, 2778, 6255 };
        double[] whattslga1700 = { 100, 100, 100 };
        // --------------------------------------------------------------------------AMD
        String[] amdGenCPU = { "AMD Ryzen 3000", "AMD Ryzen 5000", "AMD Ryzen 7000" };
        double[] whattsAmd = { 100, 200, 300 };
        // -------------------------------------------------------------------------------Generacion AMD CPU
        String[] amd3000CPU = { "AMD Ryzen 3 3100", "AMD Ryzen 5 3600", "AMD Ryzen 7 3700X", "AMD Ryzen 9 3900X" };
        double[] whattsAmd3000 = { 100, 200, 300, 400 };
        double[] preciosAmd3000 = { 1359, 2447, 4906, 13402 };
        String[] amd5000CPU = { "AMD Ryzen 3 5100", "AMD Ryzen 5 5600", "AMD Ryzen 7 5700X", "AMD Ryzen 9 5900X" };
        double[] whattsAmd5000 = { 100, 200, 300, 400 };
        double[] preciosAmd5000 = { 1500, 2880, 3435, 5741 };
        String[] amd7000CPU = { "AMD Ryzen 3 7100", "AMD Ryzen 5 7600", "AMD Ryzen 7 7700X", "AMD Ryzen 9 7900X" };
        double[] whattsAmd7000 = { 100, 200, 300, 400 };
        double[] preciosAmd7000 = { 2259, 5013, 4904, 12059 };
        // ---------------------------------------------------------------------------------------Motherboards AMD
        // -------------------------------------------------------------------------------AMD AM4
        String[] amd3000 = { "MSI Micro-ATX PRO H610M-G DDR4, S-1700, Intel H610, 64GB DDR4",
                "MSI Micro-ATX PRO B760M-A WIFI, S-1700, Intel B760, 192GB DDR5",
                "ASUS GAMING ATX ROG Strix Z790-F WIFI, S-1700, Intel Z790, 128GB DDR5" };
        double[] preciosMotheramd3000 = { 1269, 2778, 6255 };
        double[] whattsMotheramd3000 = { 100, 100, 100 };
        // -------------------------------------------------------------------------------AMD AM5
        String[] amd5000 = { "MSI Micro-ATX PRO H610M-G DDR4, S-1700, Intel H610, 64GB DDR4",
                "MSI Micro-ATX PRO B760M-A WIFI, S-1700, Intel B760, 192GB DDR5",
                "ASUS GAMING ATX ROG Strix Z790-F WIFI, S-1700, Intel Z790, 128GB DDR5" };
        double[] preciosMotheramd5000 = { 1269, 2778, 6255 };
        double[] whattsMotheramd5000 = { 100, 100, 100 };
        // -------------------------------------------------------------------------------Refrigeraciones
        String[] refrigeracion = {
                "Corsair Refrigeracion Liquida Hydro H100i RGB PLATINUM, Radiador 240mm, Dos Ventiladores ML PRO",
                "Cooler Master Refrigeracion Liquida MasterLiquid ML240L RGB V2, Radiador 240mm, Dos Ventiladores SickleFlow",
                "NZXT Refrigeracion Liquida Kraken X53, Radiador 240mm, Dos Ventiladores AER P 120mm" };
        double[] preciosRefrigeracion = { 2500, 2000, 3000 };

        // --------------------------------------RAM
        String[] DDR4 = { "Corsair Dominator RGB 8GB DDR4, 3200MHz, 1x8GB",
                "Corsair Dominator RGB 16GB DDR4, 3200MHz, 2x8GB", "Kingston FURY Beast 32GB DDR4, 3200MHz, 1X32GB",
                "Kingston FURY Beast 64GB DDR4, 3200MHz, 2X32GB" };
        double[] preciosDDR4 = { 500, 800, 1200, 2400 };
        String[] DDR5 = { "RAM DDR5 G.Skill Trident Z Neo, 16GB (2x8GB), 8400MHz, CL36, Negro",
                "RAM DDR5 G.Skill Trident Z Neo, 32GB (2x16GB), 8400MHz, CL36, Negro",
                "RAM DDR5 G.Skill Trident Z Neo, 64GB (4x16GB), 8400MHz, CL36, Negro" };
        double[] preciosDDR5 = { 1200, 2400, 4800 };
        // --------------------------------------Almacenamiento
        String[] TipoAlmacenamiento = { "HDDsata", "SSDsata", "NVMe" };
        String[] HDDsata = { "HDD Seagate Barracuda 3.5, 2TB, SATA III, 6 Gbit/s, 7200RPM, 256MB Cache",
                "HDD WD Blue 2.5, 500GB, SATA III, 6 Gbit/s, 5400RPM, 16MB Cache",
                "HDD WD Black 3.5, 2TB, SATA III, 6 Gbit/s, 7200RPM, 64MB Cache" };
        double[] preciosHDD = { 939, 759, 2069 };
        String[] SSDsata = { "SSD Western Digital Blue, 250GB, SATA III, 2.5",
                "SSD Western Digital WD Green, 1TB, SATA III, 2.5",
                "SSD Team Group T-Force Vulcan, 1TB, SATA III, 2.5" };
        double[] preciosSSD = { 749, 899, 1059 };
        String[] NVMe = { "NVMe Kingston NV2, 1TB, PCI Express 4.0", "NVMe PNY CS1030, 500GB, PCI Express 3.0",
                "NVMe WD Blue SN580, 2TB, PCI Express 4.0" };
        double[] preciosNVMe = { 969, 659, 2089 };
        // --------------------------------------Gabinetes
        String[] catalogoPlacaMicroATX = { "Game Factor CSG550 con Ventana, 2 Ventiladores, Micro ATX, Negro",
                "NZXT H510, RGB, Cristal Templado, 2 Ventiladores, ATX, Negro",
                "Corsair 3000D, Cristal Templado 2 Ventiladores ATX, Negro",
                "Corsair 4000D, Cristal Templado, 2 Ventiladores, ATX, Blanco" };
        double[] precioMicroATX = { 2500, 3000, 3000, 3000 };
        String[] catalogoPlacaATX = { "NZXT H510, RGB, Cristal Templado, 2 Ventiladores, ATX, Negro",
                "Corsair 3000D, Cristal Templado 2 Ventiladores ATX, Negro",
                "Corsair 4000D, Cristal Templado, 2 Ventiladores, ATX, Blanco" };
        double[] precioATX = { 3000, 3000, 3000 };
        // --------------------------------------Nvidia Geforce
        String[] NvidiaGenGPU = { "RTX 2000", "RTX 3000", "RTX 4000" };
        double[] whattsNvidia = { 100, 200, 300 };
        // --------------------------------------RTX 2000
        String[] NvidiaRTX2000 = { "Asus dual RTX 2060 12GB GDDR6", "MSI RTX 2070 8GB GDDR6",
                "GIGABYTE RTX 2080 8GB GDDR6" };
        double[] PreciosRTX2000 = { 4065, 4829, 5244 };
        double[] whattsRTX2000 = { 100, 200, 300, 400 };
        // --------------------------------------RTX 3000
        String[] NvidiaRTX3000 = { "Asus RTX 3060 12GB GDDR6", "MSI RTX 3070 8GB GDRR6",
                "Gigabyte RTX 3080 10GB GDDR6X", "PNY RTX 3090 24 GB XLR8" };
        double[] PreciosRTX3000 = { 5726, 12664, 16344, 22069 };
        double[] whattsRTX3000 = { 100, 200, 300, 400 };
        // --------------------------------------RTX 4000
        String[] NvidiaRTX4000 = { "ZOTAC RTX 4060 8 GB GDDR6", "ASUS RTX 4070 12GB GDDR6X", "MSI RTX 4080 16GB GDDR6X",
                "Asus RTX 4090 24GB GDDR6X" };
        double[] PreciosRTX4000 = { 5709, 10993, 26660, 35748 };
        double[] whattsRTX4000 = { 100, 200, 300, 400 };

        // --------------------------------------AMD Radeon
        String[] AMDGenGPU = { "RX 5000", "RX 6000", "RX 7000" };
        double[] whattsAMD = { 100, 200, 300 };

        // --------------------------------------RX 5000
        String[] AMDRX5000 = { "ASUS RX 5600 XT GDDR6", "Gigabyte RX 5700 XT 8GB GDDR6" };
        double[] PreciosRX5000 = { 4000, 5280 };
        double[] whattsRX5000 = { 100, 200, 300 };

        // --------------------------------------RX 6000
        String[] AMDRX6000 = { "MSI RX 6600 8GB GDDR6", "ASUS RX 6700 XT 12GB GDDR6", "Sapphire RX 6800 16GB GDDR6" };
        double[] PreciosRX6000 = { 6850, 10069, 11809 };
        double[] whattsRX6000 = { 100, 200, 300 };

        // --------------------------------------RX 7000
        String[] AMDRX7000 = { "ASUS RX 7600 8GB GDDR6", "ASUS RX 7700 XT 12GB GDDR6",
                "Sapphire RX 7800 XT 16GB GDDR6" };
        double[] PreciosRX7000 = { 5609, 8629, 9889 };
        double[] whattsRX7000 = { 100, 200, 300 };

        // --------------------------------------Fuentes de poder
        String[] PSUs600 = { "Fuente de Poder EVGA 80 PLUS Gold, Modular, 600W", "Fuente de Poder Cybercore 80 PLUS Platinum, 600W", "Fuente de Poder EVGA 80 PLUS Gold, Modular, 800W", "Fuente de Poder Cybercore 80 PLUS Platinum, 800W" };
        double[] preciosPSUs600 = { 1500, 2000, 2000, 2500 };
        String[] PSUs800 = { "Fuente de Poder EVGA 80 PLUS Gold, Modular, 800W", "Fuente de Poder Cybercore 80 PLUS Platinum, 800W", "Fuente de Poder EVGA 80 PLUS Gold, Modular, 1200W", "Fuente de Poder Cybercore 80 PLUS Platinum, 1200W" };
        double[] preciosPSUs800 = { 2000, 2500, 2500, 3000 };
        String[] PSUs1200 = { "Fuente de Poder EVGA 80 PLUS Gold, Modular, 1200W", "Fuente de Poder Cybercore 80 PLUS Platinum, 1200W", "Fuente de Poder EVGA 80 PLUS Gold, Modular, 1600W", "Fuente de Poder Cybercore 80 PLUS Platinum, 1600W" };
        double[] preciosPSUs1200 = { 2500, 3000, 3000, 3500 };
        String[] PSUs1600 = { "Fuente de Poder EVGA 80 PLUS Gold, Modular, 1600W", "Fuente de Poder Cybercore 80 PLUS Platinum, 1600W" };
        double[] preciosPSUs1600 = { 3000, 3500 };
        int opcionIntel, opcionAMD, opcionNvidia, opcionMotherboard, DDR;
        String opcionSeleccionada; // Variable para almacenar la opcion seleccionada por el usuario
        // ----------------------------------------------------------------termina declaraciones del apartado de Preensamblado
        while (!salir) {
            while (repetir) {
                System.out.println("Bienvenido a ALRM-TECH Encuentra todo para tu PC ideal aqui");
                System.out.println("1. Piezas");
                System.out.println("2. Sistema de armado guiado");
                System.out.println("3. Salir\n");
                System.out.print("Ingrese su opcion: ");
                MenuPrincipal = scanner.nextInt();
                switch (MenuPrincipal) {
                    case 1:
                        repetir = false; // Salir del bucle despues de procesar la opcion 1
                        while (!salir) {
                            System.out.println("Bienvenido al ALRM-TECH Piezas\n");
                            try {
                                Thread.sleep(500); // 500 milisegundos = medio segundo
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("¿Que desea comprar?\n");
                            try {
                                Thread.sleep(500); // 500 milisegundos = medio segundo
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            for (int i = 0; i < categorias.length; i++) {
                                System.out.println((i + 1) + ". " + categorias[i]);
                            }
                            System.out.println((categorias.length + 1) + ". Ver carrito");
                            System.out.println((categorias.length + 2) + ". Salir\n");
                            System.out.print("Ingrese su opcion: ");
                            try {
                                opcion = scanner.nextInt();
                                scanner.nextLine(); // Limpiar el buffer del scanner
                            } catch (java.util.InputMismatchException e) {
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
                                    System.out.println("Productos disponibles en la categoria \""
                                            + categorias[categoriaSeleccionada] + "\":\n");
                                    try {
                                        Thread.sleep(500); // 500 milisegundos = medio segundo
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    for (int i = 0; i < productos[categoriaSeleccionada].length; i++) {
                                        System.out.println(productos[categoriaSeleccionada][i] + " - $"
                                                + precios[categoriaSeleccionada][i]);
                                    }
                                    System.out.print("Ingrese el nombre del producto que desea comprar: \n");
                                    String compraProducto = scanner.nextLine();
                                    boolean productoEncontrado = false;
                                    for (int i = 0; i < productos[categoriaSeleccionada].length; i++) {
                                        if (productos[categoriaSeleccionada][i].equalsIgnoreCase(compraProducto)) {
                                            carrito[indiceCarrito] = productos[categoriaSeleccionada][i];
                                            preciosCarrito[indiceCarrito] = precios[categoriaSeleccionada][i];
                                            System.out.println("Ha agregado un " + productos[categoriaSeleccionada][i]
                                                    + " al carrito.\n");
                                            indiceCarrito++;
                                            productoEncontrado = true;
                                            break;
                                        }
                                    }
                                    if (!productoEncontrado) {
                                        System.out.println("El producto ingresado no está disponible.\n");
                                        break;
                                    }
                                    break;
                                case 16:
                                    if (indiceCarrito == 0) {
                                        repetir = false; // Salir del bucle despues de procesar la opcion 3
                                        System.out.print("El carrito está vacio\n");
                                        try {
                                            Thread.sleep(500); // 500 milisegundos = medio segundo
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    } else {
                                        System.out.println("Productos en el carrito:\n");
                                        try {
                                            Thread.sleep(500); // 500 milisegundos = medio segundo
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        for (int i = 0; i < indiceCarrito; i++) {
                                            System.out
                                                    .println((i + 1) + ". " + carrito[i] + " - $" + preciosCarrito[i]);
                                            subtotal += preciosCarrito[i];
                                        }
                                        double iva = subtotal * 0.16; // IVA
                                        double total = subtotal + iva; // Subtotal + 16% de impuestos

                                        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                        System.out.println("IVA: $" + String.format("%.2f", iva));
                                        System.out.println(
                                                "Total (incluye el IVA): $" + String.format("%.2f", total));
                                        try {
                                            Thread.sleep(500); // 500 milisegundos = medio segundo
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        System.out.println("1. Eliminar un producto");
                                        System.out.println("2. Pagar");
                                        System.out.println("3. Regresar al menú principal");
                                        System.out.print("Ingrese su opcion: ");
                                        int opcionCarrito = scanner.nextInt();
                                        scanner.nextLine(); // Consumir el salto de linea
                                        switch (opcionCarrito) {
                                            case 1:
                                                System.out
                                                        .print("Ingrese el número del producto que desea eliminar: \n");
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
                                                    subtotal = 0;
                                                    System.out.println("Producto eliminado del carrito.\n");
                                                } else {
                                                    System.out.println("indice inválido.\n");
                                                    try {
                                                        Thread.sleep(500); // 500 milisegundos = medio segundo
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                                break;
                                            case 2:
                                                System.out.println("Seleccione el metodo de pago:");
                                                System.out.println("1. Efectivo");
                                                System.out.println("2. Tarjeta");
                                                System.out.print("Ingrese su opcion: ");
                                                int metodoPago = scanner.nextInt();
                                                scanner.nextLine(); // Consumir el salto de linea pendiente
                                                if (metodoPago == 1) {
                                                    // Generar un número de recibo simple
                                                    long numeroRecibo = Math
                                                            .abs((long) (Math.random() * 9000000000L) + 1000000000L);
                                                    try {
                                                        Thread.sleep(500); // 500 milisegundos = medio segundo
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    System.out.println("Recibo de pago en efectivo:");
                                                    System.out.println("Número de recibo: " + numeroRecibo);
                                                    System.out.println("Detalles del pago:");
                                                    for (int i = 0; i < indiceCarrito; i++) {
                                                        System.out.println((i + 1) + ". " + carrito[i] + " - $"
                                                                + preciosCarrito[i]);
                                                    }
                                                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                                    System.out.println("IVA: $" + String.format("%.2f", iva));
                                                    System.out
                                                            .println("Total: $" + String.format("%.2f", total));
                                                    System.out.println(
                                                            "Presente este recibo para recoger su compra en una tienda de conveniencia (Oxxo, 7eleven, etc.).");
                                                    salir = true;
                                                } else if (metodoPago == 2) {
                                                    System.out.print("Ingrese el nombre del titular de la tarjeta: ");
                                                    String titularTarjeta = scanner.nextLine();
                                                    try {
                                                        Thread.sleep(500); // 500 milisegundos = medio segundo
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    System.out.print("Ingrese los 16 digitos de la tarjeta: \n");
                                                    String numeroTarjeta = scanner.nextLine();
                                                    try {
                                                        Thread.sleep(500); // 500 milisegundos = medio segundo
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    if (numeroTarjeta.length() != 16) {
                                                        System.out.println(
                                                                "El número de tarjeta debe tener exactamente 16 digitos.\n");
                                                        break;
                                                    }
                                                    System.out.print("Ingrese la fecha de vencimiento (MM/AA): \n");
                                                    String fechaVencimiento = scanner.nextLine();
                                                    try {
                                                        Thread.sleep(500); // 500 milisegundos = medio segundo
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    // Verificar si la longitud de la cadena es correcta (5 caracteres incluyendo la barra)
                                                    if (fechaVencimiento.length() != 5) {
                                                        System.out.println(
                                                                "Ingrese una fecha de vencimiento válida en formato MM/AA\n");
                                                        break;
                                                    }
                                                    // Verificar si la cadena contiene solo digitos y la barra en la posicion correcta
                                                    for (int i = 0; i < fechaVencimiento.length(); i++) {
                                                        if (i == 2) {
                                                            if (fechaVencimiento.charAt(i) != '/') {
                                                                System.out.println(
                                                                        "Ingrese una fecha de vencimiento válida en formato MM/AA\n");
                                                                break;
                                                            }
                                                        } else {
                                                            if (!Character.isDigit(fechaVencimiento.charAt(i))) {
                                                                System.out.println(
                                                                        "Ingrese una fecha de vencimiento válida en formato MM/AA\n");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    // Verificar si el mes está en el rango válido (01 - 12)
                                                    int mes = Integer.parseInt(fechaVencimiento.substring(0, 2));
                                                    if (mes < 1 || mes > 12) {
                                                        System.out.println("El mes debe estar entre 01 y 12\n");
                                                        break;
                                                    }
                                                    // Verificar si el año está en el rango válido (25 - 99)
                                                    int año = Integer.parseInt(fechaVencimiento.substring(3));
                                                    if (año < 25 || año > 99) {
                                                        System.out.println("El año debe estar entre 25 y 99\n");
                                                        break;
                                                    }
                                                    // -----------------------------------------------------------------validar codigo de seguridad
                                                    System.out.print("Ingrese el codigo de seguridad (3 digitos): ");
                                                    String codigoSeguridad = scanner.nextLine();
                                                    if (codigoSeguridad.length() != 3) {
                                                        System.out.println(
                                                                "El codigo de seguridad debe tener exactamente 3 digitos.\n");
                                                        break;
                                                    }
                                                    System.out.println("Procesando el pago con tarjeta a nombre de "
                                                            + titularTarjeta + "...");
                                                    System.out.println("Pago realizado con exito.");
                                                    System.out.println("Detalles del pago:");
                                                    for (int i = 0; i < indiceCarrito; i++) {
                                                        System.out.println((i + 1) + ". " + carrito[i] + " - $"
                                                                + preciosCarrito[i]);
                                                    }
                                                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                                    System.out.println("IVA: $" + String.format("%.2f", iva));
                                                    System.out.println("Total: $" + String.format("%.2f", total));
                                                    System.out.println("Titular de la tarjeta: " + titularTarjeta);
                                                    salir = true;
                                                } else {
                                                    System.out.println("Opcion de pago inválida.\n");
                                                }
                                                break;
                                            case 3:
                                            subtotal = 0.0;
                                                break;
                                            default:
                                                System.out.println("Opcion inválida.\n");
                                            break;
                                        }
                                    }
                                    break;
                                case 17:
                                    repetir = false; // Salir del bucle despues de procesar la opcion 17
                                    System.out.print("Saliendo");
                                    for (int i = 0; i < 3; i++) {// bucle para repetir 3 veces el . que colocamos para
                                                                 // que se mire bien el salir y este no sea instantaneo
                                        try {
                                            Thread.sleep(500); // 500 milisegundos = medio segundo
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        System.out.print(".");
                                    }
                                    salir = true;
                                    break;
                                default:
                                    System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                break;
                            }
                        }
                        scanner.close();
                        break;
                    case 2:
                    while (!salir) {
                        subtotal = 0;
                        double whatts = 0;
                        opcionAMD = 0;
                        opcionNvidia = 0;
                        System.out.println("Bienvenido a sistema de armado guiado de PC de ALRM-TECH\n");
                        System.out.println("Empezemos con el Procesador\n");
                        for (int i = 0; i < marcaCPU.length; i++) {
                            System.out.println((i + 1) + ". " + marcaCPU[i]);
                        }
                        System.out.print("Ingrese su opcion: ");
                        try {
                            opcion = scanner.nextInt();
                            scanner.nextLine();
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Entrada inválida. Intentelo de nuevo.\n");
                            scanner.nextLine();
                            continue;
                        }
                        switch (opcion) {
                            case 1:
                            opcionIntel = 0;
                                System.out.println("Ha seleccionado " + marcaCPU[opcion - 1]);
                                do {
                                    System.out.println("Seleccione la generacion de su procesador:\n");
                                    for (int i = 0; i < intelGenCPU.length; i++) {
                                        System.out.println((i + 1) + ". " + intelGenCPU[i]);
                                    }
                                    System.out.print("Ingrese su opcion: ");
                                    opcionIntel = scanner.nextInt();
                                    scanner.nextLine();
                                } while (opcionIntel < 1 || opcionIntel > intelGenCPU.length);
                                whatts += whattsintel[opcionIntel - 1];
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                switch (opcionIntel) {
                                    case 1:// --------------------------------------------------------------------------------------------INTEL
                                    int opcionCPU = 0;
                                    do {
                                        System.out.println("Ha seleccionado " + intelGenCPU[opcionIntel - 1]);
                                        System.out.println("Seleccione la gama del procesador:\n");
                                        for (int i = 0; i < intel12thCPU.length; i++) {
                                            System.out.println((i + 1) + ". " + intel12thCPU[i] + " $" + preciosintel12th[i]);
                                        }
                                        System.out.print("Ingrese su opcion: \n");
                                        precioSeleccionado = preciosintel12th[opcionCPU - 1];
                                        opcionCPU = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionCPU < 1 || opcionCPU > intel12thCPU.length);
                                    whatts += whattsintel12th[opcionCPU - 1];
                                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                    subtotal += preciosintel12th[opcionCPU - 1];
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                        break;
                                    case 2:
                                    opcionCPU = 0;
                                    do {
                                        System.out.println("Ha seleccionado " + intelGenCPU[opcionIntel - 1]);
                                        System.out.println("Seleccione la gama del procesador:");
                                        for (int i = 0; i < intel13thCPU.length; i++) {
                                            System.out.println((i + 1) + ". " + intel13thCPU[i] + " $" + preciosintel13th[i]);
                                        }
                                        System.out.print("Ingrese su opcion: \n");
                                        precioSeleccionado = preciosintel13th[opcionCPU - 1];
                                        opcionCPU = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionCPU < 1 || opcionCPU > intel13thCPU.length);
                                        whatts += whattsintel13th[opcionCPU - 1];
                                        subtotal += preciosintel13th[opcionCPU - 1];
                                        System.out.println(
                                                "El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                        System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                        break;
                                        case 3:
                                        opcionCPU = 0;
                                        System.out.println("Ha seleccionado " + intelGenCPU[opcionIntel - 1]);
                                        opcionCPU = 0;
                                        do {
                                            System.out.println("Seleccione la gama del procesador:");
                                            for (int i = 0; i < intel14thCPU.length; i++) {
                                                System.out.println((i + 1) + ". " + intel14thCPU[i] + " $" + preciosintel14th[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            precioSeleccionado = preciosintel14th[opcionCPU - 1];
                                            opcionCPU = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionCPU < 1 || opcionCPU > intel14thCPU.length);
                                        whatts += whattsintel14th[opcionCPU - 1];
                                        subtotal += preciosintel14th[opcionCPU - 1];
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                        System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                        break;
                                    default:
                                        System.out.println("Opcion inválida. Intentelo de nuevo.");
                                        break;
                                }
                                // ----------------------------------------------------------------------------------------------------Agregar seleccion de motherboards INTEL
                                System.out.println("Continuemos con las Motherboards");
                                System.out.println("Estas son las Motherboards compatibles con tu CPU\n");
                                opcionMotherboard = 0;
                                do {
                                    for (int i = 0; i < lga1700.length; i++) {
                                        System.out.println((i + 1) + ". " + lga1700[i] + " $" + precioslga1700[i]);
                                    }
                                    System.out.print("Ingrese su opcion: ");
                                    opcionMotherboard = scanner.nextInt();
                                    scanner.nextLine();
                                } while (opcionMotherboard < 1 || opcionMotherboard > lga1700.length);
                                DDR = (opcionMotherboard <= 2) ? 4 : 5;
                                System.out.println("Ha seleccionado " + lga1700[opcionMotherboard - 1]);
                                if (opcionMotherboard >= 1 && opcionMotherboard <= 3) {
                                    whatts += whattslga1700[opcionMotherboard - 1];
                                    subtotal += precioslga1700[opcionMotherboard - 1];
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                    // ---------------------------------------------------------------------------------------------------------------------Refrigeracion
                                    System.out.println("Es hora de seleccionar un sistema de refrigeracion\n");
                                    int opcionRefrigeracion = 0;
                                    do {
                                        for (int i = 0; i < refrigeracion.length; i++) {
                                            System.out.println((i + 1) + ". " + refrigeracion[i] + " $" + preciosRefrigeracion[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionRefrigeracion = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionRefrigeracion < 1 || opcionRefrigeracion > refrigeracion.length);
                                    String refrigeracionSeleccionada = refrigeracion[opcionRefrigeracion - 1];
                                    double precioRefrigeracion = preciosRefrigeracion[opcionRefrigeracion - 1];
                                    System.out.println("Ha seleccionado " + refrigeracionSeleccionada);
                                    subtotal += precioRefrigeracion;
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    // -----------------------------------------------------------------------------------------------------------------------------RAM
                                    System.out.println("Ahora toca seleccionar la memoria RAM");
                                    System.out.println("Debido a que tu Motherboard es DDR" + DDR + ", estos son el catálogo de RAMs disponibles para tu Motherboard\n");
                                    int opcionRAM = 0;
                                    if (DDR == 4) {
                                        do {
                                            for (int i = 0; i < DDR4.length; i++) {
                                                System.out.println((i + 1) + ". " + DDR4[i] + " $" + preciosDDR4[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionRAM = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionRAM < 1 || opcionRAM > DDR4.length);
                                    } else if (DDR == 5) {
                                        do {
                                            for (int i = 0; i < DDR5.length; i++) {
                                                System.out.println((i + 1) + ". " + DDR5[i] + " $" + preciosDDR5[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionRAM = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionRAM < 1 || opcionRAM > DDR5.length);
                                    } else {
                                        System.out.println("No hay catálogo de RAM disponible para este tipo de placa base.\n");
                                    }
                                    double precioRAM = 0;
                                    if (DDR == 4 && opcionRAM >= 1 && opcionRAM <= DDR4.length) {
                                        precioRAM = preciosDDR4[opcionRAM - 1];
                                    } else if (DDR == 5 && opcionRAM >= 1 && opcionRAM <= DDR5.length) {
                                        precioRAM = preciosDDR5[opcionRAM - 1];
                                    } else {
                                        System.out.println("Opcion inválida. No se ha seleccionado RAM.");
                                    }
                                    subtotal += precioRAM;
                                    opcionSeleccionada = (DDR == 4) ? DDR4[opcionRAM - 1] : DDR5[opcionRAM - 1];
                                    System.out.println("Ha seleccionado " + opcionSeleccionada);
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                    // -------------------------------------------------------------------------------------------------------------------------Almacenamiento
                                    System.out.println("Es turno de que selecciones un tipo de almacenamiento\n");
                                    int opcionAlmacenamiento = 0;
                                    do {
                                        for (int i = 0; i < TipoAlmacenamiento.length; i++) {
                                            System.out.println((i + 1) + ". " + TipoAlmacenamiento[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionAlmacenamiento = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionAlmacenamiento < 1 || opcionAlmacenamiento > TipoAlmacenamiento.length);
                                    opcionSeleccionada = TipoAlmacenamiento[opcionAlmacenamiento - 1];
                                    switch (opcionAlmacenamiento) {
                                        case 1:
                                            System.out.println("Has seleccionado HDD");
                                            System.out.println("Estas son las opciones de HDD disponibles:\n");
                                            int opcionHDD = 0;
                                            do {
                                                for (int i = 0; i < HDDsata.length; i++) {
                                                    System.out.println((i + 1) + ". " + HDDsata[i] + " $" + preciosHDD[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionHDD = scanner.nextInt();
                                                scanner.nextLine();
                                            } while (opcionHDD < 1 || opcionHDD > HDDsata.length);
                                            opcionSeleccionada = HDDsata[opcionHDD - 1];
                                            System.out.println("Ha seleccionado el " + opcionSeleccionada);
                                            subtotal += preciosHDD[opcionHDD - 1];
                                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                            break;
                                        case 2:
                                            System.out.println("Has seleccionado SSD");
                                            System.out.println("Estas son las opciones de SSD disponibles:");
                                            int opcionSSD = 0;
                                            do {
                                                for (int i = 0; i < SSDsata.length; i++) {
                                                    System.out.println((i + 1) + ". " + SSDsata[i] + " $" + preciosSSD[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionSSD = scanner.nextInt();
                                                scanner.nextLine();
                                            } while (opcionSSD < 1 || opcionSSD > SSDsata.length);
                                            opcionSeleccionada = SSDsata[opcionSSD - 1];
                                            System.out.println("Ha seleccionado " + opcionSeleccionada);
                                            subtotal += preciosSSD[opcionSSD - 1];
                                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                            break;
                                        case 3:
                                            System.out.println("Has seleccionado NVMe");
                                            System.out.println("Estas son las opciones de NVMe disponibles:\n");
                                            int opcionNVMe = 0;
                                            do {
                                                for (int i = 0; i < NVMe.length; i++) {
                                                    System.out.println((i + 1) + ". " + NVMe[i] + " $" + preciosNVMe[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionNVMe = scanner.nextInt();
                                                scanner.nextLine();
                                            } while (opcionNVMe < 1 || opcionNVMe > NVMe.length);
                                            opcionSeleccionada = NVMe[opcionNVMe - 1];
                                            System.out.println("Ha seleccionado " + opcionSeleccionada);
                                            subtotal += preciosNVMe[opcionNVMe - 1];
                                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                            break;
                                        default:
                                            System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                            break;
                                    }
                                    // ----------------------------------------------------------------------------------------------------------------- Gabinetes
                                    System.out.println("Es hora de seleccionar un Gabinete\n");
                                    System.out.println("Este es el catálogo de gabinetes disponibles compatibles con tu placa madre\n");
                                    int opcionGabinete = 0;
                                    if (opcionMotherboard <= 2) { // Si es una placa MicroATX
                                        do {
                                            for (int i = 0; i < catalogoPlacaMicroATX.length; i++) {
                                                System.out.println((i + 1) + ". " + catalogoPlacaMicroATX[i] + " $" + precioMicroATX[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionGabinete = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionGabinete < 1 || opcionGabinete > catalogoPlacaMicroATX.length);
                                    } else { // Si es una placa ATX
                                        do {
                                            for (int i = 0; i < catalogoPlacaATX.length; i++) {
                                                System.out.println((i + 1) + ". " + catalogoPlacaATX[i] + " $" + precioATX[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionGabinete = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionGabinete < 1 || opcionGabinete > catalogoPlacaATX.length);
                                    }
                                    String gabineteSeleccionado = (opcionMotherboard <= 2)
                                            ? catalogoPlacaMicroATX[opcionGabinete - 1]
                                            : catalogoPlacaATX[opcionGabinete - 1];
                                    double precioGabinete = (opcionMotherboard <= 2)
                                            ? precioMicroATX[opcionGabinete - 1]
                                            : precioATX[opcionGabinete - 1];
                                    System.out.println("Ha seleccionado " + gabineteSeleccionado);
                                    subtotal += precioGabinete; // Sumar el precio del gabinete al subtotal
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    //-----------------------------------------------------------------------------------------------------------------Tarjetas de video
                                    System.out.println("Es hora de seleccionar una Tarjeta Gráfica");
                                    System.out.println("Este es el catálogo de Tarjetas Gráficas disponibles:\n");
                                    System.out.println("1. Nvidia Geforce");
                                    System.out.println("2. AMD Radeon");
                                    int opcionGPU = 0;
                                    do {
                                        System.out.print("Ingrese su opcion (1 para Nvidia, 2 para AMD): \n");
                                        opcionGPU = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionGPU < 1 || opcionGPU > 2);
                                    switch (opcionGPU) {
                                        case 1: // Nvidia
                                            System.out.println("Has seleccionado Nvidia Geforce");
                                            System.out.println("Estas son las generaciones de Nvidia Geforce disponibles:");
                                            int opcionGenNvidia = 0;
                                            do {
                                                for (int i = 0; i < NvidiaGenGPU.length; i++) {
                                                    System.out.println((i + 1) + ". " + NvidiaGenGPU[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionGenNvidia = scanner.nextInt();
                                                scanner.nextLine();
                                            } while (opcionGenNvidia < 1 || opcionGenNvidia > NvidiaGenGPU.length);
                                            String genSeleccionada = NvidiaGenGPU[opcionGenNvidia - 1];
                                            whatts += whattsNvidia[opcionGenNvidia - 1];
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
                                                    System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                                    break;
                                            }
                                            if (opcionesNvidia != null) {
                                                opcionNvidia = 0;
                                                do {
                                                    for (int i = 0; i < opcionesNvidia.length; i++) {
                                                        System.out.println((i + 1) + ". " + opcionesNvidia[i] + " $" + preciosNvidia[i]);
                                                    }
                                                    System.out.print("Ingrese su opcion: ");
                                                    opcionNvidia = scanner.nextInt();
                                                    scanner.nextLine();
                                                } while (opcionNvidia < 1 || opcionNvidia > opcionesNvidia.length);
                                                String gpuNvidiaSeleccionada = opcionesNvidia[opcionNvidia - 1];
                                                whatts += wattsNvidia[opcionNvidia - 1];
                                                subtotal += preciosNvidia[opcionNvidia - 1];
                                                System.out.println("Ha seleccionado " + gpuNvidiaSeleccionada);
                                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                            }
                                            break;
                                        case 2: // AMD
                                            System.out.println("Has seleccionado AMD Radeon");
                                            System.out.println("Estas son las generaciones de AMD Radeon disponibles:");
                                            int opcionGenAMD = 0;
                                            do {
                                                for (int i = 0; i < AMDGenGPU.length; i++) {
                                                    System.out.println((i + 1) + ". " + AMDGenGPU[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionGenAMD = scanner.nextInt();
                                                scanner.nextLine();
                                            } while (opcionGenAMD < 1 || opcionGenAMD > AMDGenGPU.length);
                                            String genAMDSeleccionada = AMDGenGPU[opcionGenAMD - 1];
                                            whatts += whattsAMD[opcionGenAMD - 1];
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
                                                    System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                                    break;
                                            }
                                            if (opcionesAMD != null) {
                                                opcionAMD = 0;
                                                do {
                                                    for (int i = 0; i < opcionesAMD.length; i++) {
                                                        System.out.println((i + 1) + ". " + opcionesAMD[i] + " $" + preciosAMD[i]);
                                                    }
                                                    System.out.print("Ingrese su opcion: ");
                                                    opcionAMD = scanner.nextInt();
                                                    scanner.nextLine();
                                                } while (opcionAMD < 1 || opcionAMD > opcionesAMD.length);
                                                String gpuAMDSeleccionada = opcionesAMD[opcionAMD - 1];
                                                whatts += wattsAMD[opcionAMD - 1];
                                                subtotal += preciosAMD[opcionAMD - 1];
                                                System.out.println("Ha seleccionado " + gpuAMDSeleccionada);
                                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                            }
                                            break;
                                        default:
                                            System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                            break;
                                    }
                                    //----------------------------------------------------------------------------------------fuentes de poder
                                    int opcionFuente = 0;
                                    if (whatts <= 600) {// si el consumo es menor o igual a 600 watts
                                        System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                                        do {
                                            for (int i = 0; i < PSUs600.length; i++) {
                                                System.out.println((i + 1) + ". " + PSUs600[i] + " $" + preciosPSUs600[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionFuente = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionFuente < 1 || opcionFuente > PSUs600.length);
                                        String fuenteSeleccionada = PSUs600[opcionFuente - 1];
                                        double precioFuente = preciosPSUs600[opcionFuente - 1];
                                        System.out.println("Ha seleccionado " + fuenteSeleccionada);
                                        subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    } else if (whatts <= 800) {// si el consumo es menor o igual a 800 watts
                                        System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                                        do {
                                            for (int i = 0; i < PSUs800.length; i++) {
                                                System.out.println((i + 1) + ". " + PSUs800[i] + " $" + preciosPSUs800[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionFuente = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionFuente < 1 || opcionFuente > PSUs800.length);
                                        String fuenteSeleccionada = PSUs800[opcionFuente - 1];
                                        double precioFuente = preciosPSUs800[opcionFuente - 1];
                                        System.out.println("Ha seleccionado " + fuenteSeleccionada);
                                        subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    } else if (whatts <= 1200) {// si el consumo es menor o igual a 1200 watts
                                        System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                                        do {
                                            for (int i = 0; i < PSUs1200.length; i++) {
                                                System.out.println((i + 1) + ". " + PSUs1200[i] + " $" + preciosPSUs1200[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionFuente = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionFuente < 1 || opcionFuente > PSUs1200.length);
                                        String fuenteSeleccionada = PSUs1200[opcionFuente - 1];
                                        double precioFuente = preciosPSUs1200[opcionFuente - 1];
                                        System.out.println("Ha seleccionado " + fuenteSeleccionada);
                                        subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    } else {// si el consumo es mayor a 1200 watts
                                        System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:\n");
                                        do {
                                            for (int i = 0; i < PSUs1600.length; i++) {
                                                System.out.println((i + 1) + ". " + PSUs1600[i] + " $" + preciosPSUs1600[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionFuente = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionFuente < 1 || opcionFuente > PSUs1600.length);
                                        String fuenteSeleccionada = PSUs1600[opcionFuente - 1];
                                        double precioFuente = preciosPSUs1600[opcionFuente - 1];
                                        System.out.println("Ha seleccionado " + fuenteSeleccionada);
                                        subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                    }

                                    System.out.println("Muy bonito tu ensamble, pero ahora es momento de pasar por caja ╰(*°▽°*)╯");
                                    System.out.println("Imprimiendo ticket de compra...");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("                PC COMPONENTES");
                                    System.out.println("--------------------------------------------------\n");
                                    String fuenteSeleccionada = "";
                                    int i = 0;
                                    System.out.println("Procesador: " + opcionSeleccionada);
                                    System.out.println("Motherboard: " + opcionSeleccionada);
                                    System.out.println("Refrigeracion: " + refrigeracionSeleccionada);
                                    System.out.println("RAM: " + opcionSeleccionada);
                                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                                    System.out.println("Gabinete: " + gabineteSeleccionado);
                                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                                    System.out.println("Fuente de poder: " + fuenteSeleccionada);
                                    System.out.println("--------------------------------------------------\n");
                                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                    System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                                    double iva = subtotal * 0.16; // IVA
                                    System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                                    int metodoPago = 0;
                                    do {
                                        System.out.println("Seleccione el metodo de pago:");
                                        System.out.println("1. Efectivo");
                                        System.out.println("2. Tarjeta");
                                        System.out.print("Ingrese su opcion: ");
                                        metodoPago = scanner.nextInt();
                                        scanner.nextLine(); // Consumir el salto de linea pendiente
                                        if (metodoPago < 1 || metodoPago > 2) {
                                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                        }
                                    } while (metodoPago < 1 || metodoPago > 2);

                                    if (metodoPago == 1) {
                                        // Generar un número de recibo simple
                                        long numeroRecibo = Math
                                                .abs((long) (Math.random() * 9000000000L) + 1000000000L);
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
                                        System.out.println("--------------------------------------------------\n");

                                        System.out.println("Procesador: " + opcionSeleccionada + " $");
                                        System.out.println("Motherboard: " + opcionSeleccionada + " $");
                                        System.out.println("Refrigeracion: " + refrigeracionSeleccionada + " $");
                                        System.out.println("RAM: " + opcionSeleccionada + " $");
                                        System.out.println("Almacenamiento: " + opcionSeleccionada + " $");
                                        System.out.println("Gabinete: " + gabineteSeleccionado + " $");
                                        System.out.println("Tarjeta Gráfica: " + opcionSeleccionada + " $");
                                        System.out.println("Fuente de poder: " + fuenteSeleccionada + " $");
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                        System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                                        System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                                        System.out.println("Presente este recibo para recoger su compra en una tienda de conveniencia (Oxxo, 7eleven, etc.).");
                                        System.out.println("Nota: el numero de recivo expira en 7 dias.");
                                        System.out.println("Gracias por su compra.\n");
                                    } else if (metodoPago == 2) {
                                        System.out.print("Ingrese el nombre del titular de la tarjeta: \n");
                                        String titularTarjeta = scanner.nextLine();
                                        try {
                                            Thread.sleep(500); // 500 milisegundos = medio segundo
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        System.out.print("Ingrese los 16 digitos de la tarjeta: \n");
                                        String numeroTarjeta = scanner.nextLine();
                                        try {
                                            Thread.sleep(500); // 500 milisegundos = medio segundo
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        if (numeroTarjeta.length() != 16) {

                                            System.out
                                                    .println("El número de tarjeta debe tener exactamente 16 digitos.\n");
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
                                            System.out.println("Ingrese una fecha de vencimiento válida en formato MM/AA");
                                            break;
                                        }
                                        // Verificar si la cadena contiene solo digitos y la barra en la posicion correcta
                                        for (i = 0; i < fechaVencimiento.length(); i++) {
                                            if (i == 2) {
                                                if (fechaVencimiento.charAt(i) != '/') {
                                                    System.out.println(
                                                            "Ingrese una fecha de vencimiento válida en formato MM/AA\n");
                                                    break;
                                                }
                                            } else {
                                                if (!Character.isDigit(fechaVencimiento.charAt(i))) {

                                                    System.out.println(
                                                            "Ingrese una fecha de vencimiento válida en formato MM/AA\n");
                                                    break;
                                                }
                                            }
                                        }
                                        // Verificar si el mes está en el rango válido (01 - 12)
                                        int mes = Integer.parseInt(fechaVencimiento.substring(0, 2));
                                        if (mes < 1 || mes > 12) {
                                            System.out.println("El mes debe estar entre 01 y 12\n");
                                            break;
                                        }
                                        // Verificar si el año está en el rango válido (25 - 99)
                                        int año = Integer.parseInt(fechaVencimiento.substring(3));
                                        if (año < 25 || año > 99) {
                                            System.out.println("El año debe estar entre 25 y 99\n");
                                            break;
                                        }
                                        // -----------------------------------------------------------------validar
                                        // codigo de seguridad
                                        System.out.print("Ingrese el codigo de seguridad (3 digitos): \n");
                                        String codigoSeguridad = scanner.nextLine();
                                        if (codigoSeguridad.length() != 3) {
                                            System.out.println(
                                                    "El codigo de seguridad debe tener exactamente 3 digitos.\n");
                                            break;
                                        }
                                        System.out.println("Procesando el pago con tarjeta a nombre de " + titularTarjeta + "...");
                                        System.out.println("Pago realizado con exito.");
                                        System.out.println("Detalles del pago:\n");
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("                PC COMPONENTES");
                                        System.out.println("--------------------------------------------------\n");
                                        System.out.println("Procesador: " + opcionSeleccionada);
                                    System.out.println("Motherboard: " + opcionSeleccionada);
                                    System.out.println("Refrigeracion: " + refrigeracionSeleccionada);
                                    System.out.println("RAM: " + opcionSeleccionada);
                                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                                    System.out.println("Gabinete: " + gabineteSeleccionado);
                                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                                    System.out.println("Fuente de poder: " + fuenteSeleccionada);
                                        System.out.println("--------------------------------------------------\n");
                                        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                        System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                                        System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                                        System.out.println("Gracias por su compra.\n");
                                    }
                                }
                                break;
                            case 2:// --------------------------------------------------------------------------------------------------------------------------------AMD
                            System.out.println("Ha seleccionado " + marcaCPU[opcion - 1]);
                            opcionAMD = 0;
                            do {
                                System.out.println("Seleccione la generacion de su procesador:\n");
                                for (int i = 0; i < amdGenCPU.length; i++) {
                                    System.out.println((i + 1) + ". " + amdGenCPU[i]);
                                }
                                System.out.print("Ingrese su opcion: ");
                                opcionAMD = scanner.nextInt();
                                scanner.nextLine();
                                if (opcionAMD < 1 || opcionAMD > 3) {
                                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                } else {
                                    whatts += whattsAmd[opcionAMD - 1];
                                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                    switch (opcionAMD) {
                                        case 1:
                                            int opcionCPU;
                                            do {
                                                System.out.println("Ha seleccionado " + amdGenCPU[opcionAMD - 1]);
                                                System.out.println("Seleccione el procesador:");
                                                for (int i = 0; i < amd3000CPU.length; i++) {
                                                    System.out.println((i + 1) + ". " + amd3000CPU[i] + " $" + preciosAmd3000[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionCPU = scanner.nextInt();
                                                scanner.nextLine();
                                                if (opcionCPU < 1 || opcionCPU > amd3000CPU.length) {
                                                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                                } else {
                                                    whatts += whattsAmd3000[opcionCPU - 1];
                                                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                                    subtotal += preciosAmd3000[opcionCPU - 1];
                                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                                }
                                            } while (opcionCPU < 1 || opcionCPU > amd3000CPU.length);
                                            break;
                                        case 2:
                                            do {
                                                System.out.println("Ha seleccionado " + amdGenCPU[opcionAMD - 1]);
                                                System.out.println("Seleccione el procesador:\n");
                                                for (int i = 0; i < amd5000CPU.length; i++) {
                                                    System.out.println((i + 1) + ". " + amd5000CPU[i] + " $" + preciosAmd5000[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionCPU = scanner.nextInt();
                                                scanner.nextLine();
                                                if (opcionCPU < 1 || opcionCPU > amd5000CPU.length) {
                                                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                                } else {
                                                    whatts += whattsAmd5000[opcionCPU - 1];
                                                    subtotal += preciosAmd5000[opcionCPU - 1];
                                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                                }
                                            } while (opcionCPU < 1 || opcionCPU > amd5000CPU.length);
                                            break;
                                        case 3:
                                            do {
                                                System.out.println("Ha seleccionado " + amdGenCPU[opcionAMD - 1]);
                                                System.out.println("Seleccione el procesador:");
                                                for (int i = 0; i < amd7000CPU.length; i++) {
                                                    System.out.println((i + 1) + ". " + amd7000CPU[i] + " $" + preciosAmd7000[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionCPU = scanner.nextInt();
                                                scanner.nextLine();
                                                if (opcionCPU < 1 || opcionCPU > amd7000CPU.length) {
                                                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                                } else {
                                                    whatts += whattsAmd7000[opcionCPU - 1];
                                                    subtotal += preciosAmd7000[opcionCPU - 1];
                                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                                    System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                                }
                                            } while (opcionCPU < 1 || opcionCPU > amd7000CPU.length);
                                            break;
                                        default:
                                            System.out.println("Opcion inválida. Intentelo de nuevo.");
                                            break;
                                    }
                                }
                            } while (opcionAMD < 1 || opcionAMD > 3);
                            
                            // Agregar seleccion de motherboards AMD
                            System.out.println("Continuemos con las Motherboards");
                            System.out.println("Estas son las Motherboards compatibles con tu CPU");
                            opcionMotherboard = 0;
                            if (opcionAMD == 1) { // AMD Ryzen 3000
                                do {
                                    for (int i = 0; i < amd3000.length; i++) {
                                        System.out.println((i + 1) + ". " + amd3000[i] + " $" + preciosMotheramd3000[i]);
                                    }
                                    System.out.print("Ingrese su opcion: ");
                                    opcionMotherboard = scanner.nextInt();
                                    scanner.nextLine();
                                    if (opcionMotherboard < 1 || opcionMotherboard > amd3000.length) {
                                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                    } else {
                                        DDR = (opcionMotherboard <= 2) ? 4 : 5;
                                        System.out.println("Ha seleccionado " + amd3000[opcionMotherboard - 1]);
                                        whatts += whattsMotheramd3000[opcionMotherboard - 1];
                                        subtotal += preciosMotheramd3000[opcionMotherboard - 1];
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                        System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                    }
                                } while (opcionMotherboard < 1 || opcionMotherboard > amd3000.length);
                            } else { // AMD Ryzen 5000 o 7000
                                do {
                                    for (int i = 0; i < amd5000.length; i++) {
                                        System.out.println((i + 1) + ". " + amd5000[i] + " $" + preciosMotheramd5000[i]);
                                    }
                                    System.out.print("Ingrese su opcion: ");
                                    opcionMotherboard = scanner.nextInt();
                                    scanner.nextLine();
                                    if (opcionMotherboard < 1 || opcionMotherboard > amd5000.length) {
                                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                    } else {
                                        DDR = (opcionMotherboard <= 2) ? 4 : 5;
                                        System.out.println("Ha seleccionado " + amd5000[opcionMotherboard - 1]);
                                        whatts += whattsMotheramd5000[opcionMotherboard - 1];
                                        subtotal += preciosMotheramd5000[opcionMotherboard - 1];
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                        System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                    }
                                } while (opcionMotherboard < 1 || opcionMotherboard > amd5000.length);
                            }
                                // ---------------------------------------------------------------------------------------------------------------------Refrigeracion
                                System.out.println("Es hora de seleccionar un sistema de refrigeracion\n");
                                int opcionRefrigeracion = 0;
                                do {
                                    for (int i = 0; i < refrigeracion.length; i++) {
                                        System.out.println((i + 1) + ". " + refrigeracion[i] + " $" + preciosRefrigeracion[i]);
                                    }
                                    System.out.print("Ingrese su opcion: ");
                                    opcionRefrigeracion = scanner.nextInt();
                                    scanner.nextLine();
                                } while (opcionRefrigeracion < 1 || opcionRefrigeracion > refrigeracion.length);
                                String refrigeracionSeleccionada = refrigeracion[opcionRefrigeracion - 1];
                                double precioRefrigeracion = preciosRefrigeracion[opcionRefrigeracion - 1];
                                System.out.println("Ha seleccionado " + refrigeracionSeleccionada);
                                subtotal += precioRefrigeracion;
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                // -----------------------------------------------------------------------------------------------------------------------------RAM
                                System.out.println("Ahora toca seleccionar la memoria RAM");
                                DDR = (opcionMotherboard <= 2) ? 4 : 5;
                                System.out.println("Debido a que tu Motherboard es DDR" + DDR + ", estos son el catálogo de RAMs disponibles para tu Motherboard\n");
                                int opcionRAM = 0;
                                if (DDR == 4) {
                                    do {
                                        for (int i = 0; i < DDR4.length; i++) {
                                            System.out.println((i + 1) + ". " + DDR4[i] + " $" + preciosDDR4[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionRAM = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionRAM < 1 || opcionRAM > DDR4.length);
                                } else if (DDR == 5) {
                                    do {
                                        for (int i = 0; i < DDR5.length; i++) {
                                            System.out.println((i + 1) + ". " + DDR5[i] + " $" + preciosDDR5[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionRAM = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionRAM < 1 || opcionRAM > DDR5.length);
                                } else {
                                    System.out.println("No hay catálogo de RAM disponible para este tipo de placa base.\n");
                                }
                                double precioRAM = 0;
                                if (DDR == 4 && opcionRAM >= 1 && opcionRAM <= DDR4.length) {
                                    precioRAM = preciosDDR4[opcionRAM - 1];
                                } else if (DDR == 5 && opcionRAM >= 1 && opcionRAM <= DDR5.length) {
                                    precioRAM = preciosDDR5[opcionRAM - 1];
                                } else {
                                    System.out.println("Opcion inválida. No se ha seleccionado RAM.");
                                }
                                subtotal += precioRAM;
                                opcionSeleccionada = (DDR == 4) ? DDR4[opcionRAM - 1] : DDR5[opcionRAM - 1];
                                System.out.println("Ha seleccionado " + opcionSeleccionada);
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                // -------------------------------------------------------------------------------------------------------------------------Almacenamiento
                                System.out.println("Es turno de que selecciones un tipo de almacenamiento\n");
                                int opcionAlmacenamiento = 0;
                                do {
                                    for (int i = 0; i < TipoAlmacenamiento.length; i++) {
                                        System.out.println((i + 1) + ". " + TipoAlmacenamiento[i]);
                                    }
                                    System.out.print("Ingrese su opcion: ");
                                    opcionAlmacenamiento = scanner.nextInt();
                                    scanner.nextLine();
                                } while (opcionAlmacenamiento < 1 || opcionAlmacenamiento > TipoAlmacenamiento.length);
                                opcionSeleccionada = TipoAlmacenamiento[opcionAlmacenamiento - 1];
                                switch (opcionAlmacenamiento) {
                                    case 1:
                                        System.out.println("Has seleccionado HDD");
                                        System.out.println("Estas son las opciones de HDD disponibles:\n");
                                        int opcionHDD = 0;
                                        do {
                                            for (int i = 0; i < HDDsata.length; i++) {
                                                System.out.println((i + 1) + ". " + HDDsata[i] + " $" + preciosHDD[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionHDD = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionHDD < 1 || opcionHDD > HDDsata.length);
                                        opcionSeleccionada = HDDsata[opcionHDD - 1];
                                        System.out.println("Ha seleccionado el " + opcionSeleccionada);
                                        subtotal += preciosHDD[opcionHDD - 1];
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                        break;
                                    case 2:
                                        System.out.println("Has seleccionado SSD");
                                        System.out.println("Estas son las opciones de SSD disponibles:");
                                        int opcionSSD = 0;
                                        do {
                                            for (int i = 0; i < SSDsata.length; i++) {
                                                System.out.println((i + 1) + ". " + SSDsata[i] + " $" + preciosSSD[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionSSD = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionSSD < 1 || opcionSSD > SSDsata.length);
                                        opcionSeleccionada = SSDsata[opcionSSD - 1];
                                        System.out.println("Ha seleccionado " + opcionSeleccionada);
                                        subtotal += preciosSSD[opcionSSD - 1];
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                        break;
                                    case 3:
                                        System.out.println("Has seleccionado NVMe");
                                        System.out.println("Estas son las opciones de NVMe disponibles:\n");
                                        int opcionNVMe = 0;
                                        do {
                                            for (int i = 0; i < NVMe.length; i++) {
                                                System.out.println((i + 1) + ". " + NVMe[i] + " $" + preciosNVMe[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionNVMe = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionNVMe < 1 || opcionNVMe > NVMe.length);
                                        opcionSeleccionada = NVMe[opcionNVMe - 1];
                                        System.out.println("Ha seleccionado " + opcionSeleccionada);
                                        subtotal += preciosNVMe[opcionNVMe - 1];
                                        System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                        break;
                                    default:
                                        System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                        break;
                                }
                                // ----------------------------------------------------------------------------------------------------------------- Gabinetes
                                System.out.println("Es hora de seleccionar un Gabinete\n");
                                System.out.println("Este es el catálogo de gabinetes disponibles compatibles con tu placa madre\n");
                                int opcionGabinete = 0;
                                if (opcionMotherboard <= 2) { // Si es una placa MicroATX
                                    do {
                                        for (int i = 0; i < catalogoPlacaMicroATX.length; i++) {
                                            System.out.println((i + 1) + ". " + catalogoPlacaMicroATX[i] + " $" + precioMicroATX[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionGabinete = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionGabinete < 1 || opcionGabinete > catalogoPlacaMicroATX.length);
                                } else { // Si es una placa ATX
                                    do {
                                        for (int i = 0; i < catalogoPlacaATX.length; i++) {
                                            System.out.println((i + 1) + ". " + catalogoPlacaATX[i] + " $" + precioATX[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionGabinete = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionGabinete < 1 || opcionGabinete > catalogoPlacaATX.length);
                                }
                                String gabineteSeleccionado = (opcionMotherboard <= 2)
                                        ? catalogoPlacaMicroATX[opcionGabinete - 1]
                                        : catalogoPlacaATX[opcionGabinete - 1];
                                double precioGabinete = (opcionMotherboard <= 2)
                                        ? precioMicroATX[opcionGabinete - 1]
                                        : precioATX[opcionGabinete - 1];
                                System.out.println("Ha seleccionado " + gabineteSeleccionado);
                                subtotal += precioGabinete; // Sumar el precio del gabinete al subtotal
                                System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                //-----------------------------------------------------------------------------------------------------------------Tarjetas de video
                                System.out.println("Es hora de seleccionar una Tarjeta Gráfica");
                                System.out.println("Este es el catálogo de Tarjetas Gráficas disponibles:\n");
                                System.out.println("1. Nvidia Geforce");
                                System.out.println("2. AMD Radeon");
                                int opcionGPU = 0;
                                do {
                                    System.out.print("Ingrese su opcion (1 para Nvidia, 2 para AMD): \n");
                                    opcionGPU = scanner.nextInt();
                                    scanner.nextLine();
                                } while (opcionGPU < 1 || opcionGPU > 2);
                                switch (opcionGPU) {
                                    case 1: // Nvidia
                                        System.out.println("Has seleccionado Nvidia Geforce");
                                        System.out.println("Estas son las generaciones de Nvidia Geforce disponibles:");
                                        int opcionGenNvidia = 0;
                                        do {
                                            for (int i = 0; i < NvidiaGenGPU.length; i++) {
                                                System.out.println((i + 1) + ". " + NvidiaGenGPU[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionGenNvidia = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionGenNvidia < 1 || opcionGenNvidia > NvidiaGenGPU.length);
                                        String genSeleccionada = NvidiaGenGPU[opcionGenNvidia - 1];
                                        whatts += whattsNvidia[opcionGenNvidia - 1];
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
                                                System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                                break;
                                        }
                                        if (opcionesNvidia != null) {
                                            opcionNvidia = 0;
                                            do {
                                                for (int i = 0; i < opcionesNvidia.length; i++) {
                                                    System.out.println((i + 1) + ". " + opcionesNvidia[i] + " $" + preciosNvidia[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionNvidia = scanner.nextInt();
                                                scanner.nextLine();
                                            } while (opcionNvidia < 1 || opcionNvidia > opcionesNvidia.length);
                                            String gpuNvidiaSeleccionada = opcionesNvidia[opcionNvidia - 1];
                                            whatts += wattsNvidia[opcionNvidia - 1];
                                            subtotal += preciosNvidia[opcionNvidia - 1];
                                            System.out.println("Ha seleccionado " + gpuNvidiaSeleccionada);
                                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                        }
                                        break;
                                    case 2: // AMD
                                        System.out.println("Has seleccionado AMD Radeon");
                                        System.out.println("Estas son las generaciones de AMD Radeon disponibles:");
                                        int opcionGenAMD = 0;
                                        do {
                                            for (int i = 0; i < AMDGenGPU.length; i++) {
                                                System.out.println((i + 1) + ". " + AMDGenGPU[i]);
                                            }
                                            System.out.print("Ingrese su opcion: ");
                                            opcionGenAMD = scanner.nextInt();
                                            scanner.nextLine();
                                        } while (opcionGenAMD < 1 || opcionGenAMD > AMDGenGPU.length);
                                        String genAMDSeleccionada = AMDGenGPU[opcionGenAMD - 1];
                                        whatts += whattsAMD[opcionGenAMD - 1];
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
                                                System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                                break;
                                        }
                                        if (opcionesAMD != null) {
                                            opcionAMD = 0;
                                            do {
                                                for (int i = 0; i < opcionesAMD.length; i++) {
                                                    System.out.println((i + 1) + ". " + opcionesAMD[i] + " $" + preciosAMD[i]);
                                                }
                                                System.out.print("Ingrese su opcion: ");
                                                opcionAMD = scanner.nextInt();
                                                scanner.nextLine();
                                            } while (opcionAMD < 1 || opcionAMD > opcionesAMD.length);
                                            String gpuAMDSeleccionada = opcionesAMD[opcionAMD - 1];
                                            whatts += wattsAMD[opcionAMD - 1];
                                            subtotal += preciosAMD[opcionAMD - 1];
                                            System.out.println("Ha seleccionado " + gpuAMDSeleccionada);
                                            System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                            System.out.printf("El consumo actual es de: %.0f Watts%n", whatts);
                                        }
                                        break;
                                    default:
                                        System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                        break;
                                }
                                //----------------------------------------------------------------------------------------fuentes de poder
                                int opcionFuente = 0;
                                if (whatts <= 600) {// si el consumo es menor o igual a 600 watts
                                    System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                                    do {
                                        for (int i = 0; i < PSUs600.length; i++) {
                                            System.out.println((i + 1) + ". " + PSUs600[i] + " $" + preciosPSUs600[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionFuente = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionFuente < 1 || opcionFuente > PSUs600.length);
                                    String fuenteSeleccionada = PSUs600[opcionFuente - 1];
                                    double precioFuente = preciosPSUs600[opcionFuente - 1];
                                    System.out.println("Ha seleccionado " + fuenteSeleccionada);
                                    subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                } else if (whatts <= 800) {// si el consumo es menor o igual a 800 watts
                                    System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                                    do {
                                        for (int i = 0; i < PSUs800.length; i++) {
                                            System.out.println((i + 1) + ". " + PSUs800[i] + " $" + preciosPSUs800[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionFuente = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionFuente < 1 || opcionFuente > PSUs800.length);
                                    String fuenteSeleccionada = PSUs800[opcionFuente - 1];
                                    double precioFuente = preciosPSUs800[opcionFuente - 1];
                                    System.out.println("Ha seleccionado " + fuenteSeleccionada);
                                    subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                } else if (whatts <= 1200) {// si el consumo es menor o igual a 1200 watts
                                    System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:");
                                    do {
                                        for (int i = 0; i < PSUs1200.length; i++) {
                                            System.out.println((i + 1) + ". " + PSUs1200[i] + " $" + preciosPSUs1200[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionFuente = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionFuente < 1 || opcionFuente > PSUs1200.length);
                                    String fuenteSeleccionada = PSUs1200[opcionFuente - 1];
                                    double precioFuente = preciosPSUs1200[opcionFuente - 1];
                                    System.out.println("Ha seleccionado " + fuenteSeleccionada);
                                    subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                } else {// si el consumo es mayor a 1200 watts
                                    System.out.println("tu ensamble es compatible con las siguientes fuentes de poder:\n");
                                    do {
                                        for (int i = 0; i < PSUs1600.length; i++) {
                                            System.out.println((i + 1) + ". " + PSUs1600[i] + " $" + preciosPSUs1600[i]);
                                        }
                                        System.out.print("Ingrese su opcion: ");
                                        opcionFuente = scanner.nextInt();
                                        scanner.nextLine();
                                    } while (opcionFuente < 1 || opcionFuente > PSUs1600.length);
                                    String fuenteSeleccionada = PSUs1600[opcionFuente - 1];
                                    double precioFuente = preciosPSUs1600[opcionFuente - 1];
                                    System.out.println("Ha seleccionado " + fuenteSeleccionada);
                                    subtotal += precioFuente; // Sumar el precio de la fuente al subtotal
                                    System.out.println("El subtotal actual es de: $" + String.format("%.2f", subtotal));
                                }
                                System.out.println("Muy bonito tu ensamble, pero ahora es momento de pasar por caja\n");
                                System.out.println("Imprimiendo ticket de compra...\n");
                                System.out.println("--------------------------------------------------");
                                System.out.println("                PC COMPONENTES");
                                System.out.println("--------------------------------------------------\n");
                                String fuenteSeleccionada = "";
                                int i = 0;
                                System.out.println("Procesador: " + opcionSeleccionada);
                                    System.out.println("Motherboard: " + opcionSeleccionada);
                                    System.out.println("Refrigeracion: " + refrigeracionSeleccionada);
                                    System.out.println("RAM: " + opcionSeleccionada);
                                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                                    System.out.println("Gabinete: " + gabineteSeleccionado);
                                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                                    System.out.println("Fuente de poder: " + fuenteSeleccionada);
                                System.out.println("--------------------------------------------------");
                                System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                                double iva = subtotal * 0.16; // IVA
                                System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                                int metodoPago = 0;
                                do {
                                    System.out.println("Seleccione el metodo de pago:");
                                    System.out.println("1. Efectivo");
                                    System.out.println("2. Tarjeta");
                                    System.out.print("Ingrese su opcion: ");
                                    metodoPago = scanner.nextInt();
                                    scanner.nextLine(); // Consumir el salto de linea pendiente
                                    if (metodoPago < 1 || metodoPago > 2) {
                                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                    }
                                } while (metodoPago < 1 || metodoPago > 2);

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
                                    System.out.println("--------------------------------------------------\n");
                                    System.out.println("Procesador: " + opcionSeleccionada);
                                    System.out.println("Motherboard: " + opcionSeleccionada);
                                    System.out.println("Refrigeracion: " + refrigeracionSeleccionada);
                                    System.out.println("RAM: " + opcionSeleccionada);
                                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                                    System.out.println("Gabinete: " + gabineteSeleccionado);
                                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                                    System.out.println("Fuente de poder: " + fuenteSeleccionada);
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                    System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                                    System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                                    System.out.println("Presente este recibo para recoger su compra en una tienda de conveniencia (Oxxo, 7eleven, etc.).");
                                    System.out.println("Nota: el numero de recivo expira en 7 dias.");
                                    System.out.println("Gracias por su compra.");
                                } else if (metodoPago == 2) {
                                    System.out.print("Ingrese el nombre del titular de la tarjeta: ");
                                    String titularTarjeta = scanner.nextLine();
                                    try {
                                        Thread.sleep(500); // 500 milisegundos = medio segundo
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.print("Ingrese los 16 digitos de la tarjeta: ");
                                    String numeroTarjeta = scanner.nextLine();
                                    try {
                                        Thread.sleep(500); // 500 milisegundos = medio segundo
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    if (numeroTarjeta.length() != 16) {

                                        System.out.println("El número de tarjeta debe tener exactamente 16 digitos.\n");
                                        break;
                                    }
                                    System.out.print("Ingrese la fecha de vencimiento (MM/AA): ");
                                    String fechaVencimiento = scanner.nextLine();
                                    try {
                                        Thread.sleep(500); // 500 milisegundos = medio segundo
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    // Verificar si la longitud de la cadena es correcta (5 caracteres incluyendo la
                                    // barra)
                                    if (fechaVencimiento.length() != 5) {

                                        System.out
                                                .println("Ingrese una fecha de vencimiento válida en formato MM/AA\n");
                                        break;
                                    }
                                    // Verificar si la cadena contiene solo digitos y la barra en la posicion
                                    // correcta
                                    for (i = 0; i < fechaVencimiento.length(); i++) {
                                        if (i == 2) {
                                            if (fechaVencimiento.charAt(i) != '/') {

                                                System.out.println(
                                                        "Ingrese una fecha de vencimiento válida en formato MM/AA\n");
                                                break;
                                            }
                                        } else {
                                            if (!Character.isDigit(fechaVencimiento.charAt(i))) {

                                                System.out.println(
                                                        "Ingrese una fecha de vencimiento válida en formato MM/AA\n");
                                                break;
                                            }
                                        }
                                    }
                                    // Verificar si el mes está en el rango válido (01 - 12)
                                    int mes = Integer.parseInt(fechaVencimiento.substring(0, 2));
                                    if (mes < 1 || mes > 12) {
                                        System.out.println("El mes debe estar entre 01 y 12\n");
                                        break;
                                    }
                                    // Verificar si el año está en el rango válido (25 - 99)
                                    int año = Integer.parseInt(fechaVencimiento.substring(3));
                                    if (año < 25 || año > 99) {
                                        System.out.println("El año debe estar entre 25 y 99\n");
                                        break;
                                    }
                                    // -----------------------------------------------------------------validar
                                    // codigo de seguridad
                                    System.out.print("Ingrese el codigo de seguridad (3 digitos): \n");
                                    String codigoSeguridad = scanner.nextLine();
                                    if (codigoSeguridad.length() != 3) {
                                        System.out
                                                .println("El codigo de seguridad debe tener exactamente 3 digitos.\n");
                                        break;
                                    }
                                    System.out.println("Procesando el pago con tarjeta a nombre de " + titularTarjeta + "...\n");
                                    System.out.println("Pago realizado con exito.");
                                    System.out.println("Detalles del pago:");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("                PC COMPONENTES");
                                    System.out.println("--------------------------------------------------\n");
                                    System.out.println("Procesador: " + opcionSeleccionada);
                                    System.out.println("Motherboard: " + opcionSeleccionada);
                                    System.out.println("Refrigeracion: " + refrigeracionSeleccionada);
                                    System.out.println("RAM: " + opcionSeleccionada);
                                    System.out.println("Almacenamiento: " + opcionSeleccionada);
                                    System.out.println("Gabinete: " + gabineteSeleccionado);
                                    System.out.println("Tarjeta Gráfica: " + opcionSeleccionada);
                                    System.out.println("Fuente de poder: " + fuenteSeleccionada);
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                    System.out.println("IVA: $" + String.format("%.2f", subtotal * 0.16));
                                    System.out.println("Total: $" + String.format("%.2f", subtotal + iva));
                                    System.out.println("Gracias por su compra.\n");
                                }
                                break;
                            
                            default:
                                System.out.println("Opcion inválida. Intentelo de nuevo.\n");
                                break;
                            }
                            
                        
                        }
                        break;
                        case 3:
                            repetir = false; // Salir del bucle despues de procesar la opcion 3
                            System.out.print("Saliendo");
                            for (int i = 0; i < 3; i++) {// bucle para repetir 3 veces el . que colocamos para que se mire
                                                         // bien el salir y este no sea instantaneo
                                try {
                                    Thread.sleep(500); // 500 milisegundos = medio segundo
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.print(".");
                    } 
                    salir = true;
                        break;
                        default:
                            System.out.println("Opcion no válida. Intente de nuevo.");
                        break;
                }
                
            }
            
        }
        
    }
}