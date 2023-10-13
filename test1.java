package com.mycompany.test1;

import java.util.Scanner;

public class Test1 {
    
public static void main( String[] args) { 
Scanner input= new Scanner(System.in); 
 
System.out.println("Enter your age: "); 
int age=input.nextInt(); 
try{
checkAge(age);
}catch(ArithmeticException e){
    System.out.println("Access denied - You must be at least 18 years old.");}
}

static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

}
