import java.time.YearMonth;

/**
 * Validaciones del formulario de pago con tarjeta (simulado: no se cobra ni se guarda nada).
 */
public final class Tarjeta {
    private Tarjeta() {
    }

    /** Quita espacios y guiones: "4242 4242-4242 4242" -> "4242424242424242". */
    public static String limpiar(String numero) {
        return numero == null ? "" : numero.replaceAll("[\\s-]", "");
    }

    /** 16 dígitos que además pasan el algoritmo de Luhn (el que usan Visa, Mastercard, etc.). */
    public static boolean numeroValido(String numero) {
        String n = limpiar(numero);
        if (!n.matches("\\d{16}")) {
            return false;
        }
        int suma = 0;
        for (int i = 0; i < n.length(); i++) {
            int d = n.charAt(n.length() - 1 - i) - '0';
            if (i % 2 == 1) {
                d *= 2;
                if (d > 9) {
                    d -= 9;
                }
            }
            suma += d;
        }
        return suma % 10 == 0;
    }

    /** Formato MM/AA, mes 01-12 y que la tarjeta no haya vencido respecto a {@code hoy}. */
    public static boolean fechaValida(String fecha, YearMonth hoy) {
        if (fecha == null || !fecha.matches("\\d{2}/\\d{2}")) {
            return false;
        }
        int mes = Integer.parseInt(fecha.substring(0, 2));
        int anio = 2000 + Integer.parseInt(fecha.substring(3));
        if (mes < 1 || mes > 12) {
            return false;
        }
        return !YearMonth.of(anio, mes).isBefore(hoy);
    }

    public static boolean fechaValida(String fecha) {
        return fechaValida(fecha, YearMonth.now());
    }

    /** Código de seguridad de 3 dígitos. */
    public static boolean cvvValido(String cvv) {
        return cvv != null && cvv.matches("\\d{3}");
    }

    /** Para el recibo: solo los últimos 4 dígitos, "**** **** **** 4242". */
    public static String enmascarar(String numero) {
        String n = limpiar(numero);
        String ultimos = n.length() >= 4 ? n.substring(n.length() - 4) : n;
        return "**** **** **** " + ultimos;
    }
}
