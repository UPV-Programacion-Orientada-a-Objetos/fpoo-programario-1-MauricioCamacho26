package edu.upvictoria.fpoo.Problema23;

import java.util.Scanner;

public class problemaVeintiTres {

    Scanner entrada = new Scanner(System.in);


    public double SacarPrecios(){
        System.out.println("Ingresa el precio origianl: ");
        double PrecioOriginal = entrada.nextDouble();

        double precioDescuento = 0.20 * PrecioOriginal;
        double precioYaCondescuento = PrecioOriginal-precioDescuento;
        double iva = 0.15* precioYaCondescuento;
        double precioFinal = precioYaCondescuento+iva;

        System.out.println("Precio Con descuento $"+precioYaCondescuento);
        System.out.println("Descuento que aplicamos: $"+precioDescuento);

        return precioFinal;
    }
}
