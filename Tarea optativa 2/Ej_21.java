//Calcula la nota de un trimestre de la asignatura Programaci´on. El programa pedir´a las dos
// notas que ha sacado el alumno en los dos primeros controles.
// Si la media de los dos controles da un n´umero mayor o igual a 5, el alumno est´a aprobado y
// se mostrar´a la media. En caso de que la media sea un n´umero menor que 5, el alumno habr´a
// tenido que hacer el examen de recuperaci´on que se califica como apto o no apto, por tanto
// se debe preguntar al usuario ¿Cu´al ha sido el resultado de la recuperaci´on? (apto/no apto).
// Si el resultado de la recuperaci´on es apto, la nota ser´a un 5; en caso contrario, se mantiene
// la nota media anterior.

import java.util.Scanner;

public class Ej_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del primer control: ");
        double nota1 = sc.nextDouble();
        System.out.print("Introduce la nota del segundo control: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Tu nota media es " + media + ". ¡Estás aprobado!");
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = sc.next();
            if (recuperacion.equalsIgnoreCase("apto")) {
                media = 5;
            }
            System.out.println("Tu nota final es: " + media);
        }
    }
}
