package com.mycompany.test1;

import java.util.Scanner;

public class Test1 {
    
public static void main( String[] args) { 
Scanner in= new Scanner(System.in); 
Scanner put= new Scanner(System.in); 

System.out.print("Enter num1: "); 
int num1=in.nextInt();
System.out.print("Enter num2: "); 
int num2=put.nextInt();

try{
    System.out.println(calc1(num1, num2));
}catch(ArithmeticException e){
    System.out.println("Invalid Denominator");
    System.out.println(calc2(num1, num2));}
}

static int calc1(int num1, int num2) {
    int result;
       return result= num1/num2;
  }

static int calc2(int num1, int num2) {
    int result;
       return result= num1+num2;
  }

}
