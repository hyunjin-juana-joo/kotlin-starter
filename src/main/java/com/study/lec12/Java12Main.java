package com.study.lec12;

import com.study.kotlin.lec12.Person;

public class Java12Main {

    public static void main(String[] args) {
        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("움직인당2");
            }

            @Override
            public void fly() {
                System.out.println("난다2");
            }
        });

        Person.Factory.newBaby("JUANA");
    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }

}
