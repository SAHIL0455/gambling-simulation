package com.gambling;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome the Gambling Simulator");
        int everyDayStake = 100;
        int everyGameBet = 1;
        int bit = (int) Math.floor(Math.random()*10)%2;
        int win = 1;
        if (bit == win){
            System.out.println("Your are Win");
            everyDayStake++;
        }else {
            System.out.println("Your are loss");
            everyDayStake--;
        }
        System.out.println("Now Your stake is = "+everyDayStake);
    }
}
