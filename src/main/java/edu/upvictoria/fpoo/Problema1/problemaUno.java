package edu.upvictoria.fpoo.Problema1;

import java.util.Scanner;

public class problemaUno {

    Scanner entrada = new Scanner(System.in);
    public double sumar(int a , int b){
        return a + b;
    }

    public double sumarDos(){

        System.out.println("Ingresa el primer numero : ");
        double a = entrada.nextDouble();
        System.out.println("Ingresa el segundo numero para sumar: ");
        double b = entrada.nextDouble();



        return a + b;
    }



}
