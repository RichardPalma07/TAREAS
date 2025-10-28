import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== CONTROL DE ASISTENCIA Y PUNTUALIDAD ===");

        System.out.print("Ingrese los dias trabajados: ");
        int diasTrabajados = scanner.nextInt();

        System.out.print("Ingrese los dias de ausencia: ");
        int diasAusencia = scanner.nextInt();

        System.out.print("Ingrese los minutos de tardanza: ");
        int minutosTardanza = scanner.nextInt();

        // Calcular dias totales
        int diasTotales = diasTrabajados + diasAusencia;

        // Calcular porcentaje de asistencia
        float porcentajeAsistencia = ((float) diasTrabajados / diasTotales) * 100;

        // Calcular descuento por ausencias
        float descuentoAusencias = diasAusencia * 50;

        // Calcular descuento por tardanzas
        float descuentoTardanzas = minutosTardanza * 2;

        // Calcular salario final
        float salarioFinal = 1200 - descuentoAusencias - descuentoTardanzas;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Dias totales: %d\n", diasTotales);
        System.out.printf("Porcentaje de asistencia: %.2f%%\n", porcentajeAsistencia);
        System.out.printf("Descuento por ausencias: $%.2f\n", descuentoAusencias);
        System.out.printf("Descuento por tardanzas: $%.2f\n", descuentoTardanzas);
        System.out.printf("Salario final: $%.2f\n", salarioFinal);
    }
}
