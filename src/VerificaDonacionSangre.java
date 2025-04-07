import java.util.Scanner;

public class VerificaDonacionSangre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad del donante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el peso del donante (en kg): ");
        double peso = scanner.nextDouble();

        boolean edadValida = edad >= 18 && edad <= 65;
        boolean pesoValido = peso > 50;

        if (edadValida && pesoValido) {
            System.out.println("El donante es compatible para donar sangre.");
        } else {
            System.out.println("El donante no es compatible. Motivo:");
            if (!edadValida) {
                System.out.println("- Debe tener entre 18 y 65 años.");
            }
            if (!pesoValido) {
                System.out.println("- Debe pesar más de 50 kg.");
            }
        }
        scanner.close();
    }
}