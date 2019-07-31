package com.company;

public class BankAccount {


    double wallet=10000;//остаток на счете

    public double getWallet() { //возвращает текущий остаток на счете,

        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }


    public void deposit(double sum) {//положить деньги на счет
        wallet = wallet + sum;
        System.out.println("Сумма на вашем счете:" + wallet + " сом");
        if (wallet <= 0) {
            System.out.println("Положите денег");
        }
    }

    public void withDraw(double sum) throws Exception {//снимает указанную сумму со счета.
        wallet = wallet - sum;
        System.out.println("Ваш баланс:" + wallet);
        if (wallet < 0) {
            throw new LimitException("У вас недостаточно средств на счету", wallet);

        }


    }
}

