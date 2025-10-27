// Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos
// que faltan para llegar a la medianoche

import java.util.Scanner;

public class Ej_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (0-23): ");
        int horas = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = sc.nextInt();

        int segundosPasados = (horas * 3600) + (minutos * 60);
        int segundosHastaMedianoche = (24 * 3600) - segundosPasados;

        System.out.println("Faltan " + segundosHastaMedianoche + " segundos para medianoche.");
    }
}
