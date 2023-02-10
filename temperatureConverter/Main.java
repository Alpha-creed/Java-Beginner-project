package com.beginnerProject;

import java.util.Scanner;

public class Main {

    Scanner Usrinput = new Scanner(System.in);
    double temp;
    int tempFrom;
    String tempFromName;
    int tempTo;
    String tempToName;
    double k,c,f;
    public static void main(String[] args) {
	// write your code here
        Main man = new Main();
        man.start();

    }

    public void start(){
        System.out.println("Welcome to our lil program of tempearure converter");
        System.out.println("Enter your name");
        String name = Usrinput.next();
        System.out.println("Welcome once again "+name+" to our program");
        System.out.println("You can convert any temperature from \n(1)kevin,(2)celcuis,(3)fahrenhiet to eachother\n using the numbers 1,2,3 as representatives");
        System.out.println("Select the temperature you wanna convert from");
        tempFrom = Usrinput.nextInt();
        switch (tempFrom) {
            case 1 -> {
                tempFromName = "Kevin";
                System.out.println("User selected " + tempFromName + " from the list");
            }
            case 2 -> {
                tempFromName = "Celsius";
                System.out.println("User selected " + tempFromName + " from the list");
            }
            case 3 -> {
                tempFromName = "Fahrenhiet";
                System.out.println("User selected " + tempFromName + " from the list");
            }
            default -> System.out.println("Only 1-3 options are avialable");

        }
        System.out.println("Select the temperature you wanna convert to");
        tempTo = Usrinput.nextInt();
        switch(tempTo){
            case 1:
                tempFromName = "Kevin";
                System.out.println("User selected " + tempToName + " from the list");
            break;
            case 2:
                tempFromName = "Celsius";
                System.out.println("User selected " + tempToName + " from the list");
            break;
            case 3:
                tempFromName = "Fahrenhiet";
                System.out.println("User selected " + tempToName + " from the list");
            break;
            default:
                System.out.println("Only 1-3 options are avialable");
                break;
        }
        System.out.println("type in the temperature");
        temp = Usrinput.nextDouble();
        convertingTo(tempFrom,tempTo,temp);
    }

    public void convertingTo(double Numfrom,double Numto,double temps){
        //use if and if it works use switch
        if(Numfrom == 1 && Numto == 2){
            c=KevintoCelsius(temps);
            System.out.println(c+" Celsuis");
        }
        else if(Numfrom == 1 && Numto == 3){
            c=KevintoFahrenheit(temps);
            System.out.println(c+" Fahrenhiet");
        }
        else if(Numfrom == 2 && Numto == 1){
            c=CelsiustoKevin(temps);
            System.out.println(c+" Kevin");
        }
        else if(Numfrom == 2 && Numto == 3){
            c=CelciustoFahrenhiet(temps);
            System.out.println(c+" Fahrenheit");
        }
        else if(Numfrom == 3 && Numto == 1){
            c=FahrenheittoKevin(temps);
            System.out.println(c+" Kevin");
        }
        else if(Numfrom == 3 && Numto == 2){
            c=FahrenhiettoCelcuis(temps);
            System.out.println(c+" Celsius");
        }
    }

    public double FahrenhiettoCelcuis(double num){
        return ((num-32)*(5/9));
    }
    public double CelciustoFahrenhiet(double num){
        return num*9/5+35;
    }
    public double FahrenheittoKevin(double num){
        return ((num+459.67)*(5/9));
    }
    public double KevintoFahrenheit(double num){
        return num* 9/5 -459.67;
    }
    public double KevintoCelsius(double num){
        return num-273.15;
    }
    public double CelsiustoKevin(double num){
        return num +273.15;
    }

}
