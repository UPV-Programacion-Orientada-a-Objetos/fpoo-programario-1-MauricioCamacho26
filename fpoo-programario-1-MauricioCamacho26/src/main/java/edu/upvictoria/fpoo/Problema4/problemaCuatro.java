package edu.upvictoria.fpoo.Problema4;
import java.util.Scanner;

public class problemaCuatro {

    Scanner entrada = new Scanner(System.in);

    public double AreaCircunferencia(){
        double Pi = 3.1416;
        System.out.println("Ingresa el radio de la circunferencia");
        double Radiecito = entrada.nextDouble();

        double areabelica = Radiecito*Radiecito;
        double areafinal = areabelica*Pi;

        return areafinal;
    }

}
