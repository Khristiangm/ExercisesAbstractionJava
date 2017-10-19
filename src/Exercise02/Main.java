package Exercise02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        4 - Escreva um programa para ler 3 notas diferentes de um aluno e informar
//        o valor da sua maior nota.

//        Altere este programa para informar também se a maior nota foi a
//        primeira, a segunda ou a terceira.

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
        String noteAux="";

        if (higherNote <= note1) {

            higherNote = note1;
            noteAux = "the first note";
        }
        if (higherNote <= note2) {

            higherNote = note2;
            noteAux = "the second note";
        }
        if (higherNote < note3) {

            higherNote = note3;
            noteAux = "the third note";
        }
        System.out.println("Higher note is: " + higherNote + " ,and the note position is: " + noteAux + ".");
    }

}
