package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        if(isBarking) {
            return clock < 8 || clock > 20;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       int[] ages = {firstAge, secondAge, thirdAge};
       for (int age: ages) {
           if (age>=13 && age<=19){
               return true;
           }
       }
       return false;
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
