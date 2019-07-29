package com.company;

public class BankAccount {


    double wallet;//остаток на счете

    public double getAmount() { //возвращает текущий остаток на счете,

        return wallet;
    }

    public void deposit(double sum) {//положить деньги на счет
        wallet = wallet + sum;
        System.out.println("Сумма на вашем счете:" + wallet + " сом");
    }

    public void withDraw(double sum) throws Exception {//снимает указанную сумму со счета.
        wallet = wallet - sum;
        System.out.println("Ваш баланс:" + wallet);
        if (wallet < 0) {
            throw new LimitException("У вас недостаточно средств на счету", wallet);
        }
}





}

