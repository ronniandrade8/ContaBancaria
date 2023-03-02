package Entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Entre o numero da conta:");
        int numeroConta = sc.nextInt();

        System.out.print("Entre o nome do titular: ");
        String nomeTitular = sc.next();

        System.out.print("Vai ter um deposito inicial (s/n)? ");
        String resposta = sc.next();

        double deposito = 0;
        if (resposta.toUpperCase().equals("S")){
            System.out.print("Entre com o valor incial de deposito: ");
             deposito = sc.nextDouble();
        }

        ContaBancaria contaBancaria = new ContaBancaria(numeroConta,nomeTitular, deposito);
        System.out.println("Dados da conta: ");
        System.out.println(contaBancaria.toString());

        System.out.print("Entre com o valor do deposito: ");
        deposito = sc.nextDouble();
        contaBancaria.AdicionarDeposito(deposito);

        System.out.println("Dados da conta atualizado: ");
        System.out.println(contaBancaria.toString());

        System.out.print("Entre com o valor do saque: ");
        deposito = sc.nextDouble();
        contaBancaria.RemoverDeposito(deposito);

        System.out.println("Dados da conta atualizado: ");
        System.out.println(contaBancaria.toString());

        sc.close();
    }
}
