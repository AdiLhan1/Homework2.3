package com.company;

import java.util.Random;
import java.util.Scanner;

public class EarnMoney {
    Scanner scanner = new Scanner(System.in);
    BankAccount bank = new BankAccount();
    private double wonCoins;

    public double getWonCoins() {
        return wonCoins;
    }

    public void mathematic() {
        Random r = new Random();
        int rNd = r.nextInt(10) + 1;
        int rNd2 = r.nextInt(10) + 1;
        int rNd3 = r.nextInt(10) + 1;
        int a = rNd * rNd2;
        int b = rNd - rNd2 + rNd3;
        int c = rNd * rNd2 - rNd3;
        int d = rNd / rNd2 + rNd3;
        int e = rNd + rNd2 * rNd3;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Пример номер:" + i);
            System.out.println("Сколько будет " + rNd + "*" + rNd2 + "?");

            int primer = scanner.nextInt();
            if (primer == a) {
                System.out.println("Правильно молодец!");
                System.out.println("+ 100 сом за правильный ответ");
                wonCoins = wonCoins + 100;
                System.out.println("Ваш баланс:"+10+wonCoins);


            } else {
                System.out.println("Прости не правильно(, Ответ:" + a);
            }
            i++;
            System.out.println("Пример номер:" + i);
            System.out.println("Сколько будет " + rNd + "-" + rNd2 + "+" + rNd3 + "?");
            int primer1 = scanner.nextInt();
            if (primer1 == b) {
                System.out.println("Правильно молодец!");
               // bank.wallet = bank.wallet + 100;
                System.out.println("+ 100 сом за правильный ответ");
                wonCoins = wonCoins + 100;
                System.out.println("Ваш баланс:"+10+wonCoins);


            } else {
                System.out.println("Прости не правильно(, Ответ:" + b);
            }
            i++;
            System.out.println("Пример номер:" + i);
            System.out.println("Сколько будет " + rNd + "*" + rNd2 + "-" + rNd3 + "?");

            int primer2 = scanner.nextInt();
            if (primer2 == c) {
                System.out.println("Правильно молодец!,осталось еще 2)");
                System.out.println("+ 100 сом за правильный ответ");
                wonCoins = wonCoins + 100;
                System.out.println("Ваш баланс:"+10+wonCoins);

            } else {
                System.out.println("Прости не правильно(, Ответ:" + c);
            }
            i++;
            System.out.println("Пример номер:" + i);
            System.out.println("Сколько будет " + rNd + "/" + rNd2 + "+" + rNd3 + "?");

            int primer3 = scanner.nextInt();
            if (primer3 == d) {
                System.out.println("Правильно молодец!Да ты красавчик!");
                System.out.println("+ 100 сом за правильный ответ");
                wonCoins = wonCoins + 100;
                System.out.println("Ваш баланс:"+10+wonCoins);

            } else {
                System.out.println("Прости не правильно(, Ответ:" + d);
            }
            i++;
            System.out.println("Пример номер:" + i);
            System.out.println("Сколько будет " + rNd + "+" + rNd2 + "*" + rNd3 + "?");
            int primer4 = scanner.nextInt();
            if (primer4 == e) {
                System.out.println("Правильно молодец! Ты просто ГЕНИЙ!");
                System.out.println("+" +
                        " 100 сом за правильный ответ");
                wonCoins = wonCoins + 100;
                System.out.println("Ваш баланс:"+10+wonCoins);

                System.out.println("Буду ждать завтра Мегамозг, не жди легких заданий)!");
                System.out.println("Ваш выигрыш составляет:" + wonCoins + "сом");
                break;
            } else {
                System.out.println("Прости не правильно(, Ответ:" + e);
                System.out.println("Повезет завтра)");
                System.out.println("Ваш выигрыш составляет:" + wonCoins + "сом");
                break;
            }


        }

    }
}
