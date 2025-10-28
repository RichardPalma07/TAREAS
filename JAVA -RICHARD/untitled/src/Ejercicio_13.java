import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== CALCULADORA DE FERTILIZANTE PARA AGRICULTURA ===");

        System.out.print("Ingrese el largo del terreno (metros): ");
        float largo = scanner.nextFloat();

        System.out.print("Ingrese el ancho del terreno (metros): ");
        float ancho = scanner.nextFloat();

        // Calcular area del terreno
        float areaTerreno = largo * ancho;

        // Calcular fertilizante necesario (0.05 kg por m²)
        float fertilizanteNecesario = areaTerreno * 0.05f;

        // Calcular sacos necesarios (25 kg por saco)
        float sacosNecesarios = (float) Math.ceil(fertilizanteNecesario / 25);

        System.out.print("Ingrese el precio por saco: ");
        float precioSaco = scanner.nextFloat();

        // Calcular costo total
        float costoTotal = sacosNecesarios * precioSaco;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Area del terreno: %.2f m²\n", areaTerreno);
        System.out.printf("Fertilizante necesario: %.2f kg\n", fertilizanteNecesario);
        System.out.printf("Sacos necesarios: %.0f\n", sacosNecesarios);
        System.out.printf("Costo total: $%.2f\n", costoTotal);
    }
}

