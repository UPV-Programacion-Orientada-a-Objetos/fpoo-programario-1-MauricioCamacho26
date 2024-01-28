package edu.upvictoria.fpoo.Problema17;

import java.util.Scanner;

public class problemaDiecisiete {
    Scanner entrada = new Scanner(System.in);
    public double TriangulitoHipotenusa(){
        System.out.println("La formula para sacar la hipotenusa de un triangulo rectangulo es:");
        System.out.println("C^2=A^2+B^2");

        System.out.println("Ingresa el valor de A: ");
        double ValorA = entrada.nextDouble();
        System.out.println("Ingresa el valor de B: ");
        double ValorB = entrada.nextDouble();

        double AElevao = ValorA * ValorA;
        double BElevao = ValorB * ValorB;

        return AElevao+BElevao;
    }
}
