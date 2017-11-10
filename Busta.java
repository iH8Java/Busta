/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busta;

import java.util.Scanner;
/**
 *
 * @author 19mzhang
 */
public class Busta {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double balance = 1000;
        double bet;
        double multiplier;
        double randomNumber;
        int newUser = 0;
        double result;
        Scanner keyboard = new Scanner(System.in);
        while (balance >= 1){
            if (newUser == 0){
                System.out.println("Your balance is " + balance + " bits. How much do you want to bet?");
                newUser++;
            }
            else{
                System.out.println("Your new balance is " + balance + " bits. How much do you want to bet?");
            }
            bet = keyboard.nextDouble();
            while (!(bet <= balance)||(!(bet >= 0))){
                System.out.println("You cannot bet greater your balance and it must be positive.");
                bet = keyboard.nextDouble();
            }
            System.out.println("What is your multiplier for your bet?");
            multiplier = keyboard.nextDouble();
            while (!(multiplier > 1)){
                System.out.println("The multiplier must be greater than 1.");
                multiplier = keyboard.nextDouble();
            }
            randomNumber = 1/Math.random();
            if (multiplier < randomNumber) {
               result = (multiplier - 1) * bet;
               balance += result;
               System.out.println("You won " + result + " bits! The lucky multiplier is " + randomNumber + "x.");
               System.out.println("");
            }
            else{
               balance -= bet;
               System.out.println("You lost " + bet + " bits! The lucky multiplier " + randomNumber + "x.");
               System.out.println("");
            }    
        }
        System.out.println("You lost all your money. You should attend gambling anonymous.");
    }
    
    
}

