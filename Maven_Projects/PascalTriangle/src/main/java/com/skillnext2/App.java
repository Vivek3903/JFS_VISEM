package com.skillnext2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            int number=1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
