package com.Exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        3 - Escreva um programa para ler 3 notas de um aluno e informar se
//        o aluno está aprovado, reprovado ou se deverá fazer a prova
//        final.
//
//        O aluno será Aprovado a média de suas notas for > 6
//        O aluno será Reprovado se a média de suas notas for < 4
//        O aluno deverá fazer a prova se a média de suas notas for >= 4 e < 6
//
//        Média das notas: (Nota1 + Nota2 + Nota3) / 3

//        double note1;
//        System.out.println("Type your first note:\r");
//        note1 = scanner.nextDouble();
//        System.out.println("Your first note was " + note1);
//
//        double note2;
//        System.out.println("Type your Second note:\r");
//        note2 = scanner.nextDouble();
//        System.out.println("Your Second note was " + note2);
//
//        double note3;
//        System.out.println("Type your Third note:\r");
//        note3 = scanner.nextDouble();
//        System.out.println("Your Third note was " + note3);
//
//        double averageNotes;
//        averageNotes = (note1 + note2 + note3) / 3;
//        System.out.println("Your Note Was " + averageNotes);
//
//        if (averageNotes > 60){
//
//            System.out.println("Approved per average");
//        }else if ((averageNotes >= 40) && (averageNotes < 60)){
//            System.out.println("Exam");
//
//        }else{
//            System.out.println("Reproved");
//        }

        ArrayList <Double> notes = Notes.getNotes();
        Double average = new Double(Notes.average(notes));
        Notes.statusStudent(average);

        ArrayList<Double> notes1 = Notes.getNotes();
        average = new Double(Notes.average(notes1));
        Notes.statusStudent(average);

    }

}
