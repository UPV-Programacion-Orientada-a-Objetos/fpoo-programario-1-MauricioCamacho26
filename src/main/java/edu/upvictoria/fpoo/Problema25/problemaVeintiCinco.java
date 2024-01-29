package edu.upvictoria.fpoo.Problema25;

import java.util.Scanner;

public class problemaVeintiCinco {
    Scanner entrada = new Scanner(System.in);

    public double empresaV3(){
        System.out.println("Ingrese Los dias de estancia en monterrey: ");
        int diasEstancia = entrada.nextInt();

        System.out.println("Ingresa el monto de cuanto costo el hotel: ");
        double  costoHotel = entrada.nextDouble();
        System.out.println("Ingresa el coste total del gasto en comida:");
        double costoComida =entrada.nextDouble();
        double otrosGastosDiarios = 100.0;

        double totalHotel = diasEstancia*costoHotel;
        double totalComida = diasEstancia*costoComida;
        double totalGastosDiarios = diasEstancia*otrosGastosDiarios;

        return  totalComida+totalHotel+totalGastosDiarios;




    }
}
