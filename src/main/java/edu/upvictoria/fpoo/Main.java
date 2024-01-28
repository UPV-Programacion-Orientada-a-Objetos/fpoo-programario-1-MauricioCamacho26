package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.Menuu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

         Menu menu = new Menu();
         while (true) {
             menu.printMenu(entrada);
         }
    }
}