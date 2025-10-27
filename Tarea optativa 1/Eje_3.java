//Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
//convertir debe ser introducida por teclado.

import java.util.Scanner;

public class Eje_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CONVERTIDOR DE PESETAS A EUROS");
        System.out.println("Ingresar Pesetas: ");
        int pesetas=sc.nextInt();

        float euro = pesetas/166.386f;
        System.out.println(+pesetas+ " es igual a "+euro+ "€");
    }
}
