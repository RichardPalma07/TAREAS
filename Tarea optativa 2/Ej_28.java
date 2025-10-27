// Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego
// el usuario 2. Si alguno de los usuarios introduce una opci´on incorrecta, el programa deber´a
// mostrar un mensaje de error.

import java.util.Scanner;

public class Ej_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1 (piedra/papel/tijera): ");
        String j1 = sc.next().toLowerCase();
        System.out.print("Jugador 2 (piedra/papel/tijera): ");
        String j2 = sc.next().toLowerCase();

        if (!j1.matches("piedra|papel|tijera") || !j2.matches("piedra|papel|tijera")) {
            System.out.println("Error: opción no válida.");
            return;
        }

        if (j1.equals(j2)) System.out.println("Empate.");
        else if ((j1.equals("piedra") && j2.equals("tijera")) ||
                (j1.equals("papel") && j2.equals("piedra")) ||
                (j1.equals("tijera") && j2.equals("papel")))
            System.out.println("Gana el jugador 1.");
        else
            System.out.println("Gana el jugador 2.");
    }
}
