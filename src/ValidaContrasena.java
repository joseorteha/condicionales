import java.util.Scanner;

public class ValidaContrasena {

    public static void main(String[] args) {

        String contrasenaCorrecta = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la contraseña: ");
        String intentoContrasena = scanner.nextLine();

        scanner.close();

        if (intentoContrasena.equals(contrasenaCorrecta)) {
            System.out.println("¡Acceso permitido!");
        } else {
            System.out.println("¡Acceso denegado!");
        }
    }
}  