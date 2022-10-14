package Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class ListD1 {
    
// Faça um programa que receba a temperatura média dos 6
// primeiros meses do ano e armazene-as em uma lista.

// Após isto, calcule a média semestral das temperaturas e
// mostre todas as temperaturas acima desta média, e em que
// mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
// – Fevereiro e etc).

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> meses = Arrays.asList("Janeiro", "Feverreiro", "Março", "Abril", "Maio", "Junho");

        ArrayList<Double> temperatura = new ArrayList<>();

        for (String  mes : meses) {
            System.out.print("Digite a temperatura de "+mes+": ");
            double t = input.nextDouble();
            temperatura.add(t);

            System.out.println();
            
        }

        double soma=0;
        for(int i=0; i<temperatura.size(); i++){
            soma += temperatura.get(i);
        }

        double media = soma/temperatura.size();

        for(int i=0; i<temperatura.size(); i++){
            System.out.println((i+1)+" - "+meses.get(i)+"\t-\t"+temperatura.get(i));
        }

        System.out.println("____________________________________");
        System.out.println("A media das temperaturas é "+media);
    }
}
