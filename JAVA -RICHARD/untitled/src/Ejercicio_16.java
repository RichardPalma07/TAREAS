import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== CALCULADORA DE EMPAQUE Y ENVIO ===");

        System.out.print("Ingrese el numero de productos: ");
        int productos = scanner.nextInt();

        // Calcular cajas necesarias (12 productos por caja)
        int cajasNecesarias = (int) Math.ceil(productos / 12.0);

        // Calcular peso total (2 kg por caja)
        float pesoTotal = cajasNecesarias * 2;

        // Calcular costo de envio
        float costoEnvio = 5 + (pesoTotal * 0.75f);

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Cajas necesarias: %d\n", cajasNecesarias);
        System.out.printf("Peso total: %.2f kg\n", pesoTotal);
        System.out.printf("Costo de envio: $%.2f\n", costoEnvio);
    }
}

