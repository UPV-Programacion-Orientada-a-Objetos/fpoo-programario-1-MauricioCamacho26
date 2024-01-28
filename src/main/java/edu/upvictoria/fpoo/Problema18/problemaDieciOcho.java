package edu.upvictoria.fpoo.Problema18;

import java.util.Scanner;

public class problemaDieciOcho {
    Scanner entrada = new Scanner(System.in);

    public double CurvitaLocota(){

        System.out.println("Lugares recomendados");
        System.out.println("Tula Tamaulipas = 60 KM");
        System.out.println("Tampico Tamaulipas = 310 KM");
        System.out.println("Matamoros Tamaulipas = 340 KM");
        System.out.println("Jaumave Tamaulipas = 45 KM");
        System.out.println("Monterrey Nuevo leon = 290 KM");

        System.out.println("Ingresa el precio por kilometro");
        double PrecioTicket = entrada.nextDouble();
        System.out.println("Ingresa el aproximado de Kilometros que es al lugar de destino");
        double kilometro = entrada.nextDouble();

        return  PrecioTicket*kilometro;

    }

}
