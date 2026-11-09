package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23){
            return false;
        }
        if(isBarking) {
            return clock < 8 || clock > 20;
        } else {
            return false;
        }
    };

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return true;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return true;
    }

    public static double area(double width, double height) {
        return 0;
    }

    public static double area(double radius) {
        return 0;
    }
}
