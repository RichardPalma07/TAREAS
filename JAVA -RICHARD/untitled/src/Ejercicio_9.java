import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== SISTEMA DE RESERVA DE HOTEL ===");

        System.out.print("Ingrese el numero de noches: ");
        float noches = scanner.nextFloat();

        System.out.println("Tipo de habitacion:");
        System.out.println("1. Economica ($50)");
        System.out.println("2. Ejecutiva ($80)");
        System.out.println("3. Suite ($120)");
        System.out.print("Seleccione el tipo: ");
        int tipo = scanner.nextInt();

        float costoBase;

        // Determinar costo base segun tipo de habitacion
        if (tipo == 1) {
            costoBase = noches * 50;
        } else if (tipo == 2) {
            costoBase = noches * 80;
        } else {
            costoBase = noches * 120;
        }

        float descuento = 0;
        float impuesto;

        // Aplicar descuento si noches > 5
        if (noches > 5) {
            descuento = costoBase * 0.10f;
        }

        // Calcular impuesto
        impuesto = costoBase * 0.08f;

        // Calcular total
        float total = costoBase - descuento + impuesto;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Costo base: $%.2f\n", costoBase);
        System.out.printf("Descuento: $%.2f\n", descuento);
        System.out.printf("Impuesto: $%.2f\n", impuesto);
        System.out.printf("Total a pagar: $%.2f\n", total);
    }
}

