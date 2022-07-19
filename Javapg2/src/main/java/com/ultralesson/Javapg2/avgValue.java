package com.ultralesson.Javapg2;

import java.util.Scanner;

public class avgValue {

    public static void main(String[] args){

        double num;
        double sum=0;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            num = sc.nextDouble();
            sum = sum + num;

        }

        double avg = (sum / 10);
        System.out.println(avg);

    }

}
