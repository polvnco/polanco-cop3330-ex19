/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex19
{
    public static void main( String[] args )
    {
        Scanner height = new Scanner(System.in);
        System.out.print( "What is your height in inches?: " );
        while (!height.hasNextInt()) {
            System.out.print("Please enter a number!\nWhat is your height in inches?: ");
            height.next();
        }

        Scanner weight = new Scanner(System.in);
        System.out.print( "How much do you weigh in pounds?: " );
        while (!weight.hasNextInt()) {
            System.out.print("Please enter a number!\nHow much do you weigh in pounds?: ");
            weight.next();
        }

        String weigh = weight.nextLine();
        String tallness = height.nextLine();

        float W = Integer.parseInt(weigh);
        float H = Integer.parseInt(tallness);

        float bmi = ((W / (H * H)) * 703);

        System.out.print("Your BMI is ");
        System.out.printf("%.1f", bmi);
        System.out.println(".");

        if (bmi >= 25){
            System.out.println("You are overweight. You should see your doctor.");
        }

        else if (bmi <= 18.5){
            System.out.println("You are underweight. You should see your doctor.");
    }

        else{
            System.out.println("You are within the ideal weight range.");
        }
    }
}
