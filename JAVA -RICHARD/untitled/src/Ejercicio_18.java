import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== CALCULADORA DE DEPRECIACION DE ACTIVOS ===");

        System.out.print("Ingrese el valor inicial del activo: ");
        float valorInicial = scanner.nextFloat();

        System.out.print("Ingrese el valor residual: ");
        float valorResidual = scanner.nextFloat();

        System.out.print("Ingrese la vida util (años): ");
        int vidaUtil = scanner.nextInt();

        // Calcular depreciacion anual
        float depreciacionAnual = (valorInicial - valorResidual) / vidaUtil;

        System.out.println("\n--- DEPRECIACION POR AÑO ---");
        System.out.printf("Depreciacion anual: $%.2f\n\n", depreciacionAnual);

        // Calcular y mostrar valores para cada año
        float valorContable = valorInicial;
        float depreciacionAcumulada = 0;

        System.out.println("Año\tValor Contable\tDepreciacion Acumulada");
        System.out.println("---\t--------------\t----------------------");

        for (int i = 1; i <= vidaUtil; i++) {
            valorContable = valorInicial - (depreciacionAnual * i);
            depreciacionAcumulada = depreciacionAnual * i;
            System.out.printf("%d\t$%.2f\t\t$%.2f\n", i, valorContable, depreciacionAcumulada);
        }
    }
}

