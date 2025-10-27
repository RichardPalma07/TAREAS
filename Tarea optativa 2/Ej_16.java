//Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos est´a siendo
// infiel. El programa ir´a haciendo preguntas que el usuario contestar´a con verdadero o falso.
// Cada pregunta contestada como verdadero sumar´a 3 puntos. Las preguntas contestadas con
// falso no suman puntos.

import java.util.Scanner;

public class Ej_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;

        System.out.println("Responde con 'true' o 'false':");

        String[] preguntas = {
                "1. Tu pareja parece estar más inquieta de lo normal sin motivo aparente",
                "2. Ha aumentado sus gastos de vestuario",
                "3. Ha perdido el interés que mostraba anteriormente por ti",
                "4. Ahora se arregla o asea con más frecuencia",
                "5. No te deja mirar su teléfono móvil",
                "6. A veces tiene llamadas que no contesta delante de ti",
                "7. Se preocupa más por cuidar su línea o broncearse",
                "8. Llega tarde del trabajo con más frecuencia",
                "9. Se perfuma más a menudo",
                "10. Se confunde y menciona lugares donde no ha estado contigo"
        };

        for (String p : preguntas) {
            System.out.print(p + " (true/false): ");
            boolean resp = sc.nextBoolean();
            if (resp) puntos += 3;
        }

        System.out.println("\nPuntuación total: " + puntos);

        if (puntos <= 10)
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        else if (puntos <= 22)
            System.out.println("Quizás exista el peligro de otra persona en su vida, pero no bajes la guardia.");
        else
            System.out.println("Tu pareja podría estar viviendo un romance con otra persona. Averigua más.");
    }
}
