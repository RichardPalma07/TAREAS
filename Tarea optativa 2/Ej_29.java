// Realiza un programa que calcule el precio de un desayuno. El programa preguntar´a primero
// qu´e ha tomado el usuario de comer: palmera, donut o pitufo. La palmera vale 1.40 € y el
// donut 1 €. En caso de tomar pitufo, el programa debe preguntar adem´as si era con aceite
// o con tortilla; el primero vale 1.20 € y el segundo 1.60 €. Por ´ultimo se pregunta por la
// bebida: zumo o caf´e a 1.50 y 1.20 respectivamente.

import java.util.Scanner;

public class Ej_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioComida = 0, precioBebida = 0;

        System.out.print("¿Qué ha tomado de comer? (palmera, donut, pitufo): ");
        String comida = sc.next().toLowerCase();

        if (comida.equals("palmera")) precioComida = 1.4;
        else if (comida.equals("donut")) precioComida = 1.0;
        else if (comida.equals("pitufo")) {
            System.out.print("¿Con aceite o con tortilla?: ");
            String tipo = sc.next().toLowerCase();
            if (tipo.equals("aceite")) precioComida = 1.2;
            else precioComida = 1.6;
        }

        System.out.print("¿Qué ha tomado de beber? (zumo o cafe): ");
        String bebida = sc.next().toLowerCase();
        if (bebida.equals("zumo")) precioBebida = 1.5;
        else precioBebida = 1.2;

        double total = precioComida + precioBebida;
        System.out.println("El precio total del desayuno es: " + total + " €");
    }
}
