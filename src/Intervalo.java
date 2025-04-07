import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del préstamo: ");
        int valor = scanner.nextInt();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("El valor " + valor + " está dentro del intervalo permitido para el préstamo.");
        } else {
            System.out.println("El valor " + valor + " no está dentro del intervalo permitido para el préstamo.");
        }

        scanner.close();
    }
}