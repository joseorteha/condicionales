import java.util.Scanner;

public class VerificacionDiaUtil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana (en minúsculas): ");
        String dia = scanner.nextLine();

        scanner.close();

        if (dia.equals("lunes") || dia.equals("martes") ||
                dia.equals("miércoles") || dia.equals("jueves") ||
                dia.equals("viernes")) {
            System.out.println(dia + " es un día hábil.");
        } else {
            System.out.println(dia + " no es un día hábil.");
        }
    }
}