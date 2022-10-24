package com.study.lec17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java17Main {

    public static void main(String[] args) {

        List<Fruit> fruits = Arrays.asList(
            new Fruit("사과", 1_000),
            new Fruit("사과", 1_200),
            new Fruit("사과", 1_200),
            new Fruit("사과", 1_500),
            new Fruit("바나나", 3_000),
            new Fruit("바나나", 3_200),
            new Fruit("바나나", 2_500),
            new Fruit("수박", 10_000)
        );

        filterFruits(fruits, fruit -> fruit.getName().equals("사과"));

        String targetFruitName = "바나나";
        targetFruitName = "수박";

        // Java에서는 람다를 쓸때 사용할 수 있는 변수에 제약이 있음 (final인 변수 혹은 실질적 final인 변수만 사용가능)
//        filterFruits(fruits, (fruit) -> targetFruitName.equals(fruit.getName()));

    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, FruitFilter fruitFilter) {
        return fruits.stream()
            .filter(fruitFilter::isSelected)
            .collect(Collectors.toList());

//        List<Fruit> results = new ArrayList<>();
//        for (Fruit fruit : fruits) {
//            if (fruitFilter.isSelected(fruit)) {
//                results.add(fruit);
//            }
//        }
//        return results;
    }

}
