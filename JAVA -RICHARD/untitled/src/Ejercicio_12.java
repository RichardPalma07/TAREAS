import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== SISTEMA DE PUNTOS PARA PROGRAMA DE FIDELIDAD ===");

        System.out.print("Ingrese el monto de la compra: ");
        float montoCompra = scanner.nextFloat();

        System.out.print("Ingrese los puntos acumulados: ");
        float puntosAcumulados = scanner.nextFloat();

        // Calcular puntos de nueva compra
        float puntosNuevaCompra = montoCompra / 10;

        // Duplicar puntos si monto > 500
        if (montoCompra > 500) {
            puntosNuevaCompra = puntosNuevaCompra * 2;
        }

        // Calcular puntos totales
        float puntosTotales = puntosAcumulados + puntosNuevaCompra;

        // Calcular descuento disponible
        float descuentoDisponible = (puntosTotales / 100) * 10;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Puntos de nueva compra: %.2f\n", puntosNuevaCompra);
        System.out.printf("Puntos totales: %.2f\n", puntosTotales);
        System.out.printf("Descuento disponible: $%.2f\n", descuentoDisponible);
    }
}
