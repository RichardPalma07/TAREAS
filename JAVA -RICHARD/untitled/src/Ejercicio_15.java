import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== CONTROL DE PRODUCCION INDUSTRIAL ===");

        System.out.print("Ingrese las horas trabajadas: ");
        float horas = scanner.nextFloat();

        System.out.print("Ingrese las unidades por hora: ");
        float unidadesPorHora = scanner.nextFloat();

        System.out.print("Ingrese la eficiencia (%): ");
        float eficiencia = scanner.nextFloat();

        // Calcular produccion teorica
        float produccionTeorica = horas * unidadesPorHora;

        // Calcular produccion real
        float produccionReal = produccionTeorica * (eficiencia / 100);

        // Calcular defectuosos (3% de produccion real)
        float defectuosos = produccionReal * 0.03f;

        // Calcular unidades buenas
        float unidadesBuenas = produccionReal - defectuosos;

        // Calcular perdida (7.5 por defectuoso)
        float perdida = defectuosos * 7.5f;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Produccion teorica: %.2f unidades\n", produccionTeorica);
        System.out.printf("Produccion real: %.2f unidades\n", produccionReal);
        System.out.printf("Defectuosos: %.2f unidades\n", defectuosos);
        System.out.printf("Unidades buenas: %.2f unidades\n", unidadesBuenas);
        System.out.printf("Perdida: $%.2f\n", perdida);
    }
}

