package com.study.lec04;

public class Lec04Main {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2_000L);
        JavaMoney money2 = new JavaMoney(1_000L);
        JavaMoney money3 = money1;
        JavaMoney money4 = new JavaMoney(2_000L);

        if (money1.compareTo(money2) > 0) {
            System.out.println("money1이 money2보다 금액이 큽니다.");
        }

        System.out.println(money1 == money3);
        System.out.println(money1 == money4);
        System.out.println(money1.equals(money4));

        System.out.println(money1.plus(money2));
    }

}
