package edu.upvictoria.fpoo.Problema13;

import java.util.Scanner;

public class problemaTrece {
    Scanner entrada = new Scanner(System.in);
    public double DolaritoAPeso(){
        double PDolar = 17.13;

        System.out.println("Ingresa la cantidad de dinero Mexicano que quieres cambiar: ");
        double Mexicano = entrada.nextDouble();

        return Mexicano/PDolar;
    }
}
