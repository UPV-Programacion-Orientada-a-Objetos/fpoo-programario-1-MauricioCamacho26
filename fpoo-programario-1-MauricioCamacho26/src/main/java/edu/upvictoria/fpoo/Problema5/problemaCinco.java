package edu.upvictoria.fpoo.Problema5;

import java.util.Scanner;

public class problemaCinco {

    Scanner entrada = new Scanner(System.in);

    public double areaTotalTerrenos() {

        System.out.println("Ingresa la base del triangulo");
        double base = entrada.nextDouble();
        System.out.println("Ingresa la altura del triangulo");
        double altura = entrada.nextDouble();
        double areaT = base * altura / 2;

        System.out.println("Ingresa la base del rectangulo");
        double baseRec = entrada.nextDouble();
        System.out.println("Ingresa la altura del rectangulo");
        double alturaRec = entrada.nextDouble();
        double areaR = baseRec * alturaRec;

        return areaT + areaR;
    }
}
