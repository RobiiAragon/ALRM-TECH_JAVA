import java.util.Scanner;

public class test {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
        
    }

    private static void menuPrincipal() {
        int opcion;
        do {
            System.out.println("Bienvenido a ALRM-TECH Encuentra todo para tu PC ideal aquí");
            System.out.println("1. Piezas");
            System.out.println("2. Sistema de armado guiado");
            System.out.println();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Bienvenido al ALRM-TECH Piezas");
                    menuPiezas();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Bienvenido al sistema de armado guiado de PC de ALRM-TECH");
                    menuPrearmado();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 1 && opcion != 2);
    }

    private static void menuPrearmado() {
        int opcionMarcaCPU;
        do {
            System.out.println("¿Qué tipo de procesador desea elegir?");
            System.out.println("1. Intel");
            System.out.println("2. AMD");
            System.out.println();
            System.out.print("Ingrese su opción: ");
            opcionMarcaCPU = scanner.nextInt();

            switch (opcionMarcaCPU) {
                case 1:
                    System.out.println();
                    System.out.println("Ha elegido Intel.");
                    mostrarOpcionesIntel();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Ha elegido AMD.");
                    mostrarOpcionesAMD();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionMarcaCPU != 1 && opcionMarcaCPU != 2);
    }

    private static void menuPiezas() {
        int opcionMarcaCPU;
        do {
            System.out.println();
            System.out.println("Que tipo de componente llevara el dia de hoy?");
            System.out.println("1. Procesadores");
            System.out.println("2. Motherbords");
            System.out.println("3. Memorias RAM");
            System.out.println("4. Almacenamientos");
            System.out.println("5. Fuentes de poder (PSU)");
            System.out.println("6. Gabinetes");
            System.out.println("7. Monitores");
            System.out.println("8. Teclados");
            System.out.println("9. Mouses");
            System.out.println("10. Alfombrillas");
            System.out.println("11. Auriculares");
            System.out.println("12. Microfonos");
            System.out.println();
            System.out.print("Ingrese su opción: ");
            opcionMarcaCPU = scanner.nextInt();

            switch (opcionMarcaCPU) {
                case 1:
                
                    System.out.println();
                    System.out.println("Catalogo de Procesadores");
                    mostrarProcesadores();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Catalogo de Motherbords");
                    mostrarMotherbords();
                    break;
                    
                case 3:
                    System.out.println();
                    System.out.println("Catalogo de Memorias RAM");
                    mostrarMemoriasRAM();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Catalogo de Almacenamientos");
                    mostrarAlmacenamientos();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Catalogo de Fuentes de poder (PSU)");
                    mostrarPSU();
                case 6:
                    System.out.println();
                    System.out.println("Catalogo de Gabinetes");
                    mostrarGabinetes();
                    break;
                case 7:
                    System.out.println();
                    System.out.println("Catalogo de Monitores");
                    mostrarMonitores();
                    break;
                case 8:
                    System.out.println();
                    System.out.println("Catalogo de Teclados");
                    mostrarTeclados();
                    break;
                case 9:
                    System.out.println();
                    System.out.println("Catalogo de Mouses");
                    mostrarMouses();
                    break;
                case 10:
                    System.out.println();
                    System.out.println("Catalogo de Alfombrillas");
                    mostrarAlfombrillas();
                    break;
                case 11:
                    System.out.println();
                    System.out.println("Catalogo de Auriculares");
                    mostrarAuriculares();
                    break;
                case 12:
                    System.out.println();
                    System.out.println("Catalogo de Microfonos");
                    mostrarMicrofonos();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionMarcaCPU < 1 || opcionMarcaCPU > 12);
    }

    private static void mostrarOpcionesIntel() {
        int opcionGamaCPU;
        do {
            System.out.println("Qué gama de procesador desea?");
            System.out.println();
            System.out.println("1. Intel Core i3, Excelente opción para ofimática y trabajos escolares");
            System.out.println("2. Intel Core i5, Una opción equilibrada para programas de uso medio y Esports");
            System.out.println("3. Intel Core i7, Ideal para profesionales y videojuegos AAA");
            System.out.println("4. Intel Core i9, Lo mejor de lo mejor especial para entusiastas y profesionales, este procesador correrá los programas más pesados y videojuegos de próxima generación");
            System.out.println();
            System.out.print("Ingrese su opción: ");
            opcionGamaCPU = scanner.nextInt();

            switch (opcionGamaCPU) {
                case 1:
                    System.out.println();
                    System.out.println("Haz elegido el i3");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherInteli3();
                    break;
                case 2:
                System.out.println();
                    System.out.println("Haz elegido el i5");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherInteli5();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Haz elegido el i7");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherInteli7();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Haz elegido el i9");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherInteli9();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionGamaCPU < 1 || opcionGamaCPU > 4);
    }

    private static void mostrarOpcionesAMD() {
        int opcionGamaCPU;
        do {
            System.out.println();
            System.out.println("Qué gama de procesador desea?");
            System.out.println("1. AMD RYZEN 3, Excelente opción para ofimática y trabajos escolares");
            System.out.println("2. AMD RYZEN 5, Una opción equilibrada para programas de uso medio y Esports");
            System.out.println("3. AMD RYZEN 7, Ideal para profesionales y videojuegos AAA");
            System.out.println("4. AMD RYZEN 9, Lo mejor de lo mejor especial para entusiastas y profesionales, este procesador correrá los programas más pesados y videojuegos de próxima generación");
            System.out.println();
            System.out.print("Ingrese su opción: ");
            opcionGamaCPU = scanner.nextInt();

            switch (opcionGamaCPU) {
                case 1:
                    System.out.println();
                    System.out.println("Haz elegido el RYZEN 3");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherAMDR3();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Haz elegido el RYZEN 5");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherAMDR5();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Haz elegido el RYZEN 7");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherAMDR7();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Haz elegido el RYZEN 9");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherAMDR9();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionGamaCPU < 1 || opcionGamaCPU > 4);
    }

    // Métodos para mostrar las opciones de placas base
    private static void mostrarMotherInteli3() {
        // Mostrar las opciones de placas base INTEL gama de entrada disponibles
        int opcionGamaCPU;
        do {
            System.out.println();
            System.out.println("Qué Generacion de del i3 desea?");
            System.out.println("1. i3 12100 12th generacion de intel con graficos UHD 760");
            System.out.println("   4 Nucleos 8 Hilos Frecuencia base de 4.30GHz y un Boost de 4.30GHz");
            System.out.println("Precio: $100 USD");
            System.out.println("Qué Generacion de del i5 desea?");
            System.out.println("1. i5 12600 12th generacion de intel con graficos UHD 770");
            System.out.println("   6 Nucleos 12 Hilos Frecuencia base de 4.80GHz y un Boost de 4.30GHz");
            System.out.println("Precio: $300 USD");
            System.out.println("Qué Generacion de del i7 desea?");
            System.out.println("1. i7 12700 12th generacion de intel con graficos UHD 770");
            System.out.println("   8 Nucleos Performance 4 Nucleos Eficientes 20 Hilos Frecuencia base de 4.80GHz y un Boost de 4.30GHz");
            System.out.println("Precio: $500 USD");
            System.out.print("Ingrese su opción: ");
            opcionGamaCPU = scanner.nextInt();

            switch (opcionGamaCPU) {
                case 1:
                    System.out.println();
                    System.out.println("Haz elegido el RYZEN 3");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherAMDR3();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Haz elegido el RYZEN 5");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherAMDR5();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Haz elegido el RYZEN 7");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherAMDR7();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Haz elegido el RYZEN 9");
                    System.out.println("Ahora elige tu Placa base");
                    System.out.println();
                    System.out.println("Estas son las que te recomendamos para tu procesador:");
                    mostrarMotherAMDR9();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionGamaCPU < 1 || opcionGamaCPU > 4);
    }
    

    private static void mostrarMotherInteli5() {
        // Mostrar las opciones de placas base INTEL gama media disponibles
    }

    private static void mostrarMotherInteli7() {
        // Mostrar las opciones de placas base INTEL gama alta disponibles
    }

    private static void mostrarMotherInteli9() {
        // Mostrar las opciones de placas base INTEL gama entusiasta disponibles
    }

    private static void mostrarMotherAMDR3() {
        // Mostrar las opciones de placas base AMD gama de entrada disponibles
    }

    private static void mostrarMotherAMDR5() {
        // Mostrar las opciones de placas base AMD gama media disponibles
    }

    private static void mostrarMotherAMDR7() {
        // Mostrar las opciones de placas base AMD gama alta disponibles
    }

    private static void mostrarMotherAMDR9() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarProcesadores() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarMotherbords() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarMemoriasRAM() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarAlmacenamientos() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarPSU() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarGabinetes() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarMonitores() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarTeclados() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarMouses() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarAlfombrillas() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarAuriculares() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
    private static void mostrarMicrofonos() {
        // Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
}