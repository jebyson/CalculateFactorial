package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the factorial calculator. Enter an integer.");

        Scanner input = new Scanner(System.in);
        int rand = input.nextInt();
        
        CalcFact.factorialCalculator(rand);
    }
}
