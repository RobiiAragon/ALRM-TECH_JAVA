import java.util.Scanner;

public class test {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean salir = false;
        int opcion;
       //----------------------------------Procesadores
       String[] MarcaCPU = {"INTEL","AMD"};
       //-------------------------------------------------------------------------------INTEL
       String[] IntelGenCPU = {"Intel Core 12th", "Intel Core 13th", "Intel Core 14th"};
       String[] intel12thCPU = {"Intel Core i3 12100", "Intel Core i5 12600", "Intel Core i7 12700", "Intel Core i9 12900"};
       String[] intel13thCPU = {"Intel Core i3 13100", "Intel Core i5 13600", "Intel Core i7 13700", "Intel Core i9 13900"};
       String[] intel14thCPU = {"Intel Core i3 14100", "Intel Core i5 14600", "Intel Core i7 14700", "Intel Core i9 14900"};
       //--------------------------------------------------------------------------AMD
       String[] AMDGenCPU = {"AMD Ryzen 3000", "AMD Ryzen 5000", "AMD Ryzen 8000"};
       String[] AMD3000CPU = {"AMD Ryzen 3 3100", "AMD Ryzen 5 3600", "AMD Ryzen 7 3700X", "AMD Ryzen 9 3900X"};
       String[] AMD5000CPU = {"AMD Ryzen 3 5100", "AMD Ryzen 5 5600", "AMD Ryzen 7 5700X", "AMD Ryzen 9 5900X"};
       String[] AMD7000CPU = {"AMD Ryzen 3 7100", "AMD Ryzen 5 7600", "AMD Ryzen 7 7700X", "AMD Ryzen 9 7900X"};
       //---------------------------------------------------Tarjetas Graficas
       String[] MarcaGPU = {"Nvidia Geforce", "AMD Radeon"};
       //--------------------------------------------------------------------------------------------------------Nvidia Geforce
       String[] NvidiaGenGPU = {"Nvidia Geforce RTX 2000", "Nvidia Geforce RTX 3000", "Nvidia Geforce RTX 4000"};
       String[] NvidiaRTX2000GPU = {"Nvidia Geforce RTX 2060", "Nvidia Geforce RTX 2070", "Nvidia Geforce RTX 2080"};
       String[] NvidiaRTX3000GPU = {"Nvidia Geforce RTX 3060", "Nvidia Geforce RTX 3070", "Nvidia Geforce RTX 3080", "Nvidia Geforce RTX 3090"};
       String[] NvidiaRTX4000GPU = {"Nvidia Geforce RTX 4060", "Nvidia Geforce RTX 4070", "Nvidia Geforce RTX 4080", "Nvidia Geforce RTX 4090"};
       //--------------------------------------------------------------------------------------AMD Radeon
       String[] AMDGenGPU = {"AMD Radeon RX 5000", "AMD Radeon RX 6000", "AMD Radeon RX 7000"};
       String[] AMD5000GPU = {"AMD Radeon RX", "AMD Radeon RX", "AMD Radeon RX", "AMD Radeon RX"};
       String[] AMD6000GPU = {"AMD Radeon RX", "AMD Radeon RX", "AMD Radeon RX", "AMD Radeon RX"};
       String[] AMD7000GPU = {"AMD Radeon RX", "AMD Radeon RX", "AMD Radeon RX", "AMD Radeon RX"};


       while (!salir) {
           System.out.println("Bienvenido a ALRM-TECH Encuentra todo para tu PC ideal aquí");
           System.out.println("1. Piezas");
           System.out.println("2. Sistema de armado guiado");
           System.out.println();
           System.out.print("Ingrese su opción: ");
           opcion = scanner.nextInt();

           switch (opcion) {
                case 1:
                   System.out.println("Bienvenido al ALRM-TECH Piezas");
                   
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                   System.out.println("Opción inválida. Inténtelo de nuevo.");
                   break;
           }
       }
   }
}