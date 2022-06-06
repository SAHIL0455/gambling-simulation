package com.gambling;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome the Gambling Simulator");
        int everyStake = 100;
        int everyGameBet = 1;
        int days = 21;
        int win = 1;
        int numberofWin = 0;
        int numberofLoss = 0;
        for (int i = 1; i < days; i++) {
            int handCash = everyStake;
            while (handCash > 50 && handCash < 150) {
                double bit = Math.floor(Math.random() * 10) % 2;
                if (bit == win) {
                    System.out.println("Your are Win");
                    handCash++;
                } else {
                    System.out.println("Your are loss");
                    handCash--;
                }
                System.out.println("Now Your stake is = " + handCash);
            }
            if (handCash == 50) {
                System.out.println("You Have Loss 50% Stake Today");
                numberofLoss++;
            } else {
                System.out.println("You Have Win 50% Stake Today");
                numberofWin++;
            }
        }
        System.out.println("Number of luckiest Days is "+numberofWin+" Number of Unluckiest Days "+numberofLoss);
    }
}