package edu.upvictoria.fpoo.Problema9;

import java.util.Scanner;

public class problemaNueve {
    Scanner entrada = new Scanner(System.in);
    public double SueldoTrabajador(){
        System.out.println("Ingresa el valor de tu sueldo por hora : ");
        double Sueldito = entrada.nextDouble();
        System.out.print("Ingrese las horas trabajadas a la semana: ");
        double horasTrabajadas = entrada.nextDouble();

        return Sueldito*horasTrabajadas;
    }
}
