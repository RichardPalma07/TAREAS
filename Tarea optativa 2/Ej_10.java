//Escribe un programa que nos diga el hor´oscopo a partir del d´ıa y el mes de nacimiento

import java.util.Scanner;

public class Ej_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Mes de nacimiento (1-12): ");
        int mes = sc.nextInt();

        String signo = "";

        switch (mes) {
            case 1 -> signo = (dia < 20) ? "Capricornio" : "Acuario";
            case 2 -> signo = (dia < 19) ? "Acuario" : "Piscis";
            case 3 -> signo = (dia < 21) ? "Piscis" : "Aries";
            case 4 -> signo = (dia < 20) ? "Aries" : "Tauro";
            case 5 -> signo = (dia < 21) ? "Tauro" : "Géminis";
            case 6 -> signo = (dia < 21) ? "Géminis" : "Cáncer";
            case 7 -> signo = (dia < 23) ? "Cáncer" : "Leo";
            case 8 -> signo = (dia < 23) ? "Leo" : "Virgo";
            case 9 -> signo = (dia < 23) ? "Virgo" : "Libra";
            case 10 -> signo = (dia < 23) ? "Libra" : "Escorpio";
            case 11 -> signo = (dia < 22) ? "Escorpio" : "Sagitario";
            case 12 -> signo = (dia < 22) ? "Sagitario" : "Capricornio";
            default -> signo = "Mes no válido";
        }

        System.out.println("Tu signo zodiacal es: " + signo);
    }
}
