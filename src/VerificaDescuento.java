import java.util.Scanner;

public class VerificaDescuento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.0) {
            double descuento = valorCompra * 0.10;
            double valorConDescuento = valorCompra - descuento;
            System.out.printf("Descuento del 10%% aplicado.\nNuevo valor: $%.2f\n", valorConDescuento);
        } else {
            System.out.printf("Descuento no aplicado.\nValor total: $%.2f\n", valorCompra);
        }

        scanner.close();
    }
}  