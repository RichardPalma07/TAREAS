import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== CALCULADORA DE DIETA CALORICA ===");

        System.out.print("Ingrese el sexo (H para hombre, M para mujer): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese el peso (kg): ");
        float peso = scanner.nextFloat();

        System.out.print("Ingrese la altura (cm): ");
        float altura = scanner.nextFloat();

        System.out.print("Ingrese la edad (años): ");
        float edad = scanner.nextFloat();

        System.out.print("Ingrese el factor de actividad (1.2-1.9): ");
        float factorActividad = scanner.nextFloat();

        float metabolismoBasal;

        // Calcular metabolismo basal segun sexo
        if (sexo == 'H') {
            metabolismoBasal = 10 * peso + 6.25f * altura * 100 - 5 * edad + 5;
        } else {
            metabolismoBasal = 10 * peso + 6.25f * altura * 100 - 5 * edad - 161;
        }

        // Calcular calorias necesarias
        float caloriasNecesarias = metabolismoBasal * factorActividad;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Metabolismo basal: %.2f kcal\n", metabolismoBasal);
        System.out.printf("Calorias necesarias diarias: %.2f kcal\n", caloriasNecesarias);
    }
}

