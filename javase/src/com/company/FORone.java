package com.company;

import java.util.Scanner;

public class FORone {
    public static void main(String[] args) {
        int i = (int)(Math.random()*10+1);
        System.out.println("i = "+i);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int j = scanner.nextInt();

        for(int a=1;a<=7;a++){
            if(i>j){
              System.out.println("太小了，再大一点！");
              break;
          }
          else if(i<j){
                System.out.println("太大了，再小一点！");
                break;
            }
          else if(i==j){
              System.out.println("恭喜你猜对了！");
              break;
          }

        }
    }

}

