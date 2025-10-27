//Escribe un programa que calcule el salario semanal de un empleado en base a
//las horas trabajadas, a razón de 12 euros la hora.

import java.util.Scanner;

public class Ejer_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        int horas = sc.nextInt();

        float salario = horas * 12;

        System.out.println("El salario semanal es: €" + salario);
    }
}
