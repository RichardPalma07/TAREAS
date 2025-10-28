import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.println("\n=== SISTEMA DE CALIFICACIONES UNIVERSITARIAS ===");

                // Solicitar las 4 notas parciales
                System.out.print("Ingrese la nota del parcial 1 (0-100): ");
                float parcial1 = sc.nextFloat();

                System.out.print("Ingrese la nota del parcial 2 (0-100): ");
                float parcial2 = sc.nextFloat();

                System.out.print("Ingrese la nota del parcial 3 (0-100): ");
                float parcial3 = sc.nextFloat();

                System.out.print("Ingrese la nota del parcial 4 (0-100): ");
                float parcial4 = sc.nextFloat();

                System.out.print("Ingrese la nota del examen final (0-100): ");
                float examenFinal = sc.nextFloat();

                System.out.print("Ingrese la nota del trabajo final (0-100): ");
                float trabajoFinal = sc.nextFloat();

                // Calcular nota final
                float notaFinal = (parcial1 * 0.15f) + (parcial2 * 0.15f) +
                        (parcial3 * 0.15f) + (parcial4 * 0.15f) +
                        (examenFinal * 0.30f) + (trabajoFinal * 0.10f);

                // Determinar clasificacion
                String clasificacion;
                if (notaFinal >= 70) {
                    clasificacion = "Aprueba";
                } else if (notaFinal >= 60) {
                    clasificacion = "Remedial";
                } else {
                    clasificacion = "Reprueba";
                }

                // Mostrar resultados
                System.out.println("\n--- RESULTADOS ---");
                System.out.printf("Nota final: %.2f\n", notaFinal);
                System.out.println("Clasificacion: " + clasificacion);

    }
}
