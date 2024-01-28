package edu.upvictoria.fpoo.Problema11;

import java.util.Scanner;

public class problemaOnce {
    Scanner entrada = new Scanner(System.in);
    public double AreaConagua(){
        System.out.println("Ingresa el valor por Metro cubico");
        double MetroCubi =entrada.nextDouble();
        System.out.println("Ingresa la base del Contenedor: ");
        double BaseCont = entrada.nextDouble();
        System.out.println("Ingresa la altura del contenedor");
        double AlturaCont = entrada.nextDouble();
        double Metrito= BaseCont*AlturaCont;

        return MetroCubi*Metrito;
    }
}
