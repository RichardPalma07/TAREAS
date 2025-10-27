// Escribe un programa que calcule el precio final de un producto seg´un su base imponible
// (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el
// c´odigo promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10%
// y 4% respectivamente. Los c´odigos promocionales pueden ser nopro, mitad, meno5 o 5porc
// que significan respectivamente que no se aplica promoci´on, el precio se reduce a la mitad, se
// descuentan 5 euros o se descuenta el 5%

import java.util.Scanner;

public class Ej_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        double base = sc.nextDouble();
        System.out.print("Tipo de IVA (general, reducido, superreducido): ");
        String tipo = sc.next().toLowerCase();
        System.out.print("Código promocional (nopro, mitad, meno5, 5porc): ");
        String promo = sc.next().toLowerCase();

        double iva = switch (tipo) {
            case "reducido" -> 0.10;
            case "superreducido" -> 0.04;
            default -> 0.21;
        };

        double precioIva = base + (base * iva);

        double descuento = switch (promo) {
            case "mitad" -> precioIva / 2;
            case "meno5" -> precioIva - 5;
            case "5porc" -> precioIva * 0.95;
            default -> precioIva;
        };

        System.out.println("Precio base: " + base + " €");
        System.out.println("IVA aplicado: " + (iva * 100) + "%");
        System.out.println("Total con IVA: " + precioIva + " €");
        System.out.println("Código promocional: " + promo);
        System.out.println("Precio final: " + descuento + " €");
    }
}
