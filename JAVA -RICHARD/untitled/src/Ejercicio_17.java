import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== SISTEMA DE RIEGO PARA JARDINERIA ===");

        System.out.print("Ingrese el radio del jardin (metros): ");
        float radio = scanner.nextFloat();

        // Calcular area del jardin (π × radio²)
        float areaJardin = (float) (Math.PI * radio * radio);

        // Calcular agua diaria (area × 6 litros)
        float aguaDiaria = areaJardin * 6;

        // Calcular costo mensual (agua diaria × 30 días × 0.15)
        float costoMensual = aguaDiaria * 30 * 0.15f;

        // Calcular tiempo de riego (agua diaria / 2 minutos)
        float tiempoRiego = aguaDiaria / 2;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Area del jardin: %.2f m²\n", areaJardin);
        System.out.printf("Agua diaria: %.2f litros\n", aguaDiaria);
        System.out.printf("Costo mensual: $%.2f\n", costoMensual);
        System.out.printf("Tiempo de riego: %.2f minutos\n", tiempoRiego);
    }
}

