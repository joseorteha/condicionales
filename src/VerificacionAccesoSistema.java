import java.util.Scanner;

public class VerificacionAccesoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoCorrecto = 2023;
        int nivelPermisoMinimo = 1;
        int nivelPermisoMaximo = 3;

        System.out.print("Ingrese el código de acceso: ");
        int codigoDigitado = scanner.nextInt();

        System.out.print("Ingrese el nivel de permiso: ");
        int nivelPermiso = scanner.nextInt();

        boolean codigoValido = codigoDigitado == codigoCorrecto;
        boolean permisoValido = nivelPermiso >= nivelPermisoMinimo && nivelPermiso <= nivelPermisoMaximo;

        if (codigoValido && permisoValido) {
            System.out.println("Acceso permitido. ¡Bienvenido al sistema!");
        } else {
            System.out.println("Acceso denegado. Motivo(s):");
            if (!codigoValido) {
                System.out.println("- Código de acceso incorrecto.");
            }
            if (!permisoValido) {
                System.out.println("- Nivel de permiso inválido.");
            }
        }
    }
} 