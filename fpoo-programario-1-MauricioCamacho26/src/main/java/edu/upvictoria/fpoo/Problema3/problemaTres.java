package edu.upvictoria.fpoo.Problema3;

import java.util.Scanner;
public class problemaTres {

    Scanner entrada = new Scanner(System.in);
    public double BasePorAltura(){

        System.out.println("Ingresa la base del rectangulo : ");
        double a = entrada.nextDouble();
        System.out.println("Ingresa el altura del rectangulo: ");
        double b = entrada.nextDouble();

        return a * b;
    }



}
