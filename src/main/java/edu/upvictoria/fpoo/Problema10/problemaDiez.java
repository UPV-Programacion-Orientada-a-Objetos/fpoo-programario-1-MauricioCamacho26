package edu.upvictoria.fpoo.Problema10;

import java.util.Scanner;

public class problemaDiez {
    Scanner entrada = new Scanner(System.in);
    public double TotalMetros(){

        System.out.println("Ingresa la cantidad de metros que quiere comprar :");
        double metros = entrada.nextDouble();
        double totalM= 0.0254;
        return metros / totalM;

    }
}
