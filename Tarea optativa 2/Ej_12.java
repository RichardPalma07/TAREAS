//Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
// en el curso. Cada pregunta acertada sumar´a un punto. El programa mostrar´a al final la
// calificaci´on obtenida.

import java.util.Scanner;

public class Ej_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;

        System.out.println("Cuestionario de conocimientos generales del curso (responde con a, b o c):");

        System.out.print("1. ¿Qué lenguaje se usa en Programación Estructurada?\n a) C\n b) Java\n c) HTML\n> ");
        if (sc.next().equalsIgnoreCase("b")) puntos++;

        System.out.print("2. ¿Qué es un algoritmo?\n a) Un lenguaje\n b) Un conjunto de pasos\n c) Un programa\n> ");
        if (sc.next().equalsIgnoreCase("b")) puntos++;

        System.out.print("3. ¿Qué extensión tienen los archivos Java?\n a) .jav\n b) .class\n c) .java\n> ");
        if (sc.next().equalsIgnoreCase("c")) puntos++;

        System.out.print("4. ¿Qué tipo de variable almacena decimales?\n a) int\n b) double\n c) char\n> ");
        if (sc.next().equalsIgnoreCase("b")) puntos++;

        System.out.print("5. ¿Qué estructura repite instrucciones?\n a) if\n b) while\n c) switch\n> ");
        if (sc.next().equalsIgnoreCase("b")) puntos++;

        System.out.print("6. ¿Qué significa IDE?\n a) Editor de texto\n b) Entorno de desarrollo\n c) Programa de dibujo\n> ");
        if (sc.next().equalsIgnoreCase("b")) puntos++;

        System.out.print("7. ¿Qué operador se usa para comparar igualdad?\n a) ==\n b) =\n c) !=\n> ");
        if (sc.next().equalsIgnoreCase("a")) puntos++;

        System.out.print("8. ¿Cuál de estos no es un lenguaje de programación?\n a) Python\n b) Pascal\n c) Excel\n> ");
        if (sc.next().equalsIgnoreCase("c")) puntos++;

        System.out.print("9. ¿Qué imprime System.out.println?\n a) Muestra texto\n b) Lee datos\n c) Compila el código\n> ");
        if (sc.next().equalsIgnoreCase("a")) puntos++;

        System.out.print("10. ¿Qué significa JVM?\n a) Java Virtual Machine\n b) Java Visual Mode\n c) Java Variable Manager\n> ");
        if (sc.next().equalsIgnoreCase("a")) puntos++;

        System.out.println("\nTu puntuación final es: " + puntos + " puntos");
    }
}
