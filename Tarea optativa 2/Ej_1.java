// Escribe un programa que pida por teclado un día de la semana y que diga que asignatura
// toca a primera hora ese día

import java.util.Scanner;

public class Ej_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un día de la semana: ");
        String dia = sc.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("Primera hora: Programación");
                break;
            case "martes":
                System.out.println("Primera hora: Matemáticas");
                break;
            case "miércoles":
            case "miercoles":
                System.out.println("Primera hora: Inglés");
                break;
            case "jueves":
                System.out.println("Primera hora: Física");
                break;
            case "viernes":
                System.out.println("Primera hora: TIC");
                break;
            default:
                System.out.println("Ese día no hay clases.");
        }
    }
}
