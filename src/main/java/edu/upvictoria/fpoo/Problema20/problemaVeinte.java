package edu.upvictoria.fpoo.Problema20;

import java.util.Scanner;

public class problemaVeinte {
    Scanner entrada = new Scanner(System.in);
    public double llamadaBelica(){

        System.out.println("Ingresa el tiempo de duracion de la llamada: ");
        double Tiempibelico =  entrada.nextDouble();
        System.out.println("Ingresa el costo por minuto: ");
        double costoPorMinuto = entrada.nextDouble();

        return Tiempibelico*costoPorMinuto;
    }
}
