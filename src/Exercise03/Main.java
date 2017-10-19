package Exercise03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//       5 - Escreva um programa para ler 3 notas de um aluno e informar o valor
//        da sua maior e menor nota.

        Scanner scanner = new Scanner(System.in);

        double note1;
        System.out.println("Type your first note:\r");
        note1 = scanner.nextDouble();
        System.out.println("Your first note was " + note1);

        double note2;
        System.out.println("Type your Second note:\r");
        note2 = scanner.nextDouble();
        System.out.println("Your Second note was " + note2);

        double note3;
        System.out.println("Type your Third note:\r");
        note3 = scanner.nextDouble();
        System.out.println("Your Third note was " + note3);
        double higherNote = 0;
        double lowestNote = 0;

        if (higherNote <= note1) {

            higherNote = note1;

        }
        if (higherNote <= note2) {

            higherNote = note2;

        }
        if (higherNote < note3) {

            higherNote = note3;

        }

        if (lowestNote <= note1) {

            lowestNote = note1;

        }
        if (lowestNote >= note2) {

            lowestNote = note2;

        }
        if (lowestNote > note3) {

            lowestNote = note3;

        }
        System.out.println("Higher note is: " + higherNote + " ,and the Lowest note is: " + lowestNote + ".");




    }
}
