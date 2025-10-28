import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== SISTEMA DE VENTAS POR COMISIONES ===");

        System.out.print("Ingrese el monto de ventas: ");
        float ventas = scanner.nextFloat();

        float sueldoBase = 800;
        float comision;

        // Calcular comision segun el monto de ventas
        if (ventas <= 5000) {
            comision = ventas * 0.05f;
        } else if (ventas <= 10000) {
            comision = ventas * 0.08f;
        } else {
            comision = ventas * 0.12f;
        }

        float sueldoTotal = sueldoBase + comision;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Sueldo base: $%.2f\n", sueldoBase);
        System.out.printf("Comision: $%.2f\n", comision);
        System.out.printf("Sueldo total: $%.2f\n", sueldoTotal);
    }
}

