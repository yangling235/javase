package com.company;

import java.util.Scanner;

public class IFthree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("性别：");
        String a = scanner.next();
        System.out.println("年龄：");
        int b = scanner.nextInt();
        System.out.println("身高：");
        int c = scanner.nextInt();

        if (a.equals("男") || b > 20 && b <= 26 || c > 170) {
            System.out.println("满足入伍条件");
        } else if (a.equals("女") || b > 20 && b <= 22 || c > 162) {

            System.out.println("满足入伍条件");
        } else {
            System.out.println("不满足入伍条件");
        }

    }
}