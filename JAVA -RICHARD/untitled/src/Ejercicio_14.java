import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== SISTEMA DE PRESTAMO PERSONAL ===");

        System.out.print("Ingrese la tasa anual (%): ");
        float tasaAnual = scanner.nextFloat();

        System.out.print("Ingrese el monto del prestamo: ");
        float monto = scanner.nextFloat();

        System.out.print("Ingrese el numero de meses: ");
        int meses = scanner.nextInt();

        // Calcular tasa mensual
        float tasaMensual = tasaAnual / (12 * 100);

        // Calcular cuota mensual
        float potencia = (float) Math.pow(1 + tasaMensual, meses);
        float cuotaMensual = (monto * tasaMensual * potencia) / (potencia - 1);

        // Calcular total a pagar
        float totalPagar = cuotaMensual * meses;

        // Calcular interes total
        float interesTotal = totalPagar - monto;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Tasa mensual: %.4f%%\n", tasaMensual * 100);
        System.out.printf("Cuota mensual: $%.2f\n", cuotaMensual);
        System.out.printf("Total a pagar: $%.2f\n", totalPagar);
        System.out.printf("Interes total: $%.2f\n", interesTotal);
    }
}

