package edu.upvictoria.fpoo;
import edu.upvictoria.fpoo.Problema1.problemaUno;
import edu.upvictoria.fpoo.Problema2.problemaDos;
import edu.upvictoria.fpoo.Problema3.problemaTres;
import edu.upvictoria.fpoo.Problema4.problemaCuatro;
import edu.upvictoria.fpoo.Problema5.problemaCinco;

import java.util.Scanner;
// import edu.upvictoria.fpoo.EstructurasSecuenciales.EjercicioUno;
// import edu.upvictoria.fpoo.*;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Menu Principal");
        System.out.println("[1] Resolver problema 1");
        System.out.println("[2] Resolver problema 2");
        System.out.println("[3] Resolver Problema 3");
        System.out.println("[4] Resolver Problema 4");
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
                resolverProblema3();
                break;
            case 4:
                resolverProblema4();
                break;
            case 5:
                resolverProblema5();
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

    public static void resolverProblema2() {
        problemaDos problema2 = new problemaDos();
        problema2.main(null);

    }

    public static void resolverProblema3() {
        problemaTres P3 = new problemaTres();
        double resultado3 = P3.BasePorAltura();
        System.out.println("El area del rectangulo es: " + resultado3);


    }

    public static void resolverProblema4() {
        problemaCuatro P4 = new problemaCuatro();
        double resultado4 = P4.AreaCircunferencia();
        System.out.println("El area de circunferencia es: " + resultado4);
    }


    public static void resolverProblema5() {
        problemaCinco P5 = new problemaCinco();
        double resultado5 = P5.areaTotalTerrenos();
        System.out.println("El tamaño de los terrenos es :" + resultado5);
    }
}
