package edu.upvictoria.fpoo.Problema7;

import java.util.Scanner;

public class problemaSiete {
    Scanner entrada = new Scanner(System.in);

    public double TotalGalones(){

        System.out.println("Ingresa la cantidad de galones que el cliente quiere comprar :");
        double galon = entrada.nextDouble();

        return galon * 3.785;

    }
}
