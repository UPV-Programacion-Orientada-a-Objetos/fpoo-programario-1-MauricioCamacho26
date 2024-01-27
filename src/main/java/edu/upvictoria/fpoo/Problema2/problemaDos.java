package edu.upvictoria.fpoo.Problema2;

import java.util.Scanner;

public class problemaDos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa la calificación: ");
        double calificacion = entrada.nextDouble();

        double promedio = calcularPromedio(calificacion);
        System.out.println("El promedio es: " + promedio);
    }

    public static double calcularPromedio(double calificacion) {
        return calificacion * 4 / 4;
    }
}