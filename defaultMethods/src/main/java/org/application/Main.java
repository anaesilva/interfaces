package org.application;

import services.BrazilInterestService;
import services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Fazer um programa para ler uma quantia e a duração em meses de umempréstimo.
//        Informar o valor a ser pago depois de decorrido o prazo doempréstimo,
//        conforme regras de juros do Brasil. A regra de cálculo dejuros do Brasil é juro
//        composto padrão de 2% ao mês.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}