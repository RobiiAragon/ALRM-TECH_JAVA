import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a ALRM-TECH Encuentra todo para tu PC ideal aquí");
        MenuPrearmado();
        mostrarOpcionesIntel();
        mostrarOpcionesAMD();
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// Mostrar menu del sistema de prearmado
                        private static void MenuPrearmado() {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Bienvenido al sistema de armado guiado de PC");
                            System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// Mostrar opciones de procesador
                            System.out.println("¿Qué tipo de procesador desea elegir?");
                            System.out.println();
                            System.out.println("1. Intel");
                            System.out.println("2. AMD");

                            int opcion_marca_cpu = scanner.nextInt();

                            switch (opcion_marca_cpu) {
                            case 1:
                                System.out.println();
                                System.out.println("Ha elegido Intel.");
                                System.out.println();
                                mostrarOpcionesIntel();
                                break;
                            case 2:
                                System.out.println();
                                System.out.println("Ha elegido AMD.");
                                System.out.println("");
                                mostrarOpcionesAMD();
                                break;
                            default:
                                // Bucle para repetir la pregunta hasta que se introduzca una opción válida
                                while (true) {
                                MenuPrearmado();
                                }
                            }
                            scanner.close();
                        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// Mostrar procesadores INTEL

private static void mostrarOpcionesIntel() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Que gama de procesador desea?");
    System.out.println();
    System.out.println("1. Intel Core i3, Exelente opcion para ofimatica y trabajos escolares");
    System.out.println();
    System.out.println("2. Intel Core i5, Una opcion equilibrada para programas de uso medio y Esports");
    System.out.println();
    System.out.println("3. Intel Core i7, Ideal para profesioales y videojuegos AAA");
    System.out.println();
    System.out.println("3. Intel Core i9, Lo mejor de lo mejor especial para entusiastas y profesionales, este procesador correra los programs mas pesados y videojuegos de proxima generacion");
    System.out.println();

    int opcion_GAMA_cpu = scanner.nextInt();

    switch (opcion_GAMA_cpu) {
        case 1:
            System.out.println("");
            System.out.println("Haz elegido el i3");
            System.out.println("Ahora elije tu Placa base");
            System.out.println("estas son las que te recomendamos para tu procesador:");
            mostrarMotherInteli3();
                break;
        case 2:
            System.out.println("");
            System.out.println("Haz elegido el i5");
            System.out.println("Ahora elije tu Placa base");
            System.out.println("estas son las que te recomendamos para tu procesador:");
            mostrarMotherInteli5();
                break;
        case 3:
            System.out.println("");
            System.out.println("Haz elegido el i7");
            System.out.println("Ahora elije tu Placa base");
            System.out.println("estas son las que te recomendamos para tu procesador:");
            mostrarMotherInteli7();
                break;
        case 4:
            System.out.println("");
            System.out.println("Haz elegido el i9");
            System.out.println("Ahora elije tu Placa base");
            System.out.println("estas son las que te recomendamos para tu procesador:");
            mostrarMotherInteli9();
                break;
      default:
        // Bucle para repetir la pregunta hasta que se introduzca una opción válida
        while (true) {
          mostrarOpcionesIntel();
        }
    }

    scanner.close();
  }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// Mostrar procesadores AMD

    private static void mostrarOpcionesAMD() {
        Scanner scanner = new Scanner(System.in);
        int opcion_GAMA_cpu = scanner.nextInt();

        System.out.println("Que gama de procesador desea?");
        System.out.println();
        System.out.println("1. AMD RYZEN 3, Exelente opcion para ofimatica y trabajos escolares");
        System.out.println();
        System.out.println("2. AMD RYZEN 5, Una opcion equilibrada para programas de uso medio y Esports");
        System.out.println();
        System.out.println("3. AMD RYZEN 7, Ideal para profesioales y videojuegos AAA");
        System.out.println();
        System.out.println("3. AMD RYZEN 9, Lo mejor de lo mejor especial para entusiastas y profesionales, este procesador correra los programs mas pesados y videojuegos de proxima generacion");
        System.out.println();

        switch (opcion_GAMA_cpu) {
            case 1:
                System.out.println("");
                System.out.println("Haz elegido el RYZEN 3");
                System.out.println("Ahora elije tu Placa base");
                System.out.println("estas son las que te recomendamos para tu procesador:");
                mostrarMotherAMDR3();
                break;

            case 2:
                System.out.println("");
                System.out.println("Haz elegido el RYZEN 5");
                System.out.println("Ahora elije tu Placa base");
                System.out.println("estas son las que te recomendamos para tu procesador:");
                mostrarMotherAMDR5();
                break;

            case 3:
                System.out.println("");
                System.out.println("Haz elegido el RYZEN 7");
                System.out.println("Ahora elije tu Placa base");
                System.out.println("estas son las que te recomendamos para tu procesador:");
                mostrarMotherAMDR7();
                break;
                
            case 4:
                System.out.println("");
                System.out.println("Haz elegido el RYZEN 9");
                System.out.println("Ahora elije tu Placa base");
                System.out.println("estas son las que te recomendamos para tu procesador:");
                mostrarMotherAMDR9();
                break;

            default:
                // Bucle para repetir la pregunta hasta que se introduzca una opción válida
                while (true) {
                    mostrarOpcionesAMD();
                }
        }
        scanner.close();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// Mostrar Motherboards INTEL
    private static void mostrarMotherInteli3() {
        //Mostrar las opciones de placas base INTEL gama de entrada disponibles
    }
    private static void mostrarMotherInteli5() {
        //Mostrar las opciones de placas base INTEL gama media disponibles
    }
    private static void mostrarMotherInteli7() {
        //Mostrar las opciones de placas base INTEL gama alta disponibles
    }
    private static void mostrarMotherInteli9() {
        //Mostrar las opciones de placas base INTEL gama entusiasta disponibles
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// Mostrar Motherboards AMD
    
    private static void mostrarMotherAMDR3() {
        //Mostrar las opciones de placas base AMD gama de entrada disponibles
    }
    private static void mostrarMotherAMDR5() {
        //Mostrar las opciones de placas base AMD gama media disponibles
    }
    private static void mostrarMotherAMDR7() {
        //Mostrar las opciones de placas base AMD gama alta disponibles
    }
    private static void mostrarMotherAMDR9() {
        //Mostrar las opciones de placas base AMD gama entusiasta disponibles
    }
}
