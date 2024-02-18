package Loop_Assign;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n = sc.nextInt();
         int a=0,b=1,c;

        for (int i = 0; i <n ; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
         }
    }
