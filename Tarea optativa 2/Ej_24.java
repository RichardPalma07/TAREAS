//Escribe un programa que genere la n´omina (bien desglosada) de un empleado seg´un las
// siguientes condiciones:
// • Sepregunta el cargo del empleado (1- Prog. junior, 2- Prog. senior, 3- Jefe de proyecto),
// los d´ıas que ha estado de viaje visitando clientes durante el mes y su estado civil (1
//Soltero, 2- Casado).
// • El sueldo base seg´un el cargo es de 950, 1200 y 1600 euros seg´un si se trata de un prog.
// junior, un prog. senior o un jefe de proyecto respectivamente.
// • Por cada d´ıa de viaje visitando clientes se pagan 30 euros extra en concepto de dietas.
// Al sueldo neto hay que restarle el IRPF, que ser´a de un 25% en caso de estar soltero y
// un 20% en caso de estar casado

import java.util.Scanner;

public class Ej_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Prog. junior | 2. Prog. senior | 3. Jefe de proyecto");
        System.out.print("Introduce el cargo: ");
        int cargo = sc.nextInt();

        System.out.print("¿Cuántos días has viajado visitando clientes?: ");
        int diasViaje = sc.nextInt();

        System.out.println("1. Soltero | 2. Casado");
        System.out.print("Introduce tu estado civil: ");
        int estado = sc.nextInt();

        double sueldoBase = switch (cargo) {
            case 1 -> 950;
            case 2 -> 1200;
            case 3 -> 1600;
            default -> 0;
        };

        double dietas = diasViaje * 30;
        double sueldoBruto = sueldoBase + dietas;
        double irpf = (estado == 1) ? 0.25 : 0.20;
        double retencion = sueldoBruto * irpf;
        double sueldoNeto = sueldoBruto - retencion;

        System.out.println("\n--- Nómina ---");
        System.out.println("Sueldo base: " + sueldoBase + " €");
        System.out.println("Dietas: " + dietas + " €");
        System.out.println("Sueldo bruto: " + sueldoBruto + " €");
        System.out.println("Retención IRPF: " + (irpf * 100) + "%");
        System.out.println("Sueldo neto: " + sueldoNeto + " €");
    }
}
