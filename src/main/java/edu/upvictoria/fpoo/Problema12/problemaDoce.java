package edu.upvictoria.fpoo.Problema12;

import java.util.Scanner;

public class problemaDoce {

    Scanner entrada = new Scanner(System.in);
    public double AreaTotalTriangulo(){
        System.out.println("Ingresa la base del triangulo: ");
        double baseTriangulito = entrada.nextDouble();
        System.out.println("Ingresa la altura del triangulo");
        double alturaTriangulito = entrada.nextDouble();

       return baseTriangulito * alturaTriangulito/2;
    }

}
