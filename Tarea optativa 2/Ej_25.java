// La tienda online BanderaDeEspa˜na.es vende banderas personalizadas de la m´axima calidad
// y nos ha pedido hacer un configurador que calcule el precio seg´un el alto y el ancho. El precio
// base de una bandera es de un c´entimo de euro el cent´ımetro cuadrado. Si la queremos con
// un escudo bordado, el precio se incrementa en 2.50 € independientemente del tama˜no. Los
// gastos de env´ıo son 3.25 €. El IVA ya est´a incluido en todas las tarifas

import java.util.Scanner;

public class Ej_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el alto (cm): ");
        int alto = sc.nextInt();
        System.out.print("Introduce el ancho (cm): ");
        int ancho = sc.nextInt();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String escudo = sc.next();

        double precio = alto * ancho * 0.01;
        if (escudo.equalsIgnoreCase("s")) {
            precio += 2.50;
        }

        System.out.println("Precio total: " + precio + " €");
    }
}
