package com.company;

import java.util.Scanner;

public class IFtwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("出行时间：");
        double a = scanner.nextDouble();
        System.out.println("票价：");
        double b = scanner.nextDouble();

        if(a>=1.01 && a<=1.03||a>5.01 && a<=5.03||a>10.01 && a<=10.07){
            System.out.println("票价是："+b);
        }
        else{
            System.out.println("票价是："+b*0.8);
        }
    }
}
