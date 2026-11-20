import java.time.YearMonth;

/** Pruebas sin dependencias: javac -d out src/*.java test/*.java && java -cp out TarjetaTest */
public class TarjetaTest {
    private static int fallas = 0;

    private static void check(boolean condicion, String nombre) {
        System.out.println((condicion ? "ok    " : "FALLA ") + nombre);
        if (!condicion) {
            fallas++;
        }
    }

    public static void main(String[] args) {
        check(Tarjeta.numeroValido("4242424242424242"), "Visa de prueba pasa Luhn");
        check(Tarjeta.numeroValido("4242 4242 4242 4242"), "acepta espacios");
        check(Tarjeta.numeroValido("5555-5555-5555-4444"), "acepta guiones (Mastercard de prueba)");
        check(!Tarjeta.numeroValido("4242424242424241"), "rechaza dígito verificador incorrecto");
        check(!Tarjeta.numeroValido("42424242424242"), "rechaza 14 dígitos");
        check(!Tarjeta.numeroValido("abcdabcdabcdabcd"), "rechaza letras");
        check(!Tarjeta.numeroValido(null), "rechaza null");

        YearMonth hoy = YearMonth.of(2026, 11);
        check(Tarjeta.fechaValida("11/26", hoy), "el mes actual sigue vigente");
        check(Tarjeta.fechaValida("01/30", hoy), "fecha futura");
        check(!Tarjeta.fechaValida("10/26", hoy), "tarjeta vencida");
        check(!Tarjeta.fechaValida("13/27", hoy), "mes 13");
        check(!Tarjeta.fechaValida("00/27", hoy), "mes 00");
        check(!Tarjeta.fechaValida("ab/cd", hoy), "letras (antes tronaba con NumberFormatException)");
        check(!Tarjeta.fechaValida("1/27", hoy), "formato incompleto");

        check(Tarjeta.cvvValido("123"), "CVV de 3 dígitos");
        check(!Tarjeta.cvvValido("12a"), "CVV con letra");
        check(!Tarjeta.cvvValido("1234"), "CVV de 4 dígitos");

        check(Tarjeta.enmascarar("4242 4242 4242 1234").equals("**** **** **** 1234"), "enmascara el número");

        if (fallas > 0) {
            System.out.println(fallas + " prueba(s) fallaron");
            System.exit(1);
        }
        System.out.println("Todas las pruebas pasaron");
    }
}
