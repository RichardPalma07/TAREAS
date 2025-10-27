// Realiza un programa que, dado un d´ıa de la semana (de lunes a viernes) y una hora (horas y
// minutos), calcule cu´antos minutos faltan para el fin de semana. Se considerar´a que el fin de
// semana comienza el viernes a las 15:00h. Se da por hecho que el usuario introducir´a un d´ıa
// y hora correctos, anterior al viernes a las 15:00h

import java.util.Scanner;

public class Ej_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día de la semana (lunes a viernes): ");
        String dia = sc.next().toLowerCase();
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = sc.nextInt();

        int minutosTotales = 0;
        switch (dia) {
            case "lunes" -> minutosTotales = (4 * 24 * 60) + (15 * 60);
            case "martes" -> minutosTotales = (3 * 24 * 60) + (15 * 60);
            case "miércoles", "miercoles" -> minutosTotales = (2 * 24 * 60) + (15 * 60);
            case "jueves" -> minutosTotales = (1 * 24 * 60) + (15 * 60);
            case "viernes" -> minutosTotales = (15 * 60);
        }

        int minutosActuales = (hora * 60) + minutos;
        int faltan = minutosTotales - minutosActuales;

        System.out.println("Faltan " + faltan + " minutos para el fin de semana.");
    }
}
