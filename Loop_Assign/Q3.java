package Loop_Assign;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   int a=12;
   int b=8;

        while(b!=0)
        {   int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD:"+a);
        }
}