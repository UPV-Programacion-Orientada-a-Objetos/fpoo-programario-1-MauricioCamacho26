package edu.upvictoria.fpoo.Problema6;

import java.util.Scanner;

public class problemaSeis {
    Scanner entrada = new Scanner(System.in);

    public double AreasTotales() {

        System.out.println("Ingresa la base del triangulo: ");
        double baseT = entrada.nextDouble();
        System.out.println("Ingresa la altura del triangulo");
        double alturaT = entrada.nextDouble();

        double areaT = baseT * alturaT/2;

        System.out.println("Ingresa el Radio del Circulo: ");
        double RadioC = entrada.nextDouble();
        double Pi = 3.1416;
        double AreaCir = RadioC * RadioC;
        double AreaCirF = AreaCir * Pi/2;

       return  AreaCirF + areaT;
    }

}
