// Realiza un conversor de Kb a Mb.

import java.util.Scanner;

public class Ejer_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los kilobytes: ");
        float kb = sc.nextFloat();

        float mb = kb / 1024;

        System.out.println(kb + " Kb son " + mb + " Mb");
    }
}
