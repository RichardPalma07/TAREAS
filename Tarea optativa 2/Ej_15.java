//Escribe un programa que pinte una pir´amide rellena con un car´acter introducido por teclado
// que podr´a ser una letra, un n´umero o un s´ımbolo como *, +,-, $, &, etc. El programa debe
// permitir al usuario mediante un men´u elegir si el v´ertice de la pir´amide est´a apuntando hacia
// arriba, hacia abajo, hacia la izquierda o hacia la derecha.

import java.util.Scanner;

public class Ej_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un carácter para la pirámide: ");
        char c = sc.next().charAt(0);

        System.out.println("Elige la dirección de la pirámide:");
        System.out.println("1. Hacia arriba");
        System.out.println("2. Hacia abajo");
        System.out.println("3. Hacia la izquierda");
        System.out.println("4. Hacia la derecha");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("  " + c);
                System.out.println(" " + c + c + c);
                System.out.println("" + c + c + c + c + c);
            }
            case 2 -> {
                System.out.println("" + c + c + c + c + c);
                System.out.println(" " + c + c + c);
                System.out.println("  " + c);
            }
            case 3 -> {
                System.out.println("  " + c);
                System.out.println(" " + c + c);
                System.out.println("" + c + c + c);
                System.out.println(" " + c + c);
                System.out.println("  " + c);
            }
            case 4 -> {
                System.out.println(c + "  ");
                System.out.println(c + c + " ");
                System.out.println(c + c + c);
                System.out.println(c + c + " ");
                System.out.println(c + "  ");
            }
            default -> System.out.println("Opción no válida.");
        }
    }
}
