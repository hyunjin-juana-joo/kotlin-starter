package com.study.lec02;

public class Lec02Main {

    public boolean startsWithA1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null이 들어옴");
        }

        return str.startsWith("A");
    }

    public Boolean startsWithA2(String str) {
        if (str == null) {
            return null;
        }

        return str.startsWith("A");
    }

    public Boolean startsWithA3(String str) {
        if (str == null) {
            return false;
        }

        return str.startsWith("A");
    }

}
