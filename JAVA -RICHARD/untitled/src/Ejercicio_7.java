import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== CONTROL DE INVENTARIO Y REPOSICION ===");

        System.out.print("Ingrese el stock minimo: ");
        float minimo = scanner.nextFloat();

        System.out.print("Ingrese el stock actual: ");
        float stockActual = scanner.nextFloat();

        // Calcular deficit
        float deficit = minimo - stockActual;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Deficit: %.2f unidades\n", deficit);

        if (deficit > 0) {
            // Calcular unidades a comprar
            float unidadesComprar = minimo * 1.5f - stockActual;

            System.out.print("Ingrese el precio de compra por unidad: ");
            float precioCompra = scanner.nextFloat();

            // Calcular costo de reposicion
            float costoReposicion = unidadesComprar * precioCompra;

            System.out.printf("Unidades a comprar: %.2f\n", unidadesComprar);
            System.out.printf("Costo de reposicion: $%.2f\n", costoReposicion);
        } else {
            System.out.println("No es necesario realizar reposicion.");
        }
    }
}

