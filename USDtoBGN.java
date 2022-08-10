package com.company;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double USD = Double.parseDouble(scanner.nextLine());

        double priseUSD = 1.79549;
        double bgn = priseUSD * USD;

        System.out.println(bgn);

    }
}
