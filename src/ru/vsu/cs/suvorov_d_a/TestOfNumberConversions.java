package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestOfNumberConversions {

    @Test
    public void testTransform1FromArabicToRomanNumber() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testNumber1.txt"));
        int testingInput = scanner.nextInt();

        String actualResult = NumberRepresentation.arabicToRoman(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/resultNumber1.txt"));
        String correctOutput = scan.nextLine();

        Assert.assertEquals(actualResult, correctOutput);
    }

    @Test
    public void testTransform1587FromArabicToRomanNumber() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testNumber1587.txt"));
        int testingInput = scanner.nextInt();

        String actualResult = NumberRepresentation.arabicToRoman(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/resultNumber1587.txt"));
        String correctOutput = scan.nextLine();

        Assert.assertEquals(actualResult, correctOutput);
    }

    @Test
    public void testTransform3999FromArabicToRomanNumber() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testNumber3999.txt"));
        int testingInput = scanner.nextInt();

        String actualResult = NumberRepresentation.arabicToRoman(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/resultNumber3999.txt"));
        String correctOutput = scan.nextLine();

        Assert.assertEquals(actualResult, correctOutput);
    }

    @Test
    public void testTransformDXLIIIFromRomanToArabicNumber() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testNumberDXLIII.txt"));
        String testingInput = scanner.nextLine();

        int actualResult = NumberRepresentation.romanToArabic(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/resultNumberDXLIII.txt"));
        int correctOutput = scan.nextInt();

        Assert.assertEquals(actualResult, correctOutput);
    }

    @Test
    public void testTransformMCCCFromRomanToArabicNumber() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testSrc/testCase/testNumberMCCC.txt"));
        String testingInput = scanner.nextLine();

        int actualResult = NumberRepresentation.romanToArabic(testingInput);

        Scanner scan = new Scanner(new File("testSrc/testResult/resultNumberMCCC.txt"));
        int correctOutput = scan.nextInt();

        Assert.assertEquals(actualResult, correctOutput);
    }
}