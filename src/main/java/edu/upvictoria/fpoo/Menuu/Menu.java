    package edu.upvictoria.fpoo.Menuu;

    import edu.upvictoria.fpoo.Problema1.problemaUno;
    import edu.upvictoria.fpoo.Problema10.problemaDiez;
    import edu.upvictoria.fpoo.Problema11.problemaOnce;
    import edu.upvictoria.fpoo.Problema12.problemaDoce;
    import edu.upvictoria.fpoo.Problema13.problemaTrece;
    import edu.upvictoria.fpoo.Problema14.problemaCatorce;
    import edu.upvictoria.fpoo.Problema15.problemaQuince;
    import edu.upvictoria.fpoo.Problema16.problemaDieciseis;
    import edu.upvictoria.fpoo.Problema17.problemaDiecisiete;
    import edu.upvictoria.fpoo.Problema18.problemaDieciOcho;
    import edu.upvictoria.fpoo.Problema19.problemaDieciNueve;
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
            System.out.println("[8] Resolver Problema 8");
            System.out.println("[9] Resolver Problema 9");
            System.out.println("[10] Resolver Problema 10");
            System.out.println("[11] Resolver Problema 11");
            System.out.println("[12] Resolver Problema 12");
            System.out.println("[13] Resolver Problema 13");
            System.out.println("[14] Resolver Problema 14");
            System.out.println("[15] Resolver Problema 15");
            System.out.println("[16] Resolver Problema 16");
            System.out.println("[17] Resolver Problema 17");
            System.out.println("[18] Resolver Problema 18");
            System.out.println("[19] Resolver Problema 19");
            System.out.println("[20] Resolver Problema 20");
            System.out.println("[21] Resolver Problema 21");
            System.out.println("[22] Resolver Problema 22");
            System.out.println("[23] Resolver Problema 23");
            System.out.println("[24] Resolver Problema 24");
            System.out.println("[25] Resolver Problema 25");
            System.out.println("[26] Resolver Problema 26");
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
                case 11:
                    resolverProblema11();
                    break;
                case 12:
                    resolverProblema12();
                    break;
                case 13:
                    resolverProblema13();
                    break;
                case 14:
                    resolverProblema14();
                    break;
                case 15:
                    resolverProblema15();
                    break;
                case 16:
                    resolverProblema16();
                    break;
                case 17:
                    resolverProblema17();
                    break;
                case 18:
                    resolverProblema18();
                    break;
                case 19:
                    resolverProblema19();
                    break;
                case 20:
                    resolverProblema19();
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
            problemaDos P2 = new problemaDos();
            P2.main(null);

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

        public static void resolverProblema6() {
            problemaSeis P6 = new problemaSeis();
            double resultado6 = P6.AreasTotales();
            System.out.println("EL tamaño total de la figura es : " + resultado6);
        }

        public static void resolverProblema7() {
            problemaSiete P7 = new problemaSiete();
            double resultado7 = P7.TotalGalones();
            System.out.println("La cantidad de litros por galon que vas a vender son : " + resultado7);

        }

        public static void resolverProblema9() {
            problemaNueve P9 = new problemaNueve();
            double resultado9 = P9.SueldoTrabajador();
            System.out.println(" El sueldo que vas a recibir por semana es de   : " + resultado9);

        }

        public static void resolverProblema10() {
            problemaDiez P10 = new problemaDiez();
            double resultado10 = P10.TotalMetros();
            System.out.println("La cantidad de pulgadas que pediras es de  : " + resultado10);
        }

        public static void resolverProblema11() {
            problemaOnce P11 = new problemaOnce();
            double resutado11 = P11.AreaConagua();
            System.out.println("El total que pagaras por el llenado de la alberca es de : " + resutado11);

        }

        public static void resolverProblema12() {
            problemaDoce P12 = new problemaDoce();
            double resultado12 = P12.AreaTotalTriangulo();
            System.out.println("El area De triangulo es:" + resultado12);
        }

        public static void resolverProblema13() {
            problemaTrece P13 = new problemaTrece();
            double resultado13 = P13.DolaritoAPeso();
            System.out.println("El cambio total a dolares por la cantidad de dinero mexicano que introduciste es de: " + resultado13);
        }

        public static void resolverProblema14() {
            problemaCatorce P14 = new problemaCatorce();
            double resultado14 = P14.EdadPreguntada();
            System.out.println("La edad de tu empleado es de: " + resultado14);
        }


        public static void resolverProblema15() {
            problemaQuince P15 = new problemaQuince();
            double resultado15 = P15.CobroPorHora();
            System.out.println("El costo total del estacionamiento es de: " + resultado15);
        }

        public static void resolverProblema16() {
            problemaDieciseis P16 = new problemaDieciseis();
            double resultado16 = P16.LaBrochaGordita();
            System.out.println("El precio dado al cliente por metro cuadrado sera de : " + resultado16);
        }

        public static void resolverProblema17(){
            problemaDiecisiete P17 = new problemaDiecisiete();
            double resultado17 = P17.TriangulitoHipotenusa();
            System.out.println("La hipotenusa de C^2 = "+ resultado17);
        }

        public static void resolverProblema18(){
            problemaDieciOcho P18 =  new problemaDieciOcho();
            double resultado18 = P18.CurvitaLocota();
            System.out.println("El precio de tu boleto a base los kilometros es de; "+resultado18);
        }

        public static void resolverProblema19(){
            problemaDieciNueve P19 = new problemaDieciNueve();
            double resultado19 = P19.TiempoViajeBici();
            System.out.println("El tiempo Estimado es de : "+resultado19);
        }

    }
