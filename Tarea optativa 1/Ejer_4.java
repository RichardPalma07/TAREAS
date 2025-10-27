//Escribe un programa que sume, reste, multiplique y divida dos números
//introducidos por teclado.

import java.util.Scanner;

public class Ejer_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Operaciones matematicas: ");
        System.out.print("Suma.- ");
        int suma = num1+num2;
        System.out.println(num1+" + "+num2+" = "+suma);

        System.out.print("Resta.- ");
        int resta = num1-num2;
        System.out.println(num1+" - "+num2+" = "+resta);

        System.out.print("Multiplicación.- ");
        int multiplicacion = num1*num2;
        System.out.println(num1+" x "+num2+" = "+multiplicacion);

        System.out.print("División.- ");
        float division = (float)num1/num2;
        System.out.println(num1+" ÷ "+num2+" = "+division);
    }
}
