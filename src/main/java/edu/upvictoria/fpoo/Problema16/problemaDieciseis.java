package edu.upvictoria.fpoo.Problema16;

import java.util.Scanner;

public class problemaDieciseis {
    Scanner entrada = new Scanner(System.in);

    public double LaBrochaGordita(){
        System.out.println("Ingresa la cantidad de metros cuadrados que se pintaran: ");
        double Metritos = entrada.nextDouble();

       double TarifaMetroCuadrado= 10.5;

        return Metritos*TarifaMetroCuadrado;
    }
}
