import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== PLAN DE AHORRO PARA META FINANCIERA ===");

        System.out.print("Ingrese la tasa anual (%): ");
        float tasaAnual = scanner.nextFloat();

        System.out.print("Ingrese la meta a alcanzar: ");
        float meta = scanner.nextFloat();

        // Calcular tasa mensual
        float tasaMensual = tasaAnual / (12 * 100);

        System.out.print("Ingrese el numero de meses: ");
        int meses = scanner.nextInt();

        // Calcular ahorro mensual
        float potencia = (float) Math.pow(1 + tasaMensual, meses);
        float ahorroMensual = (meta * tasaMensual) / (potencia - 1);

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Tasa mensual: %.4f%%\n", tasaMensual * 100);
        System.out.printf("Ahorro mensual necesario: $%.2f\n", ahorroMensual);
    }
}

