import java.util.Scanner;

public class Ejercicio_2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE NÓMINA ===");
        System.out.print("Horas trabajadas: ");
        float horas = sc.nextFloat();
        System.out.print("Precio por hora: ");
        float precioHora = sc.nextFloat();

        if (horas <= 40) {
            float salarioBruto = horas * precioHora;
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Salario: "+salarioBruto);
        } else {
            float salarioBruto = (40 * precioHora) + ((horas - 40) * precioHora * 1.5f);

            float seguro = salarioBruto * 0.12f;
            float impuestos = salarioBruto * 0.15f;
            float salarioNeto = salarioBruto - seguro - impuestos;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Salario bruto: " + salarioBruto);
            System.out.println("Seguro (12%): " + seguro);
            System.out.println("Impuestos (15%): " + impuestos);
            System.out.println("Salario neto final: " + salarioNeto);
        }
    }
}