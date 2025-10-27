//Escribe un programa que calcule el total de una factura a partir de la base
//imponible

import java.util.Scanner;

public class Ejer_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base imponible:");
        float baseImponible = sc.nextFloat();

        float iva = 0.12f;
        float total = baseImponible + (baseImponible*iva);

        System.out.println("Base imponible: $"+baseImponible);
        System.out.println("IVA 12%: $"+(iva*baseImponible));
        System.out.println("Total de la factura: $"+total);
    }
}
