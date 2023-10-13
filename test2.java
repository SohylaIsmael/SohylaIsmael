package com.mycompany.test1;

import java.util.Scanner;

public class Test1 {
    
public static void main( String[] args) { 
Scanner in= new Scanner(System.in); 
Scanner put= new Scanner(System.in); 

System.out.print("Enter num1: "); 
int num1=in.nextInt();
System.out.print("/nEnter num2: "); 
int num2=put.nextInt();

try{
    System.out.println(calc(num1, num2));
}catch(ArithmeticException e){
    System.out.println("Invalid Denominator");}
}

static int calc(int num1, int num2) {
    int result;
    if (num2 != 0)
       return result= num1/num2;

    else {
        return result= num1+num2;
    }
  }

}
