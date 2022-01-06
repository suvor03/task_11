package ru.vsu.cs.suvorov_d_a;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum Numbers {
    I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

    private int value;

    Numbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<Numbers> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((Numbers e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
}