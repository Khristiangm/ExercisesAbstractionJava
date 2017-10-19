package com.Exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class Notes {

    public static ArrayList<Double> getNotes() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Insert note");
            values.add(scanner.nextDouble());
        }
        return values;
    }

    public static Double average(ArrayList<Double> notes){
        Double sum = new Double(0);
        for (int i = 0; i < 3 ; i++){
            sum += notes.get(i);
        }
        sum = (sum / 3);
        System.out.println("The average was: " + sum);
     return sum;
    }
    public static void statusStudent(Double averageNotes){
        if (averageNotes > 60){
            System.out.println("Your status is: Approved");

        }else if ((averageNotes >= 40) && (averageNotes < 60)){
            System.out.println("Your status is: Exam");

        }else{
            System.out.println("Your status is: Reproved");
        }
    }


}
