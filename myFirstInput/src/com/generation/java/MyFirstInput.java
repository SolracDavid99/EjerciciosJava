package com.generation.java;
//import java.io.Console;
import java.util.Scanner;

class MyFirstInput {
 public static void main(String[] args) {
   //Console console = System.console();
   Scanner s= new Scanner(System.in);
   System.out.println("Please enter your name ");
   String name = s.nextLine(); 
   //String name = console.readLine();
   System.out.println("My name is "+ name);
 }
}
