package exer_2;

import java.util.Scanner;

public class _3_tables
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to print the multiplication table:");
        int n=sc.nextInt();
        System.out.print("enter the times to print:");
        int n1=sc.nextInt();
        for(int i=1;i<=n1;i++)
        {
            System.out.printf("%d  * %d = %d%n",i,n,i*n);
        }
    }
}
