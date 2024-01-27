package edu.upvictoria.fpoo;
import edu.upvictoria.fpoo.Problema1.problemaUno;


// import edu.upvictoria.fpoo.EstructurasSecuenciales.EjercicioUno;
// import edu.upvictoria.fpoo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menu Principal");
        problemaUno P1 = new problemaUno();
        double resultado1 = P1.sumar(2, 3);
        System.out.println("Resultado de sumar(2, 3): " + resultado1);

        double resultado2 = P1.sumarDos();
        System.out.println("Resultado de sumarDos(): " + resultado2);

    }
}