package edu.upvictoria.fpoo.Problema14;

import java.util.Scanner;

public class problemaCatorce {
    Scanner entrada = new Scanner(System.in);

    public double EdadPreguntada(){
        System.out.print("Ingrese el año de nacimiento: ");
        int anoNacimiento = entrada.nextInt();

        int fechaActual = 2024;

        return anoNacimiento - fechaActual;
    }
}
