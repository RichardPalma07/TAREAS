//Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
//convertir debe ser introducida por teclado.

import java.util.Scanner;

public class Eje_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CONVERTIDOR DE EUROS A PESETAS");
        System.out.println("Ingresar Euros: ");
        int euro=sc.nextInt();

        float pesetas = euro*166.386f;
        System.out.println(+euro+ "€ es igual a "+pesetas+ " Pesetas");


    }
}
