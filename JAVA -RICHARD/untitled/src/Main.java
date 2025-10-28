/*Crea un programa que ingrese tu nombre, edad y algo que te guste hacer*/

public class Main {
    public static void main(String[] args) {

        String nombre = "Richard";
        int edad = 18;
        String pasatiempo = "Practicar matematicas y jugar";

        System.out.println("Nombre: "+nombre+
                "\nEdad: "+edad+
                "\nPasatiempo: " + pasatiempo);

        float resultado1, resultado2, resultado3, resultado4;
        resultado1 = 2-4;
        resultado2 = 4+5;
        resultado3= resultado1/resultado2;
        resultado4= resultado3*resultado3;

        System.out.println("El resultado del ejercicio es: "+ resultado4);

        double numero1, raiz, numero3, numero4;
        float numero2;
        numero1 = 4*4+6;
        raiz = Math.sqrt(numero1);
        numero2 = 2*2;
        numero3 = raiz/numero2;
        numero4 = Math.pow(numero3, 0.5);
        System.out.println("El resultado del ejercicio es: "+ numero4);
    }
}