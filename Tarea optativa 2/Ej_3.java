// Escribe un programa en que dado un n´umero del 1 a 7 escriba el correspondiente nombre del
// día de la semana

import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int n = sc.nextInt();

        switch (n) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número fuera de rango");
        }
    }
}
