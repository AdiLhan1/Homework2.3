package com.company;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EarnMoney earnMoney = new EarnMoney();
        BankAccount bank = new BankAccount();
        System.out.println("Ведите ваше Ф.И");
        String name = scanner.nextLine();
        System.out.println("Банковский счет:" + name + "а " + "\n" + "Ваш Баланс:" + 10000);
        System.out.println("Хочешь заработать денег?");
        System.out.println("1-Да,2-НЕТ");
        int word = scanner.nextInt();
        if (word == 1) {
            earnMoney.mathematic();
        } else {
            System.out.println("А зря");
        }
        bank.setWallet(earnMoney.getWonCoins() + bank.getWallet());
        System.out.println("Текущий баланс" + bank.getWallet());
        while (true) {
            try {
                if (bank.wallet > 0) {
                    System.out.println("Сколько вы хотите вывести," + "Mr:" + name + "?");
                    int money = scanner.nextInt();
                    if (money >= 0) {
                        System.out.println("Вы успешно вывели " + money + " сом");
                        bank.withDraw(money);
                    }
                } else {
                    System.out.println("У вас нет денег " + "Mr:" + name + ", сколько вы хотите положить?");
                    int money1 = scanner.nextInt();
                    System.out.println("Вы успешно положили " + money1 + " сом");
                    bank.deposit(money1);
                }
            } catch (LimitException ex) {
                ex.printStackTrace();
            } catch (Exception ewe) {
                ewe.printStackTrace();
            }
        }
    }

}

