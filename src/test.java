import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion, IntelGCPU, intel12thCPU, intel13thCPU, intel14thCPU, AMDGenCPU, AMD3000CPU, AMD5000CPU, MD7000CPU, marcaGPU, NvidiaGenGPU, NvidiaRTX2000GPU, NvidiaRTX3000GPU, NvidiaRTX4000GPU, AMDGenGPU, AMD5000GPU, AMD6000GPU, AMD7000GPU;
        while (!salir) {
            System.out.println("Bienvenido al ALRM-TECH Piezas");
            System.out.println("Seleccione la marca del procesador");
            System.out.println("1. INTEL");
            System.out.println("2. AMD");
            System.out.println();
            System.out.println("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ahora seleccione la Generacion de su procesador");
                    System.out.println("1. Intel 12th CPU \n2. Intel 13th CPU \n3. Intel 14th CPU");
                    IntelGCPU = scanner.nextInt();
                    switch (IntelGCPU) {
                        case (1):
                        System.out.println("Ahora seleccione una opcion");
                        System.out.println("1. Intel Core i3 12100\n2. Intel Core i5 12600\n3. Intel Core i7 12700\n4. Intel Core i9 12900");
                        System.out.println("Ingrese su opción: ");
                        intel12thCPU = scanner.nextInt();
                        switch (intel12thCPU) {
                            case (1):
                                System.out.println("Usted selecciono: Intel Core i3 12100");
                                break;
                            case (2):
                                System.out.println("Usted selecciono: Intel Core i5 12600");
                                break;
                            case (3):
                                System.out.println("Usted selecciono: Intel Core i7 12700");
                                break;
                            case (4):
                                System.out.println("Usted selecciono: Intel Core i9 12900");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                            break;
                    
                            case (2):
                        System.out.println("Ahora seleccione una opcion");
                        System.out.println("1. Intel Core i3 13100\n2. Intel Core i5 13600\n3. Intel Core i7 13700\n4.Intel Core i9 13900");
                        System.out.println("Ingrese su opción: ");
                        intel13thCPU = scanner.nextInt();
                        switch (intel13thCPU) {
                            case (1):
                                System.out.println("Usted selecciono: Intel Core i3 13100");
                                break;
                            case (2):
                                System.out.println("Usted selecciono: Intel Core i5 13600");
                                break;
                            case (3):
                                System.out.println("Usted selecciono: Intel Core i7 13700");
                                break;
                            case (4):
                                System.out.println("Usted selecciono: Intel Core i9 13900");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        case (3):
                        System.out.println("Ahora seleccione una opcion");
                        System.out.println("1. Intel Core i3 14100\n2. Intel Core i5 14600\n3. Intel Core i7 14700\n4.Intel Core i9 14900");
                        System.out.println("Ingrese su opción: ");
                        intel14thCPU = scanner.nextInt();
                        switch (intel14thCPU) {
                            case (1):
                                System.out.println("Usted selecciono: Intel Core i3 14100\n");
                                break;
                            case (2):
                                System.out.println("Usted selecciono: Intel Core i5 14600\n");
                                break;
                            case (3):
                                System.out.println("Usted selecciono: Intel Core i7 14700\n");
                                break;
                            case (4):
                                System.out.println("Usted selecciono: Intel Core i9 14900\n");
                                break;
                            default:
                                System.out.println("Opcion no valida\n");
                                break;
                        }
                        default:
                        System.out.println("Opcion no valida, intente de nuevo.");
                            break;
                    }
                    break;


                case 2:
                    System.out.println("Ahora seleccione la Generacion de su procesador");
                    System.out.println("1. AMD Ryzen 3000\n2.AMD Ryzen 5000\n3. AMD Ryzen 8000");
                    AMDGenCPU= scanner.nextInt();
                    switch (AMDGenCPU) {
                        case (1):
                        System.out.println("Ahora seleccione una opcion de esta generacion: \n");
                        System.out.println("1. AMD Ryzen 3 3100\n2. AMD Ryzen 5 3600\n3. AMD Ryzen 7 3700X\n4. AMD Ryzen 9 3900X");
                        System.out.println("Ingrese su opción: ");
                        AMD3000CPU = scanner.nextInt();
                        switch (AMD3000CPU) {
                            case (1):
                                System.out.println("Usted selecciono: AMD Ryzen 3 3100");
                                break;
                            case (2):
                                System.out.println("Usted selecciono: AMD Ryzen 5 3600");
                                break;
                            case (3):
                                System.out.println("Usted selecciono: AMD Ryzen 7 3700X");
                                break;
                            case (4):
                                System.out.println("Usted selecciono: AMD Ryzen 9 3900X");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                            break;
                    
                            case (2):
                        System.out.println("Ahora seleccione una opcion de esta generacion: \n");
                        System.out.println("1. AMD Ryzen 3 5100\n2. AMD Ryzen 5 5600\n3. AMD Ryzen 7 5700X\n4. AMD Ryzen 9 5900X");
                        System.out.println("Ingrese su opción: ");
                        AMD5000CPU = scanner.nextInt();
                        switch ( AMD5000CPU) {
                            case (1):
                                System.out.println("Usted selecciono: AMD Ryzen 3 5100");
                                break;
                            case (2):
                                System.out.println("Usted selecciono: AMD Ryzen 5 5600");
                                break;
                            case (3):
                                System.out.println("Usted selecciono:  AMD Ryzen 7 5700X");
                                break;
                            case (4):
                                System.out.println("Usted selecciono: AMD Ryzen 9 5900X");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        case (3):
                        System.out.println("Ahora seleccione una opcion");
                        System.out.println("1. AMD Ryzen 3 7100\n2. AMD Ryzen 5 7600\n3. AMD Ryzen 7 7700X\n4. AMD Ryzen 9 7900X");
                        System.out.println("Ingrese su opción: ");
                        MD7000CPU = scanner.nextInt();
                        switch (MD7000CPU) {
                            case (1):
                                System.out.println("Usted selecciono: AMD Ryzen 3 7100\n");
                                break;
                            case (2):
                                System.out.println("Usted selecciono: AMD Ryzen 5 7600\n");
                                break;
                            case (3):
                                System.out.println("Usted selecciono: AMD Ryzen 7 7700X\n");
                                break;
                            case (4):
                                System.out.println("Usted selecciono: AMD Ryzen 9 7900X\n");
                                break;
                            default:
                                System.out.println("Opcion no valida\n");
                                break;
                        }
                        default:
                        System.out.println("Opcion no valida, intente de nuevo.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
    }

    System.out.println("Seleccione la marca de la tarjeta grafica");
    System.out.println("1. Nvidia Geforce");
    System.out.println("2. AMD Radeon");
    System.out.println();
    System.out.println("Ingrese su opción: ");
    marcaGPU = scanner.nextInt();
    switch (marcaGPU) {
        case (1):
        System.out.println("Ahora seleccione una generacion de esta marca: ");
        System.out.println("1. Nvidia Geforce RTX 2000\n2. Nvidia Geforce RTX 3000\n3. Nvidia Geforce RTX 4000");
        System.out.println("Ingrese su opción: ");
        NvidiaGenGPU= scanner.nextInt();
        switch (NvidiaGenGPU) {
            case (1):
            System.out.println("Ahora seleccione un producto de esta generacion: ");
            System.out.println("1.Nvidia Geforce RTX 2060\n2. Nvidia Geforce RTX 2070\n3. Nvidia Geforce RTX 2080");
            System.out.println("Ingrese su opción: ");
            NvidiaRTX2000GPU= scanner.nextInt();
            switch (NvidiaRTX2000GPU) {
                case (1):
                System.out.println("Usted selecciono: Nvidia Geforce RTX 2060");
                break;
                case (2):
                System.out.println("Usted selecciono: Nvidia Geforce RTX 2070");
                break;
                case (3):
                System.out.println("Usted selecciono: Nvidia Geforce RTX 2080");
                break;
            default:
                System.out.println("Opcion no valida, intente de  nuevo.");
                break;
        }
            break;
        case (2):
        System.out.println("Ahora seleccione un producto de esta generacion: ");
            System.out.println("1.Nvidia Geforce RTX 3060\n2. Nvidia Geforce RTX 3070\n3. Nvidia Geforce RTX 3080");
            System.out.println("Ingrese su opción: ");
            NvidiaRTX3000GPU= scanner.nextInt();
            switch (NvidiaRTX3000GPU) {
                case (1):
                System.out.println("Usted selecciono: Nvidia Geforce RTX 3060");
                break;
                case (2):
                System.out.println("Usted selecciono: Nvidia Geforce RTX 3070");
                break;
                case (3):
                System.out.println("Usted selecciono: Nvidia Geforce RTX 3080");
                break;
            default:
                System.out.println("Opcion no valida, intente de  nuevo.");
                break;
        }
            break;
            case (3):
        System.out.println("1.Ahora seleccione un producto de esta generacion: ");
            System.out.println("1.Nvidia Geforce RTX 4060\n2. Nvidia Geforce RTX 4070\n3. Nvidia Geforce RTX 4080");
            System.out.println("Ingrese su opción: ");
            NvidiaRTX4000GPU= scanner.nextInt();
            switch (NvidiaRTX4000GPU) {
                case (1):
                System.out.println("Usted selecciono: Nvidia Geforce RTX 4060 - $5,709");
                break;
                case (2):
                System.out.println("Usted selecciono: Nvidia Geforce RTX 4070 - $10,993");
                break;
                case (3):
                System.out.println("Usted selecciono: Nvidia Geforce RTX 4080 ");
                break;
            default:
                System.out.println("Opcion no valida, intente de  nuevo.");
                break;
        }
            break;
        default:
        System.out.println("Opcion no valida, intente de  nuevo.");
            break;
    }
        case(2):
        System.out.println("Ahora seleccione una generacion de esta marca: ");
        System.out.println("1. AMD Radeon RX 5000\n2. MD Radeon RX 6000\n3. AMD Radeon RX 7000");
        System.out.println("Ingrese su opción: ");
        AMDGenGPU= scanner.nextInt();
        switch (AMDGenGPU) {
            case (1):
            System.out.println("Ahora seleccione un producto de esta generacion: ");
            System.out.println("1. RX 5600 XT GDDR6 - $4,000\n2. RX 5700 GAMING, 8GB GDDR6 - $4,800\n3. RX 5700 XT GAMING OC, 8GB GDDR6 - $5,280");
            System.out.println("Ingrese su opción: ");
            AMD5000GPU= scanner.nextInt();
            switch (AMD5000GPU) {
                case (1):
                System.out.println("Usted selecciono: RX 5600 XT GDDR6 - $4,000");
                break;
                case (2):
                System.out.println("Usted selecciono: RX 5700 GAMING, 8GB GDDR6 - $4,800");
                break;
                case (3):
                System.out.println("Usted selecciono: RX 5700 XT GAMING OC, 8GB GDDR6 - 5,280");
                break;
            default:
                System.out.println("Opcion no valida, intente de  nuevo.");
                break;
        }
            break;
        case (2):
        System.out.println("Ahora seleccione un producto de esta generacion: ");
            System.out.println("1.Radeon RX 6600 MECH 2X 8G GDDR6 - $6,850\n2. Radeon RX 6700 XT 12GB GDDR6 - $10,069\n3. AMD Radeon RX 6800 16GB GDDR6 - $11,809");
            System.out.println("Ingrese su opción: ");
            AMD6000GPU= scanner.nextInt();
            switch (AMD6000GPU) {
                case (1):
                System.out.println("Usted selecciono: Radeon RX 6600 MECH 2X 8G GDDR6 - $6,850");
                break;
                case (2):
                System.out.println("Usted selecciono: Radeon RX 6700 XT 12GB GDDR6 - $10,069");
                break;
                case (3):
                System.out.println("Usted selecciono: AMD Radeon RX 6800 16GB GDDR6 - $11,809");
                break;
            default:
                System.out.println("Opcion no valida, intente de  nuevo.");
                break;
        }
            break;
            case (3):
        System.out.println("1.Ahora seleccione un producto de esta generacion: ");
            System.out.println("1.Dual Radeon RX 7600 V2 OC, 8GB 128-bit GDDR6 - $5,609\n2. AMD Radeon RX 7700 XT Dual OC, 12GB GDDR6 - $8,629\n3. AMD Radeon RX 7800 XT 16GB GDDR6 - $9,889");
            System.out.println("Ingrese su opción: ");
            AMD7000GPU= scanner.nextInt();
            switch (AMD7000GPU) {
                case (1):
                System.out.println("Usted selecciono: Dual Radeon RX 7600 V2 OC, 8GB 128-bit GDDR6 - $5,609");
                break;
                case (2):
                System.out.println("Usted selecciono: AMD Radeon RX 7700 XT Dual OC, 12GB GDDR6 - $8,629");
                break;
                case (3):
                System.out.println("Usted selecciono: AMD Radeon RX 7800 XT 16GB GDDR6 - $9,889");
                break;
            default:
                System.out.println("Opcion no valida, intente de  nuevo.");
                break;
        }
            break;
        default:
        System.out.println("Opcion no valida, intente de  nuevo.");
            break;
    }
}
}
}
}