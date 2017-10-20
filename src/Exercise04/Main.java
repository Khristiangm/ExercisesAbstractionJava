package Exercise04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//       4 - Escreva um programa para ler a quantidade de vídeos que uma locadora
//           de vídeos possui e o valor que ela cobra por cada locação. Este
//           programa deverá imprimir as seguintes informações:
//
//        - Sabendo-se que 1/3 dos vídeos são alugadas por mês, exiba o
//          faturamento anual da locadora.
//
//        - Quando o cliente atrasa a entrega, é cobrada uma multa de 10%
//          sobre o valor da locação. Sabendo-se que 1/10 dos vídeos alugados
//          no mês são devolvidas com atraso, calcule o valor ganho com
//          multas por mês.
//
//        - Sabendo-se ainda que 2% dos vídeos se estragam ao longo do ano,
//          e 1/10 do total é comprado para reposição, exiba a quantidade de
//          vídeos que a locadora terá no final do ano.

        Scanner scanner = new Scanner(System.in);

        double videoTapeQuantity;
        System.out.println("Type the Quantity of video tapes\r");
        videoTapeQuantity = scanner.nextDouble();

        double videoTapeQuantityMonth;
        System.out.println("Type the Quantity of video tapes rents at month\r");
        videoTapeQuantityMonth = scanner.nextDouble();

        double brokeVideos = 0;
        double totalVideosReplaced = 0;
        double rentValues = 10;
        double annualBilling = 0;
        double tax = 0;
        double monthLateFeeProfits = 0;

        annualBilling = (((videoTapeQuantityMonth * rentValues) / 3) * 12);
        tax = rentValues * .1;
        monthLateFeeProfits = ((videoTapeQuantityMonth /10) * tax);
        brokeVideos = (videoTapeQuantity * .02);
        totalVideosReplaced = (videoTapeQuantity - brokeVideos) /10;

        System.out.println("The Annual profits was: " + annualBilling);
        System.out.println("The tax was: " + tax);
        System.out.println("The Month tax profits was: " + monthLateFeeProfits);
        System.out.println("The Videos Broken was: " + brokeVideos);
        System.out.println("The Replaced videos was: " + totalVideosReplaced);
    }
}
