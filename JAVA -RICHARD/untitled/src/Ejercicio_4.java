import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== PRESUPUESTO FAMILIAR MENSUAL ===");

        System.out.print("Ingrese el ingreso mensual: ");
        float ingreso = scanner.nextFloat();

        // Calcular gastos segun porcentajes
        float alimentacion = ingreso * 0.25f;
        float vivienda = ingreso * 0.30f;
        float transporte = ingreso * 0.15f;
        float educacion = ingreso * 0.10f;
        float ocio = ingreso * 0.05f;

        // Calcular ahorros (lo que resta)
        float todosLosGastos = alimentacion + vivienda + transporte + educacion + ocio;
        float ahorros = ingreso - todosLosGastos;

        // Mostrar resultados
        System.out.println("\n--- DISTRIBUCION DEL PRESUPUESTO ---");
        System.out.printf("Alimentacion (25%%): $%.2f\n", alimentacion);
        System.out.printf("Vivienda (30%%): $%.2f\n", vivienda);
        System.out.printf("Transporte (15%%): $%.2f\n", transporte);
        System.out.printf("Educacion (10%%): $%.2f\n", educacion);
        System.out.printf("Ocio (5%%): $%.2f\n", ocio);
        System.out.printf("Ahorros (15%%): $%.2f\n", ahorros);
        System.out.printf("Total: $%.2f\n", ingreso);
    }
}

