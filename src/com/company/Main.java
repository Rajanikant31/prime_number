package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int num,count=0,i;
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter any number=");
        num=scan.nextInt();
        for(i=2; i<num; i++) {
            if (num%i== 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.println(num+ " is prime number");
        }
        else
        {
            System.out.println(num+" is not prime number");
        }
    }
}
