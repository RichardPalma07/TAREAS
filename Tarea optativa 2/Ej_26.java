// Realiza un programa que calcule el precio de unas entradas de cine en funci´on del n´umero
// de personas y del d´ıa de la semana. El precio base de una entrada son 8 euros. El mi´ercoles
// (d´ıa del espectador), el precio base es de 5 euros. Los jueves son el d´ıa de la pareja, por lo
// que la entrada para dos cuesta 11 euros. Con la tarjeta CineCampa se obtiene un 10% de
// descuento.

import java.util.Scanner;

public class Ej_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de personas: ");
        int personas = sc.nextInt();
        System.out.print("Día de la semana: ");
        String dia = sc.next().toLowerCase();
        System.out.print("¿Tienes tarjeta CineCampa? (s/n): ");
        String tarjeta = sc.next();

        double precioEntrada = 8;

        if (dia.equals("miércoles") || dia.equals("miercoles")) {
            precioEntrada = 5;
        } else if (dia.equals("jueves")) {
            int parejas = personas / 2;
            int impares = personas % 2;
            double total = (parejas * 11) + (impares * 8);
            if (tarjeta.equalsIgnoreCase("s")) total *= 0.9;
            System.out.println("Total a pagar: " + total + " €");
            return;
        }

        double total = personas * precioEntrada;
        if (tarjeta.equalsIgnoreCase("s")) total *= 0.9;

        System.out.println("Total a pagar: " + total + " €");
    }
}
