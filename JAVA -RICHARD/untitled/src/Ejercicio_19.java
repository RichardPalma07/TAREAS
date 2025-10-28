import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== SISTEMA DE COMIDAS PARA EVENTOS ===");

        System.out.print("Ingrese el numero de invitados: ");
        int invitados = scanner.nextInt();

        // Calcular cantidades necesarias
        float carneNecesaria = invitados * 0.3f;
        float bebidasNecesarias = invitados * 2;
        float postresNecesarios = invitados * 1;

        System.out.print("Ingrese el precio por kg de carne: ");
        float precioCarne = scanner.nextFloat();

        System.out.print("Ingrese el precio por bebida: ");
        float precioBebida = scanner.nextFloat();

        System.out.print("Ingrese el precio por postre: ");
        float precioPostre = scanner.nextFloat();

        // Calcular costo total
        float costoTotal = (carneNecesaria * precioCarne) +
                (bebidasNecesarias * precioBebida) +
                (postresNecesarios * precioPostre);

        // Aplicar descuento si invitados > 100
        if (invitados > 100) {
            costoTotal = costoTotal * 0.95f;
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Carne necesaria: %.2f kg\n", carneNecesaria);
        System.out.printf("Bebidas necesarias: %.0f unidades\n", bebidasNecesarias);
        System.out.printf("Postres necesarios: %.0f unidades\n", postresNecesarios);
        System.out.printf("Costo total: $%.2f\n", costoTotal);
        if (invitados > 100) {
            System.out.println("(Descuento del 5%% aplicado)");
        }
    }
}
