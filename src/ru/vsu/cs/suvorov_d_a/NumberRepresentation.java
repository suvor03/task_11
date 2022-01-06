package ru.vsu.cs.suvorov_d_a;

import java.util.List;

public class NumberRepresentation {

    public static int romanToArabic(String input) {
        String romanNumbers = input.toUpperCase();
        int result = 0;

        List<Numbers> romanNumerals = Numbers.getReverseSortedValues();

        int i = 0;

        while ((romanNumbers.length() > 0) && (i < romanNumerals.size())) {
            Numbers symbol = romanNumerals.get(i);
            if (romanNumbers.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumbers = romanNumbers.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumbers.length() > 0) {
            throw new IllegalArgumentException(input + " can't be converted to a Roman Number");
        }
        return result;
    }

    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<Numbers> romanNumerals = Numbers.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            Numbers currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}