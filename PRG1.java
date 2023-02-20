package prg1;

import java.util.Scanner;

import Teclat.*;

public class PRG1 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        final char BUIT = '-';
        final char MOVIMENT = '•';

        System.out.println("------------------");
        System.out.println(" MIDES DEL TAULER");
        System.out.println("------------------");

        int FILES = Teclat.lligInt("Quantes files vols afegir al tauler? ", 5, 9);

        int COLUMNES = Teclat.lligInt("Quantes columnes vols afegir al tauler? ", 5, 9);

        char tauler[][] = new char[FILES][COLUMNES];

        int f;
        int c;
        int dalt;
        int baix;

        for (f = 0; f < FILES; f++) {

            for (c = 0; c < COLUMNES; c++) {

                tauler[f][c] = BUIT;
            }

        }

        boolean eixir;
        eixir = false;

        while (!eixir) {

            System.out.println("");
            System.out.print("    ");

            for (dalt = 0; dalt < COLUMNES; dalt++) {

                System.out.print(dalt - 1 + 1 + "  ");

            }

            System.out.println("");
            System.out.println("");

            for (f = 0; f < FILES; f++) {

                System.out.print(f - 1 + 1 + " ");

                for (c = 0; c < COLUMNES; c++) {

                    System.out.print("  ");
                    System.out.print(tauler[f][c]);

                }

                System.out.print("   ");
                System.out.print(f - 1 + 1);

                System.out.println("");

            }

            System.out.println("");
            System.out.print("    ");

            for (baix = 0; baix < COLUMNES; baix++) {

                System.out.print(baix - 1 + 1 + "  ");

            }

            System.out.println("");

            System.out.println("");
            System.out.println("1- Posar una peça");
            System.out.println("2- Mostrar els moviments d'una peça");
            System.out.println("3- Esborrar moviments");
            System.out.println("4- Esborrar tauler");
            System.out.println("5- Eixir");
            System.out.println("");

            int opcio = Teclat.lligInt("Quina opcio vols realitzar? ", 1, 5);

            switch (opcio) {

                case 1: //Posar una peça

                    System.out.println("");
                    System.out.println("- Torre (T)");
                    System.out.println("- Alfil (A)");
                    System.out.println("- Dama (D)");
                    System.out.println("- Rei (R)");
                    System.out.println("- Cavall (C)");
                    System.out.println("");

                    char peça = Teclat.lligChar("Dis-me el tipus de peça que vols afegir", "TADRC");

                    System.out.println("Dis-me en quines cordenades vols afergir la peça.");

                    int afegirCordenada1 = Teclat.lligInt("- Dis-me el numero de la fila", 0, FILES - 1);

                    int afegirCordenada2 = Teclat.lligInt("- Dis-me el numero de la columna", 0, COLUMNES - 1);

                    tauler[afegirCordenada1][afegirCordenada2] = peça;

                    break;

                case 2: //Mostrar els moviments d'una peça

                    System.out.println("Dis-me en quines cordenades esta la peça que vols mostrar.");

                    int filaPeça = Teclat.lligInt("- Dis-me el numero de la fila", 0, FILES - 1);

                    int columnaPeça = Teclat.lligInt("- Dis-me el numero de la columna", 0, COLUMNES - 1);

                    switch (tauler[filaPeça][columnaPeça]) {

                        case 'A':

                        case 'T':
                            
                        case 'C':

                        case 'R':

                        case 'D':

                    }

                case 3: //Esborrar moviments

                    int movimentsEsborrats = 0;

                    for (f = 0; f < FILES; f++) {

                        for (c = 0; c < COLUMNES; c++) {

                            if (tauler[f][c] == MOVIMENT) {

                                tauler[f][c] = BUIT;

                                movimentsEsborrats += 1;

                            }
                        }
                    }

                    System.out.println(" ");
                    System.out.println("S'han esborrat un total de " + movimentsEsborrats + " moviments.");
                    System.out.println(" ");

                    break;

                case 4: //Esborrar tauler

                    for (f = 0; f < FILES; f++) {

                        for (c = 0; c < COLUMNES; c++) {

                            tauler[f][c] = BUIT;
                        }

                    }

                    break;

                case 5: //Eixir

                    System.out.print("Vols acabar de jugar?: ");

                    String resposta = teclat.nextLine();

                    char primeraLletra = resposta.charAt(0);

                    if (primeraLletra == 's' || primeraLletra == 'S') {

                        eixir = true;

                    }

            }
        }
    }
}
