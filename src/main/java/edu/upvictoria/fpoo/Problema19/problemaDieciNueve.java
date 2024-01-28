package edu.upvictoria.fpoo.Problema19;

import java.util.Scanner;

public class problemaDieciNueve {

    Scanner entrada = new Scanner(System.in);

    public double TiempoViajeBici(){
        System.out.println("Distancia entre Ciudades ");
        double Distancia = entrada.nextDouble();
        System.out.println("Ingresa velocidad promedio km/h ");
        double VelocidadConst = entrada.nextDouble();

        return Distancia/VelocidadConst;
    }

}
