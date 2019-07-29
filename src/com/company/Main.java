package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bank = new BankAccount();
        bank.deposit(10000);
        while (true) {
            try {
                System.out.println("Сколько вы хотите вывести?");
                int money = scanner.nextInt();
                System.out.println("Вы успешно вывели " + money + " сом");

                bank.withDraw(money);


            } catch (LimitException ex) {
                ex.printStackTrace();
            } catch (Exception ewe) {
                ewe.printStackTrace();
            }
        }
    }

}

