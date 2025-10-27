//Una pasteler´ıa nos ha pedido realizar un programa que haga presupuestos de tartas. El
// programa preguntar´a primero de qu´e sabor quiere el usuario la tarta: manzana, fresa o
// chocolate. La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar la
// tarta de chocolate, el programa debe preguntar adem´as si el chocolate es negro o blanco; la
// primera opci´on vale 14 euros y la segunda 15. Por ´ultimo se pregunta si se a˜nade nata y si
// se personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.

import java.util.Scanner;

public class Ej_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio = 0;

        System.out.print("¿De qué sabor quieres la tarta? (manzana, fresa, chocolate): ");
        String sabor = sc.next().toLowerCase();

        if (sabor.equals("manzana")) precio = 18;
        else if (sabor.equals("fresa")) precio = 16;
        else if (sabor.equals("chocolate")) {
            System.out.print("¿Chocolate negro o blanco?: ");
            String tipo = sc.next().toLowerCase();
            if (tipo.equals("negro")) precio = 14;
            else precio = 15;
        }

        System.out.print("¿Quieres añadir nata? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) precio += 2.5;

        System.out.print("¿Quieres escribir un nombre? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) precio += 2.75;

        System.out.println("El precio final es: " + precio + " €");
    }
}
