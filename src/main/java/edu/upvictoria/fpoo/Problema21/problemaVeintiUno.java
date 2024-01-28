package edu.upvictoria.fpoo.Problema21;

import java.util.Scanner;

public class problemaVeintiUno {
    Scanner entrada = new Scanner(System.in);
    public double ConaguaV2(){

        System.out.println("Ingresa la cantidad de metros cubicos que consumio, aparece en su medidor : ");
        double metritosConsumidos = entrada.nextDouble();
        System.out.println("Ingresa el precio por metro cubico");
        double precioPormetro = entrada.nextDouble();

        return metritosConsumidos*precioPormetro;
    }
}
