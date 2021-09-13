/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the second number: ");
        int n2 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the third number: ");
        int n3 = Integer.parseInt(input.nextLine());

        if(n1 == n2 || n1 == n3 || n2 == n3){
            System.exit(0);
        }else if(n1 > n2 && n1 > n2){
            System.out.format("The largest number is %d", n1);
        }else if(n2 > n1 && n2 > n3){
            System.out.format("The largest number is %d", n2);
        }else{
            System.out.format("The largest number is %d", n3);
        }
    }
}