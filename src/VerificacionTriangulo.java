import java.util.Scanner;

public class VerificacionTriangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer lado: ");
        int lado1 = scanner.nextInt();

        System.out.print("Ingrese el segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.print("Ingrese el tercer lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los lados pueden formar un triángulo.");
        } else {
            System.out.println("Los lados no pueden formar un triángulo.");
        }

        scanner.close();
    }
}