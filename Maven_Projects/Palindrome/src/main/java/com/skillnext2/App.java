package com.skillnext2;

public class App 
{
    public static void main( String[] args )
    {
        String s="rotor";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        System.out.println((s.equals(rev)?"palindrome":"not a palindrome"));
    }
}
