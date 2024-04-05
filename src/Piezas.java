import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        //----------------------------------------------------------------------------------------------------------------------------CPUs
        String[] procesadores = {"Intel Core i3-12100", "Intel Core i5-12400", "Intel Core i7-12700","Intel Core i9-12900K", "Intel Core i3-13100", "Intel Core i5-13600", "Intel Core i7-13700","Intel Core i9-13900Kf", "Intel Core i3-14100", "Intel Core i5-14500", "Intel Core i7-14700k","Intel Core i9-14900","AMD Ryzen 3 3200g", "AMD Ryzen 5 3600", "AMD Ryzen 7 3700X","AMD Ryzen 9 3950X","AMD Ryzen 3 5300g", "AMD Ryzen 5 5600X", "AMD Ryzen 7 5700X","AMD Ryzen 9 5900X","AMD Ryzen 3 8300g", "AMD Ryzen 5 7600X", "AMD Ryzen - 7 7700X","AMD Ryzen - 9 7900X"};
        double[] preciosProcesadores = {2299, 2399, 5169, 6918, 2209, 3854, 4904, 11530, 2259, 5013, 4904, 12059, 1359, 2447, 4906, 13402, 1500, 2880, 3435, 5741, 2259, 5013, 4904, 12059};
        //-----------------------------------------------------------------------------------------------------------------------------Motherboards
        String[] motherboards = {"Madre MSI Micro-ATX PRO H610M-G DDR4, S-1700, Intel H610, 64GB DDR4", "Madre MSI Micro-ATX PRO B760M-A WIFI, S-1700, Intel B760, 192GB DDR5", "ASUS GAMING ATX ROG Strix Z790-F WIFI, S-1700, Intel Z790, 128GB DDR5", "Biostar micro ATX A520MH, S-AM4, AMD A520, HDMI, 64GB DDR4", "MSI B550M ATX PRO-VDH, S-AM4, AMD B550, HDMI, 128GB DDR4", "Gigabyte ATX B550, S-AM4, AMD B550, HDMI, 128GB DDR4", "Gigabyte Micro ATX B450M H, S-AM4, AMD B450, HDMI, 32GB DDR4", "ASUS ATX Prime B550-Plus, S-AM4, AMD B550, HDMI, 128GB DDR4", "Gigabyte AORUS X570S, S-AM4, AMD X507, USB 3.2, 128GB DDR4", "MSI Micro-ATX PRO A620M-E, S-AM5, AMD A620, HDMI, 96GB DDR5", "Gigabyte Micro-ATX A620M, S-AM5, AMD A620, HDMI, 192GB DDR5", "AORUS ATX B650 AORUS, S-AM5, AMD B650, HDMI, 128GB DDR5"};
        double[] preciosMotherboards = {1269, 2778, 6255, 829, 1659, 2459, 1399, 2719, 6959, 1079, 2339, 6699};
        //-----------------------------------------------------------------------------------------------------------------------------MemoriasRAM
        String[] memoriasRAM = {"Corsair Dominator RGB 8GB DDR4, 3200MHz, 1x8GB", "Corsair Dominator RGB 16GB DDR4, 3200MHz, 2x8GB", "Kingston FURY Beast 32GB DDR4, 3200MHz, 1X32GB", "Kingston FURY Beast 64GB DDR4, 3200MHz, 2X32GB" ,"Kingston FURY Beast 128GB DDR4, 3200MHz, 4X32GB", "XPG Lancer Blade RGB 16GB DDR5, 6000MHz, 1X16GB", "XPG Lancer Blade RGB 32GB DDR5, 3200MHz, 2X16GB", "XPG Lancer Blade RGB 64GB DDR5, 3200MHz, 4X16GB", "Kingston FURY PRO RGB 128GB DDR5, 5600MHz, 4X32GB"};
        double[] preciosmemoriasRAM = {500, 800, 1200, 2400, 4800, 1200, 2400, 4800, 9600};
        //-----------------------------------------------------------------------------------------------------------------------------Almacenamientos
        String[] almacenamientos = {"HDD Seagate Barracuda 2TB", "HDD Western Digital 500GB", "HDD Western Digital 2TB", "SSD Western Digital Blue SA510, 250GB", "SSD Western Digital WD Green, 1TB", "SSD Team Group T-Force Vulcan, 1TB", "NVMe Kingston NV2, 1TB", "NVMe PNY CS1030, 500GB", "NVMe Western Digital SN580"};
        double[] preciosalmacenamientos = {939, 759, 2069, 749, 899, 1059, 969, 659, 2089};
        //-----------------------------------------------------------------------------------------------------------------------------Fuentes de poder PSUs
        String[] psu = {"EVGA SUPERNOVA 80 PLUS Gold, 20+4 pin ATX, 135mm, 650W", "NZXT C650 Gold 80 Plus Gold, 24+4 pin ATX, 135mm, 650W", "MSI MAG A650GL 80 PLUS Bronze, 20+4 pin ATX, 120mm, 650W", "XPG CORE REACTOR 80 PLUS Gold, 24+4 pin ATX, 120mm, 650W", "EVGA SuperNOVA 80 PLUS Platinum, 24-pin ATX, 135mm, 750W", "ASUS ROG Strix 80 PLUS Gold, 20+4 pin ATX, 150mm, 750W", "EVGA SuperNOVA 80 PLUS bronze 24-pin ATX, 120mm, 850W", "XPG Cybercore 80 PLUS Platinum, 24-pin ATX, 120mm, 1000W", "Seasonic Vertex 80 PLUS Platinum, 20+4 pin ATX, 120mm, 1200W"};
        double[] preciospsu = {1979, 1669, 1559, 1549, 2899, 2909, 2119, 2979, 5409};
        //-----------------------------------------------------------------------------------------------------------------------------GPUs
        String[] tarjetasGraficas = {"Asus dual RTX 2060 12GB GDDR6", "MSI RTX 2070 8GB GDDR6", "GIGABYTE RTX 2080 8GB GDDR6", "Asus RTX 3060 12GB GDDR6", "MSI RTX 3070 8GB GDRR6", "Gigabyte RTX 3080 10GB GDDR6X", "PNY RTX 3090 24 GB XLR8", "ZOTAC RTX 4060 8 GB GDDR6", "ASUS RTX 4070 12GB GDDR6X", "MSI RTX 4080 16GB GDDR6X", "Asus RTX 4090 24GB GDDR6X", "ASUS RX 5600 XT GDDR6", "Gigabyte RX 5700 XT 8GB GDDR6", "MSI RX 6600 8GB GDDR6", "ASUS RX 6700 XT 12GB GDDR6", "Sapphire RX 6800 16GB GDDR6", "ASUS RX 7600 8GB GDDR6", "ASUS RX 7700 XT 12GB GDDR6", "Sapphire RX 7800 XT 16GB GDDR6"};
        double[] preciostarjetasGraficas = {4065, 4829, 5244, 5726, 12664, 16344, 22069, 5709, 10993, 26660, 35748, 4000, 5280, 6850, 10069, 11809, 5609, 8629, 9889};
        //-----------------------------------------------------------------------------------------------------------------------------Gabinetes
        String[] gabinetes = {"Game Factor CSG550 Micro ATX", "NZXT H510 ATX", "Corsair 3000D ATX", "Corsair 4000D ATX"};
        double[] preciosgabinetes = {2500, 3000, 3000, 3000};
        //-----------------------------------------------------------------------------------------------------------------------------Monitores
        String[] monitores = {"Odyssey MTX27G 27 1080p 144Hz", "Odyssey G5 27 1440p 144Hz", "Odyssey G4 25 1080p 240Hz", "MSI G274QPX 27 1440p 240Hz"};
        double[] preciosmonitores = {2639, 4589, 5779, 7099};
        //-----------------------------------------------------------------------------------------------------------------------------Teclados
        String[] teclados = {"Redragon Vara RGB Switch Red", "Corsair RGB Tipo C Switch Blue", "Logitech G201 Membrana", "T-Dagger RGB Tipo C Switch Brown"};
        double[] preciosteclados = {800, 662, 500, 620};
        //-----------------------------------------------------------------------------------------------------------------------------Ratones
        String[] ratones = {"Logitech MX 8K DPI USB C Inalambrico", "Logitech G203 RGB 8K DPI Alambrico", "Razer Basilisk 10K DPI USB C Inalambrico", "Razer Basilisk V3 25K DPI Alambrico", "Corsair Katar Pro 8K DPI Inalambrico", "Corsair Nightsword 8K DPI Alambrico"};
        double[] preciosratones = {1999, 485, 3013, 1299, 1045, 2176};
        //-----------------------------------------------------------------------------------------------------------------------------Cascos
        String[] cascos = {"Yeyian Alambrico RGB", "Redragon Zeus X Wireless Rgb", "Hyperx Cloud Stinger Wireless"};
        double[] precioscascos = {546, 1350, 1194};
        //-----------------------------------------------------------------------------------------------------------------------------Alfombrillas
        String[] alfombrillas = {"Razer Firefly V2 XL", "SteelSeries QcK XXL", "Logitech G640 XS"};
        double[] preciosalfombrillas = {800, 1200, 800};
        //-----------------------------------------------------------------------------------------------------------------------------MaterialConductivo
        String[] materialConductivo = {"Thermal Grizzly Pasta Termica 1g", "Thermal Grizzly Almohadilla Termica 32mm", "Thermal Grizzly Metal liquido 1G"};
        double[] preciosmaterialConductivo = {300, 600, 350};
        //-----------------------------------------------------------------------------------------------------------------------------Refrigeraciones
        String[] refrigeraciones = {"XZEAL XZ400 Refrigeracion Liquida 2x120mm", "Game Factor LQG700 Refrigeracion Liquida 3x120mm", "Ventilador DeepCool RGB 120mm", "Noctua LS-PWM 120mm"};
        double[] preciosrefrigeraciones = {950, 1600, 300, 700};
        //-----------------------------------------------------------------------------------------------------------------------------Microfonos
        String[] microfonos = {"Rode PodMic cardioide dinamico", "Shure MV7X", "HyperX SoloCast Condensador USB", "Blue Yeti Microfono USB Condensador"};
        double[] preciosmicrofonos = {2068, 3976, 799, 2315};

        String[] carrito = new String[100]; // Máximo 100 productos en el carrito LOL
        double[] preciosCarrito = new double[100];
        int indiceCarrito = 0;

        while (!salir) {
            System.out.println("Bienvenido al ALRM-TECH Piezas");
            System.out.println();
            System.out.println("¿Qué desea comprar?");
            System.out.println();
            System.out.println("1. Procesadores CPU");
            System.out.println("2. Motherboards");
            System.out.println("3. Memorias RAM");
            System.out.println("4. Almacenamientos");
            System.out.println("5. Fuentes de poder PSU");
            System.out.println("6. Tarjetas graficas GPU");
            System.out.println("7. Gabinetes");
            System.out.println("8. Monitores");
            System.out.println("9. Teclados");
            System.out.println("10. Ratones");
            System.out.println("11. Headsets");
            System.out.println("12. Alfombrillas");
            System.out.println("13. Materiales de conductividad Termica");
            System.out.println("14. Refrigeraciones");
            System.out.println("15. Microfonos");
            System.out.println();
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
                    for (int i = 0; i < motherboards.length; i++) {
                        System.out.println(motherboards[i] + " - $" + preciosMotherboards[i]);
                    }
                    System.out.print("Ingrese el nombre de la placa madre que desea comprar: ");
                    String compraMotherboard = scanner.nextLine();
                    boolean encontradoMotherboard = false;
                    for (int i = 0; i < motherboards.length; i++) {
                        if (motherboards[i].equalsIgnoreCase(compraMotherboard)) {
                            encontradoMotherboard = true;
                            carrito[indiceCarrito] = motherboards[i];
                            preciosCarrito[indiceCarrito] = preciosMotherboards[i];
                            System.out.println();
                            System.out.println("Ha agregado una " + motherboards[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoMotherboard) {
                        System.out.println();
                        System.out.println("La placa madre ingresada no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 3:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < memoriasRAM.length; i++) {
                        System.out.println(memoriasRAM[i] + " - $" + preciosmemoriasRAM[i]);
                    }
                    System.out.print("Ingrese el nombre de la memoria RAM que desea comprar: ");
                    String compraMemoriaRAM = scanner.nextLine();
                    boolean encontradoMemoriaRAM = false;
                    for (int i = 0; i < memoriasRAM.length; i++) {
                        if (memoriasRAM[i].equalsIgnoreCase(compraMemoriaRAM)) {
                            encontradoMemoriaRAM = true;
                            carrito[indiceCarrito] = memoriasRAM[i];
                            preciosCarrito[indiceCarrito] = preciosmemoriasRAM[i];
                            System.out.println();
                            System.out.println("Ha agregado una " + memoriasRAM[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoMemoriaRAM) {
                        System.out.println();
                        System.out.println("La memoria RAM ingresada no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 4:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < almacenamientos.length; i++) {
                        System.out.println(almacenamientos[i] + " - $" + preciosalmacenamientos[i]);
                    }
                    System.out.print("Ingrese el nombre del almacenamiento que desea comprar: ");
                    String compraAlmacenamiento = scanner.nextLine();
                    boolean encontradoAlmacenamiento = false;
                    for (int i = 0; i < almacenamientos.length; i++) {
                        if (almacenamientos[i].equalsIgnoreCase(compraAlmacenamiento)) {
                            encontradoAlmacenamiento = true;
                            carrito[indiceCarrito] = almacenamientos[i];
                            preciosCarrito[indiceCarrito] = preciosalmacenamientos[i];
                            System.out.println();
                            System.out.println("Ha agregado un " + almacenamientos[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoAlmacenamiento) {
                        System.out.println();
                        System.out.println("El almacenamiento ingresado no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 5:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < psu.length; i++) {
                        System.out.println(psu[i] + " - $" + preciospsu[i]);
                    }
                    System.out.print("Ingrese el nombre de la fuente de poder que desea comprar: ");
                    String compraPSU = scanner.nextLine();
                    boolean encontradoPSU = false;
                    for (int i = 0; i < psu.length; i++) {
                        if (psu[i].equalsIgnoreCase(compraPSU)) {
                            encontradoPSU = true;
                            carrito[indiceCarrito] = psu[i];
                            preciosCarrito[indiceCarrito] = preciospsu[i];
                            System.out.println();
                            System.out.println("Ha agregado una " + psu[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoPSU) {
                        System.out.println();
                        System.out.println("La fuente de poder ingresada no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 6:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < tarjetasGraficas.length; i++) {
                        System.out.println(tarjetasGraficas[i] + " - $" + preciostarjetasGraficas[i]);
                    }
                    System.out.print("Ingrese el nombre de la tarjeta gráfica que desea comprar: ");
                    String compraTarjetaGrafica = scanner.nextLine();
                    boolean encontradoTarjetaGrafica = false;
                    for (int i = 0; i < tarjetasGraficas.length; i++) {
                        if (tarjetasGraficas[i].equalsIgnoreCase(compraTarjetaGrafica)) {
                            encontradoTarjetaGrafica = true;
                            carrito[indiceCarrito] = tarjetasGraficas[i];
                            preciosCarrito[indiceCarrito] = preciostarjetasGraficas[i];
                            System.out.println();
                            System.out.println("Ha agregado una " + tarjetasGraficas[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoTarjetaGrafica) {
                        System.out.println();
                        System.out.println("La tarjeta gráfica ingresada no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 7:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < gabinetes.length; i++) {
                        System.out.println(gabinetes[i] + " - $" + preciosgabinetes[i]);
                    }
                    System.out.print("Ingrese el nombre del gabinete que desea comprar: ");
                    String compraGabinete = scanner.nextLine();
                    boolean encontradoGabinete = false;
                    for (int i = 0; i < gabinetes.length; i++) {
                        if (gabinetes[i].equalsIgnoreCase(compraGabinete)) {
                            encontradoGabinete = true;
                            carrito[indiceCarrito] = gabinetes[i];
                            preciosCarrito[indiceCarrito] = preciosgabinetes[i];
                            System.out.println();
                            System.out.println("Ha agregado un " + gabinetes[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoGabinete) {
                        System.out.println();
                        System.out.println("El gabinete ingresado no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 8:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < monitores.length; i++) {
                        System.out.println(monitores[i] + " - $" + preciosmonitores[i]);
                    }
                    System.out.print("Ingrese el nombre del monitor que desea comprar: ");
                    String compraMonitor = scanner.nextLine();
                    boolean encontradoMonitor = false;
                    for (int i = 0; i < monitores.length; i++) {
                        if (monitores[i].equalsIgnoreCase(compraMonitor)) {
                            encontradoMonitor = true;
                            carrito[indiceCarrito] = monitores[i];
                            preciosCarrito[indiceCarrito] = preciosmonitores[i];
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
                    case 9:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < teclados.length; i++) {
                        System.out.println(teclados[i] + " - $" + preciosteclados[i]);
                    }
                    System.out.print("Ingrese el nombre del teclado que desea comprar: ");
                    String compraTeclado = scanner.nextLine();
                    boolean encontradoTeclado = false;
                    for (int i = 0; i < teclados.length; i++) {
                        if (teclados[i].equalsIgnoreCase(compraTeclado)) {
                            encontradoTeclado = true;
                            carrito[indiceCarrito] = teclados[i];
                            preciosCarrito[indiceCarrito] = preciosteclados[i];
                            System.out.println();
                            System.out.println("Ha agregado un " + teclados[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoTeclado) {
                        System.out.println();
                        System.out.println("El teclado ingresado no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 10:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < ratones.length; i++) {
                        System.out.println(ratones[i] + " - $" + preciosratones[i]);
                    }
                    System.out.print("Ingrese el nombre del ratón que desea comprar: ");
                    String compraRaton = scanner.nextLine();
                    boolean encontradoRaton = false;
                    for (int i = 0; i < ratones.length; i++) {
                        if (ratones[i].equalsIgnoreCase(compraRaton)) {
                            encontradoRaton = true;
                            carrito[indiceCarrito] = ratones[i];
                            preciosCarrito[indiceCarrito] = preciosratones[i];
                            System.out.println();
                            System.out.println("Ha agregado un " + ratones[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoRaton) {
                        System.out.println();
                        System.out.println("El ratón ingresado no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 11:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < cascos.length; i++) {
                        System.out.println(cascos[i] + " - $" + precioscascos[i]);
                    }
                    System.out.print("Ingrese el nombre de los auriculares que desea comprar: ");
                    String compraCascos = scanner.nextLine();
                    boolean encontradoCascos = false;
                    for (int i = 0; i < cascos.length; i++) {
                        if (cascos[i].equalsIgnoreCase(compraCascos)) {
                            encontradoCascos = true;
                            carrito[indiceCarrito] = cascos[i];
                            preciosCarrito[indiceCarrito] = precioscascos[i];
                            System.out.println();
                            System.out.println("Ha agregado unos " + cascos[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoCascos) {
                        System.out.println();
                        System.out.println("Los auriculares ingresados no están disponibles.");
                        System.out.println();
                    }
                    break;
                    case 12:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < alfombrillas.length; i++) {
                        System.out.println(alfombrillas[i] + " - $" + preciosalfombrillas[i]);
                    }
                    System.out.print("Ingrese el nombre de la alfombrilla que desea comprar: ");
                    String compraAlfombrilla = scanner.nextLine();
                    boolean encontradoAlfombrilla = false;
                    for (int i = 0; i < alfombrillas.length; i++) {
                        if (alfombrillas[i].equalsIgnoreCase(compraAlfombrilla)) {
                            encontradoAlfombrilla = true;
                            carrito[indiceCarrito] = alfombrillas[i];
                            preciosCarrito[indiceCarrito] = preciosalfombrillas[i];
                            System.out.println();
                            System.out.println("Ha agregado una " + alfombrillas[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoAlfombrilla) {
                        System.out.println();
                        System.out.println("La alfombrilla ingresada no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 13:
                System.out.println();
                System.out.println("Productos disponibles:");
                System.out.println();
                for (int i = 0; i < materialConductivo.length; i++) {
                    System.out.println(materialConductivo[i] + " - $" + preciosmaterialConductivo[i]);
                }
                System.out.print("Ingrese el nombre del material conductivo que desea comprar: ");
                String compraMaterialConductivo = scanner.nextLine();
                boolean encontradoMaterialConductivo = false;
                for (int i = 0; i < materialConductivo.length; i++) {
                    if (materialConductivo[i].equalsIgnoreCase(compraMaterialConductivo)) {
                        encontradoMaterialConductivo = true;
                        carrito[indiceCarrito] = materialConductivo[i];
                        preciosCarrito[indiceCarrito] = preciosmaterialConductivo[i];
                        System.out.println();
                        System.out.println("Ha agregado un " + materialConductivo[i] + " al carrito.");
                        System.out.println();
                        indiceCarrito++;
                        break;
                    }
                }
                if (!encontradoMaterialConductivo) {
                    System.out.println();
                    System.out.println("El material conductivo ingresado no está disponible.");
                    System.out.println();
                }
                break;
                    case 14:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < refrigeraciones.length; i++) {
                        System.out.println(refrigeraciones[i] + " - $" + preciosrefrigeraciones[i]);
                    }
                    System.out.print("Ingrese el nombre de la refrigeración que desea comprar: ");
                    String compraRefrigeracion = scanner.nextLine();
                    boolean encontradoRefrigeracion = false;
                    for (int i = 0; i < refrigeraciones.length; i++) {
                        if (refrigeraciones[i].equalsIgnoreCase(compraRefrigeracion)) {
                            encontradoRefrigeracion = true;
                            carrito[indiceCarrito] = refrigeraciones[i];
                            preciosCarrito[indiceCarrito] = preciosrefrigeraciones[i];
                            System.out.println();
                            System.out.println("Ha agregado una " + refrigeraciones[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoRefrigeracion) {
                        System.out.println();
                        System.out.println("La refrigeración ingresada no está disponible.");
                        System.out.println();
                    }
                    break;
                    case 15:
                    System.out.println();
                    System.out.println("Productos disponibles:");
                    System.out.println();
                    for (int i = 0; i < microfonos.length; i++) {
                        System.out.println(microfonos[i] + " - $" + preciosmicrofonos[i]);
                    }
                    System.out.print("Ingrese el nombre del micrófono que desea comprar: ");
                    String compraMicrofono = scanner.nextLine();
                    boolean encontradoMicrofono = false;
                    for (int i = 0; i < microfonos.length; i++) {
                        if (microfonos[i].equalsIgnoreCase(compraMicrofono)) {
                            encontradoMicrofono = true;
                            carrito[indiceCarrito] = microfonos[i];
                            preciosCarrito[indiceCarrito] = preciosmicrofonos[i];
                            System.out.println();
                            System.out.println("Ha agregado un " + microfonos[i] + " al carrito.");
                            System.out.println();
                            indiceCarrito++;
                            break;
                        }
                    }
                    if (!encontradoMicrofono) {
                        System.out.println();
                        System.out.println("El micrófono ingresado no está disponible.");
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
    }
}
