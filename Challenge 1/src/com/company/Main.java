package com.company;
import java.util.Scanner;
//Challenge 1
public class Main {
    public static void FizzBuzz(int n){
        String output="";
        if (n%3==0)
            output += "Fizz";
        if (n % 5 == 0)
            output += "Buzz";
        if (n % 7 == 0)
            output += "Rizz";
        if (n%11==0)
            output += "Jazz";
        if (output.length()==0)
            output += String.valueOf(n);
        System.out.println(output);
    }
    public static void main(String[] args) {
        Challenge2 a=new Challenge2();
        Pairof2 b=new Pairof2();
        Pairof3 c=new Pairof3();
//	    for(int i=0;i<102;i++)
//	        FizzBuzz(i);
//	        System.out.println(a.compute(i));
//           System.out.println(a.compute2(i));
        Scanner input=new Scanner(System.in);
//        int n=input.nextInt();
//        int[] vector=new int[n];
//        for(int i=0;i<n;i++)
//            vector[i]=input.nextInt();
//        System.out.println("Sunt "+b.pair(vector)+" perechi de numere 2 numere");
//        System.out.println("Sunt "+c.pair(vector)+" perechi de numere 3 numere");
    }
}
