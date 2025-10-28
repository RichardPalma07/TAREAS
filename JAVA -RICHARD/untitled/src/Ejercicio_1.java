//Sistema de facturacion de supermercado.
//Leer el precio unitario y cantidad de cada producto. Calcular subtotal, IVA
//total y segun el total verficar si tiene un descuento.

import java.util.Scanner;
import java.util.Date;

public class Ejercicio_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== FACTURA DE SUPERMERCADO ===");

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.next();

        System.out.println("Ingrese su cédula: ");
        int cedula = sc.nextInt();

        Date fecha = new Date();

        //LECTURA DE PRECIOS UNITARIOS Y CANTIDADES DE CADA PRODCUTO
        System.out.print("Precio del producto 1: ");
        float precio1 = sc.nextFloat();
        System.out.print("Cantidad del producto 1: ");
        int cantidad1 = sc.nextInt();

        System.out.print("Precio del producto 2: ");
        float precio2 = sc.nextFloat();
        System.out.print("Cantidad del producto 2: ");
        int cantidad2 = sc.nextInt();

        System.out.print("Precio del producto 3: ");
        float precio3 = sc.nextFloat();
        System.out.print("Cantidad del producto 3: ");
        int cantidad3 = sc.nextInt();

        System.out.print("Precio del producto 4: ");
        float precio4 = sc.nextFloat();
        System.out.print("Cantidad del producto 4: ");
        int cantidad4 = sc.nextInt();

        System.out.print("Precio del producto 5: ");
        float precio5 = sc.nextFloat();
        System.out.println("Cantidad del producto 5: ");
        int cantidad5 = sc.nextInt();

        //CALCULO DE SUBTOTAL
        float subtotal = (precio1*cantidad1)+(precio2*cantidad2)+(precio3*cantidad3)+(precio4*cantidad4)+(precio5*cantidad5);

        //CALCULO IVA
        float iva = subtotal*0.12f;

        //CALCULO TOTAL
        float total = subtotal+iva;

        //VERIFICAR DESCUENTO
        if (total>100) {
            float descuento = total*0.10f;
            float totalFinal = total-descuento;

            System.out.println("--- RESULTADOS ---");
            System.out.println("Comprador: "+nombre);
            System.out.println("C.I "+cedula);
            System.out.println("Fecha de facturación: "+fecha);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("IVA (12%): " + iva);
            System.out.println("Total con IVA: " + total);
            System.out.println("Descuento: " + descuento);
            System.out.println("TOTAL FINAL A PAGAR: " + totalFinal);
        }

        System.out.println("--- RESULTADOS ---");
        System.out.println("Comprador: "+nombre);
        System.out.println("C.I "+cedula);
        System.out.println("Fecha de facturación: "+fecha);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA (12%): " + iva);
        System.out.println("Total con IVA: " + total);
    }
}
