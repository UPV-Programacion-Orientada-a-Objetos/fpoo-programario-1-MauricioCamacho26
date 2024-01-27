package edu.upvictoria.fpoo;
import edu.upvictoria.fpoo.Problema1.problemaUno;
import edu.upvictoria.fpoo.Problema2.problemaDos;

import java.util.Scanner;
// import edu.upvictoria.fpoo.EstructurasSecuenciales.EjercicioUno;
// import edu.upvictoria.fpoo.*;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Menu Principal");
        System.out.println("[1] Resolver problema 1");
        System.out.println("[2] Resolver problema 2");
        System.out.println("Ingresa tu eleccion: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                resolverProblema1();
                break;
            case 2:
                resolverProblema2();
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion Invalida, intentelo otra ves");
        }
    }

    public static void resolverProblema1() {
        problemaUno P1 = new problemaUno();
        double resultado1 = P1.sumar(2, 3);
        System.out.println("Resultado de sumar (2, 3): " + resultado1);

        double resultado2 = P1.sumarDos();
        System.out.println("resultadode sumar Dos numeros: " + resultado2);
    }
public static void resolverProblema2(){
        problemaDos problema2 = new problemaDos();
        problema2.main(null);

    }
}