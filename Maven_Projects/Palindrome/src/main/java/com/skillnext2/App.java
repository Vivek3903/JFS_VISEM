package com.skillnext2;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        System.out.println((s.equals(rev)?"palindrome":"not a palindrome"));
    }
}
