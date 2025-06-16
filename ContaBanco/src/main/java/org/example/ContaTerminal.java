package org.example;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da agência !");
        String agencia = sc.next();
        System.out.println("Digite o número da conta !");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = sc.next();
        System.out.println("Para finalizar, digite o saldo !");
        Double saldo = sc.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência " +
                "%s, conta %s e seu saldo %s já está dispopnível para saque.", nomeCliente, agencia, numero, saldo);


    }
}