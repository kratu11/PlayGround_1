package com.ultralesson.Javapg2;

import java.util.Scanner;

public class lcmAndGcd {

    public int Gcd(int a, int b){
        if(a == 0 || b == 0) return a+b;
        return Gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        lcmAndGcd ob = new lcmAndGcd();
        int gcd = ob.Gcd(a,b);
        int lcm = (a*b)/gcd;

        System.out.println("LCM: "+lcm+" GCD: "+gcd);
    }
}
