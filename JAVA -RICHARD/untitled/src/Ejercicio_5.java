import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== CALCULADORA DE MATERIALES PARA CONSTRUCCION ===");

        System.out.print("Ingrese el alto de la pared (metros): ");
        float alto = scanner.nextFloat();

        System.out.print("Ingrese el largo de la pared (metros): ");
        float largo = scanner.nextFloat();

        // Calcular area de la pared
        float areaPared = alto * largo;

        // Area de un ladrillo (0.25 x 0.12 = 0.03 m²)
        float areaLadrillo = 0.25f * 0.12f;

        // Calcular ladrillos necesarios
        float ladrillosNecesarios = areaPared / areaLadrillo;

        // Calcular mezcla necesaria (0.5 kg por ladrillo)
        float mezclaNecesaria = ladrillosNecesarios * 0.5f;

        System.out.print("Ingrese el precio por ladrillo: ");
        float precioLadrillo = scanner.nextFloat();

        System.out.print("Ingrese el precio por kg de mezcla: ");
        float precioMezcla = scanner.nextFloat();

        // Calcular costo total
        float costoTotal = (ladrillosNecesarios * precioLadrillo) + (mezclaNecesaria * precioMezcla);

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Area de la pared: %.2f m²\n", areaPared);
        System.out.printf("Ladrillos necesarios: %.0f unidades\n", ladrillosNecesarios);
        System.out.printf("Mezcla necesaria: %.2f kg\n", mezclaNecesaria);
        System.out.printf("Costo total: $%.2f\n", costoTotal);
    }
}

