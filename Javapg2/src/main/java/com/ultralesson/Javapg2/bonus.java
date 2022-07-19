package com.ultralesson.Javapg2;

import java.util.Scanner;

public class bonus {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your Salary");
        int salary = sc.nextInt();

        System.out.println("How many years of service");
        int years = sc.nextInt();

        if (years>5) System.out.println( "Salary : "+ 1.05*salary );
        else System.out.println("Salary :" + salary);

    }
}
