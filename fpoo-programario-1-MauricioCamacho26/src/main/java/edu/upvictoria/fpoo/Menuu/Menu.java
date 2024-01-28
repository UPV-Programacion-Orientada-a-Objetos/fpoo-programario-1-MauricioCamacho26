    package edu.upvictoria.fpoo.Menuu;

    import edu.upvictoria.fpoo.Problema1.problemaUno;
    import edu.upvictoria.fpoo.Problema10.problemaDiez;
    import edu.upvictoria.fpoo.Problema2.problemaDos;
    import edu.upvictoria.fpoo.Problema3.problemaTres;
    import edu.upvictoria.fpoo.Problema4.problemaCuatro;
    import edu.upvictoria.fpoo.Problema5.problemaCinco;
    import edu.upvictoria.fpoo.Problema6.problemaSeis;
    import edu.upvictoria.fpoo.Problema7.problemaSiete;
    import edu.upvictoria.fpoo.Problema9.problemaNueve;

    import java.util.Scanner;


    public class Menu {
        public void printMenu(Scanner entrada) {
            System.out.println("Menu Principal");
            System.out.println("[1] Resolver problema 1");
            System.out.println("[2] Resolver problema 2");
            System.out.println("[3] Resolver Problema 3");
            System.out.println("[4] Resolver Problema 4");
            System.out.println("[5] Resolver Problema 5");
            System.out.println("[6] Resolver Problema 6");
            System.out.println("[7] Resolver Problema 7");
            System.out.println("[8] Resolver Problema N°8");
            System.out.println("[9] Resolver Problema 9");
            System.out.println("[10] Resolver Problema 10");
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
                case 6:
                    resolverProblema6();
                    break;
                case 7:
                    resolverProblema7();
                    break;
                case 8:
                  //  resolverProblema8();
                    break;
                case 9:
                    resolverProblema9();
                    break;
                case 10:
                    resolverProblema10();
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

        public static void resolverProblema2 (){
            problemaDos P2 = new problemaDos();
            P2.main(null);

        }

        public static void resolverProblema3 () {
            problemaTres P3 = new problemaTres();
            double resultado3 = P3.BasePorAltura();
            System.out.println("El area del rectangulo es: " + resultado3);
        }

        public static void resolverProblema4 () {
            problemaCuatro P4 = new problemaCuatro();
            double resultado4 = P4.AreaCircunferencia();
            System.out.println("El area de circunferencia es: " + resultado4);
        }


        public static void resolverProblema5 () {
            problemaCinco P5 = new problemaCinco();
            double resultado5 = P5.areaTotalTerrenos();
            System.out.println("El tamaño de los terrenos es :" + resultado5);
        }

        public static void resolverProblema6 () {
            problemaSeis P6 = new problemaSeis();
            double resultado6 = P6.AreasTotales();
            System.out.println("EL tamaño total de la figura es : " + resultado6);
        }

        public static void resolverProblema7 () {
            problemaSiete P7 = new problemaSiete();
            double resultado7 = P7.TotalGalones();
            System.out.println("La cantidad de litros por galon que vas a vender son : " + resultado7);

        }

        public static void resolverProblema9 () {
            problemaNueve P9 = new problemaNueve();
            double resultado9 = P9.SueldoTrabajador();
            System.out.println("La cantidad de litros por galon que vas a vender son : " + resultado9);

        }

        public static void resolverProblema10 () {
            problemaDiez P10 = new problemaDiez();
            double resultado10 = P10.TotalMetros();
            System.out.println("La cantidad de litros por galon que vas a vender son : " + resultado10);
        }
    }
