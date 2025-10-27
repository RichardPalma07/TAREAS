// Realiza un conversor de Mb a Kb

import java.util.Scanner;

public class Ejer_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los megabytes: ");
        float mb = sc.nextFloat();

        float kb = mb * 1024;

        System.out.println(mb + " Mb son " + kb + " Kb");
    }
}
