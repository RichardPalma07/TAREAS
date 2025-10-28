import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== CALCULADORA DE RENDIMIENTO DE COMBUSTIBLE ===");

        System.out.print("Ingrese la distancia recorrida (km): ");
        float distancia = scanner.nextFloat();

        System.out.print("Ingrese el combustible usado (litros): ");
        float combustible = scanner.nextFloat();

        System.out.print("Ingrese el precio por litro: ");
        float precioLitro = scanner.nextFloat();

        // Calcular rendimiento
        float rendimiento = distancia / combustible;

        // Calcular consumo cada 100km
        float consumoCada100km = (combustible * 100) / distancia;

        // Calcular costo por km
        float costoPorKm = (combustible * precioLitro) / distancia;

        // Calcular costo total
        float costoTotal = combustible * precioLitro;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Rendimiento: %.2f km/litro\n", rendimiento);
        System.out.printf("Consumo cada 100km: %.2f litros\n", consumoCada100km);
        System.out.printf("Costo por km: $%.2f\n", costoPorKm);
        System.out.printf("Costo total: $%.2f\n", costoTotal);
    }
}
