public class Aprobacion {

    public static void main(String[] args) {

        double media = 4.3;

        if (media >= 7.0) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue aprobado.");
        } else if (media >= 5.0) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y está en recuperación.");
        } else {
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue reprobado.");
        }
    }
}