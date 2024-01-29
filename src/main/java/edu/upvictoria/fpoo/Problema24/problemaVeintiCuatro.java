package edu.upvictoria.fpoo.Problema24;

import java.util.Scanner;

public class problemaVeintiCuatro {
    Scanner entrada = new Scanner(System.in);

    public double Ahorrito(){
        System.out.println("Cuanto se ahorrara en un año?");
        System.out.println("Ingresa tu sueldo semanal: ");
        double sueldito = entrada.nextDouble();

        int semanasEnUnano = 52;
        double porcentajeAhorroSemanal = 0.15;

        double ahorroSemanal = sueldito*porcentajeAhorroSemanal;
        double ahorritoMensual = ahorroSemanal*4;
        double ahorroAnual =ahorritoMensual*12;

        System.out.println("Ahorito semanal es de : $"+ahorroSemanal);
        System.out.println("Ahorro Mensual es de : $"+ahorritoMensual);

        return ahorroAnual;
    }
}
