package com.company;

public class FORthree {
    public static void main(String[] args)

    {

        //外层循环控制行数

        for(int i = 1; i <= 9;  i++)

        {

            //内层循环控制每行表达式个数

            for(int j = 1; j <= i; j++)

            {

                System.out.print("" + i + "*" + j + "=" + (i * j));
                System.out.print(" ");

            }

            //一行结束换行

            System.out.println();

        }

    }
}
