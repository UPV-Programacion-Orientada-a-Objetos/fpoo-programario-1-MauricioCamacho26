package edu.upvictoria.fpoo.Problema15;

import java.util.Scanner;

public class problemaQuince {

    Scanner entrada = new Scanner(System.in);

    public double CobroPorHora() {
        System.out.println("Ingresa el cobro normal por hora: ");
        double cobro = entrada.nextDouble();
        System.out.println("Ingresa las horas en las cuales se quedo estacionado: ");
        double ticket = entrada.nextDouble();

        int RedondeoHoritas = (int) ticket;

        if (ticket - RedondeoHoritas > 0) {
            RedondeoHoritas++;
        }

        return RedondeoHoritas * cobro;
    }
}
