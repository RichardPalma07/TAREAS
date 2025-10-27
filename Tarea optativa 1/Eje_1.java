//Realiza un programa que pida dos números y que luego muestre el resultado
//de su multiplicación.

import java.util.Scanner;

public class Eje_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dos números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int producto = num1*num2;
        System.out.println(num1+ "x" +num2 +" es igual a: " +producto);
    }
}
