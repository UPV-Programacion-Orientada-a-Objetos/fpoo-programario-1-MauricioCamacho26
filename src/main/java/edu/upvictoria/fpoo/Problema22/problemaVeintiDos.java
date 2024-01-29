package edu.upvictoria.fpoo.Problema22;

import java.util.Scanner;

public class problemaVeintiDos {
    Scanner entrada = new Scanner(System.in);

    public double companiaLuz(){
        System.out.println("Tienda sistema de cobro");
        System.out.println("Ingresa la cantidad de Kilowatts utilizados : ");
        double killowatsitos = entrada.nextDouble();
        System.out.println("Ingresa el precio por kilowat");
        double precioporkilowat = entrada.nextDouble();

        return killowatsitos*precioporkilowat;
    }
}
