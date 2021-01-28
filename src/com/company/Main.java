package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String Surname = scanner.nextLine();
        System.out.println(" Hello " + Surname);
        System.out.println("Enter Age");
        int lol = scanner.nextInt();
        int age = 2021 - lol;
        System.out.println("You were born in " + age);
    }
}
