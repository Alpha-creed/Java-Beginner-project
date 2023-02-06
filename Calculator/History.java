package com.beginnerProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class History {
   private Scanner userInput = new Scanner(System.in);
   private boolean keepOn = true;
   private String yesOrNo;
   public ArrayList<Double> calculations = new ArrayList<>();

   public void start(){
       System.out.println("Welcome to my calculator!");
       while(keepOn == true){
           calculate();
       }
   }

   public String chooseOperator(){
       System.out.println("What to do ?"+
               "\n + for add"+
               "\n - for minus"+
               "\n * for multiply"+
               "\n / for divide");
       String operator = userInput.next();

       return operator;
   }

   public double getFirstNumber(){
       System.out.println("Input 1st number");
       return userInput.nextDouble();
   }

   public double getSecondNumber(){
       System.out.println("Input 2nd number");
       return userInput.nextDouble();
   }

   public void addition(double a,double b){
       calculations.add(a+b);
       System.out.println("The Num is :"+(a+b));
   }

   public void division(double a ,double b){
       calculations.add(a/b);
       System.out.println("The Num is "+(a/b));
   }

    public void mut(double a ,double b){
        calculations.add(a*b);
        System.out.println("The Num is "+(a*b));
    }

    public void sub(double a ,double b){
        calculations.add(a-b);
        System.out.println("The Num is "+(a-b));
    }

    public void showMenu(){
       int z = 0;
       while(z !=1){
           System.out.println("Please press the corresponding number for the operation you wish to perforn");
           System.out.println("1. Another operation");
           System.out.println("2. History?");
           System.out.println("3. Exit?");

           yesOrNo = userInput.next();

           if(yesOrNo.equals("1")){
               z=1;
               calculate();
           }else if(yesOrNo.equals("2")){
               loadHistory();
               //try making it else to see any difference
           }else {
               z=1;
               keepOn = false;
               exitMessage();
           }
       }
    }

    public void loadHistory(){
        System.out.println("Here are the calculations you have done so far:");
        //add a couple of sentences
        for(int i = 0;i<calculations.size();i++){
            System.out.println(calculations.get(i));
        }
    }

    public void exitMessage(){
        //add a couple of sentences
        System.out.println("Here are the result of calculations you have done so far:");

        for (Double calculation : calculations) {
            System.out.println(calculation);
        }
        System.out.println("Thank you for using our program! Hope you liked it");
    }

    public void calculate(){
       int x = 0;
       int y = 0;
       String operation;

       while( x < 1){
           operation = chooseOperator();
           //try putting num1 and num2 before the if loop
           if(operation.equals("+")){
               double num1 = getFirstNumber();
               double num2 = getSecondNumber();
               addition(num1,num2);
               x=1;
           }else if(operation.equals("-")){
               double num1 = getFirstNumber();
               double num2 = getSecondNumber();
               sub(num1,num2);
               x=1;
           }else if(operation.equals("/")){
               double num1 = getFirstNumber();
               double num2 = getSecondNumber();
               division(num1,num2);
               x=1;
           }else{
               double num1 = getFirstNumber();
               double num2 = getSecondNumber();
               mut(num1,num2);
           }
       }
       if(x == 1){
           showMenu();
       }
    }

}
